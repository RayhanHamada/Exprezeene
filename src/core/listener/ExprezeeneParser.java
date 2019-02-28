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
		T__38=39, T__39=40, T__40=41, T__41=42, TO_SKIP=43, DEFINE=44, ALIAS=45, 
		NAMESPACE=46, IMPORT=47, CLASS=48, FUNCTION=49, AS=50, THIS=51, NEW=52, 
		INHERIT=53, FROM=54, PREPROCESSOR=55, PUBLIC=56, PRIVATE=57, PROTECTED=58, 
		STATIC=59, CONSTANT=60, VAR=61, INT=62, FLOAT=63, DOUBLE=64, LONG=65, 
		BOOLEAN=66, CHAR=67, IF=68, ELSE=69, WHILE=70, FOR=71, DO=72, IN=73, GO=74, 
		IDENTIFIER=75, DECIMAL_LITERAL=76, FLOAT_LITERAL=77, HEX_LITERAL=78, OCTAL_LITERAL=79, 
		BINARY_LITERAL=80, CHAR_LITERAL=81, STRING_LITERAL=82, BOOLEAN_LITERAL=83, 
		NULL_LITERAL=84;
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
		RULE_elseStatement = 42, RULE_loopStatement = 43, RULE_whileloop = 44, 
		RULE_forloop = 45, RULE_foreachloop = 46, RULE_doWhileloop = 47;
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
			"condStatement", "ifStatement", "elseIfStatement", "elseStatement", "loopStatement", 
			"whileloop", "forloop", "foreachloop", "doWhileloop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'.'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", "'~'", 
			"'!'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", 
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
			null, null, null, null, null, null, null, "TO_SKIP", "DEFINE", "ALIAS", 
			"NAMESPACE", "IMPORT", "CLASS", "FUNCTION", "AS", "THIS", "NEW", "INHERIT", 
			"FROM", "PREPROCESSOR", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "CONSTANT", 
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
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DECIMAL_LITERAL - 76)) | (1L << (HEX_LITERAL - 76)) | (1L << (OCTAL_LITERAL - 76)) | (1L << (BINARY_LITERAL - 76)))) != 0)) ) {
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(114);
				primary();
				}
				break;
			case 2:
				{
				setState(115);
				methodCall();
				}
				break;
			case 3:
				{
				setState(116);
				objInstStatement();
				}
				break;
			case 4:
				{
				setState(117);
				((ExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					((ExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
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
				setState(119);
				((ExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((ExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
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
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(124);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(127);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(137);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(130);
							match(T__13);
							setState(131);
							match(T__13);
							}
							break;
						case 2:
							{
							setState(132);
							match(T__14);
							setState(133);
							match(T__14);
							setState(134);
							match(T__14);
							}
							break;
						case 3:
							{
							setState(135);
							match(T__14);
							setState(136);
							match(T__14);
							}
							break;
						}
						setState(139);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(141);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(144);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(147);
						((ExprContext)_localctx).operator = match(T__19);
						setState(148);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(150);
						((ExprContext)_localctx).operator = match(T__20);
						setState(151);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						((ExprContext)_localctx).operator = match(T__21);
						setState(154);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						((ExprContext)_localctx).operator = match(T__22);
						setState(157);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						((ExprContext)_localctx).operator = match(T__23);
						setState(160);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(162);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(165);
						((ExprContext)_localctx).operator = match(T__0);
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
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(171);
						((ExprContext)_localctx).operator = match(T__1);
						setState(174);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(172);
							identifier();
							}
							break;
						case 2:
							{
							setState(173);
							methodCall();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(177);
						match(T__2);
						setState(178);
						expr(0);
						setState(179);
						match(T__3);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(182);
						((ExprContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
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
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(194);
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
				setState(188);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				identifier();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(T__36);
				setState(191);
				expr(0);
				setState(192);
				match(T__37);
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
			setState(196);
			expr(0);
			setState(197);
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
			setState(199);
			match(T__36);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(200);
				parameterVar();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(201);
					match(T__39);
					setState(202);
					parameterVar();
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
			setState(215);
			identifier();
			setState(216);
			match(AS);
			setState(217);
			dataType();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(218);
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
			setState(221);
			match(T__24);
			setState(222);
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
			setState(224);
			match(T__36);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (IDENTIFIER - 75)) | (1L << (DECIMAL_LITERAL - 75)) | (1L << (FLOAT_LITERAL - 75)) | (1L << (HEX_LITERAL - 75)) | (1L << (OCTAL_LITERAL - 75)) | (1L << (BINARY_LITERAL - 75)) | (1L << (CHAR_LITERAL - 75)) | (1L << (STRING_LITERAL - 75)) | (1L << (BOOLEAN_LITERAL - 75)) | (1L << (NULL_LITERAL - 75)))) != 0)) {
				{
				{
				setState(225);
				expr(0);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(226);
					match(T__39);
					setState(227);
					expr(0);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
			setState(240);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(242);
				accmod();
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(245);
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
			setState(250);
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
				setState(248);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
			setState(252);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INT - 62)) | (1L << (FLOAT - 62)) | (1L << (DOUBLE - 62)) | (1L << (LONG - 62)) | (1L << (BOOLEAN - 62)) | (1L << (CHAR - 62)))) != 0)) ) {
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
			setState(254);
			userDefinedType();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(255);
				match(T__1);
				setState(256);
				userDefinedType();
				}
				}
				setState(261);
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
			setState(262);
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
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPROCESSOR) {
				{
				{
				setState(264);
				preprocessorStatement();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(270);
				globalScopeStatement();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				varDeclStatement();
				setState(279);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				varInitStatement();
				setState(282);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
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
			setState(289);
			match(PREPROCESSOR);
			setState(290);
			match(T__40);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(291);
				inPreprocessorStatement();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__41);
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
			setState(299);
			importStatement();
			setState(300);
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
		enterRule(_localctx, 44, RULE_nameSpaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(NAMESPACE);
			setState(303);
			nameSpaceIdentifier();
			setState(304);
			match(T__40);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAMESPACE) | (1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(305);
				nameSpaceStatement();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__41);
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
			setState(313);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				varDeclStatement();
				setState(316);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				varInitStatement();
				setState(319);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				classDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				methodDefStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
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
			setState(326);
			match(IMPORT);
			{
			setState(327);
			scriptPath();
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(328);
				match(T__39);
				{
				setState(329);
				scriptPath();
				}
				}
				}
				setState(334);
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
			setState(335);
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
			setState(337);
			modifier();
			setState(338);
			match(VAR);
			setState(339);
			varIdentifier();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(340);
				match(T__39);
				setState(341);
				varIdentifier();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(AS);
			setState(348);
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
			setState(350);
			modifier();
			setState(351);
			varConst();
			setState(352);
			varIdentifier();
			setState(353);
			match(AS);
			setState(354);
			dataType();
			setState(355);
			match(T__24);
			{
			setState(356);
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
			setState(358);
			expr(0);
			setState(359);
			((VarAssignStatementContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
				((VarAssignStatementContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
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
			setState(362);
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
			setState(364);
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
			setState(366);
			match(NEW);
			setState(367);
			identifier();
			setState(368);
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
			setState(370);
			modifier();
			setState(371);
			match(CLASS);
			setState(372);
			classIdentifier();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(373);
				match(INHERIT);
				setState(374);
				dataType();
				}
			}

			setState(377);
			match(T__40);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNCTION) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0)) {
				{
				{
				setState(378);
				inClassStatement();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(T__41);
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
			setState(386);
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
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				classDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				methodDefStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				varDeclStatement();
				setState(391);
				match(T__38);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				varInitStatement();
				setState(394);
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
		enterRule(_localctx, 72, RULE_methodDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			modifier();
			setState(399);
			match(FUNCTION);
			setState(400);
			funcIdentifier();
			setState(401);
			parameter();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(402);
				match(AS);
				setState(403);
				dataType();
				}
			}

			setState(406);
			match(T__40);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(407);
				inMethodStatement();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(T__41);
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
			setState(415);
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
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				varDeclStatement();
				setState(418);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				varInitStatement();
				setState(421);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				condStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				expressionStatement();
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
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				elseIfStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(433);
			match(IF);
			setState(434);
			match(T__36);
			setState(435);
			expr(0);
			setState(436);
			match(T__37);
			setState(437);
			match(T__40);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(438);
				inMethodStatement();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(T__41);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(446);
			match(ELSE);
			setState(447);
			match(IF);
			setState(448);
			match(T__36);
			setState(449);
			expr(0);
			setState(450);
			match(T__37);
			setState(451);
			match(T__40);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(452);
				inMethodStatement();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			match(T__41);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(460);
			match(ELSE);
			setState(461);
			match(T__40);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(462);
				inMethodStatement();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(T__41);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				whileloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				foreachloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(476);
			match(WHILE);
			setState(477);
			match(T__36);
			setState(478);
			expr(0);
			setState(479);
			match(T__37);
			setState(480);
			match(T__40);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(481);
				inMethodStatement();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(T__41);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(489);
			match(FOR);
			setState(490);
			match(T__36);
			setState(491);
			varInitStatement();
			setState(492);
			match(T__38);
			setState(493);
			expr(0);
			setState(494);
			match(T__38);
			setState(495);
			expr(0);
			setState(496);
			match(T__37);
			setState(497);
			match(T__40);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(498);
				inMethodStatement();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(T__41);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(506);
			match(FOR);
			setState(507);
			match(T__36);
			setState(508);
			identifier();
			setState(509);
			match(AS);
			setState(510);
			dataType();
			setState(511);
			match(IN);
			setState(512);
			identifier();
			setState(513);
			match(T__37);
			setState(514);
			match(T__40);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(515);
				inMethodStatement();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(T__41);
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
		public List<InMethodStatementContext> inMethodStatement() {
			return getRuleContexts(InMethodStatementContext.class);
		}
		public InMethodStatementContext inMethodStatement(int i) {
			return getRuleContext(InMethodStatementContext.class,i);
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
			setState(523);
			match(DO);
			setState(524);
			match(T__40);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__36) | (1L << NEW) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CONSTANT) | (1L << VAR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (ELSE - 68)) | (1L << (WHILE - 68)) | (1L << (FOR - 68)) | (1L << (DO - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOLEAN_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)))) != 0)) {
				{
				{
				setState(525);
				inMethodStatement();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(T__41);
			setState(532);
			match(WHILE);
			setState(533);
			match(T__36);
			setState(534);
			expr(0);
			setState(535);
			match(T__37);
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
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u021d\4\2\t\2\4"+
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
		"\n\7\3\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ba"+
		"\n\7\f\7\16\7\u00bd\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c5\n\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\7\n\u00d3\n\n\f"+
		"\n\16\n\u00d6\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00de\n\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\7\r\u00ec\n\r\f"+
		"\r\16\r\u00ef\13\r\3\r\3\r\3\16\3\16\3\17\5\17\u00f6\n\17\3\17\5\17\u00f9"+
		"\n\17\3\20\3\20\5\20\u00fd\n\20\3\21\3\21\3\22\3\22\3\22\7\22\u0104\n"+
		"\22\f\22\16\22\u0107\13\22\3\23\3\23\3\24\7\24\u010c\n\24\f\24\16\24\u010f"+
		"\13\24\3\24\7\24\u0112\n\24\f\24\16\24\u0115\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0122\n\25\3\26\3\26\3\26\7\26"+
		"\u0127\n\26\f\26\16\26\u012a\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u0135\n\30\f\30\16\30\u0138\13\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0147\n\32\3\33\3\33"+
		"\3\33\3\33\7\33\u014d\n\33\f\33\16\33\u0150\13\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0159\n\35\f\35\16\35\u015c\13\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u017a\n#\3#\3#\7#\u017e\n#\f#\16"+
		"#\u0181\13#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u018f\n%\3&\3&\3&\3"+
		"&\3&\3&\5&\u0197\n&\3&\3&\7&\u019b\n&\f&\16&\u019e\13&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01ad\n(\3)\3)\3)\5)\u01b2\n)\3*\3*\3*\3"+
		"*\3*\3*\7*\u01ba\n*\f*\16*\u01bd\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u01c8"+
		"\n+\f+\16+\u01cb\13+\3+\3+\3,\3,\3,\7,\u01d2\n,\f,\16,\u01d5\13,\3,\3"+
		",\3-\3-\3-\3-\5-\u01dd\n-\3.\3.\3.\3.\3.\3.\7.\u01e5\n.\f.\16.\u01e8\13"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01f6\n/\f/\16/\u01f9\13/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0207\n\60"+
		"\f\60\16\60\u020a\13\60\3\60\3\60\3\61\3\61\3\61\7\61\u0211\n\61\f\61"+
		"\16\61\u0214\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\2\3\f\62\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`\2\16\4\2NNPR\3\2\7\n\3\2\13\f\3\2\r\17\3\2\t\n\3\2\20\23\3"+
		"\2\24\25\3\2\33&\3\2\7\b\3\2:<\3\2@E\3\2>?\2\u0238\2b\3\2\2\2\4d\3\2\2"+
		"\2\6f\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\f{\3\2\2\2\16\u00c4\3\2\2\2\20\u00c6"+
		"\3\2\2\2\22\u00c9\3\2\2\2\24\u00d9\3\2\2\2\26\u00df\3\2\2\2\30\u00e2\3"+
		"\2\2\2\32\u00f2\3\2\2\2\34\u00f5\3\2\2\2\36\u00fc\3\2\2\2 \u00fe\3\2\2"+
		"\2\"\u0100\3\2\2\2$\u0108\3\2\2\2&\u010d\3\2\2\2(\u0121\3\2\2\2*\u0123"+
		"\3\2\2\2,\u012d\3\2\2\2.\u0130\3\2\2\2\60\u013b\3\2\2\2\62\u0146\3\2\2"+
		"\2\64\u0148\3\2\2\2\66\u0151\3\2\2\28\u0153\3\2\2\2:\u0160\3\2\2\2<\u0168"+
		"\3\2\2\2>\u016c\3\2\2\2@\u016e\3\2\2\2B\u0170\3\2\2\2D\u0174\3\2\2\2F"+
		"\u0184\3\2\2\2H\u018e\3\2\2\2J\u0190\3\2\2\2L\u01a1\3\2\2\2N\u01ac\3\2"+
		"\2\2P\u01b1\3\2\2\2R\u01b3\3\2\2\2T\u01c0\3\2\2\2V\u01ce\3\2\2\2X\u01dc"+
		"\3\2\2\2Z\u01de\3\2\2\2\\\u01eb\3\2\2\2^\u01fc\3\2\2\2`\u020d\3\2\2\2"+
		"bc\7M\2\2c\3\3\2\2\2de\t\2\2\2e\5\3\2\2\2fg\7O\2\2g\7\3\2\2\2ho\5\4\3"+
		"\2io\5\6\4\2jo\7T\2\2ko\7S\2\2lo\7U\2\2mo\7V\2\2nh\3\2\2\2ni\3\2\2\2n"+
		"j\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2pq\5\2\2\2qr\5\30\r"+
		"\2r\13\3\2\2\2st\b\7\1\2t|\5\16\b\2u|\5\n\6\2v|\5B\"\2wx\t\3\2\2x|\5\f"+
		"\7\17yz\t\4\2\2z|\5\f\7\16{s\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{y\3"+
		"\2\2\2|\u00bb\3\2\2\2}~\f\r\2\2~\177\t\5\2\2\177\u00ba\5\f\7\16\u0080"+
		"\u0081\f\f\2\2\u0081\u0082\t\6\2\2\u0082\u00ba\5\f\7\r\u0083\u008b\f\13"+
		"\2\2\u0084\u0085\7\20\2\2\u0085\u008c\7\20\2\2\u0086\u0087\7\21\2\2\u0087"+
		"\u0088\7\21\2\2\u0088\u008c\7\21\2\2\u0089\u008a\7\21\2\2\u008a\u008c"+
		"\7\21\2\2\u008b\u0084\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u00ba\5\f\7\f\u008e\u008f\f\n\2\2\u008f\u0090"+
		"\t\7\2\2\u0090\u00ba\5\f\7\13\u0091\u0092\f\t\2\2\u0092\u0093\t\b\2\2"+
		"\u0093\u00ba\5\f\7\n\u0094\u0095\f\b\2\2\u0095\u0096\7\26\2\2\u0096\u00ba"+
		"\5\f\7\t\u0097\u0098\f\7\2\2\u0098\u0099\7\27\2\2\u0099\u00ba\5\f\7\b"+
		"\u009a\u009b\f\6\2\2\u009b\u009c\7\30\2\2\u009c\u00ba\5\f\7\7\u009d\u009e"+
		"\f\5\2\2\u009e\u009f\7\31\2\2\u009f\u00ba\5\f\7\6\u00a0\u00a1\f\4\2\2"+
		"\u00a1\u00a2\7\32\2\2\u00a2\u00ba\5\f\7\5\u00a3\u00a4\f\3\2\2\u00a4\u00a5"+
		"\t\t\2\2\u00a5\u00ba\5\f\7\3\u00a6\u00a7\f\25\2\2\u00a7\u00aa\7\3\2\2"+
		"\u00a8\u00ab\5\2\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad\f\24\2\2\u00ad\u00b0\7\4\2\2"+
		"\u00ae\u00b1\5\2\2\2\u00af\u00b1\5\n\6\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\f\23\2\2\u00b3\u00b4\7\5\2\2"+
		"\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7\6\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b8"+
		"\f\20\2\2\u00b8\u00ba\t\n\2\2\u00b9}\3\2\2\2\u00b9\u0080\3\2\2\2\u00b9"+
		"\u0083\3\2\2\2\u00b9\u008e\3\2\2\2\u00b9\u0091\3\2\2\2\u00b9\u0094\3\2"+
		"\2\2\u00b9\u0097\3\2\2\2\u00b9\u009a\3\2\2\2\u00b9\u009d\3\2\2\2\u00b9"+
		"\u00a0\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9\u00ac\3\2"+
		"\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00c5\5\b\5\2\u00bf\u00c5\5\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2"+
		"\5\f\7\2\u00c2\u00c3\7(\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\5\f\7"+
		"\2\u00c7\u00c8\7)\2\2\u00c8\21\3\2\2\2\u00c9\u00d4\7\'\2\2\u00ca\u00cf"+
		"\5\24\13\2\u00cb\u00cc\7*\2\2\u00cc\u00ce\5\24\13\2\u00cd\u00cb\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7(\2\2\u00d8\23\3\2\2\2\u00d9\u00da\5\2\2\2\u00da\u00db"+
		"\7\64\2\2\u00db\u00dd\5\36\20\2\u00dc\u00de\5\26\f\2\u00dd\u00dc\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e1"+
		"\5\f\7\2\u00e1\27\3\2\2\2\u00e2\u00ed\7\'\2\2\u00e3\u00e8\5\f\7\2\u00e4"+
		"\u00e5\7*\2\2\u00e5\u00e7\5\f\7\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7(\2\2\u00f1\31\3\2\2\2\u00f2\u00f3\t\13\2\2\u00f3\33\3\2\2\2\u00f4"+
		"\u00f6\5\32\16\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3"+
		"\2\2\2\u00f7\u00f9\7=\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\35\3\2\2\2\u00fa\u00fd\5 \21\2\u00fb\u00fd\5\"\22\2\u00fc\u00fa\3\2\2"+
		"\2\u00fc\u00fb\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u00ff\t\f\2\2\u00ff!\3\2"+
		"\2\2\u0100\u0105\5$\23\2\u0101\u0102\7\4\2\2\u0102\u0104\5$\23\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106#\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5\2\2\2\u0109%\3\2"+
		"\2\2\u010a\u010c\5*\26\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0113\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0112\5(\25\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7\2\2\3\u0117\'\3\2\2\2\u0118\u0119\58\35\2\u0119\u011a"+
		"\7)\2\2\u011a\u0122\3\2\2\2\u011b\u011c\5:\36\2\u011c\u011d\7)\2\2\u011d"+
		"\u0122\3\2\2\2\u011e\u0122\5D#\2\u011f\u0122\5J&\2\u0120\u0122\5.\30\2"+
		"\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122)\3\2\2\2\u0123\u0124\79\2\2\u0124\u0128"+
		"\7+\2\2\u0125\u0127\5,\27\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7,\2\2\u012c+\3\2\2\2\u012d\u012e\5\64\33\2\u012e\u012f"+
		"\7)\2\2\u012f-\3\2\2\2\u0130\u0131\7\60\2\2\u0131\u0132\5\60\31\2\u0132"+
		"\u0136\7+\2\2\u0133\u0135\5\62\32\2\u0134\u0133\3\2\2\2\u0135\u0138\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7,\2\2\u013a/\3\2\2\2\u013b\u013c\7M\2\2\u013c"+
		"\61\3\2\2\2\u013d\u013e\58\35\2\u013e\u013f\7)\2\2\u013f\u0147\3\2\2\2"+
		"\u0140\u0141\5:\36\2\u0141\u0142\7)\2\2\u0142\u0147\3\2\2\2\u0143\u0147"+
		"\5D#\2\u0144\u0147\5J&\2\u0145\u0147\5.\30\2\u0146\u013d\3\2\2\2\u0146"+
		"\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2"+
		"\2\2\u0147\63\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014e\5\66\34\2\u014a"+
		"\u014b\7*\2\2\u014b\u014d\5\66\34\2\u014c\u014a\3\2\2\2\u014d\u0150\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\65\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\7T\2\2\u0152\67\3\2\2\2\u0153\u0154\5\34\17"+
		"\2\u0154\u0155\7?\2\2\u0155\u015a\5> \2\u0156\u0157\7*\2\2\u0157\u0159"+
		"\5> \2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\64"+
		"\2\2\u015e\u015f\5\36\20\2\u015f9\3\2\2\2\u0160\u0161\5\34\17\2\u0161"+
		"\u0162\5@!\2\u0162\u0163\5> \2\u0163\u0164\7\64\2\2\u0164\u0165\5\36\20"+
		"\2\u0165\u0166\7\33\2\2\u0166\u0167\5\f\7\2\u0167;\3\2\2\2\u0168\u0169"+
		"\5\f\7\2\u0169\u016a\t\t\2\2\u016a\u016b\5\f\7\2\u016b=\3\2\2\2\u016c"+
		"\u016d\5\2\2\2\u016d?\3\2\2\2\u016e\u016f\t\r\2\2\u016fA\3\2\2\2\u0170"+
		"\u0171\7\66\2\2\u0171\u0172\5\2\2\2\u0172\u0173\5\30\r\2\u0173C\3\2\2"+
		"\2\u0174\u0175\5\34\17\2\u0175\u0176\7\62\2\2\u0176\u0179\5F$\2\u0177"+
		"\u0178\7\67\2\2\u0178\u017a\5\36\20\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017f\7+\2\2\u017c\u017e\5H%\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7,\2\2\u0183"+
		"E\3\2\2\2\u0184\u0185\5\2\2\2\u0185G\3\2\2\2\u0186\u018f\5D#\2\u0187\u018f"+
		"\5J&\2\u0188\u0189\58\35\2\u0189\u018a\7)\2\2\u018a\u018f\3\2\2\2\u018b"+
		"\u018c\5:\36\2\u018c\u018d\7)\2\2\u018d\u018f\3\2\2\2\u018e\u0186\3\2"+
		"\2\2\u018e\u0187\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u018b\3\2\2\2\u018f"+
		"I\3\2\2\2\u0190\u0191\5\34\17\2\u0191\u0192\7\63\2\2\u0192\u0193\5L\'"+
		"\2\u0193\u0196\5\22\n\2\u0194\u0195\7\64\2\2\u0195\u0197\5\36\20\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019c\7+"+
		"\2\2\u0199\u019b\5N(\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a0\7,\2\2\u01a0K\3\2\2\2\u01a1\u01a2\5\2\2\2\u01a2M\3\2\2\2\u01a3"+
		"\u01a4\58\35\2\u01a4\u01a5\7)\2\2\u01a5\u01ad\3\2\2\2\u01a6\u01a7\5:\36"+
		"\2\u01a7\u01a8\7)\2\2\u01a8\u01ad\3\2\2\2\u01a9\u01ad\5P)\2\u01aa\u01ad"+
		"\5X-\2\u01ab\u01ad\5\20\t\2\u01ac\u01a3\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adO\3\2\2\2"+
		"\u01ae\u01b2\5R*\2\u01af\u01b2\5T+\2\u01b0\u01b2\5V,\2\u01b1\u01ae\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2Q\3\2\2\2\u01b3\u01b4"+
		"\7F\2\2\u01b4\u01b5\7\'\2\2\u01b5\u01b6\5\f\7\2\u01b6\u01b7\7(\2\2\u01b7"+
		"\u01bb\7+\2\2\u01b8\u01ba\5N(\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2"+
		"\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01be\u01bf\7,\2\2\u01bfS\3\2\2\2\u01c0\u01c1\7G\2\2\u01c1\u01c2"+
		"\7F\2\2\u01c2\u01c3\7\'\2\2\u01c3\u01c4\5\f\7\2\u01c4\u01c5\7(\2\2\u01c5"+
		"\u01c9\7+\2\2\u01c6\u01c8\5N(\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2"+
		"\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01cd\7,\2\2\u01cdU\3\2\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d3"+
		"\7+\2\2\u01d0\u01d2\5N(\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d7\7,\2\2\u01d7W\3\2\2\2\u01d8\u01dd\5Z.\2\u01d9\u01dd\5"+
		"\\/\2\u01da\u01dd\5^\60\2\u01db\u01dd\5`\61\2\u01dc\u01d8\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddY\3\2\2\2"+
		"\u01de\u01df\7H\2\2\u01df\u01e0\7\'\2\2\u01e0\u01e1\5\f\7\2\u01e1\u01e2"+
		"\7(\2\2\u01e2\u01e6\7+\2\2\u01e3\u01e5\5N(\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7,\2\2\u01ea[\3\2\2\2\u01eb\u01ec"+
		"\7I\2\2\u01ec\u01ed\7\'\2\2\u01ed\u01ee\5:\36\2\u01ee\u01ef\7)\2\2\u01ef"+
		"\u01f0\5\f\7\2\u01f0\u01f1\7)\2\2\u01f1\u01f2\5\f\7\2\u01f2\u01f3\7(\2"+
		"\2\u01f3\u01f7\7+\2\2\u01f4\u01f6\5N(\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7,\2\2\u01fb]\3\2\2\2\u01fc\u01fd\7I\2\2\u01fd"+
		"\u01fe\7\'\2\2\u01fe\u01ff\5\2\2\2\u01ff\u0200\7\64\2\2\u0200\u0201\5"+
		"\36\20\2\u0201\u0202\7K\2\2\u0202\u0203\5\2\2\2\u0203\u0204\7(\2\2\u0204"+
		"\u0208\7+\2\2\u0205\u0207\5N(\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020c\7,\2\2\u020c_\3\2\2\2\u020d\u020e\7J\2\2\u020e\u0212"+
		"\7+\2\2\u020f\u0211\5N(\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0216\7,\2\2\u0216\u0217\7H\2\2\u0217\u0218\7\'\2\2\u0218\u0219"+
		"\5\f\7\2\u0219\u021a\7(\2\2\u021a\u021b\7)\2\2\u021ba\3\2\2\2*n{\u008b"+
		"\u00aa\u00b0\u00b9\u00bb\u00c4\u00cf\u00d4\u00dd\u00e8\u00ed\u00f5\u00f8"+
		"\u00fc\u0105\u010d\u0113\u0121\u0128\u0136\u0146\u014e\u015a\u0179\u017f"+
		"\u018e\u0196\u019c\u01ac\u01b1\u01bb\u01c9\u01d3\u01dc\u01e6\u01f7\u0208"+
		"\u0212";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}