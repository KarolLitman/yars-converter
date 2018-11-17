package YARS;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YARSParser}.
 */
public interface YARSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YARSParser#yars}.
	 * @param ctx the parse tree
	 */
	void enterYars(YARSParser.YarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#yars}.
	 * @param ctx the parse tree
	 */
	void exitYars(YARSParser.YarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YARSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YARSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(YARSParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(YARSParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YARSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YARSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#prefixDirective}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDirective(YARSParser.PrefixDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#prefixDirective}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDirective(YARSParser.PrefixDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(YARSParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(YARSParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#vertexDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVertexDeclaration(YARSParser.VertexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#vertexDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVertexDeclaration(YARSParser.VertexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(YARSParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(YARSParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pn_local}.
	 * @param ctx the parse tree
	 */
	void enterPn_local(YARSParser.Pn_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pn_local}.
	 * @param ctx the parse tree
	 */
	void exitPn_local(YARSParser.Pn_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(YARSParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(YARSParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#vertex_name}.
	 * @param ctx the parse tree
	 */
	void enterVertex_name(YARSParser.Vertex_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#vertex_name}.
	 * @param ctx the parse tree
	 */
	void exitVertex_name(YARSParser.Vertex_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(YARSParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(YARSParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_value_key}.
	 * @param ctx the parse tree
	 */
	void enterPair_value_key(YARSParser.Pair_value_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_value_key}.
	 * @param ctx the parse tree
	 */
	void exitPair_value_key(YARSParser.Pair_value_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_lang_key}.
	 * @param ctx the parse tree
	 */
	void enterPair_lang_key(YARSParser.Pair_lang_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_lang_key}.
	 * @param ctx the parse tree
	 */
	void exitPair_lang_key(YARSParser.Pair_lang_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_vocab_key}.
	 * @param ctx the parse tree
	 */
	void enterPair_vocab_key(YARSParser.Pair_vocab_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_vocab_key}.
	 * @param ctx the parse tree
	 */
	void exitPair_vocab_key(YARSParser.Pair_vocab_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_datatype_key}.
	 * @param ctx the parse tree
	 */
	void enterPair_datatype_key(YARSParser.Pair_datatype_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_datatype_key}.
	 * @param ctx the parse tree
	 */
	void exitPair_datatype_key(YARSParser.Pair_datatype_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_any_key}.
	 * @param ctx the parse tree
	 */
	void enterPair_any_key(YARSParser.Pair_any_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_any_key}.
	 * @param ctx the parse tree
	 */
	void exitPair_any_key(YARSParser.Pair_any_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#pair_value}.
	 * @param ctx the parse tree
	 */
	void enterPair_value(YARSParser.Pair_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#pair_value}.
	 * @param ctx the parse tree
	 */
	void exitPair_value(YARSParser.Pair_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(YARSParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(YARSParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(YARSParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(YARSParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(YARSParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(YARSParser.RdfLiteralContext ctx);
}