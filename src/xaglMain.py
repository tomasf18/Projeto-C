import sys
from antlr4 import *
from xaglLexer import xaglLexer
from xaglParser import xaglParser
from Interpreter import Interpreter

def main(argv):
   visitor0 = Interpreter()
   input_stream = StdinStream()
   lexer = xaglLexer(input_stream)
   stream = CommonTokenStream(lexer)
   parser = xaglParser(stream)
   tree = parser.program()
   if parser.getNumberOfSyntaxErrors() == 0:
      visitor0.visit(tree)

if __name__ == '__main__':
   main(sys.argv)
