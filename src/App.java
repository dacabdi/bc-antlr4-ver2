package bc;

// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App  
{
    public static void main(String[] args) throws Exception 
    {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        // create a lexer that feeds off of input CharStream
        bcLexer lexer = new bcLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        bcParser parser = new bcParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at init rule

        // visit and evaluate
        EvalVisitor visitor = new EvalVisitor(parser);
        visitor.visit(tree);

        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}