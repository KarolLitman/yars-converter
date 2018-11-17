package YARS;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YARSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YARSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YARSParser#yars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYars(YARSParser.YarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YARSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(YARSParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(YARSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#prefixDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixDirective(YARSParser.PrefixDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPname(YARSParser.PnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#vertexDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertexDeclaration(YARSParser.VertexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship(YARSParser.RelationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pn_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPn_local(YARSParser.Pn_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(YARSParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#vertex_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex_name(YARSParser.Vertex_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(YARSParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_value_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_value_key(YARSParser.Pair_value_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_lang_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_lang_key(YARSParser.Pair_lang_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_vocab_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_vocab_key(YARSParser.Pair_vocab_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_datatype_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_datatype_key(YARSParser.Pair_datatype_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_any_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_any_key(YARSParser.Pair_any_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#pair_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_value(YARSParser.Pair_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(YARSParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(YARSParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(YARSParser.RdfLiteralContext ctx);
}