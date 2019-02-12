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
		RULE_nameSpaceDefinition = 21, RULE_nameSpaceIdentifier = 22, RULE_nameSpaceStatement = 23, 
		RULE_importStatement = 24, RULE_scriptPath = 25, RULE_varDeclStatement = 26, 
		RULE_varInitStatement = 27, RULE_varAssignStatement = 28, RULE_varIdentifier = 29, 
		RULE_varConst = 30, RULE_objInstStatement = 31, RULE_classDefStatement = 32, 
		RULE_classIdentifier = 33, RULE_inClassStatement = 34, RULE_methodDefStatement = 35, 
		RULE_funcIdentifier = 36, RULE_inMethodStatement = 37, RULE_condStatement = 38, 
		RULE_ifStatement = 39, RULE_elseIfStatement = 40, RULE_elseStatement = 41, 
		RULE_inIfStatement = 42, RULE_loopStatement = 43, RULE_whileloop = 44, 
		RULE_forloop = 45, RULE_foreachloop = 46, RULE_doWhileloop = 47, RULE_inloopStatement = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integerLiteral", "floatLiteral", "literal", "methodCall", 
			"expr", "primary", "parameter", "parameterVar", "defaultValueParameter", 
			"arguments", "accmod", "modifier", "dataType", "primitiveType", "referenceType", 
			"userDefinedType", "program", "globalScopeStatement", "preprocessorStatement", 
			"inPreprocessorStatement", "nameSpaceDefinition", "nameSpaceIdentifier", 
			"nameSpaceStatement", "importStatement", "scriptPath", "varDeclStatement", 
			"varInitStatement", "varAssignStatement", "varIdentifier", "varConst", 
			"objInstStatement", "classDefStatement", "classIdentifier", "inClassStatement", 
			"methodDefStatement", "funcIdentifier", "inMethodStatement", "condStatement", 
			"ifStatement", "elseIfStatement", "elseStatement", "inIfStatement", "loopStatement", 
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
			setState(98);
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
			setState(100);
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
			setState(102);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
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
			setState(112);
			identifier();
			setState(113);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new ObjInstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				objInstStatement();
				}
				break;
			case 4:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
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
				setState(120);
				expr(13);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
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
				setState(122);
				expr(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(126);
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
						setState(127);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(129);
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
						setState(130);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(132);
							match(T__12);
							setState(133);
							match(T__12);
							}
							break;
						case 2:
							{
							setState(134);
							match(T__13);
							setState(135);
							match(T__13);
							setState(136);
							match(T__13);
							}
							break;
						case 3:
							{
							setState(137);
							match(T__13);
							setState(138);
							match(T__13);
							}
							break;
						}
						setState(141);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(143);
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
						setState(144);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(146);
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
						setState(147);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new AndBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(149);
						((AndBitWiseExprContext)_localctx).operator = match(T__18);
						setState(150);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new XorBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						((XorBitWiseExprContext)_localctx).operator = match(T__19);
						setState(153);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new OrBitWiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
						((OrBitWiseExprContext)_localctx).operator = match(T__20);
						setState(156);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new AndLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						((AndLogicExprContext)_localctx).operator = match(T__21);
						setState(159);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new OrLogicExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
						((OrLogicExprContext)_localctx).operator = match(T__22);
						setState(162);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(164);
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
						setState(165);
						expr(1);
						}
						break;
					case 12:
						{
						_localctx = new MemberAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(167);
						((MemberAccessExprContext)_localctx).operator = match(T__0);
						setState(170);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(168);
							identifier();
							}
							break;
						case 2:
							{
							setState(169);
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
						setState(172);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(173);
						match(T__1);
						setState(174);
						expr(0);
						setState(175);
						match(T__2);
						}
						break;
					case 14:
						{
						_localctx = new PostFixExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(178);
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
				setState(183);
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
			setState(190);
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
				setState(184);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				identifier();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__35);
				setState(187);
				expr(0);
				setState(188);
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
			setState(192);
			match(T__35);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(193);
				parameterVar();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(194);
					match(T__37);
					setState(195);
					parameterVar();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
			setState(208);
			identifier();
			setState(209);
			match(AS);
			setState(210);
			dataType();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(211);
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
			setState(214);
			match(T__23);
			setState(215);
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
			setState(217);
			match(T__35);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << NEW))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (IDENTIFIER - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (FLOAT_LITERAL - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (BINARY_LITERAL - 74)) | (1L << (CHAR_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (NULL_LITERAL - 74)))) != 0)) {
				{
				{
				setState(218);
				expr(0);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(219);
					match(T__37);
					setState(220);
					expr(0);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
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
			setState(233);
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
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(235);
				accmod();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(238);
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
			setState(243);
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
				setState(241);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
			setState(245);
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
			setState(247);
			userDefinedType();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(248);
				match(T__0);
				setState(249);
				userDefinedType();
				}
				}
				setState(254);
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
			setState(255);
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
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPROCESSOR) {
				{
				{
				setState(257);
				preprocessorStatement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(263);
				globalScopeStatement();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
		public NameSpaceDefinitionContext nameSpaceDefinition() {
			return getRuleContext(NameSpaceDefinitionContext.class,0);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
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
			setState(282);
			match(PREPROCESSOR);
			setState(283);
			match(T__39);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(284);
				inPreprocessorStatement();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
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
			setState(292);
			importStatement();
			setState(293);
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
		public NameSpaceIdentifierContext nameSpaceIdentifier() {
			return getRuleContext(NameSpaceIdentifierContext.class,0);
		}
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
			setState(295);
			match(NAMESPACE);
			setState(296);
			nameSpaceIdentifier();
			setState(297);
			match(T__39);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(298);
				nameSpaceStatement();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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

	public static class NameSpaceIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprezeeneParser.IDENTIFIER, 0); }
		public NameSpaceIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterNameSpaceIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitNameSpaceIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitNameSpaceIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceIdentifierContext nameSpaceIdentifier() throws RecognitionException {
		NameSpaceIdentifierContext _localctx = new NameSpaceIdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nameSpaceIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 46, RULE_nameSpaceStatement);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				varDeclStatement();
				setState(309);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				varInitStatement();
				setState(312);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
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
		enterRule(_localctx, 48, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IMPORT);
			{
			setState(320);
			scriptPath();
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(321);
				match(T__37);
				{
				setState(322);
				scriptPath();
				}
				}
				}
				setState(327);
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
		enterRule(_localctx, 50, RULE_scriptPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		enterRule(_localctx, 52, RULE_varDeclStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			modifier();
			setState(331);
			match(VAR);
			setState(332);
			varIdentifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(333);
				match(T__37);
				setState(334);
				varIdentifier();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(AS);
			setState(341);
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
		enterRule(_localctx, 54, RULE_varInitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			modifier();
			setState(344);
			varConst();
			setState(345);
			varIdentifier();
			setState(346);
			match(AS);
			setState(347);
			dataType();
			setState(348);
			match(T__23);
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(349);
				expr(0);
				}
				break;
			case 2:
				{
				setState(350);
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
		enterRule(_localctx, 56, RULE_varAssignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			expr(0);
			setState(354);
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
			setState(355);
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
		enterRule(_localctx, 58, RULE_varIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 60, RULE_varConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 62, RULE_objInstStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(NEW);
			setState(362);
			identifier();
			setState(363);
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
		enterRule(_localctx, 64, RULE_classDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			modifier();
			setState(366);
			match(CLASS);
			setState(367);
			classIdentifier();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(368);
				match(INHERIT);
				setState(369);
				dataType();
				}
			}

			setState(372);
			match(T__39);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(373);
				inClassStatement();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
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
		enterRule(_localctx, 66, RULE_classIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 68, RULE_inClassStatement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				classDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				methodDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				varDeclStatement();
				setState(386);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				varInitStatement();
				setState(389);
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
		enterRule(_localctx, 70, RULE_methodDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			modifier();
			setState(394);
			match(FUNCTION);
			setState(395);
			funcIdentifier();
			setState(396);
			parameter();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(397);
				match(AS);
				setState(398);
				dataType();
				}
			}

			setState(401);
			match(T__39);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(402);
				inMethodStatement();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
		enterRule(_localctx, 72, RULE_funcIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		enterRule(_localctx, 74, RULE_inMethodStatement);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				varDeclStatement();
				setState(413);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				varInitStatement();
				setState(416);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				varAssignStatement();
				setState(419);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				objInstStatement();
				setState(422);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				methodCall();
				setState(425);
				match(T__38);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				expr(0);
				setState(430);
				match(T__38);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(432);
				match(T__39);
				setState(433);
				inMethodStatement();
				setState(434);
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
		enterRule(_localctx, 76, RULE_condStatement);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				elseIfStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
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
		enterRule(_localctx, 78, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IF);
			setState(444);
			match(T__35);
			setState(445);
			expr(0);
			setState(446);
			match(T__36);
			setState(447);
			match(T__39);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(448);
				inIfStatement();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
		enterRule(_localctx, 80, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(ELSE);
			setState(457);
			match(IF);
			setState(458);
			match(T__35);
			setState(459);
			expr(0);
			setState(460);
			match(T__36);
			setState(461);
			match(T__39);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(462);
				inIfStatement();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
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
		enterRule(_localctx, 82, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ELSE);
			setState(471);
			match(T__39);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(472);
				inIfStatement();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
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
		enterRule(_localctx, 84, RULE_inIfStatement);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				methodCall();
				setState(481);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				varDeclStatement();
				setState(484);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				varInitStatement();
				setState(487);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				varAssignStatement();
				setState(490);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(493);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(494);
				expr(0);
				setState(495);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(497);
				match(T__39);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(498);
					inIfStatement();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
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
		enterRule(_localctx, 86, RULE_loopStatement);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				whileloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				foreachloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
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
		enterRule(_localctx, 88, RULE_whileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(WHILE);
			setState(514);
			match(T__35);
			setState(515);
			expr(0);
			setState(516);
			match(T__36);
			setState(517);
			match(T__39);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(518);
				inloopStatement();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		enterRule(_localctx, 90, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(FOR);
			setState(527);
			match(T__35);
			setState(528);
			varInitStatement();
			setState(529);
			match(T__38);
			setState(530);
			expr(0);
			setState(531);
			match(T__38);
			setState(532);
			expr(0);
			setState(533);
			match(T__36);
			setState(534);
			match(T__39);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(535);
				inloopStatement();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
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
		enterRule(_localctx, 92, RULE_foreachloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(FOR);
			setState(544);
			match(T__35);
			setState(545);
			identifier();
			setState(546);
			match(AS);
			setState(547);
			dataType();
			setState(548);
			match(IN);
			setState(549);
			identifier();
			setState(550);
			match(T__36);
			setState(551);
			match(T__39);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(552);
				inloopStatement();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
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
		enterRule(_localctx, 94, RULE_doWhileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(DO);
			setState(561);
			match(T__39);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(562);
				inloopStatement();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(T__40);
			setState(569);
			match(WHILE);
			setState(570);
			match(T__35);
			setState(571);
			expr(0);
			setState(572);
			match(T__36);
			setState(573);
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
		enterRule(_localctx, 96, RULE_inloopStatement);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				methodCall();
				setState(576);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				varAssignStatement();
				setState(579);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				varDeclStatement();
				setState(582);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				varInitStatement();
				setState(585);
				match(T__38);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				condStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(589);
				expr(0);
				setState(590);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(592);
				match(T__39);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(593);
					inloopStatement();
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(599);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u025d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u008e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00ad\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c1\n\b\3\t\3\t\3\t\3\t\7\t\u00c7"+
		"\n\t\f\t\16\t\u00ca\13\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u00d7\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00e0\n"+
		"\f\f\f\16\f\u00e3\13\f\7\f\u00e5\n\f\f\f\16\f\u00e8\13\f\3\f\3\f\3\r\3"+
		"\r\3\16\5\16\u00ef\n\16\3\16\5\16\u00f2\n\16\3\17\3\17\5\17\u00f6\n\17"+
		"\3\20\3\20\3\21\3\21\3\21\7\21\u00fd\n\21\f\21\16\21\u0100\13\21\3\22"+
		"\3\22\3\23\7\23\u0105\n\23\f\23\16\23\u0108\13\23\3\23\7\23\u010b\n\23"+
		"\f\23\16\23\u010e\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u011b\n\24\3\25\3\25\3\25\7\25\u0120\n\25\f\25\16\25\u0123"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u012e\n\27\f"+
		"\27\16\27\u0131\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0140\n\31\3\32\3\32\3\32\3\32\7\32\u0146\n\32\f"+
		"\32\16\32\u0149\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u0152\n"+
		"\34\f\34\16\34\u0155\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0162\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0175\n\"\3\"\3\"\7\"\u0179\n\"\f\"\16\""+
		"\u017c\13\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u018a\n$\3%\3%\3"+
		"%\3%\3%\3%\5%\u0192\n%\3%\3%\7%\u0196\n%\f%\16%\u0199\13%\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b7\n\'\3(\3(\3(\5(\u01bc\n(\3)\3)\3"+
		")\3)\3)\3)\7)\u01c4\n)\f)\16)\u01c7\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\7*"+
		"\u01d2\n*\f*\16*\u01d5\13*\3*\3*\3+\3+\3+\7+\u01dc\n+\f+\16+\u01df\13"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01f6"+
		"\n,\f,\16,\u01f9\13,\3,\5,\u01fc\n,\3-\3-\3-\3-\5-\u0202\n-\3.\3.\3.\3"+
		".\3.\3.\7.\u020a\n.\f.\16.\u020d\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\7/\u021b\n/\f/\16/\u021e\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\7\60\u022c\n\60\f\60\16\60\u022f\13\60\3\60\3\60\3"+
		"\61\3\61\3\61\7\61\u0236\n\61\f\61\16\61\u0239\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0255\n\62\f\62\16\62"+
		"\u0258\13\62\3\62\5\62\u025b\n\62\3\62\2\3\f\63\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\16\4\2M"+
		"MOQ\3\2\6\t\3\2\n\13\3\2\f\16\3\2\b\t\3\2\17\22\3\2\23\24\3\2\32%\3\2"+
		"\6\7\3\29;\3\2?D\3\2=>\2\u028a\2d\3\2\2\2\4f\3\2\2\2\6h\3\2\2\2\bp\3\2"+
		"\2\2\nr\3\2\2\2\f}\3\2\2\2\16\u00c0\3\2\2\2\20\u00c2\3\2\2\2\22\u00d2"+
		"\3\2\2\2\24\u00d8\3\2\2\2\26\u00db\3\2\2\2\30\u00eb\3\2\2\2\32\u00ee\3"+
		"\2\2\2\34\u00f5\3\2\2\2\36\u00f7\3\2\2\2 \u00f9\3\2\2\2\"\u0101\3\2\2"+
		"\2$\u0106\3\2\2\2&\u011a\3\2\2\2(\u011c\3\2\2\2*\u0126\3\2\2\2,\u0129"+
		"\3\2\2\2.\u0134\3\2\2\2\60\u013f\3\2\2\2\62\u0141\3\2\2\2\64\u014a\3\2"+
		"\2\2\66\u014c\3\2\2\28\u0159\3\2\2\2:\u0163\3\2\2\2<\u0167\3\2\2\2>\u0169"+
		"\3\2\2\2@\u016b\3\2\2\2B\u016f\3\2\2\2D\u017f\3\2\2\2F\u0189\3\2\2\2H"+
		"\u018b\3\2\2\2J\u019c\3\2\2\2L\u01b6\3\2\2\2N\u01bb\3\2\2\2P\u01bd\3\2"+
		"\2\2R\u01ca\3\2\2\2T\u01d8\3\2\2\2V\u01fb\3\2\2\2X\u0201\3\2\2\2Z\u0203"+
		"\3\2\2\2\\\u0210\3\2\2\2^\u0221\3\2\2\2`\u0232\3\2\2\2b\u025a\3\2\2\2"+
		"de\7L\2\2e\3\3\2\2\2fg\t\2\2\2g\5\3\2\2\2hi\7N\2\2i\7\3\2\2\2jq\5\4\3"+
		"\2kq\5\6\4\2lq\7S\2\2mq\7R\2\2nq\7T\2\2oq\7U\2\2pj\3\2\2\2pk\3\2\2\2p"+
		"l\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\t\3\2\2\2rs\5\2\2\2st\5\26\f"+
		"\2t\13\3\2\2\2uv\b\7\1\2v~\5\16\b\2w~\5\n\6\2x~\5@!\2yz\t\3\2\2z~\5\f"+
		"\7\17{|\t\4\2\2|~\5\f\7\16}u\3\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}{\3"+
		"\2\2\2~\u00b7\3\2\2\2\177\u0080\f\r\2\2\u0080\u0081\t\5\2\2\u0081\u00b6"+
		"\5\f\7\16\u0082\u0083\f\f\2\2\u0083\u0084\t\6\2\2\u0084\u00b6\5\f\7\r"+
		"\u0085\u008d\f\13\2\2\u0086\u0087\7\17\2\2\u0087\u008e\7\17\2\2\u0088"+
		"\u0089\7\20\2\2\u0089\u008a\7\20\2\2\u008a\u008e\7\20\2\2\u008b\u008c"+
		"\7\20\2\2\u008c\u008e\7\20\2\2\u008d\u0086\3\2\2\2\u008d\u0088\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00b6\5\f\7\f\u0090\u0091"+
		"\f\n\2\2\u0091\u0092\t\7\2\2\u0092\u00b6\5\f\7\13\u0093\u0094\f\t\2\2"+
		"\u0094\u0095\t\b\2\2\u0095\u00b6\5\f\7\n\u0096\u0097\f\b\2\2\u0097\u0098"+
		"\7\25\2\2\u0098\u00b6\5\f\7\t\u0099\u009a\f\7\2\2\u009a\u009b\7\26\2\2"+
		"\u009b\u00b6\5\f\7\b\u009c\u009d\f\6\2\2\u009d\u009e\7\27\2\2\u009e\u00b6"+
		"\5\f\7\7\u009f\u00a0\f\5\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00b6\5\f\7\6"+
		"\u00a2\u00a3\f\4\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00b6\5\f\7\5\u00a5\u00a6"+
		"\f\3\2\2\u00a6\u00a7\t\t\2\2\u00a7\u00b6\5\f\7\3\u00a8\u00a9\f\24\2\2"+
		"\u00a9\u00ac\7\3\2\2\u00aa\u00ad\5\2\2\2\u00ab\u00ad\5\n\6\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b6\3\2\2\2\u00ae\u00af\f\23\2\2"+
		"\u00af\u00b0\7\4\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\5\2\2\u00b2\u00b6"+
		"\3\2\2\2\u00b3\u00b4\f\20\2\2\u00b4\u00b6\t\n\2\2\u00b5\177\3\2\2\2\u00b5"+
		"\u0082\3\2\2\2\u00b5\u0085\3\2\2\2\u00b5\u0090\3\2\2\2\u00b5\u0093\3\2"+
		"\2\2\u00b5\u0096\3\2\2\2\u00b5\u0099\3\2\2\2\u00b5\u009c\3\2\2\2\u00b5"+
		"\u009f\3\2\2\2\u00b5\u00a2\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a8\3\2"+
		"\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00c1\5\b\5\2\u00bb\u00c1\5\2\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be"+
		"\5\f\7\2\u00be\u00bf\7\'\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0"+
		"\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00cd\7&\2\2"+
		"\u00c3\u00c8\5\22\n\2\u00c4\u00c5\7(\2\2\u00c5\u00c7\5\22\n\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\5\2\2"+
		"\2\u00d3\u00d4\7\63\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d7\5\24\13\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\32\2"+
		"\2\u00d9\u00da\5\f\7\2\u00da\25\3\2\2\2\u00db\u00e6\7&\2\2\u00dc\u00e1"+
		"\5\f\7\2\u00dd\u00de\7(\2\2\u00de\u00e0\5\f\7\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7\'\2\2\u00ea\27\3\2\2\2\u00eb\u00ec\t\13\2\2\u00ec\31"+
		"\3\2\2\2\u00ed\u00ef\5\30\r\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7<\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\33\3\2\2\2\u00f3\u00f6\5\36\20\2\u00f4\u00f6\5 \21\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\35\3\2\2\2\u00f7\u00f8\t\f\2"+
		"\2\u00f8\37\3\2\2\2\u00f9\u00fe\5\"\22\2\u00fa\u00fb\7\3\2\2\u00fb\u00fd"+
		"\5\"\22\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff!\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\5"+
		"\2\2\2\u0102#\3\2\2\2\u0103\u0105\5(\25\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010b\5&\24\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7\2\2\3\u0110%\3\2\2\2\u0111\u0112\5\66\34"+
		"\2\u0112\u0113\7)\2\2\u0113\u011b\3\2\2\2\u0114\u0115\58\35\2\u0115\u0116"+
		"\7)\2\2\u0116\u011b\3\2\2\2\u0117\u011b\5B\"\2\u0118\u011b\5H%\2\u0119"+
		"\u011b\5,\27\2\u011a\u0111\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\'\3\2\2\2\u011c\u011d"+
		"\78\2\2\u011d\u0121\7*\2\2\u011e\u0120\5*\26\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7+\2\2\u0125)\3\2\2\2\u0126\u0127"+
		"\5\62\32\2\u0127\u0128\7)\2\2\u0128+\3\2\2\2\u0129\u012a\7/\2\2\u012a"+
		"\u012b\5.\30\2\u012b\u012f\7*\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7+\2\2\u0133-\3\2\2\2\u0134"+
		"\u0135\7L\2\2\u0135/\3\2\2\2\u0136\u0137\5\66\34\2\u0137\u0138\7)\2\2"+
		"\u0138\u0140\3\2\2\2\u0139\u013a\58\35\2\u013a\u013b\7)\2\2\u013b\u0140"+
		"\3\2\2\2\u013c\u0140\5B\"\2\u013d\u0140\5H%\2\u013e\u0140\5,\27\2\u013f"+
		"\u0136\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\61\3\2\2\2\u0141\u0142\7\60\2\2\u0142\u0147"+
		"\5\64\33\2\u0143\u0144\7(\2\2\u0144\u0146\5\64\33\2\u0145\u0143\3\2\2"+
		"\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\63"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7S\2\2\u014b\65\3\2\2\2\u014c"+
		"\u014d\5\32\16\2\u014d\u014e\7>\2\2\u014e\u0153\5<\37\2\u014f\u0150\7"+
		"(\2\2\u0150\u0152\5<\37\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0157\7\63\2\2\u0157\u0158\5\34\17\2\u0158\67\3\2\2\2\u0159"+
		"\u015a\5\32\16\2\u015a\u015b\5> \2\u015b\u015c\5<\37\2\u015c\u015d\7\63"+
		"\2\2\u015d\u015e\5\34\17\2\u015e\u0161\7\32\2\2\u015f\u0162\5\f\7\2\u0160"+
		"\u0162\5@!\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u01629\3\2\2\2\u0163"+
		"\u0164\5\f\7\2\u0164\u0165\t\t\2\2\u0165\u0166\5\f\7\2\u0166;\3\2\2\2"+
		"\u0167\u0168\5\2\2\2\u0168=\3\2\2\2\u0169\u016a\t\r\2\2\u016a?\3\2\2\2"+
		"\u016b\u016c\7\65\2\2\u016c\u016d\5\2\2\2\u016d\u016e\5\26\f\2\u016eA"+
		"\3\2\2\2\u016f\u0170\5\32\16\2\u0170\u0171\7\61\2\2\u0171\u0174\5D#\2"+
		"\u0172\u0173\7\66\2\2\u0173\u0175\5\34\17\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017a\7*\2\2\u0177\u0179\5F$"+
		"\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7+\2\2\u017e"+
		"C\3\2\2\2\u017f\u0180\5\2\2\2\u0180E\3\2\2\2\u0181\u018a\5B\"\2\u0182"+
		"\u018a\5H%\2\u0183\u0184\5\66\34\2\u0184\u0185\7)\2\2\u0185\u018a\3\2"+
		"\2\2\u0186\u0187\58\35\2\u0187\u0188\7)\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0181\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0186\3\2"+
		"\2\2\u018aG\3\2\2\2\u018b\u018c\5\32\16\2\u018c\u018d\7\62\2\2\u018d\u018e"+
		"\5J&\2\u018e\u0191\5\20\t\2\u018f\u0190\7\63\2\2\u0190\u0192\5\34\17\2"+
		"\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0197"+
		"\7*\2\2\u0194\u0196\5L\'\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u019a\u019b\7+\2\2\u019bI\3\2\2\2\u019c\u019d\5\2\2\2\u019dK\3\2"+
		"\2\2\u019e\u019f\5\66\34\2\u019f\u01a0\7)\2\2\u01a0\u01b7\3\2\2\2\u01a1"+
		"\u01a2\58\35\2\u01a2\u01a3\7)\2\2\u01a3\u01b7\3\2\2\2\u01a4\u01a5\5:\36"+
		"\2\u01a5\u01a6\7)\2\2\u01a6\u01b7\3\2\2\2\u01a7\u01a8\5@!\2\u01a8\u01a9"+
		"\7)\2\2\u01a9\u01b7\3\2\2\2\u01aa\u01ab\5\n\6\2\u01ab\u01ac\7)\2\2\u01ac"+
		"\u01b7\3\2\2\2\u01ad\u01b7\5N(\2\u01ae\u01b7\5X-\2\u01af\u01b0\5\f\7\2"+
		"\u01b0\u01b1\7)\2\2\u01b1\u01b7\3\2\2\2\u01b2\u01b3\7*\2\2\u01b3\u01b4"+
		"\5L\'\2\u01b4\u01b5\7+\2\2\u01b5\u01b7\3\2\2\2\u01b6\u019e\3\2\2\2\u01b6"+
		"\u01a1\3\2\2\2\u01b6\u01a4\3\2\2\2\u01b6\u01a7\3\2\2\2\u01b6\u01aa\3\2"+
		"\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01af\3\2\2\2\u01b6"+
		"\u01b2\3\2\2\2\u01b7M\3\2\2\2\u01b8\u01bc\5P)\2\u01b9\u01bc\5R*\2\u01ba"+
		"\u01bc\5T+\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2"+
		"\2\u01bcO\3\2\2\2\u01bd\u01be\7E\2\2\u01be\u01bf\7&\2\2\u01bf\u01c0\5"+
		"\f\7\2\u01c0\u01c1\7\'\2\2\u01c1\u01c5\7*\2\2\u01c2\u01c4\5V,\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9"+
		"Q\3\2\2\2\u01ca\u01cb\7F\2\2\u01cb\u01cc\7E\2\2\u01cc\u01cd\7&\2\2\u01cd"+
		"\u01ce\5\f\7\2\u01ce\u01cf\7\'\2\2\u01cf\u01d3\7*\2\2\u01d0\u01d2\5V,"+
		"\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7+\2\2\u01d7"+
		"S\3\2\2\2\u01d8\u01d9\7F\2\2\u01d9\u01dd\7*\2\2\u01da\u01dc\5V,\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7+\2\2\u01e1"+
		"U\3\2\2\2\u01e2\u01e3\5\n\6\2\u01e3\u01e4\7)\2\2\u01e4\u01fc\3\2\2\2\u01e5"+
		"\u01e6\5\66\34\2\u01e6\u01e7\7)\2\2\u01e7\u01fc\3\2\2\2\u01e8\u01e9\5"+
		"8\35\2\u01e9\u01ea\7)\2\2\u01ea\u01fc\3\2\2\2\u01eb\u01ec\5:\36\2\u01ec"+
		"\u01ed\7)\2\2\u01ed\u01fc\3\2\2\2\u01ee\u01fc\5X-\2\u01ef\u01fc\5N(\2"+
		"\u01f0\u01f1\5\f\7\2\u01f1\u01f2\7)\2\2\u01f2\u01fc\3\2\2\2\u01f3\u01f7"+
		"\7*\2\2\u01f4\u01f6\5V,\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01fa\u01fc\7+\2\2\u01fb\u01e2\3\2\2\2\u01fb\u01e5\3\2\2\2\u01fb"+
		"\u01e8\3\2\2\2\u01fb\u01eb\3\2\2\2\u01fb\u01ee\3\2\2\2\u01fb\u01ef\3\2"+
		"\2\2\u01fb\u01f0\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fcW\3\2\2\2\u01fd\u0202"+
		"\5Z.\2\u01fe\u0202\5\\/\2\u01ff\u0202\5^\60\2\u0200\u0202\5`\61\2\u0201"+
		"\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2"+
		"\2\2\u0202Y\3\2\2\2\u0203\u0204\7G\2\2\u0204\u0205\7&\2\2\u0205\u0206"+
		"\5\f\7\2\u0206\u0207\7\'\2\2\u0207\u020b\7*\2\2\u0208\u020a\5b\62\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7+\2\2\u020f"+
		"[\3\2\2\2\u0210\u0211\7H\2\2\u0211\u0212\7&\2\2\u0212\u0213\58\35\2\u0213"+
		"\u0214\7)\2\2\u0214\u0215\5\f\7\2\u0215\u0216\7)\2\2\u0216\u0217\5\f\7"+
		"\2\u0217\u0218\7\'\2\2\u0218\u021c\7*\2\2\u0219\u021b\5b\62\2\u021a\u0219"+
		"\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7+\2\2\u0220]\3\2\2\2\u0221"+
		"\u0222\7H\2\2\u0222\u0223\7&\2\2\u0223\u0224\5\2\2\2\u0224\u0225\7\63"+
		"\2\2\u0225\u0226\5\34\17\2\u0226\u0227\7J\2\2\u0227\u0228\5\2\2\2\u0228"+
		"\u0229\7\'\2\2\u0229\u022d\7*\2\2\u022a\u022c\5b\62\2\u022b\u022a\3\2"+
		"\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7+\2\2\u0231_\3\2\2\2\u0232"+
		"\u0233\7I\2\2\u0233\u0237\7*\2\2\u0234\u0236\5b\62\2\u0235\u0234\3\2\2"+
		"\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7+\2\2\u023b\u023c\7G\2\2\u023c"+
		"\u023d\7&\2\2\u023d\u023e\5\f\7\2\u023e\u023f\7\'\2\2\u023f\u0240\7)\2"+
		"\2\u0240a\3\2\2\2\u0241\u0242\5\n\6\2\u0242\u0243\7)\2\2\u0243\u025b\3"+
		"\2\2\2\u0244\u0245\5:\36\2\u0245\u0246\7)\2\2\u0246\u025b\3\2\2\2\u0247"+
		"\u0248\5\66\34\2\u0248\u0249\7)\2\2\u0249\u025b\3\2\2\2\u024a\u024b\5"+
		"8\35\2\u024b\u024c\7)\2\2\u024c\u025b\3\2\2\2\u024d\u025b\5N(\2\u024e"+
		"\u025b\5X-\2\u024f\u0250\5\f\7\2\u0250\u0251\7)\2\2\u0251\u025b\3\2\2"+
		"\2\u0252\u0256\7*\2\2\u0253\u0255\5b\62\2\u0254\u0253\3\2\2\2\u0255\u0258"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u025b\7+\2\2\u025a\u0241\3\2\2\2\u025a\u0244\3\2"+
		"\2\2\u025a\u0247\3\2\2\2\u025a\u024a\3\2\2\2\u025a\u024d\3\2\2\2\u025a"+
		"\u024e\3\2\2\2\u025a\u024f\3\2\2\2\u025a\u0252\3\2\2\2\u025bc\3\2\2\2"+
		".p}\u008d\u00ac\u00b5\u00b7\u00c0\u00c8\u00cd\u00d6\u00e1\u00e6\u00ee"+
		"\u00f1\u00f5\u00fe\u0106\u010c\u011a\u0121\u012f\u013f\u0147\u0153\u0161"+
		"\u0174\u017a\u0189\u0191\u0197\u01b6\u01bb\u01c5\u01d3\u01dd\u01f7\u01fb"+
		"\u0201\u020b\u021c\u022d\u0237\u0256\u025a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}