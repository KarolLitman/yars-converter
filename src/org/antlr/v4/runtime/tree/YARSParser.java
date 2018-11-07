package org.antlr.v4.runtime.tree;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BlankNode=15, BLANK_NODE_LABEL=16, 
		STRING_LITERAL_QUOTE=17, ALNUM_PLUS=18, CONTEXT=19, PN_CHARS=20, PN_CHARS_U=21, 
		UCHAR=22, PN_CHARS_BASE=23, HEX=24, SP=25, NL=26;
	public static final int
		RULE_yars = 0, RULE_statement = 1, RULE_directive = 2, RULE_declaration = 3, 
		RULE_prefixDirective = 4, RULE_pname = 5, RULE_vertexDeclaration = 6, 
		RULE_relationship = 7, RULE_pn_local = 8, RULE_predicate = 9, RULE_vertex_name = 10, 
		RULE_pair = 11, RULE_pair_value_key = 12, RULE_pair_lang_key = 13, RULE_pair_vocab_key = 14, 
		RULE_pair_datatype_key = 15, RULE_pair_any_key = 16, RULE_pair_value = 17, 
		RULE_iri = 18, RULE_literal = 19, RULE_rdfLiteral = 20;
	public static final String[] ruleNames = {
		"yars", "statement", "directive", "declaration", "prefixDirective", "pname", 
		"vertexDeclaration", "relationship", "pn_local", "predicate", "vertex_name", 
		"pair", "pair_value_key", "pair_lang_key", "pair_vocab_key", "pair_datatype_key", 
		"pair_any_key", "pair_value", "iri", "literal", "rdfLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'('", "')'", "'-'", "'['", "']'", "'->'", 
		"'value'", "'lang'", "'vocab'", "'datatype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BlankNode", "BLANK_NODE_LABEL", "STRING_LITERAL_QUOTE", 
		"ALNUM_PLUS", "CONTEXT", "PN_CHARS", "PN_CHARS_U", "UCHAR", "PN_CHARS_BASE", 
		"HEX", "SP", "NL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YARS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YARSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class YarsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(YARSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(YARSParser.NL, i);
		}
		public YarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterYars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitYars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitYars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YarsContext yars() throws RecognitionException {
		YarsContext _localctx = new YarsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << ALNUM_PLUS))) != 0)) {
				{
				{
				setState(42);
				statement();
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(NL);
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				directive();
				}
				break;
			case T__4:
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public PrefixDirectiveContext prefixDirective() {
			return getRuleContext(PrefixDirectiveContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			prefixDirective();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VertexDeclarationContext vertexDeclaration() {
			return getRuleContext(VertexDeclarationContext.class,0);
		}
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				vertexDeclaration();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				relationship();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixDirectiveContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public TerminalNode CONTEXT() { return getToken(YARSParser.CONTEXT, 0); }
		public PrefixDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPrefixDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPrefixDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPrefixDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixDirectiveContext prefixDirective() throws RecognitionException {
		PrefixDirectiveContext _localctx = new PrefixDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefixDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			pname();
			setState(64);
			match(CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PnameContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSParser.ALNUM_PLUS, 0); }
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(ALNUM_PLUS);
			setState(68);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexDeclarationContext extends ParserRuleContext {
		public Vertex_nameContext vertex_name() {
			return getRuleContext(Vertex_nameContext.class,0);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public VertexDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterVertexDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitVertexDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitVertexDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexDeclarationContext vertexDeclaration() throws RecognitionException {
		VertexDeclarationContext _localctx = new VertexDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vertexDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			vertex_name();
			setState(71);
			match(T__0);
			setState(72);
			match(T__1);
			setState(73);
			pair();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(74);
				match(T__2);
				setState(75);
				pair();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipContext extends ParserRuleContext {
		public List<Vertex_nameContext> vertex_name() {
			return getRuleContexts(Vertex_nameContext.class);
		}
		public Vertex_nameContext vertex_name(int i) {
			return getRuleContext(Vertex_nameContext.class,i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitRelationship(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitRelationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__4);
			setState(84);
			vertex_name();
			setState(85);
			match(T__5);
			setState(86);
			match(T__6);
			setState(87);
			match(T__7);
			setState(88);
			predicate();
			setState(89);
			match(T__8);
			setState(90);
			match(T__9);
			setState(91);
			match(T__4);
			setState(92);
			vertex_name();
			setState(93);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pn_localContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSParser.ALNUM_PLUS, 0); }
		public Pn_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pn_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPn_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPn_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPn_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pn_localContext pn_local() throws RecognitionException {
		Pn_localContext _localctx = new Pn_localContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pn_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ALNUM_PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public Pn_localContext pn_local() {
			return getRuleContext(Pn_localContext.class,0);
		}
		public Pair_vocab_keyContext pair_vocab_key() {
			return getRuleContext(Pair_vocab_keyContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(97);
				pname();
				setState(98);
				pn_local();
				}
				}
				break;
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(100);
				pn_local();
				setState(101);
				match(T__1);
				setState(102);
				pair_vocab_key();
				setState(103);
				match(T__3);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vertex_nameContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSParser.ALNUM_PLUS, 0); }
		public Vertex_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterVertex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitVertex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitVertex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_nameContext vertex_name() throws RecognitionException {
		Vertex_nameContext _localctx = new Vertex_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vertex_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ALNUM_PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public Pair_value_keyContext pair_value_key() {
			return getRuleContext(Pair_value_keyContext.class,0);
		}
		public Pair_lang_keyContext pair_lang_key() {
			return getRuleContext(Pair_lang_keyContext.class,0);
		}
		public Pair_datatype_keyContext pair_datatype_key() {
			return getRuleContext(Pair_datatype_keyContext.class,0);
		}
		public Pair_any_keyContext pair_any_key() {
			return getRuleContext(Pair_any_keyContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pair);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				pair_value_key();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				pair_lang_key();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				pair_datatype_key();
				}
				break;
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				pair_any_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_value_keyContext extends ParserRuleContext {
		public TerminalNode BlankNode() { return getToken(YARSParser.BlankNode, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Pair_value_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_value_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_value_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_value_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_value_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_value_keyContext pair_value_key() throws RecognitionException {
		Pair_value_keyContext _localctx = new Pair_value_keyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pair_value_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__10);
			setState(116);
			match(T__0);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BlankNode:
				{
				setState(117);
				match(BlankNode);
				}
				break;
			case CONTEXT:
				{
				setState(118);
				iri();
				}
				break;
			case STRING_LITERAL_QUOTE:
				{
				setState(119);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_lang_keyContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Pair_lang_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_lang_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_lang_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_lang_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_lang_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_lang_keyContext pair_lang_key() throws RecognitionException {
		Pair_lang_keyContext _localctx = new Pair_lang_keyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pair_lang_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			setState(123);
			match(T__0);
			setState(124);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_vocab_keyContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public Pair_vocab_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_vocab_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_vocab_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_vocab_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_vocab_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_vocab_keyContext pair_vocab_key() throws RecognitionException {
		Pair_vocab_keyContext _localctx = new Pair_vocab_keyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pair_vocab_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			match(T__0);
			setState(128);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_datatype_keyContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Pair_datatype_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_datatype_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_datatype_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_datatype_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_datatype_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_datatype_keyContext pair_datatype_key() throws RecognitionException {
		Pair_datatype_keyContext _localctx = new Pair_datatype_keyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pair_datatype_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__13);
			setState(131);
			match(T__0);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTEXT:
				{
				setState(132);
				iri();
				}
				break;
			case STRING_LITERAL_QUOTE:
				{
				setState(133);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_any_keyContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSParser.ALNUM_PLUS, 0); }
		public TerminalNode BlankNode() { return getToken(YARSParser.BlankNode, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Pair_any_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_any_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_any_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_any_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_any_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_any_keyContext pair_any_key() throws RecognitionException {
		Pair_any_keyContext _localctx = new Pair_any_keyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pair_any_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ALNUM_PLUS);
			setState(137);
			match(T__0);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BlankNode:
				{
				setState(138);
				match(BlankNode);
				}
				break;
			case CONTEXT:
				{
				setState(139);
				iri();
				}
				break;
			case STRING_LITERAL_QUOTE:
				{
				setState(140);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_valueContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(YARSParser.CONTEXT, 0); }
		public TerminalNode ALNUM_PLUS() { return getToken(YARSParser.ALNUM_PLUS, 0); }
		public Pair_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterPair_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitPair_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitPair_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_valueContext pair_value() throws RecognitionException {
		Pair_valueContext _localctx = new Pair_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pair_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==ALNUM_PLUS || _la==CONTEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(YARSParser.CONTEXT, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_iri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			rdfLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_QUOTE() { return getToken(YARSParser.STRING_LITERAL_QUOTE, 0); }
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSListener ) ((YARSListener)listener).exitRdfLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSVisitor ) return ((YARSVisitor<? extends T>)visitor).visitRdfLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(STRING_LITERAL_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\7\2\63\n\2\f\2\16\2\66\13\2\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\5\5@\n\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\b"+
		"R\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\5\rt\n\r\3\16\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0089\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0090\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\24\25\2"+
		"\u0092\2\64\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fD\3\2"+
		"\2\2\16H\3\2\2\2\20U\3\2\2\2\22a\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30s\3"+
		"\2\2\2\32u\3\2\2\2\34|\3\2\2\2\36\u0080\3\2\2\2 \u0084\3\2\2\2\"\u008a"+
		"\3\2\2\2$\u0091\3\2\2\2&\u0093\3\2\2\2(\u0095\3\2\2\2*\u0097\3\2\2\2,"+
		".\5\4\3\2-/\7\34\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62,\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3"+
		"\3\2\2\2\66\64\3\2\2\2\67:\5\6\4\28:\5\b\5\29\67\3\2\2\298\3\2\2\2:\5"+
		"\3\2\2\2;<\5\n\6\2<\7\3\2\2\2=@\5\16\b\2>@\5\20\t\2?=\3\2\2\2?>\3\2\2"+
		"\2@\t\3\2\2\2AB\5\f\7\2BC\7\25\2\2C\13\3\2\2\2DE\7\3\2\2EF\7\24\2\2FG"+
		"\7\3\2\2G\r\3\2\2\2HI\5\26\f\2IJ\7\3\2\2JK\7\4\2\2KP\5\30\r\2LM\7\5\2"+
		"\2MO\5\30\r\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2"+
		"\2\2ST\7\6\2\2T\17\3\2\2\2UV\7\7\2\2VW\5\26\f\2WX\7\b\2\2XY\7\t\2\2YZ"+
		"\7\n\2\2Z[\5\24\13\2[\\\7\13\2\2\\]\7\f\2\2]^\7\7\2\2^_\5\26\f\2_`\7\b"+
		"\2\2`\21\3\2\2\2ab\7\24\2\2b\23\3\2\2\2cd\5\f\7\2de\5\22\n\2el\3\2\2\2"+
		"fg\5\22\n\2gh\7\4\2\2hi\5\36\20\2ij\7\6\2\2jl\3\2\2\2kc\3\2\2\2kf\3\2"+
		"\2\2l\25\3\2\2\2mn\7\24\2\2n\27\3\2\2\2ot\5\32\16\2pt\5\34\17\2qt\5 \21"+
		"\2rt\5\"\22\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\31\3\2\2\2uv\7"+
		"\r\2\2vz\7\3\2\2w{\7\21\2\2x{\5&\24\2y{\5(\25\2zw\3\2\2\2zx\3\2\2\2zy"+
		"\3\2\2\2{\33\3\2\2\2|}\7\16\2\2}~\7\3\2\2~\177\5(\25\2\177\35\3\2\2\2"+
		"\u0080\u0081\7\17\2\2\u0081\u0082\7\3\2\2\u0082\u0083\5&\24\2\u0083\37"+
		"\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0088\7\3\2\2\u0086\u0089\5&\24\2"+
		"\u0087\u0089\5(\25\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089!\3"+
		"\2\2\2\u008a\u008b\7\24\2\2\u008b\u008f\7\3\2\2\u008c\u0090\7\21\2\2\u008d"+
		"\u0090\5&\24\2\u008e\u0090\5(\25\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090#\3\2\2\2\u0091\u0092\t\2\2\2\u0092%\3\2"+
		"\2\2\u0093\u0094\7\25\2\2\u0094\'\3\2\2\2\u0095\u0096\5*\26\2\u0096)\3"+
		"\2\2\2\u0097\u0098\7\23\2\2\u0098+\3\2\2\2\f\60\649?Pksz\u0088\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}