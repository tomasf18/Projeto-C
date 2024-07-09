# Generated from xagl.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .xaglParser import xaglParser
else:
    from xaglParser import xaglParser

# This class defines a complete generic visitor for a parse tree produced by xaglParser.

class xaglVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by xaglParser#program.
    def visitProgram(self, ctx:xaglParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#stat.
    def visitStat(self, ctx:xaglParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#FunctionRefreshTime.
    def visitFunctionRefreshTime(self, ctx:xaglParser.FunctionRefreshTimeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#FunctionMoveVector.
    def visitFunctionMoveVector(self, ctx:xaglParser.FunctionMoveVectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#FunctionMovePoint.
    def visitFunctionMovePoint(self, ctx:xaglParser.FunctionMovePointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#AssigmentObjectAttribute.
    def visitAssigmentObjectAttribute(self, ctx:xaglParser.AssigmentObjectAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#InstantiateObject.
    def visitInstantiateObject(self, ctx:xaglParser.InstantiateObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ForRange.
    def visitForRange(self, ctx:xaglParser.ForRangeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#WhileLoop.
    def visitWhileLoop(self, ctx:xaglParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#IfStat.
    def visitIfStat(self, ctx:xaglParser.IfStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#IfElseIf.
    def visitIfElseIf(self, ctx:xaglParser.IfElseIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#IfElseStat.
    def visitIfElseStat(self, ctx:xaglParser.IfElseStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprBooleanAND.
    def visitExprBooleanAND(self, ctx:xaglParser.ExprBooleanANDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprPropertyAccess.
    def visitExprPropertyAccess(self, ctx:xaglParser.ExprPropertyAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprUnaryOperator.
    def visitExprUnaryOperator(self, ctx:xaglParser.ExprUnaryOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprString.
    def visitExprString(self, ctx:xaglParser.ExprStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprPoint.
    def visitExprPoint(self, ctx:xaglParser.ExprPointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprBoolCompare.
    def visitExprBoolCompare(self, ctx:xaglParser.ExprBoolCompareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprBoolean.
    def visitExprBoolean(self, ctx:xaglParser.ExprBooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprBooleanOR.
    def visitExprBooleanOR(self, ctx:xaglParser.ExprBooleanORContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprParenthesis.
    def visitExprParenthesis(self, ctx:xaglParser.ExprParenthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprNot.
    def visitExprNot(self, ctx:xaglParser.ExprNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprVector.
    def visitExprVector(self, ctx:xaglParser.ExprVectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprAddSub.
    def visitExprAddSub(self, ctx:xaglParser.ExprAddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprNumber.
    def visitExprNumber(self, ctx:xaglParser.ExprNumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprMultDiv.
    def visitExprMultDiv(self, ctx:xaglParser.ExprMultDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#ExprID.
    def visitExprID(self, ctx:xaglParser.ExprIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#time.
    def visitTime(self, ctx:xaglParser.TimeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#point.
    def visitPoint(self, ctx:xaglParser.PointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#VectorPoint.
    def visitVectorPoint(self, ctx:xaglParser.VectorPointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by xaglParser#VectorPolar.
    def visitVectorPolar(self, ctx:xaglParser.VectorPolarContext):
        return self.visitChildren(ctx)



del xaglParser