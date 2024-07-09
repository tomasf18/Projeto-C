// Generated from /home/tomas/Desktop/ProjetoC/agl-gg08/src/agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aglParser}.
 */
public interface aglListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aglParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(aglParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(aglParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(aglParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(aglParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExisting}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExisting(aglParser.AssignmentExistingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExisting}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExisting(aglParser.AssignmentExistingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentInstatiation}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentInstatiation(aglParser.AssignmentInstatiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentInstatiation}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentInstatiation(aglParser.AssignmentInstatiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentObjectAttribute}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentObjectAttribute(aglParser.AssignmentObjectAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentObjectAttribute}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentObjectAttribute(aglParser.AssignmentObjectAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentEvents}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentEvents(aglParser.AssignmentEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentEvents}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentEvents(aglParser.AssignmentEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentArray(aglParser.AssignmentArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link aglParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentArray(aglParser.AssignmentArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(aglParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(aglParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionClose}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClose(aglParser.FunctionCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionClose}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClose(aglParser.FunctionCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionRefresh}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRefresh(aglParser.FunctionRefreshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionRefresh}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRefresh(aglParser.FunctionRefreshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionPrint}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrint(aglParser.FunctionPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionPrint}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrint(aglParser.FunctionPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionMoveVector}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMoveVector(aglParser.FunctionMoveVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionMoveVector}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMoveVector(aglParser.FunctionMoveVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionMoveID}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMoveID(aglParser.FunctionMoveIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionMoveID}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMoveID(aglParser.FunctionMoveIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionPlayScript}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPlayScript(aglParser.FunctionPlayScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionPlayScript}
	 * labeled alternative in {@link aglParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPlayScript(aglParser.FunctionPlayScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBooleanAND}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBooleanAND(aglParser.ExprBooleanANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBooleanAND}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBooleanAND(aglParser.ExprBooleanANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEvent}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEvent(aglParser.ExprEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEvent}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEvent(aglParser.ExprEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryOperator}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryOperator(aglParser.ExprUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryOperator}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryOperator(aglParser.ExprUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRealNumber}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRealNumber(aglParser.ExprRealNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRealNumber}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRealNumber(aglParser.ExprRealNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(aglParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(aglParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPoint}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPoint(aglParser.ExprPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPoint}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPoint(aglParser.ExprPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolCompare}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolCompare(aglParser.ExprBoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolCompare}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolCompare(aglParser.ExprBoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(aglParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(aglParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBooleanOR}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBooleanOR(aglParser.ExprBooleanORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBooleanOR}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBooleanOR(aglParser.ExprBooleanORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(aglParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(aglParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(aglParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(aglParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVector}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVector(aglParser.ExprVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVector}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVector(aglParser.ExprVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayAccess}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayAccess(aglParser.ExprArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayAccess}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayAccess(aglParser.ExprArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(aglParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(aglParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(aglParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(aglParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(aglParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(aglParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(aglParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(aglParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(aglParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link aglParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(aglParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(aglParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(aglParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventMouseClick}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEventMouseClick(aglParser.EventMouseClickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventMouseClick}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEventMouseClick(aglParser.EventMouseClickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventReadInput}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEventReadInput(aglParser.EventReadInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventReadInput}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEventReadInput(aglParser.EventReadInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventLoadFile}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEventLoadFile(aglParser.EventLoadFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventLoadFile}
	 * labeled alternative in {@link aglParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEventLoadFile(aglParser.EventLoadFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectIDCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectIDCoords(aglParser.GraphicalObjectIDCoordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectIDCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectIDCoords(aglParser.GraphicalObjectIDCoordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectInstatiationCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectInstatiationCoords(aglParser.GraphicalObjectInstatiationCoordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectInstatiationCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectInstatiationCoords(aglParser.GraphicalObjectInstatiationCoordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectID(aglParser.GraphicalObjectIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectID(aglParser.GraphicalObjectIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectInstatiationID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectInstatiationID(aglParser.GraphicalObjectInstatiationIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectInstatiationID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectInstatiationID(aglParser.GraphicalObjectInstatiationIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectUpdate}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectUpdate(aglParser.GraphicalObjectUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectUpdate}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectUpdate(aglParser.GraphicalObjectUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectModelInstantiationID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectModelInstantiationID(aglParser.GraphicalObjectModelInstantiationIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectModelInstantiationID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectModelInstantiationID(aglParser.GraphicalObjectModelInstantiationIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectModelInstantiationCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectModelInstantiationCoords(aglParser.GraphicalObjectModelInstantiationCoordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectModelInstantiationCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectModelInstantiationCoords(aglParser.GraphicalObjectModelInstantiationCoordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectModelID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectModelID(aglParser.GraphicalObjectModelIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectModelID}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectModelID(aglParser.GraphicalObjectModelIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectModelIDCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectModelIDCoords(aglParser.GraphicalObjectModelIDCoordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectModelIDCoords}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectModelIDCoords(aglParser.GraphicalObjectModelIDCoordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectAction}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectAction(aglParser.GraphicalObjectActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectAction}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectAction(aglParser.GraphicalObjectActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphicalObjectAssignmentEnum}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void enterGraphicalObjectAssignmentEnum(aglParser.GraphicalObjectAssignmentEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphicalObjectAssignmentEnum}
	 * labeled alternative in {@link aglParser#graphicalObject}.
	 * @param ctx the parse tree
	 */
	void exitGraphicalObjectAssignmentEnum(aglParser.GraphicalObjectAssignmentEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(aglParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(aglParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionIfStat}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void enterActionIfStat(aglParser.ActionIfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionIfStat}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void exitActionIfStat(aglParser.ActionIfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionIfElseIf}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void enterActionIfElseIf(aglParser.ActionIfElseIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionIfElseIf}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void exitActionIfElseIf(aglParser.ActionIfElseIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionIfElseStat}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void enterActionIfElseStat(aglParser.ActionIfElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionIfElseStat}
	 * labeled alternative in {@link aglParser#actionIf}.
	 * @param ctx the parse tree
	 */
	void exitActionIfElseStat(aglParser.ActionIfElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#modelInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterModelInstantiation(aglParser.ModelInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#modelInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitModelInstantiation(aglParser.ModelInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(aglParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(aglParser.ViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectModel}
	 * labeled alternative in {@link aglParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectModel(aglParser.ObjectModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectModel}
	 * labeled alternative in {@link aglParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectModel(aglParser.ObjectModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectGraphical}
	 * labeled alternative in {@link aglParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectGraphical(aglParser.ObjectGraphicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectGraphical}
	 * labeled alternative in {@link aglParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectGraphical(aglParser.ObjectGraphicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(aglParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(aglParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseIf}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIf(aglParser.IfElseIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseIf}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIf(aglParser.IfElseIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStat}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStat(aglParser.IfElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStat}
	 * labeled alternative in {@link aglParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStat(aglParser.IfElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link aglParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(aglParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link aglParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(aglParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForRange}
	 * labeled alternative in {@link aglParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterForRange(aglParser.ForRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForRange}
	 * labeled alternative in {@link aglParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitForRange(aglParser.ForRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEachRange}
	 * labeled alternative in {@link aglParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterForEachRange(aglParser.ForEachRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEachRange}
	 * labeled alternative in {@link aglParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitForEachRange(aglParser.ForEachRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(aglParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(aglParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(aglParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(aglParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(aglParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(aglParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aglParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(aglParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link aglParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(aglParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorPoint}
	 * labeled alternative in {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVectorPoint(aglParser.VectorPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorPoint}
	 * labeled alternative in {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVectorPoint(aglParser.VectorPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorPolar}
	 * labeled alternative in {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVectorPolar(aglParser.VectorPolarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorPolar}
	 * labeled alternative in {@link aglParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVectorPolar(aglParser.VectorPolarContext ctx);
}