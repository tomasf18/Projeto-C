import sys
from antlr4 import *
from xaglParser import xaglParser
from xaglLexer import xaglLexer
from xaglVisitor import xaglVisitor
from Objects import *
import math
import time
 
 

class Interpreter(xaglVisitor):

    def __init__(self, script, **kwargs):
        self.objects = kwargs
        
        input_stream = InputStream(script)
        lexer = xaglLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = xaglParser(stream)
        tree = parser.program()
        if parser.getNumberOfSyntaxErrors() == 0:
            self.visit(tree)
        
    
    def get_object_by_id(self, id):
        return self.objects.get(id)
    

    def get_number_or_var(self, object):
        if object in self.objects:
            object = self.get_object_by_id(object)   
            if isinstance(object, (int, float, complex)) and not isinstance(object, bool):
                return object 
        else: 
            number = float(object)
            if number.is_integer(): 
                return int(object)
            else: 
                return number

    
    def visitProgram(self, ctx:xaglParser.ProgramContext):
        return self.visitChildren(ctx)


    def visitStat(self, ctx: xaglParser.StatContext):
        return self.visitChildren(ctx)
        

    def visitInstantiateObject(self, ctx:xaglParser.InstantiateObjectContext):
        object_id = ctx.ID().getText()
        self.objects[object_id] = self.visit(ctx.expr())
        return None


    def visitExprNot(self, ctx:xaglParser.ExprNotContext):
        return not self.visit(ctx.expr())
    

    # Visit a parse tree produced by xaglParser#FunctionRefreshTime.
    def visitFunctionRefreshTime(self, ctx:xaglParser.FunctionRefreshTimeContext):
        view_id = ctx.ID().getText()
        view = self.get_object_by_id(view_id) # Retrieve view object
        
        if not view:
            raise Exception(f"View {view_id} not found in objects")
        if not isinstance(view, View):
            raise Exception(f"{view} is not a {View} type object")
        
        if ctx.time():
            time_val = self.visit(ctx.time())
            view.update(time_val)   
        else:
            view.update() 
        
        return None
    

    # Visit a parse tree produced by xaglParser#FunctionMoveVector.
    def visitFunctionMoveVector(self, ctx:xaglParser.FunctionMoveVectorContext):
        object_id = ctx.ID(0).getText()
        object = self.get_object_by_id(object_id) # Retrieve object
        if not object:
            raise Exception (f"Object {object_id} not found in objects")

        if ctx.vector():
            vector_result = self.visit(ctx.vector())
            x, y = vector_result
        else:
            var = ctx.ID(1).getText()
            var = self.get_object_by_id(var)
            if not var:
                raise Exception(f"Variable {var} not found in objects")
            vector_result = tuple(var)
            if len(vector_result) != 2:
                raise Exception(f"Variable {var} is not a valid vector")
            x = float(vector_result[0])
            y = float(vector_result[1])
            x, y = vector_result
            
        object.move_by(x, y)

        return None
    
    
    def visitFunctionMovePoint(self, ctx:xaglParser.FunctionMovePointContext):
        object_id = ctx.ID(0).getText()
        object = self.get_object_by_id(object_id) # Retrieve object
        if not object:
            raise Exception (f"Object {object_id} not found in objects")

        if ctx.point():
            point_result = self.visit(ctx.point())
            x, y = point_result
        else:
            var = ctx.ID(1).getText()
            var = self.get_object_by_id(var)
            if not var:
                raise Exception(f"Variable {var} not found in objects")
            point_result = tuple(var)
            if len(point_result) != 2:
                raise Exception(f"Variable {var} is not a valid vector")
            x = float(point_result[0])
            y = float(point_result[1])
            x, y = point_result
            
        object.move_to(x, y)
        return None


    # Visit a parse tree produced by xaglParser#assignment.
    def visitAssigmentObjectAttribute(self, ctx:xaglParser.AssigmentObjectAttributeContext):
        object_id = ctx.ID(0).getText()
        object = self.get_object_by_id(object_id)

        if not object:
            raise Exception (f"Object {object_id} not found in objects")
        
        attribute = ctx.ID(1).getText()

        setattr(object, attribute, self.visit(ctx.expr()))  
        
        return None
    

    # Visit a parse tree produced by xaglParser#ForRange.
    def visitForRange(self, ctx:xaglParser.ForRangeContext):
        loop_var = ctx.ID().getText()
        
        from_number = ctx.from_.getText()
        from_number = self.get_number_or_var(from_number)

        to_number = ctx.to.getText()
        to_number = self.get_number_or_var(to_number)
    
        for i in range(from_number, to_number):
            self.objects[loop_var] = i
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)

        return None


    # Visit a parse tree produced by xaglParser#WhileLoop.
    def visitWhileLoop(self, ctx:xaglParser.WhileLoopContext):
        condition = self.visit(ctx.expr())
        
        while condition: 
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)
            condition = self.visit(ctx.expr())
        return None
    

    # Visit a parse tree produced by xaglParser#IfStat.
    def visitIfStat(self, ctx:xaglParser.IfStatContext):
        condition = self.visit(ctx.expr())  

        if condition:  
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)
        
        return None
    

    # Visit a parse tree produced by xaglParser#IfElseIf.
    def visitIfElseIf(self, ctx:xaglParser.IfElseIfContext):
        condition = self.visit(ctx.expr())  

        if condition:  
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)
        else:
            self.visit(ctx.if_stat())

        return None
    

    # Visit a parse tree produced by xaglParser#IfElseStat.
    def visitIfElseStat(self, ctx:xaglParser.IfElseStatContext):
        condition = self.visit(ctx.expr())  

        if condition:  
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)
        else:
            for statement_ctx in ctx.stat():
                self.visit(statement_ctx)

        return None
    
    
    # Visit a parse tree produced by xaglParser#ExprBooleanAND.
    def visitExprBooleanAND(self, ctx:xaglParser.ExprBooleanANDContext):
        first_operand = self.visit(ctx.e1)
        second_operand = self.visit(ctx.e2)
        return first_operand and second_operand


    # Visit a parse tree produced by xaglParser#ExprPropertyAccess.
    def visitExprPropertyAccess(self, ctx: xaglParser.ExprPropertyAccessContext):
        object_id = ctx.ID(0).getText()
        object = self.get_object_by_id(object_id)
        
        if not object:
            raise Exception (f"Object {object_id} not found in objects")
        
        attribute = ctx.ID(1).getText()
        
        if not hasattr(object, attribute): # Check if object has attribute
            raise Exception (f"Object {object_id} doesn't have the attribute {attribute}")

        return getattr(object, attribute) 
        
        
    # Visit a parse tree produced by xaglParser#ExprUnaryOperator.
    def visitExprUnaryOperator(self, ctx:xaglParser.ExprUnaryOperatorContext):
        value = self.visit(ctx.expr())
        value = self.get_number_or_var(value)
        
        sign = ctx.sign.text
        
        if sign == '-':
            return -value
        
        return value


    # Visit a parse tree produced by xaglParser#ExprRealNumber.
    def visitExprNumber(self, ctx:xaglParser.ExprNumberContext):
        number = ctx.Number().getText()
        number = float(number)
        if number.is_integer():
            return int(number)
        else: 
            return number 
        

    # Visit a parse tree produced by xaglParser#ExprString.
    def visitExprString(self, ctx:xaglParser.ExprStringContext):
        return ctx.String().getText()


    # Visit a parse tree produced by xaglParser#ExprPoint.
    def visitExprPoint(self, ctx:xaglParser.ExprPointContext):
        return self.visit(ctx.point())
    

    # Visit a parse tree produced by xaglParser#ExprBoolCompare.
    def visitExprBoolCompare(self, ctx: xaglParser.ExprBoolCompareContext):
        first_operand = self.visit(ctx.e1)
        second_operand = self.visit(ctx.e2)
        operator = ctx.op.text

        # Dictionary mapping operators to comparison functions
        comparison_functions = {
            '==': lambda x, y: x == y,
            '!=': lambda x, y: x != y,
            '<': lambda x, y: x < y,
            '<=': lambda x, y: x <= y,
            '>': lambda x, y: x > y,
            '>=': lambda x, y: x >= y
        }

        try:
            return comparison_functions[operator](first_operand, second_operand)
        except KeyError:
            raise ValueError(f"Unknown comparison operator: {operator}")


    # Visit a parse tree produced by xaglParser#ExprBoolean.
    def visitExprBoolean(self, ctx:xaglParser.ExprBooleanContext):
        bool_val = ctx.Boolean.getText()
        if bool_val == 'True':
            return True
        elif bool_val == 'False':
            return False
        else:
            raise Exception (f"{bool_val} is not a valid value")


    # Visit a parse tree produced by xaglParser#ExprBooleanOR.
    def visitExprBooleanOR(self, ctx:xaglParser.ExprBooleanORContext):
        first_operand = self.visit(ctx.e1)
        second_operand = self.visit(ctx.e2)
        return first_operand or second_operand


    # Visit a parse tree produced by xaglParser#ExprParenthesis.
    def visitExprParenthesis(self, ctx:xaglParser.ExprParenthesisContext):
        return self.visit(ctx.expr())


    # Visit a parse tree produced by xaglParser#ExprVector.
    def visitExprVector(self, ctx:xaglParser.ExprVectorContext):
        return self.visitChildren(ctx)
        

    def visitExprMultDiv(self, ctx:xaglParser.ExprMultDivContext):
        first_operand = self.visit(ctx.e1)
        first_operand = self.get_number_or_var(first_operand)
        
        second_operand = self.visit(ctx.e2)
        second_operand = self.get_number_or_var(second_operand)

        operator = ctx.op.text

        operation_functions = {
            '*': lambda x, y: x * y,
            '/': lambda x, y: x / y,
            '%': lambda x, y: x % y 
        }

        return operation_functions[operator](first_operand, second_operand)
    
    def visitExprAddSub(self, ctx:xaglParser.ExprAddSubContext):
        first_operand = self.visit(ctx.e1)
        first_operand = self.get_number_or_var(first_operand)
        
        second_operand = self.visit(ctx.e2)
        second_operand = self.get_number_or_var(second_operand)

        operator = ctx.op.text

        # Point / Vector --> Operations
        if isinstance(first_operand, tuple) and isinstance(second_operand, tuple):
            x1, y1 = first_operand
            x2, y2 = second_operand
            return (x1 + x2, y1 + y2)

        operation_functions = {
            '+': lambda x, y: x + y,
            '-': lambda x, y: x - y,
        }

        return operation_functions[operator](first_operand, second_operand)
    
        

    # Visit a parse tree produced by xaglParser#ExprID.
    def visitExprID(self, ctx:xaglParser.ExprIDContext):
        var = ctx.ID().getText()
        test_var = self.get_object_by_id(var)
        if test_var:
            return test_var
            
        return var


    # Visit a parse tree produced by xaglParser#time.
    def visitTime(self, ctx:xaglParser.TimeContext):
        time_val = self.visit(ctx.expr())
        time_val = self.get_number_or_var(time_val) # Must be a number or a var with a number
        
        if ctx.ts.text == 'ms': # Check time unit 
            time_val /= 1000  # Convert ms --> s
        
        return time_val


    # Visit a parse tree produced by xaglParser#point.
    def visitPoint(self, ctx:xaglParser.PointContext):
        x = self.visit(ctx.expr(0))
        x = self.get_number_or_var(x)
        
        y = self.visit(ctx.expr(1))
        y = self.get_number_or_var(y)
        
        return (x, y)


    # Visit a parse tree produced by xaglParser#VectorPoint.
    def visitVectorPoint(self, ctx:xaglParser.VectorPointContext):
        return self.visit(ctx.point())


    # Visit a parse tree produced by xaglParser#VectorPolar.
    def visitVectorPolar(self, ctx:xaglParser.VectorPolarContext):
        radius = self.visit(ctx.expr(0))
        radius = self.get_number_or_var(radius)
        
        angle = self.visit(ctx.expr(1))
        angle = self.get_number_or_var(angle)
       
        return (radius * math.cos(angle), radius * math.sin(angle))

