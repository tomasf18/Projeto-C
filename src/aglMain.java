import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;


public class aglMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         aglLexer lexer = new aglLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         aglParser parser = new aglParser(tokens);

         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {

            /**
             * Semantic Visitor
             */
            SemanticVisitor semanticVisitor = new SemanticVisitor();
            try {
               semanticVisitor.visit(tree);
            } catch (Exception e) {
               e.printStackTrace();
               semanticVisitor.getErrorList().forEach(System.out::println);
            }
            
            if (semanticVisitor.hasErrors()) {
               System.out.println("Semantic errors found, Errors:");
               semanticVisitor.getErrorList().forEach(System.out::println);
               return;
            } 

            System.out.println("No semantic errors found");

            /**
             * Compiler 
             */
            AGLCompiler compiler = new AGLCompiler();
            ST pythonCode = compiler.visit(tree);
            String outputFileName = "Output.py";
            String classesFileName = "Objects";
            pythonCode.add("name", "Output");
            pythonCode.add("classesFile", classesFileName);
            PrintWriter pw = new PrintWriter(new File(outputFileName));
            pw.print(pythonCode.render());
            pw.close();
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
