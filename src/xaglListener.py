# Generated from xagl.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .xaglParser import xaglParser
else:
    from xaglParser import xaglParser

# This class defines a complete listener for a parse tree produced by xaglParser.
class xaglListener(ParseTreeListener):

    # Enter a parse tree produced by xaglParser#program.
    def enterProgram(self, ctx:xaglParser.ProgramContext):
        pass

    # Exit a parse tree produced by xaglParser#program.
    def exitProgram(self, ctx:xaglParser.ProgramContext):
        pass


    # Enter a parse tree produced by xaglParser#stat.
    def enterStat(self, ctx:xaglParser.StatContext):
        pass

    # Exit a parse tree produced by xaglParser#stat.
    def exitStat(self, ctx:xaglParser.StatContext):
        pass


    # Enter a parse tree produced by xaglParser#FunctionRefreshTime.
    def enterFunctionRefreshTime(self, ctx:xaglParser.FunctionRefreshTimeContext):
        pass

    # Exit a parse tree produced by xaglParser#FunctionRefreshTime.
    def exitFunctionRefreshTime(self, ctx:xaglParser.FunctionRefreshTimeContext):
        pass


    # Enter a parse tree produced by xaglParser#FunctionMoveVector.
    def enterFunctionMoveVector(self, ctx:xaglParser.FunctionMoveVectorContext):
        pass

    # Exit a parse tree produced by xaglParser#FunctionMoveVector.
    def exitFunctionMoveVector(self, ctx:xaglParser.FunctionMoveVectorContext):
        pass


    # Enter a parse tree produced by xaglParser#FunctionMovePoint.
    def enterFunctionMovePoint(self, ctx:xaglParser.FunctionMovePointContext):
        pass

    # Exit a parse tree produced by xaglParser#FunctionMovePoint.
    def exitFunctionMovePoint(self, ctx:xaglParser.FunctionMovePointContext):
        pass


    # Enter a parse tree produced by xaglParser#AssigmentObjectAttribute.
    def enterAssigmentObjectAttribute(self, ctx:xaglParser.AssigmentObjectAttributeContext):
        pass

    # Exit a parse tree produced by xaglParser#AssigmentObjectAttribute.
    def exitAssigmentObjectAttribute(self, ctx:xaglParser.AssigmentObjectAttributeContext):
        pass


    # Enter a parse tree produced by xaglParser#InstantiateObject.
    def enterInstantiateObject(self, ctx:xaglParser.InstantiateObjectContext):
        pass

    # Exit a parse tree produced by xaglParser#InstantiateObject.
    def exitInstantiateObject(self, ctx:xaglParser.InstantiateObjectContext):
        pass


    # Enter a parse tree produced by xaglParser#ForRange.
    def enterForRange(self, ctx:xaglParser.ForRangeContext):
        pass

    # Exit a parse tree produced by xaglParser#ForRange.
    def exitForRange(self, ctx:xaglParser.ForRangeContext):
        pass


    # Enter a parse tree produced by xaglParser#WhileLoop.
    def enterWhileLoop(self, ctx:xaglParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by xaglParser#WhileLoop.
    def exitWhileLoop(self, ctx:xaglParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by xaglParser#IfStat.
    def enterIfStat(self, ctx:xaglParser.IfStatContext):
        pass

    # Exit a parse tree produced by xaglParser#IfStat.
    def exitIfStat(self, ctx:xaglParser.IfStatContext):
        pass


    # Enter a parse tree produced by xaglParser#IfElseIf.
    def enterIfElseIf(self, ctx:xaglParser.IfElseIfContext):
        pass

    # Exit a parse tree produced by xaglParser#IfElseIf.
    def exitIfElseIf(self, ctx:xaglParser.IfElseIfContext):
        pass


    # Enter a parse tree produced by xaglParser#IfElseStat.
    def enterIfElseStat(self, ctx:xaglParser.IfElseStatContext):
        pass

    # Exit a parse tree produced by xaglParser#IfElseStat.
    def exitIfElseStat(self, ctx:xaglParser.IfElseStatContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprBooleanAND.
    def enterExprBooleanAND(self, ctx:xaglParser.ExprBooleanANDContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprBooleanAND.
    def exitExprBooleanAND(self, ctx:xaglParser.ExprBooleanANDContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprPropertyAccess.
    def enterExprPropertyAccess(self, ctx:xaglParser.ExprPropertyAccessContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprPropertyAccess.
    def exitExprPropertyAccess(self, ctx:xaglParser.ExprPropertyAccessContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprUnaryOperator.
    def enterExprUnaryOperator(self, ctx:xaglParser.ExprUnaryOperatorContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprUnaryOperator.
    def exitExprUnaryOperator(self, ctx:xaglParser.ExprUnaryOperatorContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprString.
    def enterExprString(self, ctx:xaglParser.ExprStringContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprString.
    def exitExprString(self, ctx:xaglParser.ExprStringContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprPoint.
    def enterExprPoint(self, ctx:xaglParser.ExprPointContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprPoint.
    def exitExprPoint(self, ctx:xaglParser.ExprPointContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprBoolCompare.
    def enterExprBoolCompare(self, ctx:xaglParser.ExprBoolCompareContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprBoolCompare.
    def exitExprBoolCompare(self, ctx:xaglParser.ExprBoolCompareContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprBoolean.
    def enterExprBoolean(self, ctx:xaglParser.ExprBooleanContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprBoolean.
    def exitExprBoolean(self, ctx:xaglParser.ExprBooleanContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprBooleanOR.
    def enterExprBooleanOR(self, ctx:xaglParser.ExprBooleanORContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprBooleanOR.
    def exitExprBooleanOR(self, ctx:xaglParser.ExprBooleanORContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprParenthesis.
    def enterExprParenthesis(self, ctx:xaglParser.ExprParenthesisContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprParenthesis.
    def exitExprParenthesis(self, ctx:xaglParser.ExprParenthesisContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprNot.
    def enterExprNot(self, ctx:xaglParser.ExprNotContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprNot.
    def exitExprNot(self, ctx:xaglParser.ExprNotContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprVector.
    def enterExprVector(self, ctx:xaglParser.ExprVectorContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprVector.
    def exitExprVector(self, ctx:xaglParser.ExprVectorContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprAddSub.
    def enterExprAddSub(self, ctx:xaglParser.ExprAddSubContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprAddSub.
    def exitExprAddSub(self, ctx:xaglParser.ExprAddSubContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprNumber.
    def enterExprNumber(self, ctx:xaglParser.ExprNumberContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprNumber.
    def exitExprNumber(self, ctx:xaglParser.ExprNumberContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprMultDiv.
    def enterExprMultDiv(self, ctx:xaglParser.ExprMultDivContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprMultDiv.
    def exitExprMultDiv(self, ctx:xaglParser.ExprMultDivContext):
        pass


    # Enter a parse tree produced by xaglParser#ExprID.
    def enterExprID(self, ctx:xaglParser.ExprIDContext):
        pass

    # Exit a parse tree produced by xaglParser#ExprID.
    def exitExprID(self, ctx:xaglParser.ExprIDContext):
        pass


    # Enter a parse tree produced by xaglParser#time.
    def enterTime(self, ctx:xaglParser.TimeContext):
        pass

    # Exit a parse tree produced by xaglParser#time.
    def exitTime(self, ctx:xaglParser.TimeContext):
        pass


    # Enter a parse tree produced by xaglParser#point.
    def enterPoint(self, ctx:xaglParser.PointContext):
        pass

    # Exit a parse tree produced by xaglParser#point.
    def exitPoint(self, ctx:xaglParser.PointContext):
        pass


    # Enter a parse tree produced by xaglParser#VectorPoint.
    def enterVectorPoint(self, ctx:xaglParser.VectorPointContext):
        pass

    # Exit a parse tree produced by xaglParser#VectorPoint.
    def exitVectorPoint(self, ctx:xaglParser.VectorPointContext):
        pass


    # Enter a parse tree produced by xaglParser#VectorPolar.
    def enterVectorPolar(self, ctx:xaglParser.VectorPolarContext):
        pass

    # Exit a parse tree produced by xaglParser#VectorPolar.
    def exitVectorPolar(self, ctx:xaglParser.VectorPolarContext):
        pass



del xaglParser