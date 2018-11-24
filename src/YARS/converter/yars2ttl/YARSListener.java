package YARS.converter.yars2ttl;

import YARS.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class YARSListener extends YARSBaseListener {


    public YARS y = new YARS();
    HashMap<String, String> relationship_pair;


    String pn_local = "";
    String pname = "";
    String iri = "";

    boolean inrelationship = false;

    relationship relationship;
    vertexDeclaration vertexdeclaration;


    @Override
    public void enterVertexDeclaration(YARSParser.VertexDeclarationContext ctx) {
        vertexdeclaration = new vertexDeclaration();
        vertexdeclaration.vertex_name = ctx.getChild(0).getText();
    }

    @Override
    public void exitVertexDeclaration(YARSParser.VertexDeclarationContext ctx) {

        y.vdMap.put(vertexdeclaration.vertex_name, vertexdeclaration);
    }

    @Override
    public void enterPair_value_key(YARSParser.Pair_value_keyContext ctx) {

        vertexdeclaration.value = ctx.getChild(2).getText();
    }

    public void enterPair_lang_key(YARSParser.Pair_lang_keyContext ctx) {
        vertexdeclaration.langtag = ctx.getChild(2).getText();
    }

    public void enterPair_datatype_key(YARSParser.Pair_datatype_keyContext ctx) {
        vertexdeclaration.datatype = ctx.getChild(2).getText();
    }


    @Override
    public void enterRelationship(YARSParser.RelationshipContext ctx) {

        inrelationship = true;
        relationship = new relationship();
        relationship_pair = new HashMap<String, String>();
    }


    @Override
    public void exitRelationship(YARSParser.RelationshipContext ctx) {


        String predicate = "";
        if (pname.isEmpty()) {
            predicate = "<" + iri + pn_local + ">";
        } else {
            predicate = pname + ":" + pn_local;
        }

        relationship.vertex_start = new vertexDeclaration(ctx.getChild(1).getText());
        relationship.vertex_end = new vertexDeclaration(ctx.getChild(ctx.getChildCount() - 2).getText());
        relationship.predicate = predicate;
        relationship.any_key_value_Map = relationship_pair;


        y.rslist.add(relationship);

        pn_local = "";
        pname = "";
        iri = "";
        inrelationship = false;

    }

    @Override
    public void enterPn_local(YARSParser.Pn_localContext ctx) {
        pn_local = ctx.getText();
    }

    @Override
    public void enterPair_vocab_key(YARSParser.Pair_vocab_keyContext ctx) {
        iri = ctx.getChild(2).getText().substring(1, ctx.getChild(2).getText().length() - 1);
    }

    @Override
    public void enterPname(YARSParser.PnameContext ctx) {
        if (inrelationship) {
            pname = ctx.getChild(1).getText();
        }
    }


    @Override
    public void enterPair_any_key(YARSParser.Pair_any_keyContext ctx) {
        relationship_pair.put(ctx.getChild(0).getText(), ctx.getChild(2).getText());
    }

    @Override
    public void enterPrefixDirective(YARSParser.PrefixDirectiveContext ctx) {

        String iri = ctx.getChild(1).getText().substring(1, ctx.getChild(1).getText().length() - 1);
        y.pdlist.add(new prefixDirective(ctx.getChild(0).getChild(1).getText(), iri));
    }


}