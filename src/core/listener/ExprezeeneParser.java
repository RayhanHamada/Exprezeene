// Generated from D:/RayhanHamada/CodingStuff/Project/Exprezeene/grammar\Exprezeene.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		FROM=53, PREPROCESSOR=54, PUBLIC=55, PRIVATE=56, PROTECTED=57, STATIC=58, 
		CONSTANT=59, VAR=60, INT=61, FLOAT=62, DOUBLE=63, LONG=64, BOOLEAN=65, 
		CHAR=66, IF=67, ELSE=68, WHILE=69, FOR=70, DO=71, IN=72, GO=73, IDENTIFIER=74, 
		DECIMAL_LITERAL=75, FLOAT_LITERAL=76, HEX_LITERAL=77, OCTAL_LITERAL=78, 
		BINARY_LITERAL=79, CHAR_LITERAL=80, STRING_LITERAL=81, BOOLEAN_LITERAL=82, 
		NULL_LITERAL=83;
	public static final int
		RULE_identifier = 0, RULE_integerLiteral = 1, RULE_floatLiteral = 2, RULE_literal = 3, 
		RULE_methodCall = 4, RULE_expr = 5, RULE_primary = 6, RULE_parameter = 7, 
		RULE_parameterVar = 8, RULE_defaultValueParameter = 9, RULE_arguments = 10, 
		RULE_accmod = 11, RULE_modifier = 12, RULE_dataType = 13, RULE_primitiveType = 14, 
		RULE_referenceType = 15, RULE_userDefinedType = 16, RULE_program = 17, 
		RULE_globalScopeStatement = 18, RULE_preprocessorStatement = 19, RULE_inPreprocessorStatement = 20, 
		RULE_nameSpaceDefinition = 21, RULE_nameSpaceStatement = 22, RULE_importStatement = 23, 
		RULE_scriptPath = 24, RULE_varDeclStatement = 25, RULE_varInitStatement = 26, 
		RULE_varAssignStatement = 27, RULE_varIdentifier = 28, RULE_varConst = 29, 
		RULE_objInstStatement = 30, RULE_classDefStatement = 31, RULE_classIdentifier = 32, 
		RULE_inClassStatement = 33, RULE_methodDefStatement = 34, RULE_funcIdentifier = 35, 
		RULE_inMethodStatement = 36, RULE_condStatement = 37, RULE_ifStatement = 38, 
		RULE_elseIfStatement = 39, RULE_elseStatement = 40, RULE_inIfStatement = 41, 
		RULE_loopStatement = 42, RULE_whileloop = 43, RULE_forloop = 44, RULE_foreachloop = 45, 
		RULE_doWhileloop = 46, RULE_inloopStatement = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integerLiteral", "floatLiteral", "literal", "methodCall", 
			"expr", "primary", "parameter", "parameterVar", "defaultValueParameter", 
			"arguments", "accmod", "modifier", "dataType", "primitiveType", "referenceType", 
			"userDefinedType", "program", "globalScopeStatement", "preprocessorStatement", 
			"inPreprocessorStatement", "nameSpaceDefinition", "nameSpaceStatement", 
			"importStatement", "scriptPath", "varDeclStatement", "varInitStatement", 
			"varAssignStatement", "varIdentifier", "varConst", "objInstStatement", 
			"classDefStatement", "classIdentifier", "inClassStatement", "methodDefStatement", 
			"funcIdentifier", "inMethodStatement", "condStatement", "ifStatement", 
			"elseIfStatement", "elseStatement", "inIfStatement", "loopStatement", 
			"whileloop", "forloop", "foreachloop", "doWhileloop", "inloopStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", 
			"','", "';'", "'{'", "'}'", null, "'define'", "'alias'", "'namespace'", 
			"'import'", "'class'", "'func'", "'as'", "'this'", "'new'", "'inherit'", 
			"'from'", "'preprocessor'", "'public'", "'private'", "'protected'", "'static'", 
			"'const'", "'var'", "'int'", "'float'", "'double'", "'long'", "'bool'", 
			"'char'", "'if'", "'else'", "'while'", "'for'", "'do'", "'in'", "'go'", 
			null, null, null, null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TO_SKIP", "DEFINE", "ALIAS", "NAMESPACE", 
			"IMPORT", "CLASS", "FUNCTION", "AS", "THIS", "NEW", "INHERIT", "FROM", 
			"PREPROCESSOR", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "CONSTANT", 
			"VAR", "INT", "FLOAT", "DOUBLE", "LONG", "BOOLEAN", "CHAR", "IF", "ELSE", 
			"WHILE", "FOR", "DO", "IN", "GO", "IDENTIFIER", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"HEX_LITERAL", "OCTAL_LITERAL", "BINARY_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"BOOLEAN_LITERAL", "NULL_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 2, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DECIMAL_LITERAL - 75)) | (1L << (HEX_LITERAL - 75)) | (1L << (OCTAL_LITERAL - 75)) | (1L << (BINARY_LITERAL - 75)))) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			identifier();
			setState(111);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new ObjInstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				objInstStatement();
				}
				break;
			case 4:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
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
				setState(118);
				expr(13);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
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
				setState(120);
				expr(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(124);
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
						setState(125);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(127);
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
						setState(128);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(137);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(130);
							match(T__12);
							setState(131);
							match(T__12);
							}
							break;
						case 2:
							{
							setState(132);
							match(T__13);
							setState(133);
							match(T__13);
							setState(134);
							match(T__13);
							}
							break;
						case 3:
							{
							setState(135);
							match(T__13);
							setState(136);
							match(T__13);
							}
							break;
						}
						setState(139);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(141);
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
						setState(142);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(144);
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
						setState(145);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new AndBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(147);
						((AndBitWiseExprContext)_localctx).operator = match(T__18);
						setState(148);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new XorBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(150);
						((XorBitWiseExprContext)_localctx).operator = match(T__19);
						setState(151);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new OrBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						((OrBitWiseExprContext)_localctx).operator = match(T__20);
						setState(154);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new AndLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						((AndLogicExprContext)_localctx).operator = match(T__21);
						setState(157);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new OrLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						((OrLogicExprContext)_localctx).operator = match(T__22);
						setState(160);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(162);
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
						setState(163);
						expr(1);
						}
						break;
					case 12:
						{
						_localctx = new MemberAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(165);
						((MemberAccessExprContext)_localctx).operator = match(T__0);
						setState(168);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(166);
							identifier();
							}
							break;
						case 2:
							{
							setState(167);
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
						setState(170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(171);
						match(T__1);
						setState(172);
						expr(0);
						setState(173);
						match(T__2);
						}
						break;
					case 14:
						{
						_localctx = new PostFixExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(176);
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
				setState(181);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_primary);
		try {
			setState(188);
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
				setState(182);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				identifier();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__35);
				setState(185);
				expr(0);
				setState(186);
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
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__35);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(191);
				parameterVar();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(192);
					match(T__37);
					setState(193);
					parameterVar();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 16, RULE_parameterVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			identifier();
			setState(207);
			match(AS);
			setState(208);
			dataType();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(209);
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
		enterRule(_localctx, 18, RULE_defaultValueParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__23);
			setState(213);
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
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__35);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << NEW))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (IDENTIFIER - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (FLOAT_LITERAL - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (BINARY_LITERAL - 74)) | (1L << (CHAR_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (NULL_LITERAL - 74)))) != 0)) {
				{
				{
				setState(216);
				expr(0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(217);
					match(T__37);
					setState(218);
					expr(0);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
		enterRule(_localctx, 22, RULE_accmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 24, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(233);
				accmod();
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(236);
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

	public static class DataTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		try {
			setState(241);
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
				setState(239);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
		enterRule(_localctx, 28, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INT - 61)) | (1L << (FLOAT - 61)) | (1L << (DOUBLE - 61)) | (1L << (LONG - 61)) | (1L << (BOOLEAN - 61)) | (1L << (CHAR - 61)))) != 0)) ) {
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
		public List<UserDefinedTypeContext> userDefinedType() {
			return getRuleContexts(UserDefinedTypeContext.class);
		}
		public UserDefinedTypeContext userDefinedType(int i) {
			return getRuleContext(UserDefinedTypeContext.class,i);
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
		enterRule(_localctx, 30, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			userDefinedType();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(246);
				match(T__0);
				setState(247);
				userDefinedType();
				}
				}
				setState(252);
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

	public static class UserDefinedTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_userDefinedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			identifier();
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
		public TerminalNode EOF() { return getToken(ExprezeeneParser.EOF, 0); }
		public List<PreprocessorStatementContext> preprocessorStatement() {
			return getRuleContexts(PreprocessorStatementContext.class);
		}
		public PreprocessorStatementContext preprocessorStatement(int i) {
			return getRuleContext(PreprocessorStatementContext.class,i);
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
		enterRule(_localctx, 34, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPROCESSOR) {
				{
				{
				setState(255);
				preprocessorStatement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(261);
				globalScopeStatement();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(EOF);
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
		enterRule(_localctx, 36, RULE_globalScopeStatement);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				varDeclStatement();
				setState(270);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				varInitStatement();
				setState(273);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
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

	public static class PreprocessorStatementContext extends ParserRuleContext {
		public TerminalNode PREPROCESSOR() { return getToken(ExprezeeneParser.PREPROCESSOR, 0); }
		public List<InPreprocessorStatementContext> inPreprocessorStatement() {
			return getRuleContexts(InPreprocessorStatementContext.class);
		}
		public InPreprocessorStatementContext inPreprocessorStatement(int i) {
			return getRuleContext(InPreprocessorStatementContext.class,i);
		}
		public PreprocessorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterPreprocessorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitPreprocessorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitPreprocessorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessorStatementContext preprocessorStatement() throws RecognitionException {
		PreprocessorStatementContext _localctx = new PreprocessorStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preprocessorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PREPROCESSOR);
			setState(280);
			match(T__39);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(281);
				inPreprocessorStatement();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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

	public static class InPreprocessorStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public InPreprocessorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPreprocessorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterInPreprocessorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitInPreprocessorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitInPreprocessorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPreprocessorStatementContext inPreprocessorStatement() throws RecognitionException {
		InPreprocessorStatementContext _localctx = new InPreprocessorStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inPreprocessorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			importStatement();
			setState(290);
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

	public static class NameSpaceDefinitionContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(ExprezeeneParser.NAMESPACE, 0); }
		public List<NameSpaceStatementContext> nameSpaceStatement() {
			return getRuleContexts(NameSpaceStatementContext.class);
		}
		public NameSpaceStatementContext nameSpaceStatement(int i) {
			return getRuleContext(NameSpaceStatementContext.class,i);
		}
		public NameSpaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterNameSpaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitNameSpaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitNameSpaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceDefinitionContext nameSpaceDefinition() throws RecognitionException {
		NameSpaceDefinitionContext _localctx = new NameSpaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nameSpaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(NAMESPACE);
			setState(293);
			match(T__39);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(294);
				nameSpaceStatement();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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

	public static class NameSpaceStatementContext extends ParserRuleContext {
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
		public NameSpaceDefinitionContext nameSpaceDefinition() {
			return getRuleContext(NameSpaceDefinitionContext.class,0);
		}
		public NameSpaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterNameSpaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitNameSpaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitNameSpaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceStatementContext nameSpaceStatement() throws RecognitionException {
		NameSpaceStatementContext _localctx = new NameSpaceStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nameSpaceStatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				varDeclStatement();
				setState(303);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				varInitStatement();
				setState(306);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				nameSpaceDefinition();
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
		public List<ScriptPathContext> scriptPath() {
			return getRuleContexts(ScriptPathContext.class);
		}
		public ScriptPathContext scriptPath(int i) {
			return getRuleContext(ScriptPathContext.class,i);
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
		enterRule(_localctx, 46, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IMPORT);
			{
			setState(314);
			scriptPath();
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(315);
				match(T__37);
				{
				setState(316);
				scriptPath();
				}
				}
				}
				setState(321);
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

	public static class ScriptPathContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ExprezeeneParser.STRING_LITERAL, 0); }
		public ScriptPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterScriptPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitScriptPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitScriptPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptPathContext scriptPath() throws RecognitionException {
		ScriptPathContext _localctx = new ScriptPathContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_scriptPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(STRING_LITERAL);
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
		public TerminalNode VAR() { return getToken(ExprezeeneParser.VAR, 0); }
		public List<VarIdentifierContext> varIdentifier() {
			return getRuleContexts(VarIdentifierContext.class);
		}
		public VarIdentifierContext varIdentifier(int i) {
			return getRuleContext(VarIdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 50, RULE_varDeclStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			modifier();
			setState(325);
			match(VAR);
			setState(326);
			varIdentifier();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(327);
				match(T__37);
				setState(328);
				varIdentifier();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(AS);
			setState(335);
			dataType();
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
		public VarIdentifierContext varIdentifier() {
			return getRuleContext(VarIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_varInitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			modifier();
			setState(338);
			varConst();
			setState(339);
			varIdentifier();
			setState(340);
			match(AS);
			setState(341);
			dataType();
			setState(342);
			match(T__23);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(343);
				expr(0);
				}
				break;
			case 2:
				{
				setState(344);
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
		enterRule(_localctx, 54, RULE_varAssignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expr(0);
			setState(348);
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
			setState(349);
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

	public static class VarIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdentifierContext varIdentifier() throws RecognitionException {
		VarIdentifierContext _localctx = new VarIdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			identifier();
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
		enterRule(_localctx, 58, RULE_varConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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

	public static class ObjInstStatementContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ExprezeeneParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 60, RULE_objInstStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(NEW);
			setState(356);
			identifier();
			setState(357);
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

	public static class ClassDefStatementContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(ExprezeeneParser.CLASS, 0); }
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public TerminalNode INHERIT() { return getToken(ExprezeeneParser.INHERIT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 62, RULE_classDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			modifier();
			setState(360);
			match(CLASS);
			setState(361);
			classIdentifier();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(362);
				match(INHERIT);
				setState(363);
				dataType();
				}
			}

			setState(366);
			match(T__39);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(367);
				inClassStatement();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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

	public static class ClassIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitClassIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitClassIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			identifier();
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
		enterRule(_localctx, 66, RULE_inClassStatement);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				classDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				methodDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				varDeclStatement();
				setState(380);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				varInitStatement();
				setState(383);
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
		public FuncIdentifierContext funcIdentifier() {
			return getRuleContext(FuncIdentifierContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 68, RULE_methodDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			modifier();
			setState(388);
			match(FUNCTION);
			setState(389);
			funcIdentifier();
			setState(390);
			parameter();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(391);
				match(AS);
				setState(392);
				dataType();
				}
			}

			setState(395);
			match(T__39);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(396);
				inMethodStatement();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
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

	public static class FuncIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterFuncIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitFuncIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitFuncIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncIdentifierContext funcIdentifier() throws RecognitionException {
		FuncIdentifierContext _localctx = new FuncIdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_funcIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			identifier();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 72, RULE_inMethodStatement);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				varDeclStatement();
				setState(407);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				varInitStatement();
				setState(410);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				varAssignStatement();
				setState(413);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				objInstStatement();
				setState(416);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				methodCall();
				setState(419);
				match(T__38);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(423);
				expr(0);
				setState(424);
				match(T__38);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(426);
				match(T__39);
				setState(427);
				inMethodStatement();
				setState(428);
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
		enterRule(_localctx, 74, RULE_condStatement);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				elseIfStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
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
		enterRule(_localctx, 76, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(IF);
			setState(438);
			match(T__35);
			setState(439);
			expr(0);
			setState(440);
			match(T__36);
			setState(441);
			match(T__39);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
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
		enterRule(_localctx, 78, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ELSE);
			setState(451);
			match(IF);
			setState(452);
			match(T__35);
			setState(453);
			expr(0);
			setState(454);
			match(T__36);
			setState(455);
			match(T__39);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(456);
				inIfStatement();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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
		enterRule(_localctx, 80, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(ELSE);
			setState(465);
			match(T__39);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(466);
				inIfStatement();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 82, RULE_inIfStatement);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				methodCall();
				setState(475);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				varDeclStatement();
				setState(478);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				varInitStatement();
				setState(481);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				varAssignStatement();
				setState(484);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(488);
				expr(0);
				setState(489);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(491);
				match(T__39);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(492);
					inIfStatement();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
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
		enterRule(_localctx, 84, RULE_loopStatement);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				whileloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				foreachloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
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
		enterRule(_localctx, 86, RULE_whileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(WHILE);
			setState(508);
			match(T__35);
			setState(509);
			expr(0);
			setState(510);
			match(T__36);
			setState(511);
			match(T__39);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(512);
				inloopStatement();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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
		public VarInitStatementContext varInitStatement() {
			return getRuleContext(VarInitStatementContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(FOR);
			setState(521);
			match(T__35);
			setState(522);
			varInitStatement();
			setState(523);
			match(T__38);
			setState(524);
			expr(0);
			setState(525);
			match(T__38);
			setState(526);
			expr(0);
			setState(527);
			match(T__36);
			setState(528);
			match(T__39);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(529);
				inloopStatement();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(ExprezeeneParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
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
		enterRule(_localctx, 90, RULE_foreachloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(FOR);
			setState(538);
			match(T__35);
			setState(539);
			identifier();
			setState(540);
			match(AS);
			setState(541);
			dataType();
			setState(542);
			match(IN);
			setState(543);
			identifier();
			setState(544);
			match(T__36);
			setState(545);
			match(T__39);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(546);
				inloopStatement();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
		enterRule(_localctx, 92, RULE_doWhileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DO);
			setState(555);
			match(T__39);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(556);
				inloopStatement();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			match(T__40);
			setState(563);
			match(WHILE);
			setState(564);
			match(T__35);
			setState(565);
			expr(0);
			setState(566);
			match(T__36);
			setState(567);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 94, RULE_inloopStatement);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				methodCall();
				setState(570);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				varAssignStatement();
				setState(573);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				varDeclStatement();
				setState(576);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				varInitStatement();
				setState(579);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				condStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				expr(0);
				setState(584);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(586);
				match(T__39);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(587);
					inloopStatement();
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(593);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0257\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u008c\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ab"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f\t\16"+
		"\t\u00c8\13\t\7\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\n\u00d5\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f"+
		"\u00e1\13\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\f\3\f\3\r\3\r\3\16\5\16"+
		"\u00ed\n\16\3\16\5\16\u00f0\n\16\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\u00fb\n\21\f\21\16\21\u00fe\13\21\3\22\3\22\3\23\7"+
		"\23\u0103\n\23\f\23\16\23\u0106\13\23\3\23\7\23\u0109\n\23\f\23\16\23"+
		"\u010c\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0118"+
		"\n\24\3\25\3\25\3\25\7\25\u011d\n\25\f\25\16\25\u0120\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u012a\n\27\f\27\16\27\u012d\13\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013a\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0140\n\31\f\31\16\31\u0143\13\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u014c\n\33\f\33\16\33\u014f\13\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015c\n\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u016f"+
		"\n!\3!\3!\7!\u0173\n!\f!\16!\u0176\13!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0184\n#\3$\3$\3$\3$\3$\3$\5$\u018c\n$\3$\3$\7$\u0190\n$\f"+
		"$\16$\u0193\13$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b1\n&\3\'\3\'\3\'\5\'\u01b6\n\'\3"+
		"(\3(\3(\3(\3(\3(\7(\u01be\n(\f(\16(\u01c1\13(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\7)\u01cc\n)\f)\16)\u01cf\13)\3)\3)\3*\3*\3*\7*\u01d6\n*\f*\16*\u01d9"+
		"\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7"+
		"+\u01f0\n+\f+\16+\u01f3\13+\3+\5+\u01f6\n+\3,\3,\3,\3,\5,\u01fc\n,\3-"+
		"\3-\3-\3-\3-\3-\7-\u0204\n-\f-\16-\u0207\13-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\7.\u0215\n.\f.\16.\u0218\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\7/\u0226\n/\f/\16/\u0229\13/\3/\3/\3\60\3\60\3\60\7\60\u0230\n"+
		"\60\f\60\16\60\u0233\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\7\61\u024f\n\61\f\61\16\61\u0252\13\61\3\61\5\61\u0255"+
		"\n\61\3\61\2\3\f\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\16\4\2MMOQ\3\2\6\t\3\2\n\13\3\2\f\16"+
		"\3\2\b\t\3\2\17\22\3\2\23\24\3\2\32%\3\2\6\7\3\29;\3\2?D\3\2=>\2\u0284"+
		"\2b\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\f{\3\2\2\2\16"+
		"\u00be\3\2\2\2\20\u00c0\3\2\2\2\22\u00d0\3\2\2\2\24\u00d6\3\2\2\2\26\u00d9"+
		"\3\2\2\2\30\u00e9\3\2\2\2\32\u00ec\3\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3"+
		"\2\2\2 \u00f7\3\2\2\2\"\u00ff\3\2\2\2$\u0104\3\2\2\2&\u0117\3\2\2\2(\u0119"+
		"\3\2\2\2*\u0123\3\2\2\2,\u0126\3\2\2\2.\u0139\3\2\2\2\60\u013b\3\2\2\2"+
		"\62\u0144\3\2\2\2\64\u0146\3\2\2\2\66\u0153\3\2\2\28\u015d\3\2\2\2:\u0161"+
		"\3\2\2\2<\u0163\3\2\2\2>\u0165\3\2\2\2@\u0169\3\2\2\2B\u0179\3\2\2\2D"+
		"\u0183\3\2\2\2F\u0185\3\2\2\2H\u0196\3\2\2\2J\u01b0\3\2\2\2L\u01b5\3\2"+
		"\2\2N\u01b7\3\2\2\2P\u01c4\3\2\2\2R\u01d2\3\2\2\2T\u01f5\3\2\2\2V\u01fb"+
		"\3\2\2\2X\u01fd\3\2\2\2Z\u020a\3\2\2\2\\\u021b\3\2\2\2^\u022c\3\2\2\2"+
		"`\u0254\3\2\2\2bc\7L\2\2c\3\3\2\2\2de\t\2\2\2e\5\3\2\2\2fg\7N\2\2g\7\3"+
		"\2\2\2ho\5\4\3\2io\5\6\4\2jo\7S\2\2ko\7R\2\2lo\7T\2\2mo\7U\2\2nh\3\2\2"+
		"\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2pq\5\2"+
		"\2\2qr\5\26\f\2r\13\3\2\2\2st\b\7\1\2t|\5\16\b\2u|\5\n\6\2v|\5> \2wx\t"+
		"\3\2\2x|\5\f\7\17yz\t\4\2\2z|\5\f\7\16{s\3\2\2\2{u\3\2\2\2{v\3\2\2\2{"+
		"w\3\2\2\2{y\3\2\2\2|\u00b5\3\2\2\2}~\f\r\2\2~\177\t\5\2\2\177\u00b4\5"+
		"\f\7\16\u0080\u0081\f\f\2\2\u0081\u0082\t\6\2\2\u0082\u00b4\5\f\7\r\u0083"+
		"\u008b\f\13\2\2\u0084\u0085\7\17\2\2\u0085\u008c\7\17\2\2\u0086\u0087"+
		"\7\20\2\2\u0087\u0088\7\20\2\2\u0088\u008c\7\20\2\2\u0089\u008a\7\20\2"+
		"\2\u008a\u008c\7\20\2\2\u008b\u0084\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00b4\5\f\7\f\u008e\u008f\f\n"+
		"\2\2\u008f\u0090\t\7\2\2\u0090\u00b4\5\f\7\13\u0091\u0092\f\t\2\2\u0092"+
		"\u0093\t\b\2\2\u0093\u00b4\5\f\7\n\u0094\u0095\f\b\2\2\u0095\u0096\7\25"+
		"\2\2\u0096\u00b4\5\f\7\t\u0097\u0098\f\7\2\2\u0098\u0099\7\26\2\2\u0099"+
		"\u00b4\5\f\7\b\u009a\u009b\f\6\2\2\u009b\u009c\7\27\2\2\u009c\u00b4\5"+
		"\f\7\7\u009d\u009e\f\5\2\2\u009e\u009f\7\30\2\2\u009f\u00b4\5\f\7\6\u00a0"+
		"\u00a1\f\4\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00b4\5\f\7\5\u00a3\u00a4\f"+
		"\3\2\2\u00a4\u00a5\t\t\2\2\u00a5\u00b4\5\f\7\3\u00a6\u00a7\f\24\2\2\u00a7"+
		"\u00aa\7\3\2\2\u00a8\u00ab\5\2\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\f\23\2\2\u00ad"+
		"\u00ae\7\4\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7\5\2\2\u00b0\u00b4\3\2"+
		"\2\2\u00b1\u00b2\f\20\2\2\u00b2\u00b4\t\n\2\2\u00b3}\3\2\2\2\u00b3\u0080"+
		"\3\2\2\2\u00b3\u0083\3\2\2\2\u00b3\u008e\3\2\2\2\u00b3\u0091\3\2\2\2\u00b3"+
		"\u0094\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u009a\3\2\2\2\u00b3\u009d\3\2"+
		"\2\2\u00b3\u00a0\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3"+
		"\u00ac\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\r\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bf"+
		"\5\b\5\2\u00b9\u00bf\5\2\2\2\u00ba\u00bb\7&\2\2\u00bb\u00bc\5\f\7\2\u00bc"+
		"\u00bd\7\'\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2"+
		"\2\2\u00be\u00ba\3\2\2\2\u00bf\17\3\2\2\2\u00c0\u00cb\7&\2\2\u00c1\u00c6"+
		"\5\22\n\2\u00c2\u00c3\7(\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\'\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\5\2\2\2\u00d1\u00d2"+
		"\7\63\2\2\u00d2\u00d4\5\34\17\2\u00d3\u00d5\5\24\13\2\u00d4\u00d3\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\23\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d8"+
		"\5\f\7\2\u00d8\25\3\2\2\2\u00d9\u00e4\7&\2\2\u00da\u00df\5\f\7\2\u00db"+
		"\u00dc\7(\2\2\u00dc\u00de\5\f\7\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00da\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7\'\2\2\u00e8\27\3\2\2\2\u00e9\u00ea\t\13\2\2\u00ea\31\3\2\2\2"+
		"\u00eb\u00ed\5\30\r\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef"+
		"\3\2\2\2\u00ee\u00f0\7<\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\33\3\2\2\2\u00f1\u00f4\5\36\20\2\u00f2\u00f4\5 \21\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\t\f\2\2\u00f6\37"+
		"\3\2\2\2\u00f7\u00fc\5\"\22\2\u00f8\u00f9\7\3\2\2\u00f9\u00fb\5\"\22\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5\2\2\2\u0100"+
		"#\3\2\2\2\u0101\u0103\5(\25\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0109\5&\24\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7\2\2\3\u010e%\3\2\2\2\u010f\u0110\5\64\33\2\u0110\u0111"+
		"\7)\2\2\u0111\u0118\3\2\2\2\u0112\u0113\5\66\34\2\u0113\u0114\7)\2\2\u0114"+
		"\u0118\3\2\2\2\u0115\u0118\5@!\2\u0116\u0118\5F$\2\u0117\u010f\3\2\2\2"+
		"\u0117\u0112\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\'\3"+
		"\2\2\2\u0119\u011a\78\2\2\u011a\u011e\7*\2\2\u011b\u011d\5*\26\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7+\2\2\u0122"+
		")\3\2\2\2\u0123\u0124\5\60\31\2\u0124\u0125\7)\2\2\u0125+\3\2\2\2\u0126"+
		"\u0127\7/\2\2\u0127\u012b\7*\2\2\u0128\u012a\5.\30\2\u0129\u0128\3\2\2"+
		"\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7+\2\2\u012f-\3\2\2\2\u0130\u0131"+
		"\5\64\33\2\u0131\u0132\7)\2\2\u0132\u013a\3\2\2\2\u0133\u0134\5\66\34"+
		"\2\u0134\u0135\7)\2\2\u0135\u013a\3\2\2\2\u0136\u013a\5@!\2\u0137\u013a"+
		"\5F$\2\u0138\u013a\5,\27\2\u0139\u0130\3\2\2\2\u0139\u0133\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a/\3\2\2\2"+
		"\u013b\u013c\7\60\2\2\u013c\u0141\5\62\32\2\u013d\u013e\7(\2\2\u013e\u0140"+
		"\5\62\32\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\61\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145"+
		"\7S\2\2\u0145\63\3\2\2\2\u0146\u0147\5\32\16\2\u0147\u0148\7>\2\2\u0148"+
		"\u014d\5:\36\2\u0149\u014a\7(\2\2\u014a\u014c\5:\36\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\63\2\2\u0151\u0152\5"+
		"\34\17\2\u0152\65\3\2\2\2\u0153\u0154\5\32\16\2\u0154\u0155\5<\37\2\u0155"+
		"\u0156\5:\36\2\u0156\u0157\7\63\2\2\u0157\u0158\5\34\17\2\u0158\u015b"+
		"\7\32\2\2\u0159\u015c\5\f\7\2\u015a\u015c\5> \2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\67\3\2\2\2\u015d\u015e\5\f\7\2\u015e\u015f\t\t\2"+
		"\2\u015f\u0160\5\f\7\2\u01609\3\2\2\2\u0161\u0162\5\2\2\2\u0162;\3\2\2"+
		"\2\u0163\u0164\t\r\2\2\u0164=\3\2\2\2\u0165\u0166\7\65\2\2\u0166\u0167"+
		"\5\2\2\2\u0167\u0168\5\26\f\2\u0168?\3\2\2\2\u0169\u016a\5\32\16\2\u016a"+
		"\u016b\7\61\2\2\u016b\u016e\5B\"\2\u016c\u016d\7\66\2\2\u016d\u016f\5"+
		"\34\17\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0174\7*\2\2\u0171\u0173\5D#\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2"+
		"\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\7+\2\2\u0178A\3\2\2\2\u0179\u017a\5\2\2\2\u017aC"+
		"\3\2\2\2\u017b\u0184\5@!\2\u017c\u0184\5F$\2\u017d\u017e\5\64\33\2\u017e"+
		"\u017f\7)\2\2\u017f\u0184\3\2\2\2\u0180\u0181\5\66\34\2\u0181\u0182\7"+
		")\2\2\u0182\u0184\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017c\3\2\2\2\u0183"+
		"\u017d\3\2\2\2\u0183\u0180\3\2\2\2\u0184E\3\2\2\2\u0185\u0186\5\32\16"+
		"\2\u0186\u0187\7\62\2\2\u0187\u0188\5H%\2\u0188\u018b\5\20\t\2\u0189\u018a"+
		"\7\63\2\2\u018a\u018c\5\34\17\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u018d\3\2\2\2\u018d\u0191\7*\2\2\u018e\u0190\5J&\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7+\2\2\u0195G\3\2\2\2\u0196"+
		"\u0197\5\2\2\2\u0197I\3\2\2\2\u0198\u0199\5\64\33\2\u0199\u019a\7)\2\2"+
		"\u019a\u01b1\3\2\2\2\u019b\u019c\5\66\34\2\u019c\u019d\7)\2\2\u019d\u01b1"+
		"\3\2\2\2\u019e\u019f\58\35\2\u019f\u01a0\7)\2\2\u01a0\u01b1\3\2\2\2\u01a1"+
		"\u01a2\5> \2\u01a2\u01a3\7)\2\2\u01a3\u01b1\3\2\2\2\u01a4\u01a5\5\n\6"+
		"\2\u01a5\u01a6\7)\2\2\u01a6\u01b1\3\2\2\2\u01a7\u01b1\5L\'\2\u01a8\u01b1"+
		"\5V,\2\u01a9\u01aa\5\f\7\2\u01aa\u01ab\7)\2\2\u01ab\u01b1\3\2\2\2\u01ac"+
		"\u01ad\7*\2\2\u01ad\u01ae\5J&\2\u01ae\u01af\7+\2\2\u01af\u01b1\3\2\2\2"+
		"\u01b0\u0198\3\2\2\2\u01b0\u019b\3\2\2\2\u01b0\u019e\3\2\2\2\u01b0\u01a1"+
		"\3\2\2\2\u01b0\u01a4\3\2\2\2\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0"+
		"\u01a9\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1K\3\2\2\2\u01b2\u01b6\5N(\2\u01b3"+
		"\u01b6\5P)\2\u01b4\u01b6\5R*\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2"+
		"\u01b5\u01b4\3\2\2\2\u01b6M\3\2\2\2\u01b7\u01b8\7E\2\2\u01b8\u01b9\7&"+
		"\2\2\u01b9\u01ba\5\f\7\2\u01ba\u01bb\7\'\2\2\u01bb\u01bf\7*\2\2\u01bc"+
		"\u01be\5T+\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3"+
		"\7+\2\2\u01c3O\3\2\2\2\u01c4\u01c5\7F\2\2\u01c5\u01c6\7E\2\2\u01c6\u01c7"+
		"\7&\2\2\u01c7\u01c8\5\f\7\2\u01c8\u01c9\7\'\2\2\u01c9\u01cd\7*\2\2\u01ca"+
		"\u01cc\5T+\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2"+
		"\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1"+
		"\7+\2\2\u01d1Q\3\2\2\2\u01d2\u01d3\7F\2\2\u01d3\u01d7\7*\2\2\u01d4\u01d6"+
		"\5T+\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7+"+
		"\2\2\u01dbS\3\2\2\2\u01dc\u01dd\5\n\6\2\u01dd\u01de\7)\2\2\u01de\u01f6"+
		"\3\2\2\2\u01df\u01e0\5\64\33\2\u01e0\u01e1\7)\2\2\u01e1\u01f6\3\2\2\2"+
		"\u01e2\u01e3\5\66\34\2\u01e3\u01e4\7)\2\2\u01e4\u01f6\3\2\2\2\u01e5\u01e6"+
		"\58\35\2\u01e6\u01e7\7)\2\2\u01e7\u01f6\3\2\2\2\u01e8\u01f6\5V,\2\u01e9"+
		"\u01f6\5L\'\2\u01ea\u01eb\5\f\7\2\u01eb\u01ec\7)\2\2\u01ec\u01f6\3\2\2"+
		"\2\u01ed\u01f1\7*\2\2\u01ee\u01f0\5T+\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f6\7+\2\2\u01f5\u01dc\3\2\2\2\u01f5\u01df\3\2"+
		"\2\2\u01f5\u01e2\3\2\2\2\u01f5\u01e5\3\2\2\2\u01f5\u01e8\3\2\2\2\u01f5"+
		"\u01e9\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f6U\3\2\2\2"+
		"\u01f7\u01fc\5X-\2\u01f8\u01fc\5Z.\2\u01f9\u01fc\5\\/\2\u01fa\u01fc\5"+
		"^\60\2\u01fb\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fcW\3\2\2\2\u01fd\u01fe\7G\2\2\u01fe\u01ff\7&\2\2\u01ff"+
		"\u0200\5\f\7\2\u0200\u0201\7\'\2\2\u0201\u0205\7*\2\2\u0202\u0204\5`\61"+
		"\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7+\2\2\u0209"+
		"Y\3\2\2\2\u020a\u020b\7H\2\2\u020b\u020c\7&\2\2\u020c\u020d\5\66\34\2"+
		"\u020d\u020e\7)\2\2\u020e\u020f\5\f\7\2\u020f\u0210\7)\2\2\u0210\u0211"+
		"\5\f\7\2\u0211\u0212\7\'\2\2\u0212\u0216\7*\2\2\u0213\u0215\5`\61\2\u0214"+
		"\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7+\2\2\u021a"+
		"[\3\2\2\2\u021b\u021c\7H\2\2\u021c\u021d\7&\2\2\u021d\u021e\5\2\2\2\u021e"+
		"\u021f\7\63\2\2\u021f\u0220\5\34\17\2\u0220\u0221\7J\2\2\u0221\u0222\5"+
		"\2\2\2\u0222\u0223\7\'\2\2\u0223\u0227\7*\2\2\u0224\u0226\5`\61\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7+\2\2\u022b"+
		"]\3\2\2\2\u022c\u022d\7I\2\2\u022d\u0231\7*\2\2\u022e\u0230\5`\61\2\u022f"+
		"\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0234\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7+\2\2\u0235"+
		"\u0236\7G\2\2\u0236\u0237\7&\2\2\u0237\u0238\5\f\7\2\u0238\u0239\7\'\2"+
		"\2\u0239\u023a\7)\2\2\u023a_\3\2\2\2\u023b\u023c\5\n\6\2\u023c\u023d\7"+
		")\2\2\u023d\u0255\3\2\2\2\u023e\u023f\58\35\2\u023f\u0240\7)\2\2\u0240"+
		"\u0255\3\2\2\2\u0241\u0242\5\64\33\2\u0242\u0243\7)\2\2\u0243\u0255\3"+
		"\2\2\2\u0244\u0245\5\66\34\2\u0245\u0246\7)\2\2\u0246\u0255\3\2\2\2\u0247"+
		"\u0255\5L\'\2\u0248\u0255\5V,\2\u0249\u024a\5\f\7\2\u024a\u024b\7)\2\2"+
		"\u024b\u0255\3\2\2\2\u024c\u0250\7*\2\2\u024d\u024f\5`\61\2\u024e\u024d"+
		"\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\7+\2\2\u0254\u023b\3\2"+
		"\2\2\u0254\u023e\3\2\2\2\u0254\u0241\3\2\2\2\u0254\u0244\3\2\2\2\u0254"+
		"\u0247\3\2\2\2\u0254\u0248\3\2\2\2\u0254\u0249\3\2\2\2\u0254\u024c\3\2"+
		"\2\2\u0255a\3\2\2\2.n{\u008b\u00aa\u00b3\u00b5\u00be\u00c6\u00cb\u00d4"+
		"\u00df\u00e4\u00ec\u00ef\u00f3\u00fc\u0104\u010a\u0117\u011e\u012b\u0139"+
		"\u0141\u014d\u015b\u016e\u0174\u0183\u018b\u0191\u01b0\u01b5\u01bf\u01cd"+
		"\u01d7\u01f1\u01f5\u01fb\u0205\u0216\u0227\u0231\u0250\u0254";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}