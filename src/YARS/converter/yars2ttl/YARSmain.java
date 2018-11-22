package YARS.converter.yars2ttl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import YARS.YARSLexer;
import YARS.YARSParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class YARSmain {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName(args[1]);

        YARSLexer lexer = new YARSLexer(input);
        YARSParser parser = new YARSParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yars();


//        YARSVisitor yars = new YARSVisitor();
//        System.out.println(yars.visit(tree));
//        yars.y.buildTurtle();


        YARSListener yars2 = new YARSListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(yars2, tree);


        switch (args[0].toLowerCase()) {
            case "turtle":
                yars2.y.buildTurtle();
                break;
            case "rdfreification":
                yars2.y.buildRDFreification();
                break;
            case "singletonproperty":
                yars2.y.buildSingletonProperty();
                break;
            case "n-aryrelation":
                yars2.y.buildNaryRelation();
                break;
            case "rdf*":
                yars2.y.buildRDFstar();
                break;
            case "namedgraph":
                yars2.y.buildNamedGraphs();
                break;
            default: {
                System.out.println("Incorrect serialization type. Supported types are:\n" +
                        "Turtle, RDFReification, SingletonProperty, N-aryRelation, RDF*, NamedGraph");
            }
        }


    }

}
