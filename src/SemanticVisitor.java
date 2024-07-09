import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("CheckReturnValue")
public class SemanticVisitor extends aglBaseVisitor<Object> {
   public ArrayList<String> errorList = new ArrayList<>();
   
   public boolean           hasErrors()    { return errorList.size() > 0; }
   public ArrayList<String> getErrorList() { return errorList; }

   List<String> primitiveTypes;

   private HashSet<String> userDefinedModels = new HashSet<String>();
               /*  VariableID, Type */
   public HashMap<String, String> variables = new HashMap<>();
   private HashMap<String, Boolean> hasValue = new HashMap<>();

   private HashMap<String, String[]> attributeList = new HashMap<>();
   private HashMap<String, ArrayList<String>> enumMap = new HashMap<>();
   
   private String exprResultType = null;
   private String action = null;
   private String inModel = "";


   public SemanticVisitor() {
      super();
      primitiveTypes =  Arrays.asList("Number", "Integer", "String", "Vector", "Point", "Boolean");
      enumMap = new HashMap<>();
      /* Hashmap Key = Attribute Value = Type:SupportedClasses */
      
      // General
      attributeList.put("fill", new String[]       {"String", "any"});
      attributeList.put("outline", new String[]    {"String", "any"});
      attributeList.put("state", new String[]      {"String", "any"});

      // Objects
      attributeList.put("length", new String[]     {"Point Vector", "Rectangle Line Ellipse Dot PieSlice ArcChord Arc"});
      attributeList.put("start", new String[]      {"Number Integer", "Arc ArcChord PieSlice"});
      attributeList.put("extent", new String[]     {"Number Integer", "Arc ArcChord PieSlice"});
      attributeList.put("points", new String[]     {"Array", "Polygon Blob Spline Polyline"});
      
      // Text
      attributeList.put("text", new String[]       {"String", "Text"});
      
      // Views
      attributeList.put("width", new String[]      {"Number Integer", "View"});
      attributeList.put("height", new String[]     {"Number Integer", "View"});
      attributeList.put("title", new String[]      {"String", "View"});
      attributeList.put("background", new String[] {"String", "View"});
      attributeList.put("Ox", new String[]         {"Integer Number", "View"});
      attributeList.put("Oy", new String[]         {"Integer Number", "View"});
   }
   
   /************************************************************************/
   /* Assignments                                                           */
      // Helpful Function
      private Object ObjectAttrAssignment(String baseObject,  String baseObjectType, String objectAttr, aglParser.ExprContext expr) {
         if (baseObjectType == null) {
            // if this runs, then its because an invalid model was instantiaated before, can safely ignore as error was already caught
            return null;
         }

         if(userDefinedModels.contains(baseObjectType)){
            ArrayList<String> enumTypes = enumMap.get(baseObjectType + '.' + objectAttr);
            if (enumTypes == null) {
               errorList.add("Model \"" + baseObjectType + "\" does not have attribute \"" + objectAttr +"\"");
               return null;
            }
            if (!enumTypes.contains(expr.getText())) {
               errorList.add(String.format(
                  "Attribute \"%s\" for Model \"%s\" does not have have value \"%s\"",
                  objectAttr, baseObjectType, expr.getText()
               ));
               return null;
            }

            return null;
         }

         String[] val = attributeList.getOrDefault(objectAttr, null);
         if (val == null) {
            errorList.add(String.format("Attribute \"%s\" is not a valid attribute", objectAttr));
            return null;
         }
         
         String attributeType = val[0];
         String supportedBy = val[1];
         
         // Se baseObjectType = model, ir buscar o filho 
         if (!supportedBy.contains(baseObjectType) && !supportedBy.contains("any")) {
            errorList.add(String.format("Variable \"%s\" of type \"%s\" does not implement attribute \"%s\"",
                                       baseObject, baseObjectType, objectAttr));
            exprResultType = null;
            return null;
         }

         visit(expr);
         if (exprResultType.equals("any")){
            exprResultType = null;
            return null;
         }
         if (exprResultType.equals("Vector") && attributeType.contains("Point") || 
            exprResultType.equals("Point") && attributeType.contains("Vector") ) {
            exprResultType = null;
            return null;
         }

         if ((exprResultType.equals("Integer") || exprResultType.equals("Number")) &&
             (attributeType.equals("Integer") || attributeType.equals("Number"))) {
            exprResultType = null;
            return null;
         }  

         if (!attributeType.contains(exprResultType)){
            errorList.add(String.format("Cannot assign expression value of type \"%s\" to attribute \"%s\" of type \"%s\"", 
                                          exprResultType, objectAttr, attributeType));
         }
         exprResultType = null;
         return null;
      }

      @Override public Object visitAssignmentExisting(aglParser.AssignmentExistingContext ctx) {
         String varID = inModel + ctx.ID().getText();
         String expectedResult = variables.get(varID);

         // Verificar se existe
         if ( expectedResult == null) {
            errorList.add(String.format("Variable \"%s\" not initialized before assignment! (On Existing Assignment)", varID));
         }
         
         // Verificar se valor é do tipo correto
         // visit expr trata do assunto:
         //    - se valor for diferente
         //       * erro: expr nao é toda do mesmo tipo
         // se resultado da expressao != esperada dá erro
         if (checkExprType(ctx.expr(), new String[] {"Number", "Integer"}) ){
            hasValue.put(varID, true);
            // Reset result types
            exprResultType = null; expectedResult = null;
            return null;
         }
         visit(ctx.expr());
         
         if (!expectedResult.equals(exprResultType) && !expectedResult.equals("any")) {
            errorList.add(String.format("Variable \"%s\" of type \"%s\" cannot be assigned value of type \"%s\" (existing)",
                                                   varID, expectedResult, exprResultType));
         }
         hasValue.put(varID, true);
         // Reset result types
         exprResultType = null; expectedResult = null;
         return null;
      }
      
      @Override public Object visitAssignmentInstatiation(aglParser.AssignmentInstatiationContext ctx) {
         String varID = (String) visit(ctx.instantiation());
         if (ctx.instantiation().varName == null){
            return null;
         }
         String expectedresult = variables.get(varID);
         
         // verificar se valor é do tipo correto
         // visit expr trata do assunto:
         //    - se valor for diferente
         //       * erro: expr nao é toda do mesmo tipo
         // se resultado da expressao != esperada dá erro
         visit(ctx.expr());

         if (exprResultType == null){
            return null;
         }
         if (exprResultType.equals("any")){
            hasValue.put(varID, true);
            // reset result types
            exprResultType = null;
            return null;
         }
         // Se for => v : Vector = Point, está tudo bem
         if (expectedresult.equals("Vector") && exprResultType.equals("Point")) {
            hasValue.put(varID, true);
            // reset result types
            exprResultType = null;
            return null;
         }
         // Se for K : Number/Integer = Integer/Number, está tudo bem, cast é feito no compiler
         if ((exprResultType.equals("Integer") || exprResultType.equals("Number")) &&
             (expectedresult.equals("Integer") || expectedresult.equals("Number"))) {
            hasValue.put(varID, true);
            // reset result types
            exprResultType = null;
            return null;
         }
         
         // Se nao forem do mesmo tipo
         if (!exprResultType.equals(expectedresult)) {
            errorList.add(String.format("variable \"%s\" of type \"%s\" cannot be assigned value of type \"%s\" (instantiation)", varID, expectedresult, exprResultType));
            exprResultType = null;
            return null;
         }
         
         hasValue.put(varID, true);
         // reset result types
         exprResultType = null;
         return null;
      }
   
      @Override public Object visitAssignmentObjectAttribute(aglParser.AssignmentObjectAttributeContext ctx) {
         String baseObject = ctx.ID(0).getText();
         String objectAttr = ctx.ID(1).getText();
   
         // Verificar se attributo a editar é do tipo correto
         // Criar um mapa com as caracteristicas e os tipos esperados
         // e comparar com isso
         String baseObjectType = variables.getOrDefault(baseObject, null);
         if (baseObjectType == null) {
            errorList.add(String.format("Variable \"%s\" not initialized before assignment! (On ObjectAttribute assignment)", baseObject));
            return null;
         }
         
         if (baseObjectType.equals("Enum")){
            ArrayList<String> enumList = enumMap.get(baseObject);
            if (enumList.contains(ctx.expr().getText())) {
               errorList.add("Enum " + baseObject + " has no value " + ctx.expr().getText());
               return null;
            }

         }
         // Só há dois tipos: primitivos e classes
         // Se for primitivo, não pode conter atributos
         // Caso nao o seja, então é classe e contem atributos
         if (primitiveTypes.contains(baseObjectType)){
            errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes", baseObject));
            return null;
         }
         
         return ObjectAttrAssignment(baseObject, baseObjectType, objectAttr, ctx.expr());
      }

      

      @Override
      public Object visitAssignmentEvents(aglParser.AssignmentEventsContext ctx) {
         visit(ctx.instantiation());
         if (ctx.instantiation().varName == null){
            return null;
         }
         String varID = ctx.instantiation().varName;
         
         visit(ctx.event());
         if (!exprResultType.equals("any") && !variables.get(varID).equals(exprResultType)) {
            errorList.add(String.format("Variable \"%s\" of type \"%s\" cannot be assigned value of type \"%s\" (event)",
                           varID, variables.get(varID), exprResultType));
            exprResultType = null;
            return null;
         }
         hasValue.put(varID, true);
         exprResultType = null;
         return null;
      }

      @Override
      public Object visitAssignmentArray(aglParser.AssignmentArrayContext ctx) {
         String varID = ctx.ID().getText();

         if (variables.get(varID) == null) {
            errorList.add(String.format("Array variable \"%s\" not initialized before assignment!", varID));
            return null;
         }

         if (!checkExprType(ctx.index, new String[] {"Integer"}))
            errorList.add("Can only access array at an Integer Index!");
         
         exprResultType = null;
         return null;
      }
   
      @Override public Object visitInstantiation(aglParser.InstantiationContext ctx) {
         String varID = inModel + ctx.varID.getText();
         String varType = (String) visit(ctx.type());
         if (varType == null){
            return null;
         }
         variables.put(varID, varType);
         ctx.varName = varID;

         // Assumimos que todos os arrays ja sao inicializados, e usamos a função array.insert(index, value)
         String expected = varType.split(":")[0];
         if (expected.equals("Array"))
            hasValue.put(varID, true);
         else
            hasValue.put(varID, false);
         return (Object) varID;
      }
   /* END Assignments                                                       */
   /************************************************************************/


   

   /************************************************************************/
   /* Operations                                                            */ 
      /* FUNCTIONS VISITORS */
         @Override public Object visitFunctionClose(aglParser.FunctionCloseContext ctx) {
            String varID = ctx.ID().getText();
            String varType = variables.get(varID);
            if (varType == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before use! (Close function)", varID));
               return null;
            }

            String expected = varType.split(":")[0];
            if(!varType.equals("View") || expected.equals("Array")) {
               errorList.add(String.format("Variable \"%s\" is of type \"%s\".Function close can only be used on objects of type View. ", varID, varType));
            }
            if(!hasValue.get(varID)) {
               errorList.add(String.format("Variable \"%s\" used before being assigned a value", varID));
               return null;
            }
            return null;
         }

         @Override public Object visitFunctionRefresh(aglParser.FunctionRefreshContext ctx) {
            String varID = ctx.ID().getText();
            String varType = variables.get(varID);
            if (varType == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before use! (Refresh Function)", varID));
            }
            if(!varType.equals("View")) {
               errorList.add(String.format("Variable \"%s\" is of type \"%s\".Function refresh can only be used on objects of type View. (Refresh Function)", varID, varType));
            }
            if(!hasValue.get(varID)) {
               errorList.add(String.format("Variable \"%s\" used before being assigned a value. (Refresh Function)", varID));
               return null;
            }
            return null;
         }

         @Override public Object visitFunctionMoveVector(aglParser.FunctionMoveVectorContext ctx) {
            visit(ctx.expr()); String exprType = exprResultType; exprResultType = null;
            if (exprType == null)
               return null;
            
            if (exprType.equals("any")) {
               return null;
            }

            if (primitiveTypes.contains(exprType)) {
               errorList.add(String.format("Variable \"%s\" is not a Graphical Object. Function move can only be applied to Graphical Objects.", ctx.expr().getText()));
            }
            return visit(ctx.point());
         }

         @Override public Object visitFunctionMoveID(aglParser.FunctionMoveIDContext ctx) {
            visit(ctx.expr()); String exprType = exprResultType; exprResultType = null;
            if (exprType == null)
               return null;

            if (primitiveTypes.contains(exprType)) {
               errorList.add(String.format("Variable \"%s\" is not a Graphical Object. Function move can only be applied to Graphical Objects.", ctx.expr()));
               return null;
            }

            String vectorID = ctx.vectorID.getText();
            String vectorType = variables.get(vectorID);
            if ( vectorID == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before use! (Function Move by ID)", vectorID));
            }
            if (!vectorType.equals("Vector")) {
               errorList.add(String.format("\""+ctx.getText()+"\" Variable \"%s\" must be a vector. (Function Move by ID)", vectorID));
               return null;
            }

            if(!hasValue.get(vectorID)) {
               errorList.add(String.format("Variable \"%s\" used before being assigned a value. (Function Move by ID)", vectorID));
               return null;
            }

            return null;
         }

         @Override
         public Object visitFunctionPlayScript(aglParser.FunctionPlayScriptContext ctx) {
            String varID = ctx.ID().getText();
            String varType = variables.get(varID);
            if (varType == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before use!", varID));
               return null;
            }

            if (!varType.equals("Script")) {
               errorList.add(String.format("Can only play scripts, variable \"%s\" is not a script"));
            }
            return null;
         }
      /* END FUNCTION VISITORS */

   
      /* EXPR VISITORS */
         @Override public Object visitExprUnaryOperator(aglParser.ExprUnaryOperatorContext ctx) {
            if (!checkExprType(ctx.expr(), new String[] {"Number", "Integer"})) {
               errorList.add("Unary operators can only be used with number or ID expressions");
               exprResultType = null;
            }
            visit(ctx.expr());
            return null;
         }

         @Override public Object visitExprPow(aglParser.ExprPowContext ctx) {
            if (checkExprType(ctx.e1, new String[]{"Integer", "Number"})) {
                  exprResultType = "Number";
                  return null;
            }
            errorList.add("Can only raise Number/Integer to a power of another Number/Integer!");
            return null;
         }


         @Override public Object visitExprMultDiv(aglParser.ExprMultDivContext ctx) {
            if (checkExprType(ctx.e1, new String[]{"Integer", "Number"})) {
                  exprResultType = "Number";
                  return null;
            }
            if (checkExprType(ctx.e2, new String[]{"Integer", "Number"})) {
               exprResultType = "Number";
               return null;
         }
            
            errorList.add("Can only multiply/divide numbers!");
            return null;
         }

         @Override public Object visitExprAddSub(aglParser.ExprAddSubContext ctx) {
            visit(ctx.e1);
            String type1 = exprResultType;
            visit(ctx.e2);
            String type2 = exprResultType;
            exprResultType = null;

            if(type1.equals("any") && type2.equals("any")) {
               exprResultType = "any";
               return null;
            }

            // fix problems
            if (type1.equals("any"))
               type1 = type2;
            else if (type2.equals("any"))
               type1 = type2;

            if (type1.equals("Boolean") || type2.equals("Boolean")) {
               errorList.add("Cannot add two expressions of type Boolean");
               return null;
            }
            if (type1.equals("String") || type2.equals("String")){
               if (ctx.op.getText().equals("-") && type1.equals("String")){
                  errorList.add("Cannot subtract two strings!");
                  return null;
               }
               exprResultType = "String";
               return null;
            }

            if (type1.equals(type2) && !type1.equals("Point")) {
               exprResultType = type1;
               return null;
            }

            // Se ponto + Vector ou vice versa, resultado é ponto e retorna
            if ((type1.equals("Vector") && type2.equals("Point")) ||
               (type1.equals("Point") && type2.equals("Vector")) ) {
               exprResultType = "Point";
               return null;
            }
            
            if (type1.equals("Number") && (type2.equals("Integer")) ||
                type1.equals("Integer") && type2.equals("Number")) {
               exprResultType = "Number";
               return null;
            }

            errorList.add("Can only sum/subtract Numbers or (Point, Vector) | (Vector, Vector)! or concat Strings");
            return null;
         }
         
         @Override public Object visitExprPoint(aglParser.ExprPointContext ctx) { exprResultType = "Point"; return null; }
         @Override public Object visitExprVector(aglParser.ExprVectorContext ctx) { exprResultType = "Vector"; return null; }
         @Override public Object visitExprInteger(aglParser.ExprIntegerContext ctx) { exprResultType = "Integer"; return null; }
         @Override public Object visitExprRealNumber(aglParser.ExprRealNumberContext ctx) { exprResultType = "Number"; return null; }
         @Override public Object visitExprString(aglParser.ExprStringContext ctx) { exprResultType = "String"; return null; }
         @Override public Object visitExprID(aglParser.ExprIDContext ctx) {
            String varID = ctx.ID().getText();
            exprResultType = variables.get(varID);
            if (exprResultType == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before use! (ExprID)", varID));
            }
            return null;
         }
         @Override public Object visitExprBoolean(aglParser.ExprBooleanContext ctx) { exprResultType = "Boolean"; return null; }
         @Override public Object visitExprNotBoolean(aglParser.ExprNotBooleanContext ctx) { 

            if (!checkExprType(ctx.expr(), new String[] {"Boolean"})) {
               errorList.add("Operator \"!\" can only negate boolean expressions!");
               exprResultType = null;
            }
            exprResultType = "Boolean";
            return null;
         }
         @Override public Object visitExprBoolCompare(aglParser.ExprBoolCompareContext ctx) {
            if (ctx.getChild(1).getText().equals("==")) {
               visit(ctx.e1);
               String e1Type = exprResultType;
               visit(ctx.e2);
               String e2Type = exprResultType;
               if (e1Type == null || e2Type == null) {
                  // Cannot continute as one of them was catch to be null
                  exprResultType = null;
                  return null;
               }

               if (e1Type.equals(e2Type) && e1Type.equals("String")) {
                  exprResultType = "Boolean";
                  return null;
               }
               exprResultType = null;
            }

            if (!checkExprType(ctx.e1, new String[] {"Integer", "Number", "Boolean"})){
               errorList.add("Comparison operators can only be used with expressions of the same type");
               return null;
            }
            if (!checkExprType(ctx.e2, new String[] {"Integer", "Number", "Boolean"})){
               errorList.add("Comparison operators can only be used with expressions of the same type");
               return null;
            }
            exprResultType = "Boolean";
            return null;
         }

         @Override public Object visitExprBooleanAND(aglParser.ExprBooleanANDContext ctx) {
            if (!checkExprType(ctx.e1, new String[] {"Boolean"})){
               errorList.add("Comparison operators can only be used with expressions of the same type");
               return null;
            }
            if (!checkExprType(ctx.e2, new String[] {"Boolean"})){
               errorList.add("Comparison operators can only be used with expressions of the same type");
               return null;
            }
            exprResultType = "Boolean";
            return null;
         }
         @Override public Object visitExprBooleanOR(aglParser.ExprBooleanORContext ctx) {
            visit(ctx.expr(0)); String type1 = exprResultType;
            visit(ctx.expr(1)); String type2 = exprResultType;
            exprResultType = null;
            if (type1 == null || type2 == null) {
               // Cannot continute as one of them was catch to be null
               exprResultType = null;
               return null;
            }

            if (!type1.equals("Boolean") || !type2.equals("Boolean")) {
               errorList.add("Boolean OR operator can only be used with boolean expressions");
               return null;
            }
            exprResultType = "Boolean";
            return null;
         }

         @Override
         public Object visitExprArray(aglParser.ExprArrayContext ctx) {
            for (aglParser.ExprContext expr : ctx.expr()) {
               visit(expr);
               // TODO: Posso fazer tipo Array<type> o que obrigda a ser tudo da mesma expressao
               // e permite meter mais verificaçoes. Para já é a solução simples
               if (exprResultType == null) {
                  errorList.add("Cannot initalize array with invalid expression!");
               }
            }
            exprResultType = "Array";
            return null;
         }

         @Override
         public Object visitExprArrayAccess(aglParser.ExprArrayAccessContext ctx) {
            String arrayID = ctx.ID().getText();
            String varType = variables.get(arrayID);
            if (varType == null) {
               errorList.add(String.format("Cannot access content of \"%s\", variable not initialize before used", arrayID));
               return null;
            }
            // String expected = varType.split(":")[0];
            // if (!expected.equals("Array")) {
            //    errorList.add(String.format("Variable \"%s\" is not an array! Cannot use array access operator", arrayID));
            //    return null;
            // }
            // String arrType = varType.split(":")[1];
            // exprResultType = arrType;
            exprResultType = "any";
            return null;
         }
      /* END EXPR VISITORS */

      /* EVENT VISITORS */
         @Override public Object visitEventMouseClick(aglParser.EventMouseClickContext ctx) {
            exprResultType = "Point";
            return null;
         }

         @Override public Object visitEventReadInput(aglParser.EventReadInputContext ctx) {
            exprResultType = "Script";
            return null;
         }

         @Override
         public Object visitEventLoadFile(aglParser.EventLoadFileContext ctx) {
            exprResultType = "Script";
            return null;
         }
      /* END EVENTS VISITORS */
   /* END Operations                                                        */ 
   /************************************************************************/

   /************************************************************************/
   /* Graphical context                                                     */
      /* GRAPHICALOBJECT VISITORS */
         @Override public Object visitGraphicalObjectIDCoords(aglParser.GraphicalObjectIDCoordsContext ctx) {
            String objID, objType;
            objType = (String) visit(ctx.objectType());
            // Temporary object ID
            variables.put("[Temporary Variable]", objType);
            objID = "[Temporary Variable]";
            
            if (primitiveTypes.contains(objType)){
               errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes", objID));
               return null;
            }
            visit(ctx.point());

            for (aglParser.AssignmentContext assignment : ctx.assignment()) {
               aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
               ObjectAttrAssignment("", objType, asgn.ID().getText(), asgn.expr());
            }
            return null;
         }

         @Override public Object visitGraphicalObjectInstatiationCoords(aglParser.GraphicalObjectInstatiationCoordsContext ctx) {
            visit(ctx.point());

            String objID, objType;
            visit(ctx.instantiation());
            if (ctx.instantiation().varName == null){
               return null;
            }

            objID = ctx.instantiation().varName;
            objType = ctx.instantiation().type().getText();

            if (primitiveTypes.contains(objType)){
               errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes", objID));
               return null;
            }

            for (aglParser.AssignmentContext assignment : ctx.assignment()) {
               aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
               ObjectAttrAssignment(objID, objType, asgn.ID().getText(), asgn.expr());
            }
            hasValue.put(objID, true);
            return null;
         }


         @Override public Object visitGraphicalObjectID(aglParser.GraphicalObjectIDContext ctx) {
            String pointType, pointID, objID, objType;
            
            objType = (String) visit(ctx.objectType());
            // Temporary object ID
            variables.put("[Temporary Variable]", objType);
            objID = "[Temporary Variable]";
            
            pointID = ctx.pointID.getText();
            pointType = variables.get(pointID);
            if (pointType == null) {
               errorList.add(String.format("Variable \"%s\" used before being instantiated!", pointID));
               return null;
            }

            if (!pointType.equals("Point")) {
               errorList.add(String.format("Variable \"%s\" is not of type point. Can only instantiate graphical figure at a Point!", pointID));
               return null;
            }

            if(!hasValue.get(pointID)) {
               errorList.add(String.format("Variable \"%s\" before being assigned a value", pointID));
               return null;
            }

            if (primitiveTypes.contains(objType)){
               errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes", objID));
               return null;
            }
            
            for (aglParser.AssignmentContext assignment : ctx.assignment()) {
               aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
               ObjectAttrAssignment("", objType, asgn.ID().getText(), asgn.expr());
            }
            hasValue.put(objID, true);
            return null;
         }

         @Override public Object visitGraphicalObjectInstatiationID(aglParser.GraphicalObjectInstatiationIDContext ctx) {
            String pointType, pointID, objID, objType;
            visit(ctx.instantiation());
            if (ctx.instantiation().varName == null){
               return null;
            }

            objID = ctx.instantiation().varName;
            objType = ctx.instantiation().type().getText();
            
            pointID = ctx.pointID.getText();
            pointType = variables.get(pointID);
            if (pointType == null) {
               errorList.add(String.format("Variable \"%s\" used before being instantiated!", pointID));
               return null;
            }

            if (!pointType.equals("Point")) {
               errorList.add(String.format("Variable \"%s\" is not of type point. Can only instantiate graphical figure at a Point!", pointID));
               return null;
            }

            if(!hasValue.get(pointID)) {
               errorList.add(String.format("Variable \"%s\" before being assigned a value", pointID));
               return null;
            }

            if (primitiveTypes.contains(objType)){
               errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes", objID));
               return null;
            }
            for (aglParser.AssignmentContext assignment : ctx.assignment()) {
               aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
               ObjectAttrAssignment(objID, objType, asgn.ID().getText(), asgn.expr());
            }
            hasValue.put(objID, true);
            return null;
         }


         @Override public Object visitGraphicalObjectUpdate(aglParser.GraphicalObjectUpdateContext ctx) {
            String objID = inModel + (String) visit(ctx.object());
            String objType = variables.get(objID);

            if (objType == null) {
               errorList.add(String.format("Variable \"%s\" not initialized before assignment! (Graphical Object Update)", objID));
               return null;
            }

            if (primitiveTypes.contains(objType)){
               errorList.add(String.format("Variable \"%s\" is not a graphical object, cannot change its attributes (Graphical Object Update)", objID));
               return null;
            }

            for (aglParser.AssignmentContext assignment : ctx.assignment()) {
               aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
               ObjectAttrAssignment(objID, objType, asgn.ID().getText(), asgn.expr());
            }
            hasValue.put(objID, true);
            return null;
         }


         @Override
         public Object visitGraphicalObjectModelInstantiationID(
               aglParser.GraphicalObjectModelInstantiationIDContext ctx) {
            visit(ctx.instantiation());
            String varID = ctx.instantiation().varName;
            if (varID == null){
               return null;
            }
            String objType = ctx.instantiation().type().getText();

            String pointID = ctx.pointID.getText();
            String pointType = variables.get(pointID);
            if (pointType == null) {
               errorList.add(String.format("Variable \"%s\" used before being instantiated!", pointID));
               return null;
            }

            if (!pointType.equals("Point")) {
               errorList.add(String.format("Variable \"%s\" is not of type point. Can only instantiate graphical figure at a Point!", pointID));
               return null;
            }

            if(!hasValue.get(pointID)) {
               errorList.add(String.format("Variable \"%s\" before being assigned a value", pointID));
               return null;
            }

            String[] keySet = variables.keySet().toArray(new String[variables.keySet().size()]);
            for (String variable : keySet) {
               if (!variable.contains(objType))
                  continue;
               String objVar = variable.replace(objType, varID);
               variables.put(objVar, variables.get(variable));
            }

            // Define that has value if its User Defined Model
            hasValue.put(varID, userDefinedModels.contains(objType));

            return null;
         }

         
         @Override
         public Object visitGraphicalObjectModelInstantiationCoords(
            aglParser.GraphicalObjectModelInstantiationCoordsContext ctx) {
            visit(ctx.instantiation());

            String varID = ctx.instantiation().varName;
            if (varID == null){
               return null;
            }
            visit(ctx.point());

            String objType = ctx.instantiation().type().getText();
            String[] keySet = variables.keySet().toArray(new String[variables.keySet().size()]);

            for (String variable : keySet) {
               if (variable == null){continue;}
               if (!variable.contains(objType))
                  continue;
               String objVar = variable.replace(objType, varID);
               variables.put(objVar, variables.get(variable));
            }

            // Define that has value if its User Defined Model
            hasValue.put(varID, userDefinedModels.contains(objType));
            
            return null;
         }
            
         @Override
         public Object visitGraphicalObjectModelID(aglParser.GraphicalObjectModelIDContext ctx) {
            visit(ctx.objectType());

            String pointID = ctx.pointID.getText();
            String pointType = variables.get(pointID);
            if (pointType == null) {
               errorList.add(String.format("Variable \"%s\" used before being instantiated!", pointID));
               return null;
            }

            if (!pointType.equals("Point")) {
               errorList.add(String.format("Variable \"%s\" is not of type point. Can only instantiate graphical figure at a Point!", pointID));
               return null;
            }

            if(!hasValue.get(pointID)) {
               errorList.add(String.format("Variable \"%s\" before being assigned a value", pointID));
            }
            return null;
         }
         
         @Override
         public Object visitGraphicalObjectModelIDCoords(aglParser.GraphicalObjectModelIDCoordsContext ctx) {
            visit(ctx.objectType());
            visit(ctx.point());
            return null;
         }
         @Override
         public Object visitGraphicalObjectAssignmentEnum(aglParser.GraphicalObjectAssignmentEnumContext ctx) {
            if (inModel == "") {
               errorList.add("Can only instantiate Enum inside model!");
               return null;
            }
            String varID = inModel + ctx.modelID.getText();
            variables.put(varID, "Enum");
            hasValue.put(varID, true);
            
            ArrayList<String> enumList = enumMap.getOrDefault(varID, new ArrayList<String>()); 
            for (TerminalNode enumItem : ctx.ID()) {
               enumList.add(enumItem.getText());
            }
            enumList.remove(ctx.ID(0).getText());
            enumMap.put(varID, enumList);
            return null;
         }
         /* END GRAPHICALOBJECT VISITORS */
      
      
      
      @Override
      public Object visitAction(aglParser.ActionContext ctx) {
         action = ctx.ID().getText();
         if (enumMap.get(inModel + action) != null)
            ctx.actionIf().forEach(this::visit);
         else {
            errorList.add(String.format("Enum \"%s\" not initialized before action", action));
         }
         action = null;
         return null;
      }
      

      @Override
      public Object visitActionIfStat(aglParser.ActionIfStatContext ctx) {
         ArrayList<String> enumList = enumMap.get(inModel + action);
         if (!ctx.ID(0).getText().equals(action)) {
            errorList.add("Action object does not match state object!");
            return null;
         }
         if (!enumList.contains(ctx.ID(1).getText())){
            errorList.add(String.format("Enum \"%s\" does not contain value \"%s\"!", action, ctx.ID(1).getText()));
            return null;
         }
         visit(ctx.stat());
         return null;
      }

      @Override
      public Object visitActionIfElseIf(aglParser.ActionIfElseIfContext ctx) {
         ArrayList<String> enumList = enumMap.get(inModel + action);
         if (!ctx.ID(0).getText().equals(action)) {
            errorList.add("Action object does not match state object!");
            return null;
         }
         if (!enumList.contains(ctx.ID(1).getText())){
            errorList.add(String.format("Enum \"%s\" does not contain value \"%s\"!", action, ctx.ID(1).getText()));
            return null;
         }
         visit(ctx.stat());
         visit(ctx.actionIf());
         return null;
      }

      @Override
      public Object visitActionIfElseStat(aglParser.ActionIfElseStatContext ctx) {
         ArrayList<String> enumList = enumMap.get(inModel + action);
         if (!ctx.ID(0).getText().equals(action)) {
            errorList.add("Action object does not match state object!");
            return null;
         }
         if (!enumList.contains(ctx.ID(1).getText())){
            errorList.add(String.format("Enum \"%s\" does not contain value \"%s\"!", action, ctx.ID(1).getText()));
            return null;
         }
         visit(ctx.ifBlock);
         visit(ctx.elseBlock);
         return null;
      }
      

      @Override
      public Object visitModelInstantiation(aglParser.ModelInstantiationContext ctx) {
         inModel = inModel + ctx.modelID.getText() + ".";
         for (aglParser.GraphicalObjectContext modelItems : ctx.graphicalObject()) {
            visit(modelItems);
         }
         inModel = "";

         userDefinedModels.add(ctx.modelID.getText());
         return null;
      }
      @Override public Object visitView(aglParser.ViewContext ctx) {
         visit(ctx.instantiation());
         if (ctx.instantiation().varName == null){
            return null;
         }

         String objID = ctx.instantiation().ID().getText();
         String objType = ctx.instantiation().type().getText();
         
         if (!objType.equals("View")) {
            errorList.add("Can only instantiate Views using \"ID with {}\"");
            return null;
         }
         
         for (aglParser.AssignmentContext assignment : ctx.assignment()) {
            aglParser.AssignmentExistingContext asgn = (aglParser.AssignmentExistingContext) assignment;
            ObjectAttrAssignment(objID, objType, asgn.ID().getText(), asgn.expr());
         }
         hasValue.put(objID, true);
         return null;
      }



      /* OBJECT VISITORS */
         @Override
         public Object visitObjectGraphical(aglParser.ObjectGraphicalContext ctx) {
            return (Object) ctx.ID().getText();
         }
         @Override
         public Object visitObjectModel(aglParser.ObjectModelContext ctx) {
            String chain = (String) visit(ctx.object());
            return chain + '.' + (Object) ctx.ID().getText();
         }
      /* END OBJECT VISITORS */
   
   /* END Graphical context                                                 */ 
   /************************************************************************/

   

   /************************************************************************/
   /* LOOPS                                                                */
      // Helpful function
      private Object visitConditional(aglParser.ExprContext exprContext) {
         visit(exprContext);
         if (exprResultType.equals("any")){
            exprResultType = null;
            return null;      
         }
         if (!exprResultType.equals("Boolean")) {
            errorList.add(String.format("If condition \"%s\" must be a boolean", exprContext.getText()));
         }
         exprResultType = null;
         return null;
      }
      
      /* IF_STAT VISITORS */
      @Override public Object visitIfStat(aglParser.IfStatContext ctx) 
         { return visitConditional(ctx.expr()); }  

      @Override public Object visitIfElseIf(aglParser.IfElseIfContext ctx) { visitConditional(ctx.expr()); 
           return visit(ctx.if_stat()); }

      @Override public Object visitIfElseStat(aglParser.IfElseStatContext ctx)
         { return visitConditional(ctx.expr()); }

      /* END IF_STAT VISITORS */

      @Override public Object visitWhileLoop(aglParser.WhileLoopContext ctx) 
         { return visitConditional(ctx.expr()); }

      @Override public Object visitForRange(aglParser.ForRangeContext ctx) {
         // TODO implementar para permitir ID's inves de só numeros no range
         String vartype = variables.get(ctx.ID().getText());
         if (vartype != null && (!vartype.equals("Number") && !vartype.equals("Integer")) ){
            errorList.add(String.format("Cannot assign a number to an existing ID \"%s\" of non-Number type", ctx.ID().getText()));
         }
         variables.put(vartype, "Number");

         if (!checkExprType(ctx.from, new String[] {"Integer", "Number"})){
            errorList.add("For cycle starting number must be a numerical type!");
         }

         if (!checkExprType(ctx.to, new String[] {"Integer", "Number"})){
            errorList.add("For cycle end number must be a numerical type!");
         }
         if (ctx.step != null && !checkExprType(ctx.step, new String[] {"Integer", "Number"})){
            errorList.add("For cycle step number must be a numerical type!");
         }
         
         return visit(ctx.stat());
      }

      @Override
      public Object visitForEachRange(aglParser.ForEachRangeContext ctx) {
         visit(ctx.expr());
         String expected = exprResultType;
         if (!expected.equals("Array") && !exprResultType.equals("any")) {
            errorList.add(String.format("Can only iterate through lists! \"%s\" is non-iterable", ctx.expr().getText()));
         }
         variables.put(ctx.ID().getText(), "any");
         hasValue.put(ctx.ID().getText(), true);
         exprResultType = null;
         return visit(ctx.stat());
      }
      

      private boolean checkExprType(aglParser.ExprContext ctx, String[] validTypes) {
         visit(ctx);
         String expected = exprResultType;
         exprResultType = null;

         if (expected == null) {
            // Cannot continute as one of them was catch to be null
            // returns as if it was correct to not raise false errors
            return true;
         }

         if (expected.equals("any")){
            return true;
         };
         for (String type : validTypes) {
            if (expected.equals(type)){
               return true;
            }
         }
         return false;
      }
   /* END LOOPS                                                             */
   /************************************************************************/



   /************************************************************************/
   /* Primitives Data Types                                                 */ 
      @Override
      public Object visitTime(aglParser.TimeContext ctx) {
         if (!checkExprType(ctx.expr(), new String[] {"Number", "Integer"})){
            errorList.add("Time must be a number!");
         }
         exprResultType = null;
         return null;
      }

      @Override
      public Object visitType(aglParser.TypeContext ctx){ 
         if (ctx.objectType() == null) {
            return (Object) ctx.getText();
         }
         return visit(ctx.objectType());
      }

      

      @Override
      public Object visitObjectType(aglParser.ObjectTypeContext ctx) {
         if (ctx.ID() == null) {
            return (Object) ctx.getText();
         }
         
         String modelName = ctx.getText();
         if (!userDefinedModels.contains(modelName)) {
            errorList.add(String.format("Type \"%s\" is not a valid type/Model.", modelName));
            return null;
         }
         return (Object) modelName;
      }


      @Override public Object visitPoint(aglParser.PointContext ctx) {
         if (checkExprType(ctx.expr(0), new String[]{"Number", "Integer"}) &&
             checkExprType(ctx.expr(1), new String[]{"Number", "Integer"})) {
            return null;
         }
         errorList.add("Point must be declared using only numerical types!");
         return null;
      }

      @Override public Object visitVectorPoint(aglParser.VectorPointContext ctx) { exprResultType = "Vector"; return null; }
      @Override public Object visitVectorPolar(aglParser.VectorPolarContext ctx) { exprResultType = "Vector"; return null; }
   /* END Primitives Data Types                                             */ 
   /************************************************************************/
}