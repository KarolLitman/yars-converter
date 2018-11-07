package org.antlr.v4.runtime.tree;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TurtleVisitor;


public class main {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName(args[0]);

        YARSLexer lexer = new YARSLexer(input);
        YARSParser parser = new YARSParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yars();

        TurtleVisitor xml = new TurtleVisitor();



        System.out.println(xml.visit(tree));
//        System.out.println(tree.toStringTree(parser));

        xml.y.buildTurtle();


//        TurtleListener classListener = new TurtleListener();
//        parser.yars().enterRule(classListener);





//        return classListener.;

//        String xml = new TurtleVisitor().visit(tree);
//        System.out.println(xml);

    }

}
