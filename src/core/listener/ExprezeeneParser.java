// Generated from E:/Rayhan Hamada/Kodingan/Latihan/Java/IJProj/Exprezeene/grammar\Exprezeene.g4 by ANTLR 4.7
package core.listener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprezeeneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, TO_SKIP=42, DEFINE=43, ALIAS=44, NAMESPACE=45, 
		IMPORT=46, CLASS=47, FUNCTION=48, AS=49, THIS=50, NEW=51, INHERIT=52, 
		PUBLIC=53, PRIVATE=54, PROTECTED=55, STATIC=56, CONSTANT=57, VAR=58, INT=59, 
		FLOAT=60, DOUBLE=61, LONG=62, BOOLEAN=63, CHAR=64, IF=65, ELSE=66, WHILE=67, 
		FOR=68, DO=69, IN=70, GO=71, IDENTIFIER=72, DECIMAL_LITERAL=73, FLOAT_LITERAL=74, 
		HEX_LITERAL=75, OCTAL_LITERAL=76, BINARY_LITERAL=77, CHAR_LITERAL=78, 
		STRING_LITERAL=79, BOOLEAN_LITERAL=80, NULL_LITERAL=81;
	public static final int
		RULE_integerLiteral = 0, RULE_floatLiteral = 1, RULE_literal = 2, RULE_methodCall = 3, 
		RULE_expr = 4, RULE_primary = 5, RULE_parameter = 6, RULE_parameterVar = 7, 
		RULE_defaultValueParameter = 8, RULE_arguments = 9, RULE_accmod = 10, 
		RULE_modifier = 11, RULE_type = 12, RULE_primitiveType = 13, RULE_referenceType = 14, 
		RULE_userDefinedType = 15, RULE_program = 16, RULE_globalScopeStatement = 17, 
		RULE_entryPoint = 18, RULE_allowedEntryPointStatement = 19, RULE_importStatement = 20, 
		RULE_varDeclStatement = 21, RULE_varInitStatement = 22, RULE_varConst = 23, 
		RULE_varAssignStatement = 24, RULE_objInstStatement = 25, RULE_classDefStatement = 26, 
		RULE_inClassStatement = 27, RULE_methodDefStatement = 28, RULE_inMethodStatement = 29, 
		RULE_condStatement = 30, RULE_ifStatement = 31, RULE_elseIfStatement = 32, 
		RULE_elseStatement = 33, RULE_inIfStatement = 34, RULE_loopStatement = 35, 
		RULE_whileloop = 36, RULE_forloop = 37, RULE_foreachloop = 38, RULE_doWhileloop = 39, 
		RULE_inloopStatement = 40;
	public static final String[] ruleNames = {
		"integerLiteral", "floatLiteral", "literal", "methodCall", "expr", "primary", 
		"parameter", "parameterVar", "defaultValueParameter", "arguments", "accmod", 
		"modifier", "type", "primitiveType", "referenceType", "userDefinedType", 
		"program", "globalScopeStatement", "entryPoint", "allowedEntryPointStatement", 
		"importStatement", "varDeclStatement", "varInitStatement", "varConst", 
		"varAssignStatement", "objInstStatement", "classDefStatement", "inClassStatement", 
		"methodDefStatement", "inMethodStatement", "condStatement", "ifStatement", 
		"elseIfStatement", "elseStatement", "inIfStatement", "loopStatement", 
		"whileloop", "forloop", "foreachloop", "doWhileloop", "inloopStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
		"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
		"'^'", "'|'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "','", 
		"';'", "'{'", "'}'", null, "'define'", "'alias'", "'namespace'", "'import'", 
		"'class'", "'func'", "'as'", "'this'", "'new'", "'inherit'", "'public'", 
		"'private'", "'protected'", "'static'", "'const'", "'var'", "'int'", "'float'", 
		"'double'", "'long'", "'bool'", "'char'", "'if'", "'else'", "'while'", 
		"'for'", "'do'", "'in'", "'go'", null, null, null, null, null, null, null, 
		null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "TO_SKIP", "DEFINE", "ALIAS", "NAMESPACE", 
		"IMPORT", "CLASS", "FUNCTION", "AS", "THIS", "NEW", "INHERIT", "PUBLIC", 
		"PRIVATE", "PROTECTED", "STATIC", "CONSTANT", "VAR", "INT", "FLOAT", "DOUBLE", 
		"LONG", "BOOLEAN", "CHAR", "IF", "ELSE", "WHILE", "FOR", "DO", "IN", "GO", 
		"IDENTIFIER", "DECIMAL_LITERAL", "FLOAT_LITERAL", "HEX_LITERAL", "OCTAL_LITERAL", 
		"BINARY_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
		"NULL_LITERAL"
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
	public String getGrammarFileName() { return "Exprezeene.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprezeeneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ExprezeeneParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ExprezeeneParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ExprezeeneParser.BINARY_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ExprezeeneParser.HEX_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (DECIMAL_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (BINARY_LITERAL - 73)))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ExprezeeneParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FLOAT_LITERAL);
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ExprezeeneParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ExprezeeneParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ExprezeeneParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ExprezeeneParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(NULL_LITERAL);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			setState(95);
			arguments();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostFixExprContext extends ExprContext {
		public Token postfix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostFixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPostFixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPostFixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPostFixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrLogicExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrLogicExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterOrLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitOrLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitOrLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrBitWiseExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrBitWiseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterOrBitWiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitOrBitWiseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitOrBitWiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndLogicExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndLogicExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAndLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAndLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAndLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreFixExprContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreFixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPreFixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPreFixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPreFixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitShiftExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitShiftExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterBitShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitBitShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitBitShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExprContext extends ExprContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjInstExprContext extends ExprContext {
		public ObjInstStatementContext objInstStatement() {
			return getRuleContext(ObjInstStatementContext.class,0);
		}
		public ObjInstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterObjInstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitObjInstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitObjInstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorBitWiseExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public XorBitWiseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterXorBitWiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitXorBitWiseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitXorBitWiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExprContext extends ExprContext {
		public Token operator;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MemberAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitMemberAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndBitWiseExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndBitWiseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAndBitWiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAndBitWiseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAndBitWiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new ObjInstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				objInstStatement();
				}
				break;
			case 4:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				((PreFixExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((PreFixExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr(13);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				((PreFixExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((PreFixExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				expr(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(108);
						((MultExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((MultExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(111);
						((AddExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((AddExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(121);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(114);
							match(T__12);
							setState(115);
							match(T__12);
							}
							break;
						case 2:
							{
							setState(116);
							match(T__13);
							setState(117);
							match(T__13);
							setState(118);
							match(T__13);
							}
							break;
						case 3:
							{
							setState(119);
							match(T__13);
							setState(120);
							match(T__13);
							}
							break;
						}
						setState(123);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(125);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new AndBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						((AndBitWiseExprContext)_localctx).operator = match(T__18);
						setState(132);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new XorBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						((XorBitWiseExprContext)_localctx).operator = match(T__19);
						setState(135);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new OrBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						((OrBitWiseExprContext)_localctx).operator = match(T__20);
						setState(138);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new AndLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						((AndLogicExprContext)_localctx).operator = match(T__21);
						setState(141);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new OrLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						((OrLogicExprContext)_localctx).operator = match(T__22);
						setState(144);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(146);
						((AssignmentExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((AssignmentExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						expr(1);
						}
						break;
					case 12:
						{
						_localctx = new MemberAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(149);
						((MemberAccessExprContext)_localctx).operator = match(T__0);
						setState(152);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(150);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(151);
							methodCall();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ArrayAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(155);
						match(T__1);
						setState(156);
						expr(0);
						setState(157);
						match(T__2);
						}
						break;
					case 14:
						{
						_localctx = new PostFixExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(160);
						((PostFixExprContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((PostFixExprContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primary);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(IDENTIFIER);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__35);
				setState(169);
				expr(0);
				setState(170);
				match(T__36);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<ParameterVarContext> parameterVar() {
			return getRuleContexts(ParameterVarContext.class);
		}
		public ParameterVarContext parameterVar(int i) {
			return getRuleContext(ParameterVarContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__35);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(175);
				parameterVar();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(176);
					match(T__37);
					setState(177);
					parameterVar();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__36);
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

	public static class ParameterVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefaultValueParameterContext defaultValueParameter() {
			return getRuleContext(DefaultValueParameterContext.class,0);
		}
		public ParameterVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterParameterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitParameterVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitParameterVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterVarContext parameterVar() throws RecognitionException {
		ParameterVarContext _localctx = new ParameterVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENTIFIER);
			setState(191);
			match(AS);
			setState(192);
			type();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(193);
				defaultValueParameter();
				}
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

	public static class DefaultValueParameterContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValueParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterDefaultValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitDefaultValueParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitDefaultValueParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueParameterContext defaultValueParameter() throws RecognitionException {
		DefaultValueParameterContext _localctx = new DefaultValueParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultValueParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__23);
			setState(197);
			expr(0);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__35);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << NEW))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (IDENTIFIER - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCTAL_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (BOOLEAN_LITERAL - 72)) | (1L << (NULL_LITERAL - 72)))) != 0)) {
				{
				{
				setState(200);
				expr(0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(201);
					match(T__37);
					setState(202);
					expr(0);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__36);
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

	public static class AccmodContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ExprezeeneParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ExprezeeneParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ExprezeeneParser.PROTECTED, 0); }
		public AccmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAccmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAccmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAccmod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccmodContext accmod() throws RecognitionException {
		AccmodContext _localctx = new AccmodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_accmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
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

	public static class ModifierContext extends ParserRuleContext {
		public AccmodContext accmod() {
			return getRuleContext(AccmodContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ExprezeeneParser.STATIC, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(217);
				accmod();
				}
			}

			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(220);
				match(STATIC);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case BOOLEAN:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprezeeneParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprezeeneParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprezeeneParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(ExprezeeneParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(ExprezeeneParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(ExprezeeneParser.CHAR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (INT - 59)) | (1L << (FLOAT - 59)) | (1L << (DOUBLE - 59)) | (1L << (LONG - 59)) | (1L << (BOOLEAN - 59)) | (1L << (CHAR - 59)))) != 0)) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public UserDefinedTypeContext userDefinedType() {
			return getRuleContext(UserDefinedTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			userDefinedType();
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

	public static class UserDefinedTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public UserDefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterUserDefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitUserDefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitUserDefinedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeContext userDefinedType() throws RecognitionException {
		UserDefinedTypeContext _localctx = new UserDefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_userDefinedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
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

	public static class ProgramContext extends ParserRuleContext {
		public EntryPointContext entryPoint() {
			return getRuleContext(EntryPointContext.class,0);
		}
		public List<GlobalScopeStatementContext> globalScopeStatement() {
			return getRuleContexts(GlobalScopeStatementContext.class);
		}
		public GlobalScopeStatementContext globalScopeStatement(int i) {
			return getRuleContext(GlobalScopeStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					globalScopeStatement();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(239);
			entryPoint();
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

	public static class GlobalScopeStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public ClassDefStatementContext classDefStatement() {
			return getRuleContext(ClassDefStatementContext.class,0);
		}
		public MethodDefStatementContext methodDefStatement() {
			return getRuleContext(MethodDefStatementContext.class,0);
		}
		public GlobalScopeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalScopeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterGlobalScopeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitGlobalScopeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitGlobalScopeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalScopeStatementContext globalScopeStatement() throws RecognitionException {
		GlobalScopeStatementContext _localctx = new GlobalScopeStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_globalScopeStatement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				importStatement();
				setState(242);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				varDeclStatement();
				setState(245);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				varInitStatement();
				setState(248);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				classDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				methodDefStatement();
				}
				break;
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

	public static class EntryPointContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public AccmodContext accmod() {
			return getRuleContext(AccmodContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public List<AllowedEntryPointStatementContext> allowedEntryPointStatement() {
			return getRuleContexts(AllowedEntryPointStatementContext.class);
		}
		public AllowedEntryPointStatementContext allowedEntryPointStatement(int i) {
			return getRuleContext(AllowedEntryPointStatementContext.class,i);
		}
		public EntryPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterEntryPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitEntryPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitEntryPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryPointContext entryPoint() throws RecognitionException {
		EntryPointContext _localctx = new EntryPointContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_entryPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(254);
				accmod();
				}
			}

			setState(257);
			match(GO);
			setState(258);
			parameter();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(259);
				match(AS);
				}
			}

			setState(262);
			match(T__39);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(263);
				allowedEntryPointStatement();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__40);
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

	public static class AllowedEntryPointStatementContext extends ParserRuleContext {
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public VarAssignStatementContext varAssignStatement() {
			return getRuleContext(VarAssignStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ObjInstStatementContext objInstStatement() {
			return getRuleContext(ObjInstStatementContext.class,0);
		}
		public AllowedEntryPointStatementContext allowedEntryPointStatement() {
			return getRuleContext(AllowedEntryPointStatementContext.class,0);
		}
		public AllowedEntryPointStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowedEntryPointStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterAllowedEntryPointStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitAllowedEntryPointStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitAllowedEntryPointStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllowedEntryPointStatementContext allowedEntryPointStatement() throws RecognitionException {
		AllowedEntryPointStatementContext _localctx = new AllowedEntryPointStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_allowedEntryPointStatement);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				varDeclStatement();
				setState(272);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				varInitStatement();
				setState(275);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				varAssignStatement();
				setState(278);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				methodCall();
				setState(281);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				condStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				objInstStatement();
				setState(286);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				match(T__39);
				setState(289);
				allowedEntryPointStatement();
				setState(290);
				match(T__40);
				}
				break;
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ExprezeeneParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprezeeneParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprezeeneParser.IDENTIFIER, i);
		}
		public List<TerminalNode> AS() { return getTokens(ExprezeeneParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(ExprezeeneParser.AS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IMPORT);
			setState(295);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(296);
				match(AS);
				setState(297);
				type();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(300);
				match(T__37);
				setState(301);
				match(IDENTIFIER);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(302);
					match(AS);
					setState(303);
					type();
					}
				}

				}
				}
				setState(310);
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

	public static class VarDeclStatementContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprezeeneParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprezeeneParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterVarDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitVarDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitVarDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclStatementContext varDeclStatement() throws RecognitionException {
		VarDeclStatementContext _localctx = new VarDeclStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varDeclStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			modifier();
			setState(312);
			match(VAR);
			setState(313);
			match(IDENTIFIER);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(314);
				match(T__37);
				setState(315);
				match(IDENTIFIER);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(AS);
			setState(322);
			type();
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

	public static class VarInitStatementContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public VarConstContext varConst() {
			return getRuleContext(VarConstContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjInstStatementContext objInstStatement() {
			return getRuleContext(ObjInstStatementContext.class,0);
		}
		public VarInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterVarInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitVarInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitVarInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitStatementContext varInitStatement() throws RecognitionException {
		VarInitStatementContext _localctx = new VarInitStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varInitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			modifier();
			setState(325);
			varConst();
			setState(326);
			match(IDENTIFIER);
			setState(327);
			match(T__23);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(328);
				expr(0);
				}
				break;
			case 2:
				{
				setState(329);
				objInstStatement();
				}
				break;
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

	public static class VarConstContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprezeeneParser.VAR, 0); }
		public TerminalNode CONSTANT() { return getToken(ExprezeeneParser.CONSTANT, 0); }
		public VarConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterVarConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitVarConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitVarConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarConstContext varConst() throws RecognitionException {
		VarConstContext _localctx = new VarConstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VAR) ) {
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

	public static class VarAssignStatementContext extends ParserRuleContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarAssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterVarAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitVarAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitVarAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignStatementContext varAssignStatement() throws RecognitionException {
		VarAssignStatementContext _localctx = new VarAssignStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varAssignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expr(0);
			setState(335);
			((VarAssignStatementContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
				((VarAssignStatementContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(336);
			expr(0);
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

	public static class ObjInstStatementContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ExprezeeneParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ObjInstStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objInstStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterObjInstStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitObjInstStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitObjInstStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjInstStatementContext objInstStatement() throws RecognitionException {
		ObjInstStatementContext _localctx = new ObjInstStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objInstStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(NEW);
			setState(339);
			match(IDENTIFIER);
			setState(340);
			parameter();
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

	public static class ClassDefStatementContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(ExprezeeneParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public TerminalNode INHERIT() { return getToken(ExprezeeneParser.INHERIT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InClassStatementContext> inClassStatement() {
			return getRuleContexts(InClassStatementContext.class);
		}
		public InClassStatementContext inClassStatement(int i) {
			return getRuleContext(InClassStatementContext.class,i);
		}
		public ClassDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterClassDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitClassDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitClassDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefStatementContext classDefStatement() throws RecognitionException {
		ClassDefStatementContext _localctx = new ClassDefStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			modifier();
			setState(343);
			match(CLASS);
			setState(344);
			match(IDENTIFIER);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(345);
				match(INHERIT);
				setState(346);
				type();
				}
			}

			setState(349);
			match(T__39);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(350);
				inClassStatement();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(T__40);
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

	public static class InClassStatementContext extends ParserRuleContext {
		public ClassDefStatementContext classDefStatement() {
			return getRuleContext(ClassDefStatementContext.class,0);
		}
		public MethodDefStatementContext methodDefStatement() {
			return getRuleContext(MethodDefStatementContext.class,0);
		}
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public InClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inClassStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterInClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitInClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitInClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClassStatementContext inClassStatement() throws RecognitionException {
		InClassStatementContext _localctx = new InClassStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inClassStatement);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				classDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				methodDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				varDeclStatement();
				setState(361);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				varInitStatement();
				setState(364);
				match(T__38);
				}
				break;
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

	public static class MethodDefStatementContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ExprezeeneParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
		}
		public MethodDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterMethodDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitMethodDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitMethodDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefStatementContext methodDefStatement() throws RecognitionException {
		MethodDefStatementContext _localctx = new MethodDefStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			modifier();
			setState(369);
			match(FUNCTION);
			setState(370);
			match(IDENTIFIER);
			setState(371);
			parameter();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(372);
				match(AS);
				setState(373);
				type();
				}
			}

			setState(376);
			match(T__39);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(377);
				inMethodStatement();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(T__40);
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

	public static class InMethodStatementContext extends ParserRuleContext {
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public VarAssignStatementContext varAssignStatement() {
			return getRuleContext(VarAssignStatementContext.class,0);
		}
		public ObjInstStatementContext objInstStatement() {
			return getRuleContext(ObjInstStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public InMethodStatementContext inMethodStatement() {
			return getRuleContext(InMethodStatementContext.class,0);
		}
		public InMethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inMethodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterInMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitInMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitInMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InMethodStatementContext inMethodStatement() throws RecognitionException {
		InMethodStatementContext _localctx = new InMethodStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inMethodStatement);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				varDeclStatement();
				setState(386);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				varInitStatement();
				setState(389);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				varAssignStatement();
				setState(392);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				objInstStatement();
				setState(395);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				methodCall();
				setState(398);
				match(T__38);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(400);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				match(T__39);
				setState(403);
				inMethodStatement();
				setState(404);
				match(T__40);
				}
				break;
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

	public static class CondStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfStatementContext elseIfStatement() {
			return getRuleContext(ElseIfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public CondStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterCondStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitCondStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitCondStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondStatementContext condStatement() throws RecognitionException {
		CondStatementContext _localctx = new CondStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condStatement);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				elseIfStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				elseStatement();
				}
				break;
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprezeeneParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InIfStatementContext> inIfStatement() {
			return getRuleContexts(InIfStatementContext.class);
		}
		public InIfStatementContext inIfStatement(int i) {
			return getRuleContext(InIfStatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IF);
			setState(414);
			match(T__35);
			setState(415);
			expr(0);
			setState(416);
			match(T__36);
			setState(417);
			match(T__39);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(418);
				inIfStatement();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(T__40);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ExprezeeneParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ExprezeeneParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InIfStatementContext> inIfStatement() {
			return getRuleContexts(InIfStatementContext.class);
		}
		public InIfStatementContext inIfStatement(int i) {
			return getRuleContext(InIfStatementContext.class,i);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ELSE);
			setState(427);
			match(IF);
			setState(428);
			match(T__35);
			setState(429);
			expr(0);
			setState(430);
			match(T__36);
			setState(431);
			match(T__39);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(432);
				inIfStatement();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(T__40);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ExprezeeneParser.ELSE, 0); }
		public List<InIfStatementContext> inIfStatement() {
			return getRuleContexts(InIfStatementContext.class);
		}
		public InIfStatementContext inIfStatement(int i) {
			return getRuleContext(InIfStatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ELSE);
			setState(441);
			match(T__39);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(442);
				inIfStatement();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			match(T__40);
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

	public static class InIfStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public VarAssignStatementContext varAssignStatement() {
			return getRuleContext(VarAssignStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public List<InIfStatementContext> inIfStatement() {
			return getRuleContexts(InIfStatementContext.class);
		}
		public InIfStatementContext inIfStatement(int i) {
			return getRuleContext(InIfStatementContext.class,i);
		}
		public InIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterInIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitInIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitInIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InIfStatementContext inIfStatement() throws RecognitionException {
		InIfStatementContext _localctx = new InIfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inIfStatement);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				methodCall();
				setState(451);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				varDeclStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				varInitStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				varAssignStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				match(T__39);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
					{
					{
					setState(459);
					inIfStatement();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465);
				match(T__40);
				}
				break;
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public ForeachloopContext foreachloop() {
			return getRuleContext(ForeachloopContext.class,0);
		}
		public DoWhileloopContext doWhileloop() {
			return getRuleContext(DoWhileloopContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loopStatement);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				whileloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				foreachloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				doWhileloop();
				}
				break;
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprezeeneParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InloopStatementContext> inloopStatement() {
			return getRuleContexts(InloopStatementContext.class);
		}
		public InloopStatementContext inloopStatement(int i) {
			return getRuleContext(InloopStatementContext.class,i);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(WHILE);
			setState(475);
			match(T__35);
			setState(476);
			expr(0);
			setState(477);
			match(T__36);
			setState(478);
			match(T__39);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(479);
				inloopStatement();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(T__40);
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprezeeneParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InloopStatementContext> inloopStatement() {
			return getRuleContexts(InloopStatementContext.class);
		}
		public InloopStatementContext inloopStatement(int i) {
			return getRuleContext(InloopStatementContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(FOR);
			setState(488);
			match(T__35);
			setState(489);
			match(IDENTIFIER);
			setState(490);
			match(T__23);
			setState(491);
			expr(0);
			setState(492);
			match(T__38);
			setState(493);
			expr(0);
			setState(494);
			match(T__38);
			setState(495);
			expr(0);
			setState(496);
			match(T__36);
			setState(497);
			match(T__39);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(498);
				inloopStatement();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(T__40);
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

	public static class ForeachloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprezeeneParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprezeeneParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprezeeneParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public TerminalNode IN() { return getToken(ExprezeeneParser.IN, 0); }
		public List<InloopStatementContext> inloopStatement() {
			return getRuleContexts(InloopStatementContext.class);
		}
		public InloopStatementContext inloopStatement(int i) {
			return getRuleContext(InloopStatementContext.class,i);
		}
		public ForeachloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterForeachloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitForeachloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitForeachloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachloopContext foreachloop() throws RecognitionException {
		ForeachloopContext _localctx = new ForeachloopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_foreachloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(FOR);
			setState(507);
			match(T__35);
			setState(508);
			match(IDENTIFIER);
			setState(509);
			match(AS);
			setState(510);
			match(IDENTIFIER);
			setState(511);
			match(IN);
			setState(512);
			match(IDENTIFIER);
			setState(513);
			match(T__36);
			setState(514);
			match(T__39);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(515);
				inloopStatement();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(T__40);
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

	public static class DoWhileloopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ExprezeeneParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(ExprezeeneParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InloopStatementContext> inloopStatement() {
			return getRuleContexts(InloopStatementContext.class);
		}
		public InloopStatementContext inloopStatement(int i) {
			return getRuleContext(InloopStatementContext.class,i);
		}
		public DoWhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterDoWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitDoWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitDoWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileloopContext doWhileloop() throws RecognitionException {
		DoWhileloopContext _localctx = new DoWhileloopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_doWhileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(DO);
			setState(524);
			match(T__39);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
				{
				{
				setState(525);
				inloopStatement();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(T__40);
			setState(532);
			match(WHILE);
			setState(533);
			match(T__35);
			setState(534);
			expr(0);
			setState(535);
			match(T__36);
			setState(536);
			match(T__38);
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

	public static class InloopStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public VarAssignStatementContext varAssignStatement() {
			return getRuleContext(VarAssignStatementContext.class,0);
		}
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public List<InloopStatementContext> inloopStatement() {
			return getRuleContexts(InloopStatementContext.class);
		}
		public InloopStatementContext inloopStatement(int i) {
			return getRuleContext(InloopStatementContext.class,i);
		}
		public InloopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inloopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterInloopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitInloopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitInloopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InloopStatementContext inloopStatement() throws RecognitionException {
		InloopStatementContext _localctx = new InloopStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inloopStatement);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				methodCall();
				setState(539);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				varAssignStatement();
				setState(542);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				varDeclStatement();
				setState(545);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				varInitStatement();
				setState(548);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				condStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				match(T__39);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IF - 65)) | (1L << (ELSE - 65)) | (1L << (WHILE - 65)) | (1L << (FOR - 65)) | (1L << (DO - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (BOOLEAN_LITERAL - 65)) | (1L << (NULL_LITERAL - 65)))) != 0)) {
					{
					{
					setState(553);
					inloopStatement();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(T__40);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u0235\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u009b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a4\n\6\f\6\16\6\u00a7"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3\b\3\b\7\b\u00b5"+
		"\n\b\f\b\16\b\u00b8\13\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ce"+
		"\n\13\f\13\16\13\u00d1\13\13\7\13\u00d3\n\13\f\13\16\13\u00d6\13\13\3"+
		"\13\3\13\3\f\3\f\3\r\5\r\u00dd\n\r\3\r\5\r\u00e0\n\r\3\16\3\16\5\16\u00e4"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\7\22\u00ed\n\22\f\22\16\22\u00f0"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00ff\n\23\3\24\5\24\u0102\n\24\3\24\3\24\3\24\5\24\u0107\n\24\3"+
		"\24\3\24\7\24\u010b\n\24\f\24\16\24\u010e\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0127\n\25\3\26\3\26\3\26\3\26\5\26\u012d"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0133\n\26\7\26\u0135\n\26\f\26\16\26\u0138"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\7\27\u013f\n\27\f\27\16\27\u0142\13\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u014d\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u015e\n\34\3\34\3\34\7\34\u0162\n\34\f\34\16\34\u0165\13\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0171\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0179\n\36\3\36\3\36\7\36\u017d\n\36\f\36\16\36\u0180"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0199\n\37\3 "+
		"\3 \3 \5 \u019e\n \3!\3!\3!\3!\3!\3!\7!\u01a6\n!\f!\16!\u01a9\13!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01b4\n\"\f\"\16\"\u01b7\13\"\3\"\3"+
		"\"\3#\3#\3#\7#\u01be\n#\f#\16#\u01c1\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\7$\u01cf\n$\f$\16$\u01d2\13$\3$\5$\u01d5\n$\3%\3%\3%\3%\5%\u01db"+
		"\n%\3&\3&\3&\3&\3&\3&\7&\u01e3\n&\f&\16&\u01e6\13&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01f6\n\'\f\'\16\'\u01f9\13\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0207\n(\f(\16(\u020a\13(\3(\3"+
		"(\3)\3)\3)\7)\u0211\n)\f)\16)\u0214\13)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u022d\n*\f*\16*\u0230\13*\3"+
		"*\5*\u0233\n*\3*\2\3\n+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPR\2\16\4\2KKMO\3\2\6\t\3\2\n\13\3\2\f\16\3"+
		"\2\b\t\3\2\17\22\3\2\23\24\3\2\32%\3\2\6\7\3\2\679\3\2=B\3\2;<\2\u026b"+
		"\2T\3\2\2\2\4V\3\2\2\2\6^\3\2\2\2\b`\3\2\2\2\nk\3\2\2\2\f\u00ae\3\2\2"+
		"\2\16\u00b0\3\2\2\2\20\u00c0\3\2\2\2\22\u00c6\3\2\2\2\24\u00c9\3\2\2\2"+
		"\26\u00d9\3\2\2\2\30\u00dc\3\2\2\2\32\u00e3\3\2\2\2\34\u00e5\3\2\2\2\36"+
		"\u00e7\3\2\2\2 \u00e9\3\2\2\2\"\u00ee\3\2\2\2$\u00fe\3\2\2\2&\u0101\3"+
		"\2\2\2(\u0126\3\2\2\2*\u0128\3\2\2\2,\u0139\3\2\2\2.\u0146\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0150\3\2\2\2\64\u0154\3\2\2\2\66\u0158\3\2\2\28\u0170"+
		"\3\2\2\2:\u0172\3\2\2\2<\u0198\3\2\2\2>\u019d\3\2\2\2@\u019f\3\2\2\2B"+
		"\u01ac\3\2\2\2D\u01ba\3\2\2\2F\u01d4\3\2\2\2H\u01da\3\2\2\2J\u01dc\3\2"+
		"\2\2L\u01e9\3\2\2\2N\u01fc\3\2\2\2P\u020d\3\2\2\2R\u0232\3\2\2\2TU\t\2"+
		"\2\2U\3\3\2\2\2VW\7L\2\2W\5\3\2\2\2X_\5\2\2\2Y_\5\4\3\2Z_\7Q\2\2[_\7P"+
		"\2\2\\_\7R\2\2]_\7S\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2"+
		"\2\2^]\3\2\2\2_\7\3\2\2\2`a\7J\2\2ab\5\24\13\2b\t\3\2\2\2cd\b\6\1\2dl"+
		"\5\f\7\2el\5\b\5\2fl\5\64\33\2gh\t\3\2\2hl\5\n\6\17ij\t\4\2\2jl\5\n\6"+
		"\16kc\3\2\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2ki\3\2\2\2l\u00a5\3\2\2\2m"+
		"n\f\r\2\2no\t\5\2\2o\u00a4\5\n\6\16pq\f\f\2\2qr\t\6\2\2r\u00a4\5\n\6\r"+
		"s{\f\13\2\2tu\7\17\2\2u|\7\17\2\2vw\7\20\2\2wx\7\20\2\2x|\7\20\2\2yz\7"+
		"\20\2\2z|\7\20\2\2{t\3\2\2\2{v\3\2\2\2{y\3\2\2\2|}\3\2\2\2}\u00a4\5\n"+
		"\6\f~\177\f\n\2\2\177\u0080\t\7\2\2\u0080\u00a4\5\n\6\13\u0081\u0082\f"+
		"\t\2\2\u0082\u0083\t\b\2\2\u0083\u00a4\5\n\6\n\u0084\u0085\f\b\2\2\u0085"+
		"\u0086\7\25\2\2\u0086\u00a4\5\n\6\t\u0087\u0088\f\7\2\2\u0088\u0089\7"+
		"\26\2\2\u0089\u00a4\5\n\6\b\u008a\u008b\f\6\2\2\u008b\u008c\7\27\2\2\u008c"+
		"\u00a4\5\n\6\7\u008d\u008e\f\5\2\2\u008e\u008f\7\30\2\2\u008f\u00a4\5"+
		"\n\6\6\u0090\u0091\f\4\2\2\u0091\u0092\7\31\2\2\u0092\u00a4\5\n\6\5\u0093"+
		"\u0094\f\3\2\2\u0094\u0095\t\t\2\2\u0095\u00a4\5\n\6\3\u0096\u0097\f\24"+
		"\2\2\u0097\u009a\7\3\2\2\u0098\u009b\7J\2\2\u0099\u009b\5\b\5\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a4\3\2\2\2\u009c\u009d\f\23"+
		"\2\2\u009d\u009e\7\4\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a4\3\2\2\2\u00a1\u00a2\f\20\2\2\u00a2\u00a4\t\n\2\2\u00a3m\3\2\2\2"+
		"\u00a3p\3\2\2\2\u00a3s\3\2\2\2\u00a3~\3\2\2\2\u00a3\u0081\3\2\2\2\u00a3"+
		"\u0084\3\2\2\2\u00a3\u0087\3\2\2\2\u00a3\u008a\3\2\2\2\u00a3\u008d\3\2"+
		"\2\2\u00a3\u0090\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00af"+
		"\5\6\4\2\u00a9\u00af\7J\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\5\n\6\2\u00ac"+
		"\u00ad\7\'\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00aa\3\2\2\2\u00af\r\3\2\2\2\u00b0\u00bb\7&\2\2\u00b1\u00b6"+
		"\5\20\t\2\u00b2\u00b3\7(\2\2\u00b3\u00b5\5\20\t\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7\'\2\2\u00bf\17\3\2\2\2\u00c0\u00c1\7J\2\2\u00c1\u00c2"+
		"\7\63\2\2\u00c2\u00c4\5\32\16\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00c8"+
		"\5\n\6\2\u00c8\23\3\2\2\2\u00c9\u00d4\7&\2\2\u00ca\u00cf\5\n\6\2\u00cb"+
		"\u00cc\7(\2\2\u00cc\u00ce\5\n\6\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\7\'\2\2\u00d8\25\3\2\2\2\u00d9\u00da\t\13\2\2\u00da\27\3\2\2\2"+
		"\u00db\u00dd\5\26\f\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00e0\7:\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\31\3\2\2\2\u00e1\u00e4\5\34\17\2\u00e2\u00e4\5\36\20\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\33\3\2\2\2\u00e5\u00e6\t\f\2\2\u00e6"+
		"\35\3\2\2\2\u00e7\u00e8\5 \21\2\u00e8\37\3\2\2\2\u00e9\u00ea\7J\2\2\u00ea"+
		"!\3\2\2\2\u00eb\u00ed\5$\23\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\5&\24\2\u00f2#\3\2\2\2\u00f3\u00f4\5*\26\2\u00f4"+
		"\u00f5\7)\2\2\u00f5\u00ff\3\2\2\2\u00f6\u00f7\5,\27\2\u00f7\u00f8\7)\2"+
		"\2\u00f8\u00ff\3\2\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\7)\2\2\u00fb\u00ff"+
		"\3\2\2\2\u00fc\u00ff\5\66\34\2\u00fd\u00ff\5:\36\2\u00fe\u00f3\3\2\2\2"+
		"\u00fe\u00f6\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff%\3\2\2\2\u0100\u0102\5\26\f\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7I\2\2\u0104\u0106\5\16"+
		"\b\2\u0105\u0107\7\63\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010c\7*\2\2\u0109\u010b\5(\25\2\u010a\u0109\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7+\2\2\u0110\'\3\2\2\2"+
		"\u0111\u0112\5,\27\2\u0112\u0113\7)\2\2\u0113\u0127\3\2\2\2\u0114\u0115"+
		"\5.\30\2\u0115\u0116\7)\2\2\u0116\u0127\3\2\2\2\u0117\u0118\5\62\32\2"+
		"\u0118\u0119\7)\2\2\u0119\u0127\3\2\2\2\u011a\u011b\5\b\5\2\u011b\u011c"+
		"\7)\2\2\u011c\u0127\3\2\2\2\u011d\u0127\5> \2\u011e\u0127\5H%\2\u011f"+
		"\u0120\5\64\33\2\u0120\u0121\7)\2\2\u0121\u0127\3\2\2\2\u0122\u0123\7"+
		"*\2\2\u0123\u0124\5(\25\2\u0124\u0125\7+\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0111\3\2\2\2\u0126\u0114\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u011a\3\2"+
		"\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0126"+
		"\u0122\3\2\2\2\u0127)\3\2\2\2\u0128\u0129\7\60\2\2\u0129\u012c\7J\2\2"+
		"\u012a\u012b\7\63\2\2\u012b\u012d\5\32\16\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0136\3\2\2\2\u012e\u012f\7(\2\2\u012f\u0132\7J\2"+
		"\2\u0130\u0131\7\63\2\2\u0131\u0133\5\32\16\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u012e\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137+\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013a\5\30\r\2\u013a\u013b\7<\2\2\u013b\u0140\7J\2\2\u013c"+
		"\u013d\7(\2\2\u013d\u013f\7J\2\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\7\63\2\2\u0144\u0145\5\32\16\2\u0145-\3\2\2\2\u0146"+
		"\u0147\5\30\r\2\u0147\u0148\5\60\31\2\u0148\u0149\7J\2\2\u0149\u014c\7"+
		"\32\2\2\u014a\u014d\5\n\6\2\u014b\u014d\5\64\33\2\u014c\u014a\3\2\2\2"+
		"\u014c\u014b\3\2\2\2\u014d/\3\2\2\2\u014e\u014f\t\r\2\2\u014f\61\3\2\2"+
		"\2\u0150\u0151\5\n\6\2\u0151\u0152\t\t\2\2\u0152\u0153\5\n\6\2\u0153\63"+
		"\3\2\2\2\u0154\u0155\7\65\2\2\u0155\u0156\7J\2\2\u0156\u0157\5\16\b\2"+
		"\u0157\65\3\2\2\2\u0158\u0159\5\30\r\2\u0159\u015a\7\61\2\2\u015a\u015d"+
		"\7J\2\2\u015b\u015c\7\66\2\2\u015c\u015e\5\32\16\2\u015d\u015b\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\7*\2\2\u0160\u0162"+
		"\58\35\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7+"+
		"\2\2\u0167\67\3\2\2\2\u0168\u0171\5\66\34\2\u0169\u0171\5:\36\2\u016a"+
		"\u016b\5,\27\2\u016b\u016c\7)\2\2\u016c\u0171\3\2\2\2\u016d\u016e\5.\30"+
		"\2\u016e\u016f\7)\2\2\u016f\u0171\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u0169"+
		"\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u01719\3\2\2\2\u0172"+
		"\u0173\5\30\r\2\u0173\u0174\7\62\2\2\u0174\u0175\7J\2\2\u0175\u0178\5"+
		"\16\b\2\u0176\u0177\7\63\2\2\u0177\u0179\5\32\16\2\u0178\u0176\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017e\7*\2\2\u017b\u017d"+
		"\5<\37\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7+"+
		"\2\2\u0182;\3\2\2\2\u0183\u0184\5,\27\2\u0184\u0185\7)\2\2\u0185\u0199"+
		"\3\2\2\2\u0186\u0187\5.\30\2\u0187\u0188\7)\2\2\u0188\u0199\3\2\2\2\u0189"+
		"\u018a\5\62\32\2\u018a\u018b\7)\2\2\u018b\u0199\3\2\2\2\u018c\u018d\5"+
		"\64\33\2\u018d\u018e\7)\2\2\u018e\u0199\3\2\2\2\u018f\u0190\5\b\5\2\u0190"+
		"\u0191\7)\2\2\u0191\u0199\3\2\2\2\u0192\u0199\5> \2\u0193\u0199\5H%\2"+
		"\u0194\u0195\7*\2\2\u0195\u0196\5<\37\2\u0196\u0197\7+\2\2\u0197\u0199"+
		"\3\2\2\2\u0198\u0183\3\2\2\2\u0198\u0186\3\2\2\2\u0198\u0189\3\2\2\2\u0198"+
		"\u018c\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0192\3\2\2\2\u0198\u0193\3\2"+
		"\2\2\u0198\u0194\3\2\2\2\u0199=\3\2\2\2\u019a\u019e\5@!\2\u019b\u019e"+
		"\5B\"\2\u019c\u019e\5D#\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019c\3\2\2\2\u019e?\3\2\2\2\u019f\u01a0\7C\2\2\u01a0\u01a1\7&\2\2\u01a1"+
		"\u01a2\5\n\6\2\u01a2\u01a3\7\'\2\2\u01a3\u01a7\7*\2\2\u01a4\u01a6\5F$"+
		"\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7+\2\2\u01ab"+
		"A\3\2\2\2\u01ac\u01ad\7D\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\7&\2\2\u01af"+
		"\u01b0\5\n\6\2\u01b0\u01b1\7\'\2\2\u01b1\u01b5\7*\2\2\u01b2\u01b4\5F$"+
		"\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7+\2\2\u01b9"+
		"C\3\2\2\2\u01ba\u01bb\7D\2\2\u01bb\u01bf\7*\2\2\u01bc\u01be\5F$\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7+\2\2\u01c3"+
		"E\3\2\2\2\u01c4\u01c5\5\b\5\2\u01c5\u01c6\7)\2\2\u01c6\u01d5\3\2\2\2\u01c7"+
		"\u01d5\5,\27\2\u01c8\u01d5\5.\30\2\u01c9\u01d5\5\62\32\2\u01ca\u01d5\5"+
		"H%\2\u01cb\u01d5\5> \2\u01cc\u01d0\7*\2\2\u01cd\u01cf\5F$\2\u01ce\u01cd"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\7+\2\2\u01d4\u01c4\3\2"+
		"\2\2\u01d4\u01c7\3\2\2\2\u01d4\u01c8\3\2\2\2\u01d4\u01c9\3\2\2\2\u01d4"+
		"\u01ca\3\2\2\2\u01d4\u01cb\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d5G\3\2\2\2"+
		"\u01d6\u01db\5J&\2\u01d7\u01db\5L\'\2\u01d8\u01db\5N(\2\u01d9\u01db\5"+
		"P)\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01dbI\3\2\2\2\u01dc\u01dd\7E\2\2\u01dd\u01de\7&\2\2\u01de"+
		"\u01df\5\n\6\2\u01df\u01e0\7\'\2\2\u01e0\u01e4\7*\2\2\u01e1\u01e3\5R*"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7+\2\2\u01e8"+
		"K\3\2\2\2\u01e9\u01ea\7F\2\2\u01ea\u01eb\7&\2\2\u01eb\u01ec\7J\2\2\u01ec"+
		"\u01ed\7\32\2\2\u01ed\u01ee\5\n\6\2\u01ee\u01ef\7)\2\2\u01ef\u01f0\5\n"+
		"\6\2\u01f0\u01f1\7)\2\2\u01f1\u01f2\5\n\6\2\u01f2\u01f3\7\'\2\2\u01f3"+
		"\u01f7\7*\2\2\u01f4\u01f6\5R*\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2"+
		"\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fb\7+\2\2\u01fbM\3\2\2\2\u01fc\u01fd\7F\2\2\u01fd\u01fe"+
		"\7&\2\2\u01fe\u01ff\7J\2\2\u01ff\u0200\7\63\2\2\u0200\u0201\7J\2\2\u0201"+
		"\u0202\7H\2\2\u0202\u0203\7J\2\2\u0203\u0204\7\'\2\2\u0204\u0208\7*\2"+
		"\2\u0205\u0207\5R*\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\7+\2\2\u020cO\3\2\2\2\u020d\u020e\7G\2\2\u020e\u0212\7*\2\2\u020f"+
		"\u0211\5R*\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216"+
		"\7+\2\2\u0216\u0217\7E\2\2\u0217\u0218\7&\2\2\u0218\u0219\5\n\6\2\u0219"+
		"\u021a\7\'\2\2\u021a\u021b\7)\2\2\u021bQ\3\2\2\2\u021c\u021d\5\b\5\2\u021d"+
		"\u021e\7)\2\2\u021e\u0233\3\2\2\2\u021f\u0220\5\62\32\2\u0220\u0221\7"+
		")\2\2\u0221\u0233\3\2\2\2\u0222\u0223\5,\27\2\u0223\u0224\7)\2\2\u0224"+
		"\u0233\3\2\2\2\u0225\u0226\5.\30\2\u0226\u0227\7)\2\2\u0227\u0233\3\2"+
		"\2\2\u0228\u0233\5> \2\u0229\u0233\5H%\2\u022a\u022e\7*\2\2\u022b\u022d"+
		"\5R*\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\7+"+
		"\2\2\u0232\u021c\3\2\2\2\u0232\u021f\3\2\2\2\u0232\u0222\3\2\2\2\u0232"+
		"\u0225\3\2\2\2\u0232\u0228\3\2\2\2\u0232\u0229\3\2\2\2\u0232\u022a\3\2"+
		"\2\2\u0233S\3\2\2\2/^k{\u009a\u00a3\u00a5\u00ae\u00b6\u00bb\u00c4\u00cf"+
		"\u00d4\u00dc\u00df\u00e3\u00ee\u00fe\u0101\u0106\u010c\u0126\u012c\u0132"+
		"\u0136\u0140\u014c\u015d\u0163\u0170\u0178\u017e\u0198\u019d\u01a7\u01b5"+
		"\u01bf\u01d0\u01d4\u01da\u01e4\u01f7\u0208\u0212\u022e\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}