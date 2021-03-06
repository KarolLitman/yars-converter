package YARS.converter.yars2ttl;

import YARS.*;

public class YARSVisitor extends YARSBaseVisitor<String> {

    public YARS y = new YARS();

    boolean visitedRelationship = false;
    boolean visitedvertexDeclaration = false;

//    @Override public String visitStatement(YARSParser.StatementContext ctx) { return visitChildren(ctx); }
//    @Override public String visitDirective(YARSParser.DirectiveContext ctx) { return visitChildren(ctx); }


    @Override public String visitPrefixDirective(YARSParser.PrefixDirectiveContext ctx) { return visitChildren(ctx); }
    @Override public String visitPname(YARSParser.PnameContext ctx) {

        String prefix = ctx.getChild(1).getText();

        String iri = ctx.getParent().getChild(1).getText();

//        System.out.println(super.visit(ctx.parent));

//        y.addprefixDirective(prefix,iri);
        return "";
    }

//    @Override public String visitVertexDeclaration(YARSParser.VertexDeclarationContext ctx) {
////        return ctx.getText();
//
//        String vertexname=ctx.getChild(0).getChild(0).getText();
//        String vertexvalue=ctx.getChild(3).getChild(0).getChild(2).getChild(0).getText();
//        String vertexvalueLang="";
//        if(ctx.getChildCount()==7) {
//            vertexvalueLang=ctx.getChild(5).getChild(0).getChild(2).getChild(0).getText();
//        }
//
//        if(!vertexvalueLang.isEmpty()){
//            vertexvalue+="@"+vertexvalueLang.replace("\"", "");
//        }
//
//        y.addvertexDeclaration(vertexname,vertexvalue);
//
//
//        return "";
//
//    }


    @Override public String visitRelationship(YARSParser.RelationshipContext ctx) {

        String first_vertex=ctx.getChild(1).getText();
        String second_vertex=ctx.getChild(9).getText();

        String prefix=ctx.getChild(5).getChild(0).getText();
        String predicate = "";
        if (prefix.charAt(0) == ':') {
            prefix = prefix.substring(1, prefix.length() - 1);
            String pn_local = ctx.getChild(5).getChild(1).getText();
            predicate = prefix + ":" + pn_local;
        } else {
//System.out.println(ctx.getChild(5).getChild(0));

            String pn_local = ctx.getChild(5).getChild(0).getText();
            String iri = ctx.getChild(5).getChild(2).getChild(2).getText();
            predicate = iri.substring(0, iri.length() - 1) + pn_local + ">";
        }
//        y.addrelationship(first_vertex,predicate,second_vertex);


//        System.out.println( "iteracja1 "+ iteracja++);
        return visitChildren(ctx);

    }

    @Override
    public String visitPredicate(YARSParser.PredicateContext ctx) {
//System.out.println("iteracja2 "+ iteracja2++);
        return "test";
    }



    @Override public String visitPair_value_key(YARSParser.Pair_value_keyContext ctx) {


        String vertexname=ctx.getParent().getParent().getChild(0).getText();
        String vertexvalue=ctx.getChild(2).getChild(0).getText();
//        String vertexvalueLang="";
//        if(ctx.getChildCount()==7) {
//            vertexvalueLang=ctx.getChild(5).getChild(0).getChild(2).getChild(0).getText();
//        }
//
//        if(!vertexvalueLang.isEmpty()){
//            vertexvalue+="@"+vertexvalueLang.replace("\"", "");
//        }

//        y.addVertexValue(vertexname,vertexvalue);

//        return "iteracja2 "+iteracja2+++"\n";
        return "";
    }

    @Override public String visitPair_lang_key(YARSParser.Pair_lang_keyContext ctx) {


        String vertexname=ctx.getParent().getParent().getChild(0).getText();
        String vertexlang=ctx.getChild(2).getChild(0).getText();

        vertexlang = vertexlang.replace("\"", "");
        vertexlang = "@"+vertexlang;

//        String vertexvalueLang="";
//        if(ctx.getChildCount()==7) {
//            vertexvalueLang=ctx.getChild(5).getChild(0).getChild(2).getChild(0).getText();
//        }
//
//        if(!vertexvalueLang.isEmpty()){
//            vertexvalue+="@"+vertexvalueLang.replace("\"", "");
//        }

//        y.addVertexLang(vertexname,vertexlang);

        return "";

    }


    @Override public String visitPair_datatype_key(YARSParser.Pair_datatype_keyContext ctx) {

        String vertexname=ctx.getParent().getParent().getChild(0).getText();
        String vertexdatatype=ctx.getChild(2).getText();



        vertexdatatype="^^"+vertexdatatype;

//        String vertexvalueLang="";
//        if(ctx.getChildCount()==7) {
//            vertexvalueLang=ctx.getChild(5).getChild(0).getChild(2).getChild(0).getText();
//        }
//
//        if(!vertexvalueLang.isEmpty()){
//            vertexvalue+="@"+vertexvalueLang.replace("\"", "");
//        }

//        y.addVertexDatatype(vertexname,vertexdatatype);

        return "";
    }




    @Override
    public String aggregateResult(String aggregate, String nextResult) {


        if (aggregate == null) {
            return nextResult;
        }

        if (nextResult == null) {
            return aggregate;
        }

        StringBuilder sb = new StringBuilder(aggregate);
        sb.append(" ");
        sb.append(nextResult);


        return sb.toString();
    }


}
