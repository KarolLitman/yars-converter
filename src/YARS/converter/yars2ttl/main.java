package YARS.converter.yars2ttl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import YARS.YARSLexer;
import YARS.YARSParser;


public class main {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName(args[0]);

        YARSLexer lexer = new YARSLexer(input);
        YARSParser parser = new YARSParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yars();

        YARSVisitor yars = new YARSVisitor();



        System.out.println(yars.visit(tree));

        yars.y.buildTurtle();




    }

}
