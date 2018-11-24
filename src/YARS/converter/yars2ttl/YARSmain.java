package YARS.converter.yars2ttl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import YARS.YARSLexer;
import YARS.YARSParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.File;


public class YARSmain {

    public static void main(String[] args) throws Exception {


//        YARSVisitor yars = new YARSVisitor();
//        System.out.println(yars.visit(tree));
//        yars.y.buildTurtle();
        

        Options options = new Options();
        Option inputcli = new Option("i", "input", true, "input file path");
        inputcli.setRequired(true);
        options.addOption(inputcli);
        Option formatarg = new Option("f", "format", true, "output format (ttl, rr, ng, sp, rs, nr)");
        formatarg.setRequired(true);
        options.addOption(formatarg);
        CommandLineParser parsercli = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
        try {
            cmd = parsercli.parse(options, args);
            String fileparam = cmd.getOptionValue("input");

            CharStream input = CharStreams.fromFileName(fileparam);
            YARSLexer lexer = new YARSLexer(input);
            YARSParser parser = new YARSParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.yars();
            YARSListener yars2 = new YARSListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(yars2, tree);


//            File file = new File(fileparam);
            if (cmd.hasOption("format")) {
                String format = cmd.getOptionValue("format");
                if (format.equalsIgnoreCase("ttl")) {
                    yars2.y.buildTurtle();
                } else if (format.equalsIgnoreCase("rr")) {
                    yars2.y.buildRDFreification();
                } else if (format.equalsIgnoreCase("ng")) {
                    yars2.y.buildNamedGraphs();
                } else if (format.equalsIgnoreCase("sp")) {
                    yars2.y.buildSingletonProperty();
                } else if (format.equalsIgnoreCase("rs")) {
                    yars2.y.buildRDFstar();
                } else if (format.equalsIgnoreCase("nr")) {
                    yars2.y.buildNaryRelation();
                } else {
                    System.out.println("Invalid format type.");
                }

            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("converter.jar", options);
        }
    }








    }


