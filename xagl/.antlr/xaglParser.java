// Generated from /home/tomas/Desktop/ProjetoC/agl-gg08/xagl/xagl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xaglParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Number=37, String=38, 
		ID=39, Boolean=40, COMMENT=41, MLCOMMENT=42, WS=43, NL=44;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_functions = 2, RULE_assignment = 3, 
		RULE_for_loop = 4, RULE_while_loop = 5, RULE_if_stat = 6, RULE_expr = 7, 
		RULE_time = 8, RULE_point = 9, RULE_vector = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "functions", "assignment", "for_loop", "while_loop", 
			"if_stat", "expr", "time", "point", "vector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'refresh'", "'after'", "'move'", "'by'", "'to'", "'.'", 
			"'='", "'for'", "'in'", "'..'", "'do'", "'{'", "'}'", "'while'", "'('", 
			"')'", "'if'", "'else'", "'+'", "'-'", "'%'", "'*'", "'/'", "'&&'", "'||'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'ms'", "'s'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Number", "String", "ID", "Boolean", "COMMENT", "MLCOMMENT", "WS", 
			"NL"
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
	public String getGrammarFileName() { return "xagl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xaglParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(xaglParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				functions();
				setState(31);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assignment();
				setState(34);
				match(T__0);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				for_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				while_loop();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				if_stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	 
		public FunctionsContext() { }
		public void copyFrom(FunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMoveVectorContext extends FunctionsContext {
		public List<TerminalNode> ID() { return getTokens(xaglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xaglParser.ID, i);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public FunctionMoveVectorContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionRefreshTimeContext extends FunctionsContext {
		public TerminalNode ID() { return getToken(xaglParser.ID, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public FunctionRefreshTimeContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMovePointContext extends FunctionsContext {
		public List<TerminalNode> ID() { return getTokens(xaglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xaglParser.ID, i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public FunctionMovePointContext(FunctionsContext ctx) { copyFrom(ctx); }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functions);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FunctionRefreshTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__1);
				setState(42);
				match(ID);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(43);
					match(T__2);
					setState(44);
					time();
					}
				}

				}
				break;
			case 2:
				_localctx = new FunctionMoveVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__3);
				setState(48);
				match(ID);
				setState(49);
				match(T__4);
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(50);
					vector();
					}
					break;
				case ID:
					{
					setState(51);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new FunctionMovePointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__3);
				setState(55);
				match(ID);
				setState(56);
				match(T__5);
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(57);
					point();
					}
					break;
				case ID:
					{
					setState(58);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssigmentObjectAttributeContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(xaglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xaglParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigmentObjectAttributeContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			_localctx = new AssigmentObjectAttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(T__6);
			setState(65);
			match(ID);
			setState(66);
			match(T__7);
			setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends For_loopContext {
		public ExprContext from_;
		public ExprContext to;
		public TerminalNode ID() { return getToken(xaglParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForRangeContext(For_loopContext ctx) { copyFrom(ctx); }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_loop);
		int _la;
		try {
			_localctx = new ForRangeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__8);
			setState(70);
			match(ID);
			setState(71);
			match(T__9);
			setState(72);
			((ForRangeContext)_localctx).from_ = expr(0);
			setState(73);
			match(T__10);
			setState(74);
			((ForRangeContext)_localctx).to = expr(0);
			setState(75);
			match(T__11);
			setState(76);
			match(T__12);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
				{
				{
				setState(77);
				stat();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends While_loopContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileLoopContext(While_loopContext ctx) { copyFrom(ctx); }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		int _la;
		try {
			_localctx = new WhileLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__14);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(86);
				match(T__15);
				}
				break;
			}
			setState(89);
			expr(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(90);
				match(T__16);
				}
			}

			setState(93);
			match(T__11);
			setState(94);
			match(T__12);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
				{
				{
				setState(95);
				stat();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends ParserRuleContext {
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	 
		public If_statContext() { }
		public void copyFrom(If_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatContext extends If_statContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfElseStatContext(If_statContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseIfContext extends If_statContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfElseIfContext(If_statContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends If_statContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(If_statContext ctx) { copyFrom(ctx); }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stat);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__17);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__15);
					}
					break;
				}
				setState(107);
				expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(108);
					match(T__16);
					}
				}

				setState(111);
				match(T__11);
				setState(112);
				match(T__12);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
					{
					{
					setState(113);
					stat();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new IfElseIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__17);
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(122);
					match(T__15);
					}
					break;
				}
				setState(125);
				expr(0);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(126);
					match(T__16);
					}
				}

				setState(129);
				match(T__11);
				setState(130);
				match(T__12);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
					{
					{
					setState(131);
					stat();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__13);
				setState(138);
				match(T__18);
				setState(139);
				if_stat();
				}
				break;
			case 3:
				_localctx = new IfElseStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(T__17);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(142);
					match(T__15);
					}
					break;
				}
				setState(145);
				expr(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(146);
					match(T__16);
					}
				}

				setState(149);
				match(T__11);
				setState(150);
				match(T__12);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
					{
					{
					setState(151);
					stat();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__13);
				setState(158);
				match(T__18);
				setState(159);
				match(T__12);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549756109332L) != 0)) {
					{
					{
					setState(160);
					stat();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanANDContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBooleanANDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPropertyAccessContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(xaglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xaglParser.ID, i);
		}
		public ExprPropertyAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryOperatorContext extends ExprContext {
		public Token sign;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryOperatorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(xaglParser.String, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPointContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExprPointContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolCompareContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBoolCompareContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode Boolean() { return getToken(xaglParser.Boolean, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanORContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBooleanORContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVectorContext extends ExprContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ExprVectorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprOperationContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOperationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode Number() { return getToken(xaglParser.Number, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(xaglParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				((ExprUnaryOperatorContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((ExprUnaryOperatorContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__15);
				setState(174);
				expr(0);
				setState(175);
				match(T__16);
				}
				break;
			case 3:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				point();
				}
				break;
			case 4:
				{
				_localctx = new ExprVectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				vector();
				}
				break;
			case 5:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(Number);
				}
				break;
			case 6:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(String);
				}
				break;
			case 7:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ExprPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(ID);
				setState(183);
				match(T__6);
				setState(184);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(Boolean);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOperationContext(new ExprContext(_parentctx, _parentState));
						((ExprOperationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(189);
						((ExprOperationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
							((ExprOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						((ExprOperationContext)_localctx).e2 = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprBooleanANDContext(new ExprContext(_parentctx, _parentState));
						((ExprBooleanANDContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(T__24);
						setState(193);
						((ExprBooleanANDContext)_localctx).e2 = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprBooleanORContext(new ExprContext(_parentctx, _parentState));
						((ExprBooleanORContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(T__25);
						setState(196);
						((ExprBooleanORContext)_localctx).e2 = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolCompareContext(new ExprContext(_parentctx, _parentState));
						((ExprBoolCompareContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						((ExprBoolCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
							((ExprBoolCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						((ExprBoolCompareContext)_localctx).e2 = expr(3);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public Token ts;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expr(0);
			setState(206);
			((TimeContext)_localctx).ts = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
				((TimeContext)_localctx).ts = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__15);
			setState(209);
			expr(0);
			setState(210);
			match(T__34);
			setState(211);
			expr(0);
			setState(212);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VectorContext extends ParserRuleContext {
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	 
		public VectorContext() { }
		public void copyFrom(VectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VectorPointContext extends VectorContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public VectorPointContext(VectorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VectorPolarContext extends VectorContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VectorPolarContext(VectorContext ctx) { copyFrom(ctx); }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vector);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new VectorPointContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				point();
				}
				break;
			case 2:
				_localctx = new VectorPolarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__15);
				setState(216);
				expr(0);
				setState(217);
				match(T__35);
				setState(218);
				expr(0);
				setState(219);
				match(T__16);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002"+
		"\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"O\b\u0004\n\u0004\f\u0004R\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005X\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\\\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n"+
		"\u0005\f\u0005d\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006s\b\u0006\n\u0006\f\u0006v\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0080\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0085\b\u0006\n\u0006\f\u0006\u0088\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0090\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0099\b\u0006\n"+
		"\u0006\f\u0006\u009c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00a2\b\u0006\n\u0006\f\u0006\u00a5\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a9\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00bb\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c9\b\u0007\n\u0007"+
		"\f\u0007\u00cc\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00de\b\n\u0001\n\u0000\u0001\u000e\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0014"+
		"\u0015\u0001\u0000\u0014\u0018\u0001\u0000\u001b \u0001\u0000!\"\u00fb"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004"+
		"=\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bE\u0001\u0000"+
		"\u0000\u0000\nU\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000"+
		"\u000e\u00ba\u0001\u0000\u0000\u0000\u0010\u00cd\u0001\u0000\u0000\u0000"+
		"\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00dd\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001"+
		"\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f \u0005\u0001\u0000\u0000 (\u0001\u0000\u0000\u0000!\"\u0003\u0006"+
		"\u0003\u0000\"#\u0005\u0001\u0000\u0000#(\u0001\u0000\u0000\u0000$(\u0003"+
		"\b\u0004\u0000%(\u0003\n\u0005\u0000&(\u0003\f\u0006\u0000\'\u001e\u0001"+
		"\u0000\u0000\u0000\'!\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0002\u0000\u0000*-\u0005\'\u0000\u0000+,\u0005\u0003"+
		"\u0000\u0000,.\u0003\u0010\b\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.>\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000\u000001\u0005"+
		"\'\u0000\u000014\u0005\u0005\u0000\u000025\u0003\u0014\n\u000035\u0005"+
		"\'\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005>\u0001"+
		"\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0005\'\u0000\u00008;\u0005"+
		"\u0006\u0000\u00009<\u0003\u0012\t\u0000:<\u0005\'\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=)\u0001\u0000\u0000\u0000=/\u0001\u0000\u0000\u0000=6\u0001\u0000\u0000"+
		"\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005\'\u0000\u0000@A\u0005\u0007"+
		"\u0000\u0000AB\u0005\'\u0000\u0000BC\u0005\b\u0000\u0000CD\u0003\u000e"+
		"\u0007\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005"+
		"\'\u0000\u0000GH\u0005\n\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0005"+
		"\u000b\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0005\f\u0000\u0000LP\u0005"+
		"\r\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u000e\u0000"+
		"\u0000T\t\u0001\u0000\u0000\u0000UW\u0005\u000f\u0000\u0000VX\u0005\u0010"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0003\u000e\u0007\u0000Z\\\u0005\u0011\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0005\f\u0000\u0000^b\u0005\r\u0000\u0000_a\u0003\u0002\u0001"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005\u000e\u0000\u0000f\u000b\u0001\u0000\u0000"+
		"\u0000gi\u0005\u0012\u0000\u0000hj\u0005\u0010\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0003"+
		"\u000e\u0007\u0000ln\u0005\u0011\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\f\u0000\u0000"+
		"pt\u0005\r\u0000\u0000qs\u0003\u0002\u0001\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u000e"+
		"\u0000\u0000x\u00a9\u0001\u0000\u0000\u0000y{\u0005\u0012\u0000\u0000"+
		"z|\u0005\u0010\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0003\u000e\u0007\u0000~\u0080"+
		"\u0005\u0011\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\f\u0000\u0000\u0082\u0086\u0005\r\u0000\u0000\u0083\u0085\u0003\u0002"+
		"\u0001\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0005\u0013"+
		"\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c\u00a9\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0005\u0012\u0000\u0000\u008e\u0090\u0005\u0010\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0003\u000e\u0007"+
		"\u0000\u0092\u0094\u0005\u0011\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u009a\u0005\r\u0000\u0000"+
		"\u0097\u0099\u0003\u0002\u0001\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u000e\u0000\u0000"+
		"\u009e\u009f\u0005\u0013\u0000\u0000\u009f\u00a3\u0005\r\u0000\u0000\u00a0"+
		"\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8g\u0001\u0000\u0000\u0000\u00a8y\u0001"+
		"\u0000\u0000\u0000\u00a8\u008d\u0001\u0000\u0000\u0000\u00a9\r\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0006\u0007\uffff\uffff\u0000\u00ab\u00ac\u0007"+
		"\u0000\u0000\u0000\u00ac\u00bb\u0003\u000e\u0007\f\u00ad\u00ae\u0005\u0010"+
		"\u0000\u0000\u00ae\u00af\u0003\u000e\u0007\u0000\u00af\u00b0\u0005\u0011"+
		"\u0000\u0000\u00b0\u00bb\u0001\u0000\u0000\u0000\u00b1\u00bb\u0003\u0012"+
		"\t\u0000\u00b2\u00bb\u0003\u0014\n\u0000\u00b3\u00bb\u0005%\u0000\u0000"+
		"\u00b4\u00bb\u0005&\u0000\u0000\u00b5\u00bb\u0005\'\u0000\u0000\u00b6"+
		"\u00b7\u0005\'\u0000\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00bb"+
		"\u0005\'\u0000\u0000\u00b9\u00bb\u0005(\u0000\u0000\u00ba\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ba\u00ad\u0001\u0000\u0000\u0000\u00ba\u00b1\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ca\u0001\u0000\u0000\u0000\u00bc\u00bd\n\r"+
		"\u0000\u0000\u00bd\u00be\u0007\u0001\u0000\u0000\u00be\u00c9\u0003\u000e"+
		"\u0007\u000e\u00bf\u00c0\n\u0004\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000"+
		"\u0000\u00c1\u00c9\u0003\u000e\u0007\u0005\u00c2\u00c3\n\u0003\u0000\u0000"+
		"\u00c3\u00c4\u0005\u001a\u0000\u0000\u00c4\u00c9\u0003\u000e\u0007\u0004"+
		"\u00c5\u00c6\n\u0002\u0000\u0000\u00c6\u00c7\u0007\u0002\u0000\u0000\u00c7"+
		"\u00c9\u0003\u000e\u0007\u0003\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u000f\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0003\u000e\u0007\u0000\u00ce\u00cf\u0007\u0003\u0000\u0000\u00cf"+
		"\u0011\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1"+
		"\u00d2\u0003\u000e\u0007\u0000\u00d2\u00d3\u0005#\u0000\u0000\u00d3\u00d4"+
		"\u0003\u000e\u0007\u0000\u00d4\u00d5\u0005\u0011\u0000\u0000\u00d5\u0013"+
		"\u0001\u0000\u0000\u0000\u00d6\u00de\u0003\u0012\t\u0000\u00d7\u00d8\u0005"+
		"\u0010\u0000\u0000\u00d8\u00d9\u0003\u000e\u0007\u0000\u00d9\u00da\u0005"+
		"$\u0000\u0000\u00da\u00db\u0003\u000e\u0007\u0000\u00db\u00dc\u0005\u0011"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00de\u0015\u0001\u0000"+
		"\u0000\u0000\u0019\u0019\'-4;=PW[bimt{\u007f\u0086\u008f\u0093\u009a\u00a3"+
		"\u00a8\u00ba\u00c8\u00ca\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}