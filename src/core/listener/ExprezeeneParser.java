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
		RULE_methodCall = 4, RULE_expr = 5, RULE_primary = 6, RULE_expressionStatement = 7, 
		RULE_parameter = 8, RULE_parameterVar = 9, RULE_defaultValueParameter = 10, 
		RULE_arguments = 11, RULE_accmod = 12, RULE_modifier = 13, RULE_dataType = 14, 
		RULE_primitiveType = 15, RULE_referenceType = 16, RULE_userDefinedType = 17, 
		RULE_program = 18, RULE_globalScopeStatement = 19, RULE_preprocessorStatement = 20, 
		RULE_inPreprocessorStatement = 21, RULE_nameSpaceDefinition = 22, RULE_nameSpaceIdentifier = 23, 
		RULE_nameSpaceStatement = 24, RULE_importStatement = 25, RULE_scriptPath = 26, 
		RULE_varDeclStatement = 27, RULE_varInitStatement = 28, RULE_varAssignStatement = 29, 
		RULE_varIdentifier = 30, RULE_varConst = 31, RULE_objInstStatement = 32, 
		RULE_classDefStatement = 33, RULE_classIdentifier = 34, RULE_inClassStatement = 35, 
		RULE_methodDefStatement = 36, RULE_funcIdentifier = 37, RULE_inMethodStatement = 38, 
		RULE_condStatement = 39, RULE_ifStatement = 40, RULE_elseIfStatement = 41, 
		RULE_elseStatement = 42, RULE_inIfStatement = 43, RULE_loopStatement = 44, 
		RULE_whileloop = 45, RULE_forloop = 46, RULE_foreachloop = 47, RULE_doWhileloop = 48, 
		RULE_inloopStatement = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integerLiteral", "floatLiteral", "literal", "methodCall", 
			"expr", "primary", "expressionStatement", "parameter", "parameterVar", 
			"defaultValueParameter", "arguments", "accmod", "modifier", "dataType", 
			"primitiveType", "referenceType", "userDefinedType", "program", "globalScopeStatement", 
			"preprocessorStatement", "inPreprocessorStatement", "nameSpaceDefinition", 
			"nameSpaceIdentifier", "nameSpaceStatement", "importStatement", "scriptPath", 
			"varDeclStatement", "varInitStatement", "varAssignStatement", "varIdentifier", 
			"varConst", "objInstStatement", "classDefStatement", "classIdentifier", 
			"inClassStatement", "methodDefStatement", "funcIdentifier", "inMethodStatement", 
			"condStatement", "ifStatement", "elseIfStatement", "elseStatement", "inIfStatement", 
			"loopStatement", "whileloop", "forloop", "foreachloop", "doWhileloop", 
			"inloopStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", 
			"';'", "','", "'{'", "'}'", null, "'define'", "'alias'", "'namespace'", 
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
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
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
			setState(114);
			identifier();
			setState(115);
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
		public Token prefix;
		public Token operator;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ObjInstStatementContext objInstStatement() {
			return getRuleContext(ObjInstStatementContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(118);
				primary();
				}
				break;
			case 2:
				{
				setState(119);
				methodCall();
				}
				break;
			case 3:
				{
				setState(120);
				objInstStatement();
				}
				break;
			case 4:
				{
				setState(121);
				((ExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((ExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				expr(13);
				}
				break;
			case 5:
				{
				setState(123);
				((ExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((ExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				expr(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(128);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(141);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(134);
							match(T__12);
							setState(135);
							match(T__12);
							}
							break;
						case 2:
							{
							setState(136);
							match(T__13);
							setState(137);
							match(T__13);
							setState(138);
							match(T__13);
							}
							break;
						case 3:
							{
							setState(139);
							match(T__13);
							setState(140);
							match(T__13);
							}
							break;
						}
						setState(143);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(145);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(148);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(151);
						((ExprContext)_localctx).operator = match(T__18);
						setState(152);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						((ExprContext)_localctx).operator = match(T__19);
						setState(155);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						((ExprContext)_localctx).operator = match(T__20);
						setState(158);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						((ExprContext)_localctx).operator = match(T__21);
						setState(161);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						((ExprContext)_localctx).operator = match(T__22);
						setState(164);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(1);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(169);
						((ExprContext)_localctx).operator = match(T__0);
						setState(172);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(170);
							identifier();
							}
							break;
						case 2:
							{
							setState(171);
							methodCall();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(175);
						match(T__1);
						setState(176);
						expr(0);
						setState(177);
						match(T__2);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(180);
						((ExprContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
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
				setState(185);
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
			setState(192);
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
				setState(186);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				identifier();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__35);
				setState(189);
				expr(0);
				setState(190);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprezeeneListener ) ((ExprezeeneListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprezeeneVisitor ) return ((ExprezeeneVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			expr(0);
			setState(195);
			match(T__37);
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
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__35);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(198);
				parameterVar();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(199);
					match(T__38);
					setState(200);
					parameterVar();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
		enterRule(_localctx, 18, RULE_parameterVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			identifier();
			setState(214);
			match(AS);
			setState(215);
			dataType();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(216);
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
		enterRule(_localctx, 20, RULE_defaultValueParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__23);
			setState(220);
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
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__35);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << NEW))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (IDENTIFIER - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (FLOAT_LITERAL - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (BINARY_LITERAL - 74)) | (1L << (CHAR_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (NULL_LITERAL - 74)))) != 0)) {
				{
				{
				setState(223);
				expr(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(224);
					match(T__38);
					setState(225);
					expr(0);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		enterRule(_localctx, 24, RULE_accmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 26, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(240);
				accmod();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(243);
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
		enterRule(_localctx, 28, RULE_dataType);
		try {
			setState(248);
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
				setState(246);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 32, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			userDefinedType();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(253);
				match(T__0);
				setState(254);
				userDefinedType();
				}
				}
				setState(259);
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
		enterRule(_localctx, 34, RULE_userDefinedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 36, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPROCESSOR) {
				{
				{
				setState(262);
				preprocessorStatement();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(268);
				globalScopeStatement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
		enterRule(_localctx, 38, RULE_globalScopeStatement);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				varDeclStatement();
				setState(277);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				varInitStatement();
				setState(280);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
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
		enterRule(_localctx, 40, RULE_preprocessorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(PREPROCESSOR);
			setState(288);
			match(T__39);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(289);
				inPreprocessorStatement();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		enterRule(_localctx, 42, RULE_inPreprocessorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			importStatement();
			setState(298);
			match(T__37);
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
		enterRule(_localctx, 44, RULE_nameSpaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(NAMESPACE);
			setState(301);
			nameSpaceIdentifier();
			setState(302);
			match(T__39);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(303);
				nameSpaceStatement();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
		enterRule(_localctx, 46, RULE_nameSpaceIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 48, RULE_nameSpaceStatement);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				varDeclStatement();
				setState(314);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				varInitStatement();
				setState(317);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
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
		enterRule(_localctx, 50, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IMPORT);
			{
			setState(325);
			scriptPath();
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(326);
				match(T__38);
				{
				setState(327);
				scriptPath();
				}
				}
				}
				setState(332);
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
		enterRule(_localctx, 52, RULE_scriptPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 54, RULE_varDeclStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			modifier();
			setState(336);
			match(VAR);
			setState(337);
			varIdentifier();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(338);
				match(T__38);
				setState(339);
				varIdentifier();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(AS);
			setState(346);
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
		enterRule(_localctx, 56, RULE_varInitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			modifier();
			setState(349);
			varConst();
			setState(350);
			varIdentifier();
			setState(351);
			match(AS);
			setState(352);
			dataType();
			setState(353);
			match(T__23);
			{
			setState(354);
			expr(0);
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
		enterRule(_localctx, 58, RULE_varAssignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expr(0);
			setState(357);
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
			setState(358);
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
		enterRule(_localctx, 60, RULE_varIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		enterRule(_localctx, 62, RULE_varConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 64, RULE_objInstStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(NEW);
			setState(365);
			identifier();
			setState(366);
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
		enterRule(_localctx, 66, RULE_classDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			modifier();
			setState(369);
			match(CLASS);
			setState(370);
			classIdentifier();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(371);
				match(INHERIT);
				setState(372);
				dataType();
				}
			}

			setState(375);
			match(T__39);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(376);
				inClassStatement();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
		enterRule(_localctx, 68, RULE_classIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		enterRule(_localctx, 70, RULE_inClassStatement);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				classDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				methodDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				varDeclStatement();
				setState(389);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				varInitStatement();
				setState(392);
				match(T__37);
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
		enterRule(_localctx, 72, RULE_methodDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			modifier();
			setState(397);
			match(FUNCTION);
			setState(398);
			funcIdentifier();
			setState(399);
			parameter();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(400);
				match(AS);
				setState(401);
				dataType();
				}
			}

			setState(404);
			match(T__39);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(405);
				inMethodStatement();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
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
		enterRule(_localctx, 74, RULE_funcIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 76, RULE_inMethodStatement);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				varDeclStatement();
				setState(416);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				varInitStatement();
				setState(419);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				varAssignStatement();
				setState(422);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				objInstStatement();
				setState(425);
				match(T__37);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				methodCall();
				setState(428);
				match(T__37);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				match(T__39);
				setState(434);
				inMethodStatement();
				setState(435);
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
		enterRule(_localctx, 78, RULE_condStatement);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				elseIfStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
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
		enterRule(_localctx, 80, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IF);
			setState(445);
			match(T__35);
			setState(446);
			expr(0);
			setState(447);
			match(T__36);
			setState(448);
			match(T__39);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(449);
				inIfStatement();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 82, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(ELSE);
			setState(458);
			match(IF);
			setState(459);
			match(T__35);
			setState(460);
			expr(0);
			setState(461);
			match(T__36);
			setState(462);
			match(T__39);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(463);
				inIfStatement();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
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
		enterRule(_localctx, 84, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(ELSE);
			setState(472);
			match(T__39);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(473);
				inIfStatement();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 86, RULE_inIfStatement);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				methodCall();
				setState(482);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				varDeclStatement();
				setState(485);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				varInitStatement();
				setState(488);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				varAssignStatement();
				setState(491);
				match(T__37);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				condStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(495);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(496);
				match(T__39);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(497);
					inIfStatement();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
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
		enterRule(_localctx, 88, RULE_loopStatement);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				whileloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				foreachloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
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
		enterRule(_localctx, 90, RULE_whileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(WHILE);
			setState(513);
			match(T__35);
			setState(514);
			expr(0);
			setState(515);
			match(T__36);
			setState(516);
			match(T__39);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(517);
				inloopStatement();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
		enterRule(_localctx, 92, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(FOR);
			setState(526);
			match(T__35);
			setState(527);
			varInitStatement();
			setState(528);
			match(T__37);
			setState(529);
			expr(0);
			setState(530);
			match(T__37);
			setState(531);
			expr(0);
			setState(532);
			match(T__36);
			setState(533);
			match(T__39);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(534);
				inloopStatement();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
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
		enterRule(_localctx, 94, RULE_foreachloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(FOR);
			setState(543);
			match(T__35);
			setState(544);
			identifier();
			setState(545);
			match(AS);
			setState(546);
			dataType();
			setState(547);
			match(IN);
			setState(548);
			identifier();
			setState(549);
			match(T__36);
			setState(550);
			match(T__39);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(551);
				inloopStatement();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
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
		enterRule(_localctx, 96, RULE_doWhileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(DO);
			setState(560);
			match(T__39);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
				{
				{
				setState(561);
				inloopStatement();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(T__40);
			setState(568);
			match(WHILE);
			setState(569);
			match(T__35);
			setState(570);
			expr(0);
			setState(571);
			match(T__36);
			setState(572);
			match(T__37);
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
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 98, RULE_inloopStatement);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				methodCall();
				setState(575);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				varAssignStatement();
				setState(578);
				match(T__37);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				varDeclStatement();
				setState(581);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				varInitStatement();
				setState(584);
				match(T__37);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				condStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(589);
				match(T__39);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__35) | (1L << T__39) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (BOOLEAN_LITERAL - 67)) | (1L << (NULL_LITERAL - 67)))) != 0)) {
					{
					{
					setState(590);
					inloopStatement();
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(596);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b8\n\7"+
		"\f\7\16\7\u00bb\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c3\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\7\n\u00d1\n\n\f\n\16"+
		"\n\u00d4\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00dc\n\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\r\u00e5\n\r\f\r\16\r\u00e8\13\r\7\r\u00ea\n\r\f\r\16"+
		"\r\u00ed\13\r\3\r\3\r\3\16\3\16\3\17\5\17\u00f4\n\17\3\17\5\17\u00f7\n"+
		"\17\3\20\3\20\5\20\u00fb\n\20\3\21\3\21\3\22\3\22\3\22\7\22\u0102\n\22"+
		"\f\22\16\22\u0105\13\22\3\23\3\23\3\24\7\24\u010a\n\24\f\24\16\24\u010d"+
		"\13\24\3\24\7\24\u0110\n\24\f\24\16\24\u0113\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0120\n\25\3\26\3\26\3\26\7\26"+
		"\u0125\n\26\f\26\16\26\u0128\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u0133\n\30\f\30\16\30\u0136\13\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0145\n\32\3\33\3\33"+
		"\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e\13\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0157\n\35\f\35\16\35\u015a\13\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0178\n#\3#\3#\7#\u017c\n#\f#\16"+
		"#\u017f\13#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u018d\n%\3&\3&\3&\3"+
		"&\3&\3&\5&\u0195\n&\3&\3&\7&\u0199\n&\f&\16&\u019c\13&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b8"+
		"\n(\3)\3)\3)\5)\u01bd\n)\3*\3*\3*\3*\3*\3*\7*\u01c5\n*\f*\16*\u01c8\13"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u01d3\n+\f+\16+\u01d6\13+\3+\3+\3,\3,"+
		"\3,\7,\u01dd\n,\f,\16,\u01e0\13,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\7-\u01f5\n-\f-\16-\u01f8\13-\3-\5-\u01fb\n-\3.\3."+
		"\3.\3.\5.\u0201\n.\3/\3/\3/\3/\3/\3/\7/\u0209\n/\f/\16/\u020c\13/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u021a\n\60\f"+
		"\60\16\60\u021d\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u022b\n\61\f\61\16\61\u022e\13\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u0235\n\62\f\62\16\62\u0238\13\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u0252\n\63\f\63\16\63\u0255\13\63\3\63"+
		"\5\63\u0258\n\63\3\63\2\3\f\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\16\4\2MMOQ\3\2\6\t\3\2"+
		"\n\13\3\2\f\16\3\2\b\t\3\2\17\22\3\2\23\24\3\2\32%\3\2\6\7\3\29;\3\2?"+
		"D\3\2=>\2\u0285\2f\3\2\2\2\4h\3\2\2\2\6j\3\2\2\2\br\3\2\2\2\nt\3\2\2\2"+
		"\f\177\3\2\2\2\16\u00c2\3\2\2\2\20\u00c4\3\2\2\2\22\u00c7\3\2\2\2\24\u00d7"+
		"\3\2\2\2\26\u00dd\3\2\2\2\30\u00e0\3\2\2\2\32\u00f0\3\2\2\2\34\u00f3\3"+
		"\2\2\2\36\u00fa\3\2\2\2 \u00fc\3\2\2\2\"\u00fe\3\2\2\2$\u0106\3\2\2\2"+
		"&\u010b\3\2\2\2(\u011f\3\2\2\2*\u0121\3\2\2\2,\u012b\3\2\2\2.\u012e\3"+
		"\2\2\2\60\u0139\3\2\2\2\62\u0144\3\2\2\2\64\u0146\3\2\2\2\66\u014f\3\2"+
		"\2\28\u0151\3\2\2\2:\u015e\3\2\2\2<\u0166\3\2\2\2>\u016a\3\2\2\2@\u016c"+
		"\3\2\2\2B\u016e\3\2\2\2D\u0172\3\2\2\2F\u0182\3\2\2\2H\u018c\3\2\2\2J"+
		"\u018e\3\2\2\2L\u019f\3\2\2\2N\u01b7\3\2\2\2P\u01bc\3\2\2\2R\u01be\3\2"+
		"\2\2T\u01cb\3\2\2\2V\u01d9\3\2\2\2X\u01fa\3\2\2\2Z\u0200\3\2\2\2\\\u0202"+
		"\3\2\2\2^\u020f\3\2\2\2`\u0220\3\2\2\2b\u0231\3\2\2\2d\u0257\3\2\2\2f"+
		"g\7L\2\2g\3\3\2\2\2hi\t\2\2\2i\5\3\2\2\2jk\7N\2\2k\7\3\2\2\2ls\5\4\3\2"+
		"ms\5\6\4\2ns\7S\2\2os\7R\2\2ps\7T\2\2qs\7U\2\2rl\3\2\2\2rm\3\2\2\2rn\3"+
		"\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\5\2\2\2uv\5\30\r\2v"+
		"\13\3\2\2\2wx\b\7\1\2x\u0080\5\16\b\2y\u0080\5\n\6\2z\u0080\5B\"\2{|\t"+
		"\3\2\2|\u0080\5\f\7\17}~\t\4\2\2~\u0080\5\f\7\16\177w\3\2\2\2\177y\3\2"+
		"\2\2\177z\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\u00b9\3\2\2\2\u0081"+
		"\u0082\f\r\2\2\u0082\u0083\t\5\2\2\u0083\u00b8\5\f\7\16\u0084\u0085\f"+
		"\f\2\2\u0085\u0086\t\6\2\2\u0086\u00b8\5\f\7\r\u0087\u008f\f\13\2\2\u0088"+
		"\u0089\7\17\2\2\u0089\u0090\7\17\2\2\u008a\u008b\7\20\2\2\u008b\u008c"+
		"\7\20\2\2\u008c\u0090\7\20\2\2\u008d\u008e\7\20\2\2\u008e\u0090\7\20\2"+
		"\2\u008f\u0088\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u00b8\5\f\7\f\u0092\u0093\f\n\2\2\u0093\u0094\t\7\2\2\u0094"+
		"\u00b8\5\f\7\13\u0095\u0096\f\t\2\2\u0096\u0097\t\b\2\2\u0097\u00b8\5"+
		"\f\7\n\u0098\u0099\f\b\2\2\u0099\u009a\7\25\2\2\u009a\u00b8\5\f\7\t\u009b"+
		"\u009c\f\7\2\2\u009c\u009d\7\26\2\2\u009d\u00b8\5\f\7\b\u009e\u009f\f"+
		"\6\2\2\u009f\u00a0\7\27\2\2\u00a0\u00b8\5\f\7\7\u00a1\u00a2\f\5\2\2\u00a2"+
		"\u00a3\7\30\2\2\u00a3\u00b8\5\f\7\6\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7"+
		"\31\2\2\u00a6\u00b8\5\f\7\5\u00a7\u00a8\f\3\2\2\u00a8\u00a9\t\t\2\2\u00a9"+
		"\u00b8\5\f\7\3\u00aa\u00ab\f\24\2\2\u00ab\u00ae\7\3\2\2\u00ac\u00af\5"+
		"\2\2\2\u00ad\u00af\5\n\6\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b8\3\2\2\2\u00b0\u00b1\f\23\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5"+
		"\f\7\2\u00b3\u00b4\7\5\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b6\f\20\2\2\u00b6"+
		"\u00b8\t\n\2\2\u00b7\u0081\3\2\2\2\u00b7\u0084\3\2\2\2\u00b7\u0087\3\2"+
		"\2\2\u00b7\u0092\3\2\2\2\u00b7\u0095\3\2\2\2\u00b7\u0098\3\2\2\2\u00b7"+
		"\u009b\3\2\2\2\u00b7\u009e\3\2\2\2\u00b7\u00a1\3\2\2\2\u00b7\u00a4\3\2"+
		"\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\r\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c3\5\b\5\2\u00bd\u00c3"+
		"\5\2\2\2\u00be\u00bf\7&\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\7\'\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2"+
		"\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7(\2\2\u00c6\21"+
		"\3\2\2\2\u00c7\u00d2\7&\2\2\u00c8\u00cd\5\24\13\2\u00c9\u00ca\7)\2\2\u00ca"+
		"\u00cc\5\24\13\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6"+
		"\23\3\2\2\2\u00d7\u00d8\5\2\2\2\u00d8\u00d9\7\63\2\2\u00d9\u00db\5\36"+
		"\20\2\u00da\u00dc\5\26\f\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\25\3\2\2\2\u00dd\u00de\7\32\2\2\u00de\u00df\5\f\7\2\u00df\27\3\2\2\2"+
		"\u00e0\u00eb\7&\2\2\u00e1\u00e6\5\f\7\2\u00e2\u00e3\7)\2\2\u00e3\u00e5"+
		"\5\f\7\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef\31\3\2\2"+
		"\2\u00f0\u00f1\t\13\2\2\u00f1\33\3\2\2\2\u00f2\u00f4\5\32\16\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\7<\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00fb\5 \21"+
		"\2\u00f9\u00fb\5\"\22\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\37\3\2\2\2\u00fc\u00fd\t\f\2\2\u00fd!\3\2\2\2\u00fe\u0103\5$\23\2\u00ff"+
		"\u0100\7\3\2\2\u0100\u0102\5$\23\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104#\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\5\2\2\2\u0107%\3\2\2\2\u0108\u010a\5*\26\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u0111\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\5(\25\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\2\2\3\u0115"+
		"\'\3\2\2\2\u0116\u0117\58\35\2\u0117\u0118\7(\2\2\u0118\u0120\3\2\2\2"+
		"\u0119\u011a\5:\36\2\u011a\u011b\7(\2\2\u011b\u0120\3\2\2\2\u011c\u0120"+
		"\5D#\2\u011d\u0120\5J&\2\u011e\u0120\5.\30\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120)\3\2\2\2\u0121\u0122\78\2\2\u0122\u0126\7*\2\2\u0123\u0125"+
		"\5,\27\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7+"+
		"\2\2\u012a+\3\2\2\2\u012b\u012c\5\64\33\2\u012c\u012d\7(\2\2\u012d-\3"+
		"\2\2\2\u012e\u012f\7/\2\2\u012f\u0130\5\60\31\2\u0130\u0134\7*\2\2\u0131"+
		"\u0133\5\62\32\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7+\2\2\u0138/\3\2\2\2\u0139\u013a\7L\2\2\u013a\61\3\2\2\2\u013b"+
		"\u013c\58\35\2\u013c\u013d\7(\2\2\u013d\u0145\3\2\2\2\u013e\u013f\5:\36"+
		"\2\u013f\u0140\7(\2\2\u0140\u0145\3\2\2\2\u0141\u0145\5D#\2\u0142\u0145"+
		"\5J&\2\u0143\u0145\5.\30\2\u0144\u013b\3\2\2\2\u0144\u013e\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\63\3\2\2"+
		"\2\u0146\u0147\7\60\2\2\u0147\u014c\5\66\34\2\u0148\u0149\7)\2\2\u0149"+
		"\u014b\5\66\34\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\65\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\7S\2\2\u0150\67\3\2\2\2\u0151\u0152\5\34\17\2\u0152\u0153\7>\2"+
		"\2\u0153\u0158\5> \2\u0154\u0155\7)\2\2\u0155\u0157\5> \2\u0156\u0154"+
		"\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\63\2\2\u015c\u015d\5"+
		"\36\20\2\u015d9\3\2\2\2\u015e\u015f\5\34\17\2\u015f\u0160\5@!\2\u0160"+
		"\u0161\5> \2\u0161\u0162\7\63\2\2\u0162\u0163\5\36\20\2\u0163\u0164\7"+
		"\32\2\2\u0164\u0165\5\f\7\2\u0165;\3\2\2\2\u0166\u0167\5\f\7\2\u0167\u0168"+
		"\t\t\2\2\u0168\u0169\5\f\7\2\u0169=\3\2\2\2\u016a\u016b\5\2\2\2\u016b"+
		"?\3\2\2\2\u016c\u016d\t\r\2\2\u016dA\3\2\2\2\u016e\u016f\7\65\2\2\u016f"+
		"\u0170\5\2\2\2\u0170\u0171\5\30\r\2\u0171C\3\2\2\2\u0172\u0173\5\34\17"+
		"\2\u0173\u0174\7\61\2\2\u0174\u0177\5F$\2\u0175\u0176\7\66\2\2\u0176\u0178"+
		"\5\36\20\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2"+
		"\u0179\u017d\7*\2\2\u017a\u017c\5H%\2\u017b\u017a\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0181\7+\2\2\u0181E\3\2\2\2\u0182\u0183\5\2\2\2\u0183"+
		"G\3\2\2\2\u0184\u018d\5D#\2\u0185\u018d\5J&\2\u0186\u0187\58\35\2\u0187"+
		"\u0188\7(\2\2\u0188\u018d\3\2\2\2\u0189\u018a\5:\36\2\u018a\u018b\7(\2"+
		"\2\u018b\u018d\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186"+
		"\3\2\2\2\u018c\u0189\3\2\2\2\u018dI\3\2\2\2\u018e\u018f\5\34\17\2\u018f"+
		"\u0190\7\62\2\2\u0190\u0191\5L\'\2\u0191\u0194\5\22\n\2\u0192\u0193\7"+
		"\63\2\2\u0193\u0195\5\36\20\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u019a\7*\2\2\u0197\u0199\5N(\2\u0198\u0197"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7+\2\2\u019eK\3\2\2\2\u019f"+
		"\u01a0\5\2\2\2\u01a0M\3\2\2\2\u01a1\u01a2\58\35\2\u01a2\u01a3\7(\2\2\u01a3"+
		"\u01b8\3\2\2\2\u01a4\u01a5\5:\36\2\u01a5\u01a6\7(\2\2\u01a6\u01b8\3\2"+
		"\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9\7(\2\2\u01a9\u01b8\3\2\2\2\u01aa"+
		"\u01ab\5B\"\2\u01ab\u01ac\7(\2\2\u01ac\u01b8\3\2\2\2\u01ad\u01ae\5\n\6"+
		"\2\u01ae\u01af\7(\2\2\u01af\u01b8\3\2\2\2\u01b0\u01b8\5P)\2\u01b1\u01b8"+
		"\5Z.\2\u01b2\u01b8\5\20\t\2\u01b3\u01b4\7*\2\2\u01b4\u01b5\5N(\2\u01b5"+
		"\u01b6\7+\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01a1\3\2\2\2\u01b7\u01a4\3\2"+
		"\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01aa\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b7"+
		"\u01b0\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2"+
		"\2\2\u01b8O\3\2\2\2\u01b9\u01bd\5R*\2\u01ba\u01bd\5T+\2\u01bb\u01bd\5"+
		"V,\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"Q\3\2\2\2\u01be\u01bf\7E\2\2\u01bf\u01c0\7&\2\2\u01c0\u01c1\5\f\7\2\u01c1"+
		"\u01c2\7\'\2\2\u01c2\u01c6\7*\2\2\u01c3\u01c5\5X-\2\u01c4\u01c3\3\2\2"+
		"\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7+\2\2\u01caS\3\2\2\2\u01cb\u01cc"+
		"\7F\2\2\u01cc\u01cd\7E\2\2\u01cd\u01ce\7&\2\2\u01ce\u01cf\5\f\7\2\u01cf"+
		"\u01d0\7\'\2\2\u01d0\u01d4\7*\2\2\u01d1\u01d3\5X-\2\u01d2\u01d1\3\2\2"+
		"\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7+\2\2\u01d8U\3\2\2\2\u01d9\u01da"+
		"\7F\2\2\u01da\u01de\7*\2\2\u01db\u01dd\5X-\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7+\2\2\u01e2W\3\2\2\2\u01e3\u01e4"+
		"\5\n\6\2\u01e4\u01e5\7(\2\2\u01e5\u01fb\3\2\2\2\u01e6\u01e7\58\35\2\u01e7"+
		"\u01e8\7(\2\2\u01e8\u01fb\3\2\2\2\u01e9\u01ea\5:\36\2\u01ea\u01eb\7(\2"+
		"\2\u01eb\u01fb\3\2\2\2\u01ec\u01ed\5<\37\2\u01ed\u01ee\7(\2\2\u01ee\u01fb"+
		"\3\2\2\2\u01ef\u01fb\5Z.\2\u01f0\u01fb\5P)\2\u01f1\u01fb\5\20\t\2\u01f2"+
		"\u01f6\7*\2\2\u01f3\u01f5\5X-\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2"+
		"\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f9\u01fb\7+\2\2\u01fa\u01e3\3\2\2\2\u01fa\u01e6\3\2\2\2\u01fa"+
		"\u01e9\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa\u01f0\3\2"+
		"\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f2\3\2\2\2\u01fbY\3\2\2\2\u01fc\u0201"+
		"\5\\/\2\u01fd\u0201\5^\60\2\u01fe\u0201\5`\61\2\u01ff\u0201\5b\62\2\u0200"+
		"\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2"+
		"\2\2\u0201[\3\2\2\2\u0202\u0203\7G\2\2\u0203\u0204\7&\2\2\u0204\u0205"+
		"\5\f\7\2\u0205\u0206\7\'\2\2\u0206\u020a\7*\2\2\u0207\u0209\5d\63\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7+\2\2\u020e"+
		"]\3\2\2\2\u020f\u0210\7H\2\2\u0210\u0211\7&\2\2\u0211\u0212\5:\36\2\u0212"+
		"\u0213\7(\2\2\u0213\u0214\5\f\7\2\u0214\u0215\7(\2\2\u0215\u0216\5\f\7"+
		"\2\u0216\u0217\7\'\2\2\u0217\u021b\7*\2\2\u0218\u021a\5d\63\2\u0219\u0218"+
		"\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7+\2\2\u021f_\3\2\2\2\u0220"+
		"\u0221\7H\2\2\u0221\u0222\7&\2\2\u0222\u0223\5\2\2\2\u0223\u0224\7\63"+
		"\2\2\u0224\u0225\5\36\20\2\u0225\u0226\7J\2\2\u0226\u0227\5\2\2\2\u0227"+
		"\u0228\7\'\2\2\u0228\u022c\7*\2\2\u0229\u022b\5d\63\2\u022a\u0229\3\2"+
		"\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7+\2\2\u0230a\3\2\2\2\u0231"+
		"\u0232\7I\2\2\u0232\u0236\7*\2\2\u0233\u0235\5d\63\2\u0234\u0233\3\2\2"+
		"\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7+\2\2\u023a\u023b\7G\2\2\u023b"+
		"\u023c\7&\2\2\u023c\u023d\5\f\7\2\u023d\u023e\7\'\2\2\u023e\u023f\7(\2"+
		"\2\u023fc\3\2\2\2\u0240\u0241\5\n\6\2\u0241\u0242\7(\2\2\u0242\u0258\3"+
		"\2\2\2\u0243\u0244\5<\37\2\u0244\u0245\7(\2\2\u0245\u0258\3\2\2\2\u0246"+
		"\u0247\58\35\2\u0247\u0248\7(\2\2\u0248\u0258\3\2\2\2\u0249\u024a\5:\36"+
		"\2\u024a\u024b\7(\2\2\u024b\u0258\3\2\2\2\u024c\u0258\5P)\2\u024d\u0258"+
		"\5Z.\2\u024e\u0258\5\20\t\2\u024f\u0253\7*\2\2\u0250\u0252\5d\63\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\7+\2\2\u0257"+
		"\u0240\3\2\2\2\u0257\u0243\3\2\2\2\u0257\u0246\3\2\2\2\u0257\u0249\3\2"+
		"\2\2\u0257\u024c\3\2\2\2\u0257\u024d\3\2\2\2\u0257\u024e\3\2\2\2\u0257"+
		"\u024f\3\2\2\2\u0258e\3\2\2\2-r\177\u008f\u00ae\u00b7\u00b9\u00c2\u00cd"+
		"\u00d2\u00db\u00e6\u00eb\u00f3\u00f6\u00fa\u0103\u010b\u0111\u011f\u0126"+
		"\u0134\u0144\u014c\u0158\u0177\u017d\u018c\u0194\u019a\u01b7\u01bc\u01c6"+
		"\u01d4\u01de\u01f6\u01fa\u0200\u020a\u021b\u022c\u0236\u0253\u0257";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}