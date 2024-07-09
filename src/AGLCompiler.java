import static java.lang.System.setOut;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class AGLCompiler extends aglBaseVisitor<ST> {

   private String inModel = "";

   STGroup templates = new STGroupFile("tkinter.stg");

   protected int varCount = 0;
   protected String newVarName() {
      varCount++;
      return "v"+varCount;
   }

   protected String view = null;

   @Override public ST visitProgram(aglParser.ProgramContext ctx) {
      ST template = templates.getInstanceOf("module");
      for (aglParser.StatContext statContext : ctx.stat()) {
         ST statTemplate = visit(statContext);
         if (statTemplate != null) {
            template.add("stat", statTemplate.render());
         }
      }

      return template;
   }

   @Override public ST visitStat(aglParser.StatContext ctx) {
      if (ctx.instantiation() != null) {
         return visit(ctx.instantiation());
      } else if (ctx.assignment() != null) {
         return visit(ctx.assignment());
      } else if (ctx.functions() != null) {
         return visit(ctx.functions());
      } else if (ctx.view() != null) {
         return visit(ctx.view());
      } else if (ctx.graphicalObject() != null) {
         return visit(ctx.graphicalObject());
      } else if (ctx.for_loop() != null) {
         return visit(ctx.for_loop());
      } else if (ctx.if_stat() != null) {
         return visit(ctx.if_stat());
      } else if (ctx.while_loop() != null) {
         return visit(ctx.while_loop());
      } else if (ctx.modelInstantiation() != null) {  // Estava ctx.model()
         return visit(ctx.modelInstantiation());
      } else if (!ctx.stat().isEmpty()) {
         ST stat = templates.getInstanceOf("stats");
         for (aglParser.StatContext statCtx : ctx.stat()) {
            stat.add("stat", visit(statCtx).render());
         }
         return stat;
      }
      return null;
   }

   @Override public ST visitAssignmentExisting(aglParser.AssignmentExistingContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      String var = ctx.ID().getText();
      template.add("stat", visit(ctx.expr()).render()); 
      template.add("var", var);
      template.add("value", ctx.expr().varName);
      return template;
   }

   @Override public ST visitAssignmentInstatiation(aglParser.AssignmentInstatiationContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      String var = ctx.instantiation().ID().getText();
      template.add("stat", visit(ctx.expr()).render());
      template.add("var", var);
      template.add("value", ctx.expr().varName);
      return template;
   }

   @Override public ST visitAssignmentObjectAttribute(aglParser.AssignmentObjectAttributeContext ctx) {
      ST template = templates.getInstanceOf("attribute_assign");
      String objectVar = ctx.ID(0).getText();
      String attribute = ctx.ID(1).getText();
      template.add("stat", visit(ctx.expr()).render());
      String value = ctx.expr().varName;
      template.add("objectVar", objectVar);
      template.add("attribute", attribute);
      template.add("value", value);
      return template;
   }

   
   @Override
   public ST visitAssignmentEvents(aglParser.AssignmentEventsContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      template.add("stat", visit(ctx.event()).render());
      String var = ctx.instantiation().ID().getText();
      template.add("var", var);
      template.add("value", ctx.event().varName);
      return template;
   }

   @Override
   public ST visitAssignmentArray(aglParser.AssignmentArrayContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      String arrayVar = ctx.ID().getText();
      template.add("stat", visit(ctx.expr(0)).render());
      template.add("stat", visit(ctx.expr(1)).render());
      template.add("var", String.format("%s[%s]", arrayVar, ctx.expr(0).varName));
      template.add("value", ctx.expr(1).varName);
      return template;
   }

   // Not necessary
   @Override public ST visitInstantiation(aglParser.InstantiationContext ctx) {
      ST template = null;
      return visitChildren(ctx);
      //return template;
   }

   @Override public ST visitExprNotBoolean(aglParser.ExprNotBooleanContext ctx) { 
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, "", visit(ctx.expr()).render(), 
            ctx.varName,
            "", " not ", ctx.expr().varName
         );
   }
   
   @Override public ST visitExprBooleanAND(aglParser.ExprBooleanANDContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName,
            ctx.e1.varName, "and", ctx.e2.varName
         );
   }

   @Override public ST visitExprArray(aglParser.ExprArrayContext ctx) {
      ctx.varName = newVarName();
      ST template = templates.getInstanceOf("assignment");
      template.add("var", ctx.varName);
      template.add("value", ctx.getText());
      return template;
   }

   @Override public ST visitExprEvent(aglParser.ExprEventContext ctx) {
      ST template = visit(ctx.events());
      ctx.varName = ctx.events().varName;
      return template;
   }

   @Override public ST visitExprUnaryOperator(aglParser.ExprUnaryOperatorContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, "", visit(ctx.expr()).render(), 
            ctx.varName,
            "", ctx.sign.getText(), ctx.expr().varName
         );
   }

   @Override public ST visitExprInteger(aglParser.ExprIntegerContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", ctx.Integer().getText());
      return template;
   }

   @Override public ST visitExprRealNumber(aglParser.ExprRealNumberContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", ctx.Number().getText());
      return template;
   }

   @Override public ST visitExprString(aglParser.ExprStringContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", ctx.String().getText());
      return template;
   }

   @Override public ST visitExprPoint(aglParser.ExprPointContext ctx) {
      ST point = templates.getInstanceOf("point");
      ctx.varName = newVarName();
      point.add("stat", visit(ctx.point()).render());
      point.add("var", ctx.varName);
      point.add("x", ctx.point().expr(0).varName);
      point.add("y", ctx.point().expr(1).varName);
      return point;
   }

   @Override public ST visitExprBoolCompare(aglParser.ExprBoolCompareContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName,
            ctx.e1.varName, ctx.getChild(1).getText(), ctx.e2.varName
         );
   }

   @Override public ST visitExprBoolean(aglParser.ExprBooleanContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      String value = ctx.Boolean().getText();
      template.add("value", value.substring(0, 1).toUpperCase() + value.substring(1));   
      return template;
   }

   @Override public ST visitExprBooleanOR(aglParser.ExprBooleanORContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName,
            ctx.e1.varName, "or", ctx.e2.varName
         );
   }

   @Override public ST visitExprParenthesis(aglParser.ExprParenthesisContext ctx) {
      ST template = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return template;
   }

   @Override public ST visitExprVector(aglParser.ExprVectorContext ctx) {
      // Vector is only visited if its polar coordinates
      // Else it will be treated as a point
      ctx.varName = newVarName();
      ST template = templates.getInstanceOf("vectorPolar");
      
      aglParser.VectorPolarContext vectorctx = (aglParser.VectorPolarContext) ctx.vector();
      template.add("stat", visit(vectorctx.expr(0)).render());
      template.add("stat", visit(vectorctx.expr(1)).render());

      template.add("var", ctx.varName);
      template.add("angle", vectorctx.expr(0).varName);
      template.add("length", vectorctx.expr(1).varName);
      return template;
   }

   @Override public ST visitExprPow(aglParser.ExprPowContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName, 
            ctx.e1.varName, "**", ctx.e2.varName
         );
   }

   @Override public ST visitExprMultDiv(aglParser.ExprMultDivContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName,
            ctx.e1.varName, ctx.op.getText(), ctx.e2.varName
         );
   }

   @Override public ST visitExprAddSub(aglParser.ExprAddSubContext ctx) {
      ctx.varName = newVarName();
      return binaryExpression(
            ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), 
            ctx.varName,
            ctx.e1.varName, ctx.op.getText(), ctx.e2.varName
         );
   }

   protected ST binaryExpression(ParserRuleContext ctx, String e1Stats, String e2Stats, String var, String e1Var, String op, String e2Var) {
      ST res = templates.getInstanceOf("binaryExpression");
      res.add("stat", e1Stats);
      res.add("stat", e2Stats);
      res.add("var", var);
      res.add("expr1", e1Var);
      res.add("op", op);
      res.add("expr2", e2Var);
      return res;
   }

   @Override public ST visitExprID(aglParser.ExprIDContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", ctx.ID().getText());   
      return template;
   }

   @Override public ST visitEvents(aglParser.EventsContext ctx) {
      ST template = visit(ctx.event());
      ctx.varName = ctx.event().varName;
      return template;
   }

   @Override public ST visitEventMouseClick(aglParser.EventMouseClickContext ctx) {
      ST template = templates.getInstanceOf("wait_mouse_click");
      ctx.varName = newVarName();
      template.add("view", view);
      template.add("eventName", newVarName());
      template.add("pointName", ctx.varName);
      return template;
   }

   @Override public ST visitEventReadInput(aglParser.EventReadInputContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", String.format("input(%s)", ctx.String() != null ? ctx.String().getText() : null));
      return template;
   }

   @Override
   public ST visitEventLoadFile(aglParser.EventLoadFileContext ctx) {
      ST template = templates.getInstanceOf("load");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("fileName", ctx.String().getText());
      return template;
   }

   @Override
   public ST visitExprArrayAccess(aglParser.ExprArrayAccessContext ctx) {
      ST template = templates.getInstanceOf("assignment");
      ctx.varName = newVarName();
      template.add("var", ctx.varName);
      template.add("value", ctx.ID().getText() + "[" + ctx.expr().getText() + "]");
      return template;
   }

   @Override public ST visitFunctionClose(aglParser.FunctionCloseContext ctx) {
      ST template = templates.getInstanceOf("close");
      template.add("view", ctx.ID().getText());
      return template;
   }

   @Override public ST visitFunctionRefresh(aglParser.FunctionRefreshContext ctx) {
      ST template = templates.getInstanceOf("refresh");
      template.add("view", ctx.ID().getText());
      if (ctx.time() != null) {
         template.add("stat", visit(ctx.time()).render());
         if (ctx.time().ts.getText().equals("s")) {
            template.add("time", ctx.time().expr().varName);
         } else if (ctx.time().ts.getText().equals("ms")) {
            template.add("time", String.format("float(%s)/1000", ctx.time().expr().varName));
         }
      }

      return template;
   }

   @Override public ST visitFunctionPrint(aglParser.FunctionPrintContext ctx) {
      ST template = templates.getInstanceOf("print");
      template.add("stat", visit(ctx.expr()).render());
      template.add("string", ctx.expr().varName);
      return template;
   }

   @Override public ST visitFunctionMoveVector(aglParser.FunctionMoveVectorContext ctx) {
      ST template = null;
      if (ctx.s.getText().equals("by")) {
         template = templates.getInstanceOf("move_by");
         template.add("view", view);
         template.add("stat", visit(ctx.point()).render());
         template.add("stat", visit(ctx.expr()).render());
         template.add("objectsVar", ctx.expr().varName);
         template.add("x", ctx.point().x1.varName);
         template.add("y", ctx.point().x2.varName);
      } else {
         template = templates.getInstanceOf("move_to");
         template.add("view", view);
         template.add("stat", visit(ctx.point()).render());
         template.add("stat", visit(ctx.expr()).render());
         template.add("objectsVar", ctx.expr().varName);
         template.add("x", ctx.point().x1.varName);
         template.add("y", ctx.point().x2.varName);
      }
      return template;
   }

   @Override public ST visitFunctionMoveID(aglParser.FunctionMoveIDContext ctx) {
      ST template = null;
      if (ctx.s.getText().equals("by")) {
         template = templates.getInstanceOf("move_by");
         template.add("view", view);
         template.add("stat", visit(ctx.expr()).render());
         template.add("objectsVar", ctx.expr().varName);
         String pointVar = ctx.ID().getText();
         template.add("x", pointVar + "[0]");
         template.add("y", pointVar + "[1]");
      } else {
         template = templates.getInstanceOf("move_to");
         template.add("view", view);
         template.add("stat", visit(ctx.expr()).render());
         template.add("objectsVar", ctx.expr().varName);
         String pointVar = ctx.ID().getText();
         template.add("x", pointVar + "[0]");
         template.add("y", pointVar + "[1]");
      }
      return template;
   }



   @Override
   public ST visitFunctionPlayScript(aglParser.FunctionPlayScriptContext ctx) {
      ST template = templates.getInstanceOf("interpreter");
      String script = ctx.ID().getText();
      template.add("script", script);

      List<String> propList = new ArrayList<>();
      List<String> valueList = new ArrayList<>();
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String prop = assign.ID().getText();
         propList.add(prop);
         template.add("stat", visit(assign.expr()).render());
         String value = assign.expr().varName;
         valueList.add(value);
      }
      template.add("propsVals", combinePropVals(propList, valueList));
      return template;
   }

   @Override public ST visitTime(aglParser.TimeContext ctx) {
      ST template = templates.getInstanceOf("stats");
      template.add("stat", visit(ctx.expr()).render());
      return template;
   }

   @Override public ST visitIfStat(aglParser.IfStatContext ctx) {
      ST template = templates.getInstanceOf("if_stat");

      String expr = ctx.expr()
                     .getText()
                     .replaceAll("\\&\\&", " and ")
                     .replaceAll("\\|\\|", " or ")
                     .replaceAll("!", " not ");

      template.add("expr", expr);
      template.add("statIf", visit(ctx.stat()).render());

      return template;
   }

   @Override public ST visitIfElseStat(aglParser.IfElseStatContext ctx) {
      ST template = templates.getInstanceOf("if_else_stat");

      String expr = ctx.expr()
                     .getText()
                     .replaceAll("\\&\\&", " and ")
                     .replaceAll("\\|\\|", " or ")
                     .replaceAll("!", " not ");
      template.add("expr", expr);

      template.add("statIf", visit(ctx.ifBlock).render());
      template.add("statElse", visit(ctx.elseBlock).render());
      return template;
   }

   @Override public ST visitIfElseIf(aglParser.IfElseIfContext ctx) {
      ST template = templates.getInstanceOf("if_elif_stat");
      String expr = ctx.expr()
                     .getText()
                     .replaceAll("\\&\\&", " and ")
                     .replaceAll("\\|\\|", " or ")
                     .replaceAll("!", " not ");
      template.add("expr", expr);
      template.add("statIf", visit(ctx.stat()).render());

      template.add("elif", visit(ctx.if_stat()).render());

      return template;
   }

   @Override public ST visitWhileLoop(aglParser.WhileLoopContext ctx) {
      ST template = templates.getInstanceOf("while_loop");
      String expr = ctx.expr()
                     .getText()
                     .replaceAll("\\&\\&", " and ")
                     .replaceAll("\\|\\|", " or ")
                     .replaceAll("!", " not ");
      template.add("expr", expr);
      template.add("statWhile", visit(ctx.stat()).render());

      return template;
   }

   @Override public ST visitForRange(aglParser.ForRangeContext ctx) {
      ST template = templates.getInstanceOf("for_loop");
      template.add("stat", visit(ctx.from).render());
      template.add("stat", visit(ctx.to).render());
      
      if (ctx.step != null) {
         template.add("stat", visit(ctx.step).render());
      }

      template.add("var", ctx.ID().getText());
      template.add("from", ctx.from.varName);
      template.add("to", ctx.to.varName);
      
      if (ctx.step != null) {
         template.add("step", ctx.step.varName);
      } else {
         template.add("step", 1);
      }

      template.add("statFor", visit(ctx.stat()).render());

      return template;
   }

   @Override public ST visitForEachRange(aglParser.ForEachRangeContext ctx) {
      ST template = templates.getInstanceOf("for_each_loop");
      template.add("stat", visit(ctx.expr()).render());
   

      template.add("var", ctx.ID().getText());
      template.add("expr", ctx.expr().varName);

      template.add("statFor", visit(ctx.stat()).render());

      return template;
   }

   @Override public ST visitGraphicalObjectIDCoords(aglParser.GraphicalObjectIDCoordsContext ctx) {
      String objectName = ctx.objectType().getText();
      ST template = templates.getInstanceOf("create_object");
      template.add("stat", visit(ctx.point()).render());
      template.add("view", view);
      String objectVar = newVarName();
      template.add("objectVar", objectVar);
      template.add("figure", objectName);
      String referencePoint = String.format("(%s, %s)",  ctx.point().expr(0).varName, ctx.point().expr(1).varName);
      template.add("referencePoint", referencePoint);

      List<String> propList = new ArrayList<>();
      List<String> valueList = new ArrayList<>();
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String prop = assign.ID().getText();
         propList.add(prop);
         template.add("stat", visit(assign.expr()).render());
         String value = assign.expr().varName;
         valueList.add(value);
      }
      template.add("propsVals", combinePropVals(propList, valueList));
      
      return template;
   }

   protected String combinePropVals(List<String> props, List<String> values) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < props.size(); i++) {
         if (i > 0) sb.append(", ");
         sb.append(props.get(i)).append("=").append(values.get(i));
      }
      return sb.toString();
   }

   @Override public ST visitGraphicalObjectInstatiationCoords(aglParser.GraphicalObjectInstatiationCoordsContext ctx) {
      String objectVar = ctx.instantiation().ID().getText();
      String objectType = ctx.instantiation().type().getText();

      ST template = templates.getInstanceOf("create_object");
      template.add("stat", visit(ctx.point()).render());
      template.add("objectVar", objectVar);
      template.add("figure", objectType);
      String referencePoint = String.format("(%s, %s)",  ctx.point().expr(0).varName, ctx.point().expr(1).varName);
      template.add("referencePoint", referencePoint);
      
      template.add("view", view);
      List<String> propList = new ArrayList<>();
      List<String> valueList = new ArrayList<>();
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String prop = assign.ID().getText();
         propList.add(prop);
         template.add("stat", visit(assign.expr()).render());
         String value = assign.expr().varName;
         valueList.add(value);
      }
      template.add("propsVals", combinePropVals(propList, valueList));
      
      return template;
   }

   @Override public ST visitGraphicalObjectID(aglParser.GraphicalObjectIDContext ctx) {
      String objectName = ctx.objectType().getText();
      String pointVar = ctx.ID().getText();
      ST template = templates.getInstanceOf("create_object");
      template.add("view", view);
      String objectVar = newVarName();
      template.add("objectVar", objectVar);
      template.add("figure", objectName);
      template.add("referencePoint", pointVar);

      List<String> propList = new ArrayList<>();
      List<String> valueList = new ArrayList<>();
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String prop = assign.ID().getText();
         propList.add(prop);
         template.add("stat", visit(assign.expr()).render());
         String value = assign.expr().varName;
         valueList.add(value);
      }
      template.add("propsVals", combinePropVals(propList, valueList));
      
      return template;
   }

   @Override public ST visitGraphicalObjectInstatiationID(aglParser.GraphicalObjectInstatiationIDContext ctx) {
      String objectVar = ctx.instantiation().ID().getText();
      String objectName = ctx.instantiation().type().getText();
      String pointVar = ctx.ID().getText();
      ST template = templates.getInstanceOf("create_object");
      template.add("view", view);
      template.add("objectVar", objectVar);
      template.add("figure", objectName);
      template.add("referencePoint", pointVar);

      List<String> propList = new ArrayList<>();
      List<String> valueList = new ArrayList<>();
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String prop = assign.ID().getText();
         propList.add(prop);
         template.add("stat", visit(assign.expr()).render());
         String value = assign.expr().varName;
         valueList.add(value);
      }
      template.add("propsVals", combinePropVals(propList, valueList));
      
      return template;
   }

   @Override public ST visitGraphicalObjectUpdate(aglParser.GraphicalObjectUpdateContext ctx) {
      ST template = templates.getInstanceOf("stats");
      visit(ctx.object());
      String objectVar = ctx.object().varName;
      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         ST attribute_assign = templates.getInstanceOf("attribute_assign");
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         template.add("stat", visit(assign.expr()).render());
         String prop = assign.ID().getText();
         String value = assign.expr().varName;
         attribute_assign.add("objectVar", objectVar);
         attribute_assign.add("attribute", prop);
         attribute_assign.add("value", value);
         template.add("stat", attribute_assign.render());
      }
      return template;
   }

   @Override public ST visitView(aglParser.ViewContext ctx) {
      ST template = templates.getInstanceOf("view");
      String viewName = ctx.instantiation().ID().getText(); // Obter texto de nó terminal CTRL Z aqui e na gram
      template.add("viewName", viewName);
      view = viewName;

      for (aglParser.AssignmentContext assignCtx : ctx.assignment()) {
         aglParser.AssignmentExistingContext assign = (aglParser.AssignmentExistingContext) assignCtx;
         String attribute = assign.ID().getText();
         String value = assign.expr().getText();

         ST viewOptionsTemplate = templates.getInstanceOf("option");
         viewOptionsTemplate.add("attribute", attribute);
         viewOptionsTemplate.add("value", value);

         template.add("attributeValue", viewOptionsTemplate.render());
      }
      return template;
   }

   @Override public ST visitPoint(aglParser.PointContext ctx) {
      ST template = templates.getInstanceOf("stats");
      template.add("stat", visit(ctx.expr(0)).render());
      template.add("stat", visit(ctx.expr(1)).render());
      return template;
   }

   // Not necessary
   @Override public ST visitVectorPoint(aglParser.VectorPointContext ctx) {
      ST template = null;
      return visitChildren(ctx);
   }

   // Not necessary
   @Override public ST visitVectorPolar(aglParser.VectorPolarContext ctx) {
      ST template = null;
      return visitChildren(ctx);
   }

   @Override
   public ST visitObjectGraphical(aglParser.ObjectGraphicalContext ctx) {
      ctx.varName = ctx.ID().getText();
      return null;
   }

   @Override
   public ST visitObjectModel(aglParser.ObjectModelContext ctx) {
      // TODO Make compatible with models
      return null;
   }

   // @Override
   // public ST visitAction(aglParser.ActionContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitAction(ctx);
   // }

   // @Override
   // public ST visitActionIfElseIf(aglParser.ActionIfElseIfContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitActionIfElseIf(ctx);
   // }

   // @Override
   // public ST visitActionIfElseStat(aglParser.ActionIfElseStatContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitActionIfElseStat(ctx);
   // }

   // @Override
   // public ST visitActionIfStat(aglParser.ActionIfStatContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitActionIfStat(ctx);
   // }

   // @Override
   // public ST visitGraphicalObjectAssignmentEnum(aglParser.GraphicalObjectAssignmentEnumContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitGraphicalObjectAssignmentEnum(ctx);
   // }

   // @Override
   // public ST visitGraphicalObjectModelID(aglParser.GraphicalObjectModelIDContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitGraphicalObjectModelID(ctx);
   // }

   // @Override
   // public ST visitGraphicalObjectModelIDCoords(aglParser.GraphicalObjectModelIDCoordsContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitGraphicalObjectModelIDCoords(ctx);
   // }

   // @Override
   // public ST visitGraphicalObjectModelInstantiationCoords(
   //       aglParser.GraphicalObjectModelInstantiationCoordsContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitGraphicalObjectModelInstantiationCoords(ctx);
   // }

   // @Override
   // public ST visitGraphicalObjectModelInstantiationID(aglParser.GraphicalObjectModelInstantiationIDContext ctx) {
   //    // TODO Auto-generated method stub
   //    return super.visitGraphicalObjectModelInstantiationID(ctx);
   // }

   // @Override
   // public ST visitModelInstantiation(aglParser.ModelInstantiationContext ctx) {
   //    ST template = templates.getInstanceOf("modelInstantiation");
   //    inModel = inModel + ctx.modelID.getText() + ".";

   //    for (aglParser.GraphicalObjectContext modelItems : ctx.graphicalObject()) {
   //       ST modelChild = templates.getInstanceOf("modelChild");
   //       visit(modelItems);

   //       // Para já ignoramos actions
   //       modelChild.add("objId", modelItems.varName );

   //       template.add("modelChildren", viewOptionsTemplate.render());
   //    }
   //    template.add("modelContents", modelChildren.render());

   //    inModel = "";
   //    return template;
   // }

   // Not necessary
   @Override
   public ST visitType(aglParser.TypeContext ctx) {
      ST template = null;
      return template;
   }
   
}
