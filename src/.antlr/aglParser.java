// Generated from /home/tomas/Desktop/ProjetoC/agl-gg08/src/agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class aglParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, Boolean=76, Integer=77, Number=78, String=79, ID=80, 
		COMMENT=81, MLCOMMENT=82, WS=83, NL=84, ERROR=85;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_instantiation = 3, 
		RULE_functions = 4, RULE_expr = 5, RULE_events = 6, RULE_event = 7, RULE_graphicalObject = 8, 
		RULE_action = 9, RULE_actionIf = 10, RULE_modelInstantiation = 11, RULE_view = 12, 
		RULE_object = 13, RULE_if_stat = 14, RULE_while_loop = 15, RULE_for_loop = 16, 
		RULE_time = 17, RULE_type = 18, RULE_objectType = 19, RULE_point = 20, 
		RULE_vector = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assignment", "instantiation", "functions", "expr", 
			"events", "event", "graphicalObject", "action", "actionIf", "modelInstantiation", 
			"view", "object", "if_stat", "while_loop", "for_loop", "time", "type", 
			"objectType", "point", "vector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'.'", "'['", "']'", "':'", "'close'", 
			"'refresh'", "'after'", "'print'", "'move'", "'by'", "'to'", "'play'", 
			"'with'", "'-'", "'+'", "'^'", "'*'", "'/'", "'%'", "'('", "')'", "'!'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "','", 
			"'wait'", "'mouse click'", "'input'", "'load'", "'at'", "'do'", "'Enum'", 
			"'in'", "'action'", "'on'", "'if'", "'else'", "'::'", "'Model'", "'while'", 
			"'for'", "'..'", "'ms'", "'s'", "'Integer'", "'Number'", "'Point'", "'Vector'", 
			"'String'", "'Array'", "'Script'", "'Boolean'", "'View'", "'Dot'", "'Line'", 
			"'Rectangle'", "'Ellipse'", "'Text'", "'Arc'", "'ArcChord'", "'PieSlice'", 
			"'Polyline'", "'Spline'", "'Polygon'", "'Blob'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Boolean", "Integer", "Number", "String", "ID", 
			"COMMENT", "MLCOMMENT", "WS", "NL", "ERROR"
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
	public String getGrammarFileName() { return "agl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aglParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(aglParser.EOF, 0); }
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9219906376203815422L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 69631L) != 0)) {
				{
				{
				setState(44);
				stat();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ViewContext view() {
			return getRuleContext(ViewContext.class,0);
		}
		public GraphicalObjectContext graphicalObject() {
			return getRuleContext(GraphicalObjectContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public ModelInstantiationContext modelInstantiation() {
			return getRuleContext(ModelInstantiationContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9219906376203815422L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 69631L) != 0)) {
					{
					{
					setState(53);
					stat();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				instantiation();
				setState(61);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				functions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				view();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				graphicalObject();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				for_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				if_stat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				modelInstantiation();
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
	public static class AssignmentInstatiationContext extends AssignmentContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentInstatiationContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExistingContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentExistingContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentObjectAttributeContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentObjectAttributeContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentArrayContext extends AssignmentContext {
		public ExprContext index;
		public ExprContext value;
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentEventsContext extends AssignmentContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public AssignmentEventsContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignmentExistingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ID);
				setState(74);
				match(T__3);
				setState(75);
				expr(0);
				setState(76);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AssignmentInstatiationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				instantiation();
				setState(79);
				match(T__3);
				setState(80);
				expr(0);
				setState(81);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new AssignmentObjectAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__4);
				setState(85);
				match(ID);
				setState(86);
				match(T__3);
				setState(87);
				expr(0);
				setState(88);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new AssignmentEventsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				instantiation();
				setState(91);
				match(T__3);
				setState(92);
				event();
				setState(93);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new AssignmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				((AssignmentArrayContext)_localctx).index = expr(0);
				setState(98);
				match(T__6);
				setState(99);
				match(T__3);
				setState(100);
				((AssignmentArrayContext)_localctx).value = expr(0);
				setState(101);
				match(T__2);
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
	public static class InstantiationContext extends ParserRuleContext {
		public String varName;
		public Token varID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((InstantiationContext)_localctx).varID = match(ID);
			setState(106);
			match(T__7);
			setState(107);
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
	public static class FunctionPlayScriptContext extends FunctionsContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public FunctionPlayScriptContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMoveVectorContext extends FunctionsContext {
		public Token s;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public FunctionMoveVectorContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPrintContext extends FunctionsContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionPrintContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionRefreshContext extends FunctionsContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public FunctionRefreshContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCloseContext extends FunctionsContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public FunctionCloseContext(FunctionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMoveIDContext extends FunctionsContext {
		public Token s;
		public Token vectorID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public FunctionMoveIDContext(FunctionsContext ctx) { copyFrom(ctx); }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionCloseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__8);
				setState(110);
				match(ID);
				setState(111);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new FunctionRefreshContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__9);
				setState(113);
				match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(114);
					match(T__10);
					setState(115);
					time();
					}
				}

				setState(118);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new FunctionPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__11);
				setState(120);
				expr(0);
				setState(121);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new FunctionMoveVectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__12);
				setState(124);
				expr(0);
				setState(125);
				((FunctionMoveVectorContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((FunctionMoveVectorContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				point();
				setState(127);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new FunctionMoveIDContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(T__12);
				setState(130);
				expr(0);
				setState(131);
				((FunctionMoveIDContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((FunctionMoveIDContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				((FunctionMoveIDContext)_localctx).vectorID = match(ID);
				setState(133);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new FunctionPlayScriptContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(T__15);
				setState(136);
				match(ID);
				setState(137);
				match(T__16);
				setState(138);
				match(T__0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(139);
					assignment();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__1);
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
	public static class ExprEventContext extends ExprContext {
		public EventsContext events() {
			return getRuleContext(EventsContext.class,0);
		}
		public ExprEventContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotBooleanContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotBooleanContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class ExprRealNumberContext extends ExprContext {
		public TerminalNode Number() { return getToken(aglParser.Number, 0); }
		public ExprRealNumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(aglParser.String, 0); }
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
		public TerminalNode Boolean() { return getToken(aglParser.Boolean, 0); }
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
	public static class ExprArrayContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprArrayContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVectorContext extends ExprContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ExprVectorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayAccessContext extends ExprContext {
		public ExprContext index;
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPowContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPowContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode Integer() { return getToken(aglParser.Integer, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149);
				((ExprUnaryOperatorContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ExprUnaryOperatorContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__23);
				setState(152);
				expr(0);
				setState(153);
				match(T__24);
				}
				break;
			case 3:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(Boolean);
				}
				break;
			case 4:
				{
				_localctx = new ExprEventContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				events();
				}
				break;
			case 5:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ExprVectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				vector();
				}
				break;
			case 7:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(Integer);
				}
				break;
			case 8:
				{
				_localctx = new ExprRealNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(Number);
				}
				break;
			case 9:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(String);
				}
				break;
			case 10:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new ExprNotBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__25);
				setState(164);
				expr(6);
				}
				break;
			case 12:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__5);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68804149312L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
					{
					setState(166);
					expr(0);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__34) {
						{
						{
						setState(167);
						match(T__34);
						setState(168);
						expr(0);
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(176);
				match(T__6);
				}
				break;
			case 13:
				{
				_localctx = new ExprArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(ID);
				setState(178);
				match(T__5);
				setState(179);
				((ExprArrayAccessContext)_localctx).index = expr(0);
				setState(180);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPowContext(new ExprContext(_parentctx, _parentState));
						((ExprPowContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(185);
						match(T__19);
						setState(186);
						((ExprPowContext)_localctx).e2 = expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(188);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((ExprMultDivContext)_localctx).e2 = expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(191);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((ExprAddSubContext)_localctx).e2 = expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolCompareContext(new ExprContext(_parentctx, _parentState));
						((ExprBoolCompareContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((ExprBoolCompareContext)_localctx).e2 = expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprBooleanANDContext(new ExprContext(_parentctx, _parentState));
						((ExprBooleanANDContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(T__32);
						setState(198);
						((ExprBooleanANDContext)_localctx).e2 = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprBooleanORContext(new ExprContext(_parentctx, _parentState));
						((ExprBooleanORContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(T__33);
						setState(201);
						((ExprBooleanORContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class EventsContext extends ParserRuleContext {
		public String varName;
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public EventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_events; }
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_events);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__35);
			setState(208);
			event();
			}
		}
		catch (RecognitionException re) {
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
	public static class EventContext extends ParserRuleContext {
		public String varName;
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
	 
		public EventContext() { }
		public void copyFrom(EventContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventReadInputContext extends EventContext {
		public TerminalNode String() { return getToken(aglParser.String, 0); }
		public EventReadInputContext(EventContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventMouseClickContext extends EventContext {
		public EventMouseClickContext(EventContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventLoadFileContext extends EventContext {
		public TerminalNode String() { return getToken(aglParser.String, 0); }
		public EventLoadFileContext(EventContext ctx) { copyFrom(ctx); }
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_event);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				_localctx = new EventMouseClickContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new EventReadInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__37);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(212);
					match(String);
					}
					break;
				}
				}
				break;
			case T__38:
				_localctx = new EventLoadFileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(T__38);
				setState(216);
				match(String);
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
	public static class GraphicalObjectContext extends ParserRuleContext {
		public String varName;
		public GraphicalObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphicalObject; }
	 
		public GraphicalObjectContext() { }
		public void copyFrom(GraphicalObjectContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectModelIDContext extends GraphicalObjectContext {
		public Token pointID;
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public GraphicalObjectModelIDContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectModelInstantiationCoordsContext extends GraphicalObjectContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public GraphicalObjectModelInstantiationCoordsContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectModelIDCoordsContext extends GraphicalObjectContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public GraphicalObjectModelIDCoordsContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectAssignmentEnumContext extends GraphicalObjectContext {
		public Token modelID;
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public GraphicalObjectAssignmentEnumContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectModelInstantiationIDContext extends GraphicalObjectContext {
		public Token pointID;
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public GraphicalObjectModelInstantiationIDContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectInstatiationCoordsContext extends GraphicalObjectContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public GraphicalObjectInstatiationCoordsContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectIDCoordsContext extends GraphicalObjectContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public GraphicalObjectIDCoordsContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectUpdateContext extends GraphicalObjectContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public GraphicalObjectUpdateContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectIDContext extends GraphicalObjectContext {
		public Token pointID;
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public GraphicalObjectIDContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectActionContext extends GraphicalObjectContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public GraphicalObjectActionContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphicalObjectInstatiationIDContext extends GraphicalObjectContext {
		public Token pointID;
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public GraphicalObjectInstatiationIDContext(GraphicalObjectContext ctx) { copyFrom(ctx); }
	}

	public final GraphicalObjectContext graphicalObject() throws RecognitionException {
		GraphicalObjectContext _localctx = new GraphicalObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_graphicalObject);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new GraphicalObjectIDCoordsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				objectType();
				setState(220);
				match(T__39);
				setState(221);
				point();
				setState(222);
				match(T__16);
				setState(223);
				match(T__0);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(224);
					assignment();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new GraphicalObjectInstatiationCoordsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				instantiation();
				setState(233);
				match(T__39);
				setState(234);
				point();
				setState(235);
				match(T__16);
				setState(236);
				match(T__0);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(237);
					assignment();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new GraphicalObjectIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				objectType();
				setState(246);
				match(T__39);
				setState(247);
				((GraphicalObjectIDContext)_localctx).pointID = match(ID);
				setState(248);
				match(T__16);
				setState(249);
				match(T__0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(250);
					assignment();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new GraphicalObjectInstatiationIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				instantiation();
				setState(259);
				match(T__39);
				setState(260);
				((GraphicalObjectInstatiationIDContext)_localctx).pointID = match(ID);
				setState(261);
				match(T__16);
				setState(262);
				match(T__0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(263);
					assignment();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new GraphicalObjectUpdateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(T__16);
				setState(272);
				object(0);
				setState(273);
				match(T__40);
				setState(274);
				match(T__0);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(275);
					assignment();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new GraphicalObjectModelInstantiationIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				instantiation();
				setState(284);
				match(T__39);
				setState(285);
				((GraphicalObjectModelInstantiationIDContext)_localctx).pointID = match(ID);
				setState(286);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new GraphicalObjectModelInstantiationCoordsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				instantiation();
				setState(289);
				match(T__39);
				setState(290);
				point();
				setState(291);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new GraphicalObjectModelIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				objectType();
				setState(294);
				match(T__39);
				setState(295);
				((GraphicalObjectModelIDContext)_localctx).pointID = match(ID);
				setState(296);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new GraphicalObjectModelIDCoordsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				objectType();
				setState(299);
				match(T__39);
				setState(300);
				point();
				setState(301);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new GraphicalObjectActionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				action();
				}
				break;
			case 11:
				_localctx = new GraphicalObjectAssignmentEnumContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(304);
				((GraphicalObjectAssignmentEnumContext)_localctx).modelID = match(ID);
				setState(305);
				match(T__7);
				setState(306);
				match(T__41);
				setState(307);
				match(T__42);
				setState(308);
				match(T__0);
				{
				setState(309);
				match(ID);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(310);
					match(T__34);
					setState(311);
					match(ID);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(317);
				match(T__1);
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
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<ActionIfContext> actionIf() {
			return getRuleContexts(ActionIfContext.class);
		}
		public ActionIfContext actionIf(int i) {
			return getRuleContext(ActionIfContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__43);
			setState(321);
			match(T__44);
			setState(322);
			match(ID);
			setState(323);
			match(T__0);
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				actionIf();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__45 );
			setState(329);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
	public static class ActionIfContext extends ParserRuleContext {
		public ActionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionIf; }
	 
		public ActionIfContext() { }
		public void copyFrom(ActionIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionIfElseIfContext extends ActionIfContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ActionIfContext actionIf() {
			return getRuleContext(ActionIfContext.class,0);
		}
		public ActionIfElseIfContext(ActionIfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionIfElseStatContext extends ActionIfContext {
		public StatContext ifBlock;
		public StatContext elseBlock;
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ActionIfElseStatContext(ActionIfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionIfStatContext extends ActionIfContext {
		public List<TerminalNode> ID() { return getTokens(aglParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(aglParser.ID, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ActionIfStatContext(ActionIfContext ctx) { copyFrom(ctx); }
	}

	public final ActionIfContext actionIf() throws RecognitionException {
		ActionIfContext _localctx = new ActionIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_actionIf);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ActionIfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__45);
				setState(332);
				match(ID);
				setState(333);
				match(T__26);
				setState(334);
				match(ID);
				setState(335);
				match(T__40);
				setState(336);
				stat();
				}
				break;
			case 2:
				_localctx = new ActionIfElseIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__45);
				setState(338);
				match(ID);
				setState(339);
				match(T__26);
				setState(340);
				match(ID);
				setState(341);
				match(T__40);
				setState(342);
				stat();
				setState(343);
				match(T__46);
				setState(344);
				actionIf();
				}
				break;
			case 3:
				_localctx = new ActionIfElseStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(T__45);
				setState(347);
				match(ID);
				setState(348);
				match(T__26);
				setState(349);
				match(ID);
				setState(350);
				match(T__40);
				setState(351);
				((ActionIfElseStatContext)_localctx).ifBlock = stat();
				setState(352);
				match(T__46);
				setState(353);
				match(T__40);
				setState(354);
				((ActionIfElseStatContext)_localctx).elseBlock = stat();
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
	public static class ModelInstantiationContext extends ParserRuleContext {
		public Token modelID;
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public List<GraphicalObjectContext> graphicalObject() {
			return getRuleContexts(GraphicalObjectContext.class);
		}
		public GraphicalObjectContext graphicalObject(int i) {
			return getRuleContext(GraphicalObjectContext.class,i);
		}
		public ModelInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelInstantiation; }
	}

	public final ModelInstantiationContext modelInstantiation() throws RecognitionException {
		ModelInstantiationContext _localctx = new ModelInstantiationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modelInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((ModelInstantiationContext)_localctx).modelID = match(ID);
			setState(359);
			match(T__47);
			setState(360);
			match(T__48);
			setState(361);
			match(T__0);
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				graphicalObject();
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & -8646981653161312255L) != 0) );
			setState(367);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
	public static class ViewContext extends ParserRuleContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			instantiation();
			setState(370);
			match(T__16);
			setState(371);
			match(T__0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(372);
				assignment();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
	public static class ObjectContext extends ParserRuleContext {
		public String varName;
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectModelContext extends ObjectContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ObjectModelContext(ObjectContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectGraphicalContext extends ObjectContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ObjectGraphicalContext(ObjectContext ctx) { copyFrom(ctx); }
	}

	public final ObjectContext object() throws RecognitionException {
		return object(0);
	}

	private ObjectContext object(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectContext _localctx = new ObjectContext(_ctx, _parentState);
		ObjectContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_object, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ObjectGraphicalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(381);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjectModelContext(new ObjectContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_object);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					match(T__4);
					setState(385);
					match(ID);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public StatContext ifBlock;
		public StatContext elseBlock;
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
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public IfElseIfContext(If_statContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends If_statContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public IfStatContext(If_statContext ctx) { copyFrom(ctx); }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stat);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(T__45);
				setState(392);
				expr(0);
				setState(393);
				match(T__40);
				setState(394);
				stat();
				}
				break;
			case 2:
				_localctx = new IfElseIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__45);
				setState(397);
				expr(0);
				setState(398);
				match(T__40);
				setState(399);
				stat();
				setState(400);
				match(T__46);
				setState(401);
				if_stat();
				}
				break;
			case 3:
				_localctx = new IfElseStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(T__45);
				setState(404);
				expr(0);
				setState(405);
				match(T__40);
				setState(406);
				((IfElseStatContext)_localctx).ifBlock = stat();
				setState(407);
				match(T__46);
				setState(408);
				match(T__40);
				setState(409);
				((IfElseStatContext)_localctx).elseBlock = stat();
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
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileLoopContext(While_loopContext ctx) { copyFrom(ctx); }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		try {
			_localctx = new WhileLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__49);
			setState(414);
			expr(0);
			setState(415);
			match(T__40);
			setState(416);
			stat();
			}
		}
		catch (RecognitionException re) {
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
	public static class ForEachRangeContext extends For_loopContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ForEachRangeContext(For_loopContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends For_loopContext {
		public ExprContext from;
		public ExprContext to;
		public ExprContext step;
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForRangeContext(For_loopContext ctx) { copyFrom(ctx); }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_loop);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ForRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(T__50);
				setState(419);
				match(ID);
				setState(420);
				match(T__42);
				setState(421);
				((ForRangeContext)_localctx).from = expr(0);
				setState(422);
				match(T__51);
				setState(423);
				((ForRangeContext)_localctx).to = expr(0);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(424);
					match(T__51);
					setState(425);
					((ForRangeContext)_localctx).step = expr(0);
					}
				}

				setState(428);
				match(T__40);
				setState(429);
				stat();
				}
				break;
			case 2:
				_localctx = new ForEachRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(T__50);
				setState(432);
				match(ID);
				setState(433);
				match(T__42);
				setState(434);
				expr(0);
				setState(435);
				match(T__40);
				setState(436);
				stat();
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
		enterRule(_localctx, 34, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expr(0);
			setState(441);
			((TimeContext)_localctx).ts = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				match(T__61);
				}
				break;
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				objectType();
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
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(aglParser.ID, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 139263L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public ExprContext x1;
		public ExprContext x2;
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
		enterRule(_localctx, 40, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__23);
			setState(457);
			((PointContext)_localctx).x1 = expr(0);
			setState(458);
			match(T__34);
			setState(459);
			((PointContext)_localctx).x2 = expr(0);
			setState(460);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_vector);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new VectorPointContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				point();
				}
				break;
			case 2:
				_localctx = new VectorPolarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__23);
				setState(464);
				expr(0);
				setState(465);
				match(T__7);
				setState(466);
				expr(0);
				setState(467);
				match(T__24);
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
		case 13:
			return object_sempred((ObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean object_sempred(ObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001U\u01d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004"+
		"\n\u0004\f\u0004\u0090\t\u0004\u0001\u0004\u0003\u0004\u0093\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00aa\b\u0005\n\u0005\f\u0005"+
		"\u00ad\t\u0005\u0003\u0005\u00af\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00cb\b\u0005\n\u0005\f\u0005\u00ce\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d6\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00da\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e2\b\b\n\b\f\b\u00e5\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ef"+
		"\b\b\n\b\f\b\u00f2\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00fc\b\b\n\b\f\b\u00ff\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0109\b\b\n\b\f\b\u010c"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0115"+
		"\b\b\n\b\f\b\u0118\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0139"+
		"\b\b\n\b\f\b\u013c\t\b\u0001\b\u0003\b\u013f\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u0146\b\t\u000b\t\f\t\u0147\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0165"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u016c\b\u000b\u000b\u000b\f\u000b\u016d\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0176\b\f\n\f\f\f\u0179\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0183"+
		"\b\r\n\r\f\r\u0186\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u019c\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01ab\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01b7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01c5\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01d6\b\u0015\u0001\u0015\u0000\u0002"+
		"\n\u001a\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u0006\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0012\u0013\u0001\u0000\u0015\u0017\u0001\u0000\u001b \u0001\u0000"+
		"56\u0002\u0000?KPP\u0211\u0000/\u0001\u0000\u0000\u0000\u0002G\u0001\u0000"+
		"\u0000\u0000\u0004g\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000"+
		"\b\u0092\u0001\u0000\u0000\u0000\n\u00b6\u0001\u0000\u0000\u0000\f\u00cf"+
		"\u0001\u0000\u0000\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u013e"+
		"\u0001\u0000\u0000\u0000\u0012\u0140\u0001\u0000\u0000\u0000\u0014\u0164"+
		"\u0001\u0000\u0000\u0000\u0016\u0166\u0001\u0000\u0000\u0000\u0018\u0171"+
		"\u0001\u0000\u0000\u0000\u001a\u017c\u0001\u0000\u0000\u0000\u001c\u019b"+
		"\u0001\u0000\u0000\u0000\u001e\u019d\u0001\u0000\u0000\u0000 \u01b6\u0001"+
		"\u0000\u0000\u0000\"\u01b8\u0001\u0000\u0000\u0000$\u01c4\u0001\u0000"+
		"\u0000\u0000&\u01c6\u0001\u0000\u0000\u0000(\u01c8\u0001\u0000\u0000\u0000"+
		"*\u01d5\u0001\u0000\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"23\u0005\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u000048\u0005\u0001"+
		"\u0000\u000057\u0003\u0002\u0001\u000065\u0001\u0000\u0000\u00007:\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;H\u0005\u0002\u0000"+
		"\u0000<=\u0003\u0006\u0003\u0000=>\u0005\u0003\u0000\u0000>H\u0001\u0000"+
		"\u0000\u0000?H\u0003\u0004\u0002\u0000@H\u0003\b\u0004\u0000AH\u0003\u0018"+
		"\f\u0000BH\u0003\u0010\b\u0000CH\u0003 \u0010\u0000DH\u0003\u001c\u000e"+
		"\u0000EH\u0003\u001e\u000f\u0000FH\u0003\u0016\u000b\u0000G4\u0001\u0000"+
		"\u0000\u0000G<\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001"+
		"\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000"+
		"GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IJ\u0005"+
		"P\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0003\n\u0005\u0000LM\u0005"+
		"\u0003\u0000\u0000Mh\u0001\u0000\u0000\u0000NO\u0003\u0006\u0003\u0000"+
		"OP\u0005\u0004\u0000\u0000PQ\u0003\n\u0005\u0000QR\u0005\u0003\u0000\u0000"+
		"Rh\u0001\u0000\u0000\u0000ST\u0005P\u0000\u0000TU\u0005\u0005\u0000\u0000"+
		"UV\u0005P\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0003\n\u0005\u0000"+
		"XY\u0005\u0003\u0000\u0000Yh\u0001\u0000\u0000\u0000Z[\u0003\u0006\u0003"+
		"\u0000[\\\u0005\u0004\u0000\u0000\\]\u0003\u000e\u0007\u0000]^\u0005\u0003"+
		"\u0000\u0000^h\u0001\u0000\u0000\u0000_`\u0005P\u0000\u0000`a\u0005\u0006"+
		"\u0000\u0000ab\u0003\n\u0005\u0000bc\u0005\u0007\u0000\u0000cd\u0005\u0004"+
		"\u0000\u0000de\u0003\n\u0005\u0000ef\u0005\u0003\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000gI\u0001\u0000\u0000\u0000gN\u0001\u0000\u0000\u0000gS\u0001"+
		"\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000g_\u0001\u0000\u0000\u0000"+
		"h\u0005\u0001\u0000\u0000\u0000ij\u0005P\u0000\u0000jk\u0005\b\u0000\u0000"+
		"kl\u0003$\u0012\u0000l\u0007\u0001\u0000\u0000\u0000mn\u0005\t\u0000\u0000"+
		"no\u0005P\u0000\u0000o\u0093\u0005\u0003\u0000\u0000pq\u0005\n\u0000\u0000"+
		"qt\u0005P\u0000\u0000rs\u0005\u000b\u0000\u0000su\u0003\"\u0011\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0093\u0005\u0003\u0000\u0000wx\u0005\f\u0000\u0000xy\u0003\n"+
		"\u0005\u0000yz\u0005\u0003\u0000\u0000z\u0093\u0001\u0000\u0000\u0000"+
		"{|\u0005\r\u0000\u0000|}\u0003\n\u0005\u0000}~\u0007\u0000\u0000\u0000"+
		"~\u007f\u0003(\u0014\u0000\u007f\u0080\u0005\u0003\u0000\u0000\u0080\u0093"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0083\u0003"+
		"\n\u0005\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0085\u0005P"+
		"\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0093\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0089\u0005P\u0000"+
		"\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u008e\u0005\u0001\u0000"+
		"\u0000\u008b\u008d\u0003\u0004\u0002\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0002\u0000"+
		"\u0000\u0092m\u0001\u0000\u0000\u0000\u0092p\u0001\u0000\u0000\u0000\u0092"+
		"w\u0001\u0000\u0000\u0000\u0092{\u0001\u0000\u0000\u0000\u0092\u0081\u0001"+
		"\u0000\u0000\u0000\u0092\u0087\u0001\u0000\u0000\u0000\u0093\t\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0006\u0005\uffff\uffff\u0000\u0095\u0096\u0007"+
		"\u0001\u0000\u0000\u0096\u00b7\u0003\n\u0005\u0013\u0097\u0098\u0005\u0018"+
		"\u0000\u0000\u0098\u0099\u0003\n\u0005\u0000\u0099\u009a\u0005\u0019\u0000"+
		"\u0000\u009a\u00b7\u0001\u0000\u0000\u0000\u009b\u00b7\u0005L\u0000\u0000"+
		"\u009c\u00b7\u0003\f\u0006\u0000\u009d\u00b7\u0003(\u0014\u0000\u009e"+
		"\u00b7\u0003*\u0015\u0000\u009f\u00b7\u0005M\u0000\u0000\u00a0\u00b7\u0005"+
		"N\u0000\u0000\u00a1\u00b7\u0005O\u0000\u0000\u00a2\u00b7\u0005P\u0000"+
		"\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000\u00a4\u00b7\u0003\n\u0005\u0006"+
		"\u00a5\u00ae\u0005\u0006\u0000\u0000\u00a6\u00ab\u0003\n\u0005\u0000\u00a7"+
		"\u00a8\u0005#\u0000\u0000\u00a8\u00aa\u0003\n\u0005\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b7\u0005\u0007\u0000\u0000\u00b1\u00b2"+
		"\u0005P\u0000\u0000\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4\u0003"+
		"\n\u0005\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u0094\u0001\u0000\u0000\u0000\u00b6\u0097\u0001\u0000"+
		"\u0000\u0000\u00b6\u009b\u0001\u0000\u0000\u0000\u00b6\u009c\u0001\u0000"+
		"\u0000\u0000\u00b6\u009d\u0001\u0000\u0000\u0000\u00b6\u009e\u0001\u0000"+
		"\u0000\u0000\u00b6\u009f\u0001\u0000\u0000\u0000\u00b6\u00a0\u0001\u0000"+
		"\u0000\u0000\u00b6\u00a1\u0001\u0000\u0000\u0000\u00b6\u00a2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00a3\u0001\u0000\u0000\u0000\u00b6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b7\u00cc\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\n\u0012\u0000\u0000\u00b9\u00ba\u0005\u0014\u0000"+
		"\u0000\u00ba\u00cb\u0003\n\u0005\u0012\u00bb\u00bc\n\u0011\u0000\u0000"+
		"\u00bc\u00bd\u0007\u0002\u0000\u0000\u00bd\u00cb\u0003\n\u0005\u0012\u00be"+
		"\u00bf\n\u0010\u0000\u0000\u00bf\u00c0\u0007\u0001\u0000\u0000\u00c0\u00cb"+
		"\u0003\n\u0005\u0011\u00c1\u00c2\n\u0005\u0000\u0000\u00c2\u00c3\u0007"+
		"\u0003\u0000\u0000\u00c3\u00cb\u0003\n\u0005\u0006\u00c4\u00c5\n\u0004"+
		"\u0000\u0000\u00c5\u00c6\u0005!\u0000\u0000\u00c6\u00cb\u0003\n\u0005"+
		"\u0005\u00c7\u00c8\n\u0003\u0000\u0000\u00c8\u00c9\u0005\"\u0000\u0000"+
		"\u00c9\u00cb\u0003\n\u0005\u0004\u00ca\u00b8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c1\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u000b\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005$\u0000\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000\u00d1\r"+
		"\u0001\u0000\u0000\u0000\u00d2\u00da\u0005%\u0000\u0000\u00d3\u00d5\u0005"+
		"&\u0000\u0000\u00d4\u00d6\u0005O\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00da\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\'\u0000\u0000\u00d8\u00da\u0005O\u0000\u0000"+
		"\u00d9\u00d2\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u000f\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0003&\u0013\u0000\u00dc\u00dd\u0005(\u0000\u0000\u00dd\u00de"+
		"\u0003(\u0014\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00e3\u0005"+
		"\u0001\u0000\u0000\u00e0\u00e2\u0003\u0004\u0002\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0002\u0000\u0000\u00e7\u013f\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003"+
		"\u0006\u0003\u0000\u00e9\u00ea\u0005(\u0000\u0000\u00ea\u00eb\u0003(\u0014"+
		"\u0000\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec\u00f0\u0005\u0001\u0000"+
		"\u0000\u00ed\u00ef\u0003\u0004\u0002\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0002\u0000"+
		"\u0000\u00f4\u013f\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003&\u0013\u0000"+
		"\u00f6\u00f7\u0005(\u0000\u0000\u00f7\u00f8\u0005P\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0011\u0000\u0000\u00f9\u00fd\u0005\u0001\u0000\u0000\u00fa\u00fc"+
		"\u0003\u0004\u0002\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0002\u0000\u0000\u0101\u013f"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0006\u0003\u0000\u0103\u0104"+
		"\u0005(\u0000\u0000\u0104\u0105\u0005P\u0000\u0000\u0105\u0106\u0005\u0011"+
		"\u0000\u0000\u0106\u010a\u0005\u0001\u0000\u0000\u0107\u0109\u0003\u0004"+
		"\u0002\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u0002\u0000\u0000\u010e\u013f\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u0011\u0000\u0000\u0110\u0111\u0003\u001a"+
		"\r\u0000\u0111\u0112\u0005)\u0000\u0000\u0112\u0116\u0005\u0001\u0000"+
		"\u0000\u0113\u0115\u0003\u0004\u0002\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0002\u0000"+
		"\u0000\u011a\u013f\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0006\u0003"+
		"\u0000\u011c\u011d\u0005(\u0000\u0000\u011d\u011e\u0005P\u0000\u0000\u011e"+
		"\u011f\u0005\u0003\u0000\u0000\u011f\u013f\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0003\u0006\u0003\u0000\u0121\u0122\u0005(\u0000\u0000\u0122\u0123"+
		"\u0003(\u0014\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u013f\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0005(\u0000"+
		"\u0000\u0127\u0128\u0005P\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000"+
		"\u0129\u013f\u0001\u0000\u0000\u0000\u012a\u012b\u0003&\u0013\u0000\u012b"+
		"\u012c\u0005(\u0000\u0000\u012c\u012d\u0003(\u0014\u0000\u012d\u012e\u0005"+
		"\u0003\u0000\u0000\u012e\u013f\u0001\u0000\u0000\u0000\u012f\u013f\u0003"+
		"\u0012\t\u0000\u0130\u0131\u0005P\u0000\u0000\u0131\u0132\u0005\b\u0000"+
		"\u0000\u0132\u0133\u0005*\u0000\u0000\u0133\u0134\u0005+\u0000\u0000\u0134"+
		"\u0135\u0005\u0001\u0000\u0000\u0135\u013a\u0005P\u0000\u0000\u0136\u0137"+
		"\u0005#\u0000\u0000\u0137\u0139\u0005P\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0002"+
		"\u0000\u0000\u013e\u00db\u0001\u0000\u0000\u0000\u013e\u00e8\u0001\u0000"+
		"\u0000\u0000\u013e\u00f5\u0001\u0000\u0000\u0000\u013e\u0102\u0001\u0000"+
		"\u0000\u0000\u013e\u010f\u0001\u0000\u0000\u0000\u013e\u011b\u0001\u0000"+
		"\u0000\u0000\u013e\u0120\u0001\u0000\u0000\u0000\u013e\u0125\u0001\u0000"+
		"\u0000\u0000\u013e\u012a\u0001\u0000\u0000\u0000\u013e\u012f\u0001\u0000"+
		"\u0000\u0000\u013e\u0130\u0001\u0000\u0000\u0000\u013f\u0011\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005,\u0000\u0000\u0141\u0142\u0005-\u0000\u0000"+
		"\u0142\u0143\u0005P\u0000\u0000\u0143\u0145\u0005\u0001\u0000\u0000\u0144"+
		"\u0146\u0003\u0014\n\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u0002\u0000\u0000\u014a\u0013\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005.\u0000\u0000\u014c\u014d\u0005P\u0000\u0000\u014d\u014e\u0005\u001b"+
		"\u0000\u0000\u014e\u014f\u0005P\u0000\u0000\u014f\u0150\u0005)\u0000\u0000"+
		"\u0150\u0165\u0003\u0002\u0001\u0000\u0151\u0152\u0005.\u0000\u0000\u0152"+
		"\u0153\u0005P\u0000\u0000\u0153\u0154\u0005\u001b\u0000\u0000\u0154\u0155"+
		"\u0005P\u0000\u0000\u0155\u0156\u0005)\u0000\u0000\u0156\u0157\u0003\u0002"+
		"\u0001\u0000\u0157\u0158\u0005/\u0000\u0000\u0158\u0159\u0003\u0014\n"+
		"\u0000\u0159\u0165\u0001\u0000\u0000\u0000\u015a\u015b\u0005.\u0000\u0000"+
		"\u015b\u015c\u0005P\u0000\u0000\u015c\u015d\u0005\u001b\u0000\u0000\u015d"+
		"\u015e\u0005P\u0000\u0000\u015e\u015f\u0005)\u0000\u0000\u015f\u0160\u0003"+
		"\u0002\u0001\u0000\u0160\u0161\u0005/\u0000\u0000\u0161\u0162\u0005)\u0000"+
		"\u0000\u0162\u0163\u0003\u0002\u0001\u0000\u0163\u0165\u0001\u0000\u0000"+
		"\u0000\u0164\u014b\u0001\u0000\u0000\u0000\u0164\u0151\u0001\u0000\u0000"+
		"\u0000\u0164\u015a\u0001\u0000\u0000\u0000\u0165\u0015\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005P\u0000\u0000\u0167\u0168\u00050\u0000\u0000\u0168"+
		"\u0169\u00051\u0000\u0000\u0169\u016b\u0005\u0001\u0000\u0000\u016a\u016c"+
		"\u0003\u0010\b\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0002\u0000\u0000\u0170\u0017\u0001\u0000\u0000\u0000\u0171\u0172\u0003"+
		"\u0006\u0003\u0000\u0172\u0173\u0005\u0011\u0000\u0000\u0173\u0177\u0005"+
		"\u0001\u0000\u0000\u0174\u0176\u0003\u0004\u0002\u0000\u0175\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"\u0002\u0000\u0000\u017b\u0019\u0001\u0000\u0000\u0000\u017c\u017d\u0006"+
		"\r\uffff\uffff\u0000\u017d\u017e\u0005P\u0000\u0000\u017e\u0184\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\n\u0001\u0000\u0000\u0180\u0181\u0005\u0005"+
		"\u0000\u0000\u0181\u0183\u0005P\u0000\u0000\u0182\u017f\u0001\u0000\u0000"+
		"\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u001b\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005.\u0000\u0000"+
		"\u0188\u0189\u0003\n\u0005\u0000\u0189\u018a\u0005)\u0000\u0000\u018a"+
		"\u018b\u0003\u0002\u0001\u0000\u018b\u019c\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0005.\u0000\u0000\u018d\u018e\u0003\n\u0005\u0000\u018e\u018f"+
		"\u0005)\u0000\u0000\u018f\u0190\u0003\u0002\u0001\u0000\u0190\u0191\u0005"+
		"/\u0000\u0000\u0191\u0192\u0003\u001c\u000e\u0000\u0192\u019c\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005.\u0000\u0000\u0194\u0195\u0003\n\u0005"+
		"\u0000\u0195\u0196\u0005)\u0000\u0000\u0196\u0197\u0003\u0002\u0001\u0000"+
		"\u0197\u0198\u0005/\u0000\u0000\u0198\u0199\u0005)\u0000\u0000\u0199\u019a"+
		"\u0003\u0002\u0001\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0187"+
		"\u0001\u0000\u0000\u0000\u019b\u018c\u0001\u0000\u0000\u0000\u019b\u0193"+
		"\u0001\u0000\u0000\u0000\u019c\u001d\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u00052\u0000\u0000\u019e\u019f\u0003\n\u0005\u0000\u019f\u01a0\u0005"+
		")\u0000\u0000\u01a0\u01a1\u0003\u0002\u0001\u0000\u01a1\u001f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u00053\u0000\u0000\u01a3\u01a4\u0005P\u0000\u0000"+
		"\u01a4\u01a5\u0005+\u0000\u0000\u01a5\u01a6\u0003\n\u0005\u0000\u01a6"+
		"\u01a7\u00054\u0000\u0000\u01a7\u01aa\u0003\n\u0005\u0000\u01a8\u01a9"+
		"\u00054\u0000\u0000\u01a9\u01ab\u0003\n\u0005\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005)\u0000\u0000\u01ad\u01ae\u0003\u0002"+
		"\u0001\u0000\u01ae\u01b7\u0001\u0000\u0000\u0000\u01af\u01b0\u00053\u0000"+
		"\u0000\u01b0\u01b1\u0005P\u0000\u0000\u01b1\u01b2\u0005+\u0000\u0000\u01b2"+
		"\u01b3\u0003\n\u0005\u0000\u01b3\u01b4\u0005)\u0000\u0000\u01b4\u01b5"+
		"\u0003\u0002\u0001\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01a2"+
		"\u0001\u0000\u0000\u0000\u01b6\u01af\u0001\u0000\u0000\u0000\u01b7!\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0003\n\u0005\u0000\u01b9\u01ba\u0007\u0004"+
		"\u0000\u0000\u01ba#\u0001\u0000\u0000\u0000\u01bb\u01c5\u00057\u0000\u0000"+
		"\u01bc\u01c5\u00058\u0000\u0000\u01bd\u01c5\u00059\u0000\u0000\u01be\u01c5"+
		"\u0005:\u0000\u0000\u01bf\u01c5\u0005;\u0000\u0000\u01c0\u01c5\u0005<"+
		"\u0000\u0000\u01c1\u01c5\u0005=\u0000\u0000\u01c2\u01c5\u0005>\u0000\u0000"+
		"\u01c3\u01c5\u0003&\u0013\u0000\u01c4\u01bb\u0001\u0000\u0000\u0000\u01c4"+
		"\u01bc\u0001\u0000\u0000\u0000\u01c4\u01bd\u0001\u0000\u0000\u0000\u01c4"+
		"\u01be\u0001\u0000\u0000\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"%\u0001\u0000\u0000\u0000\u01c6\u01c7\u0007\u0005\u0000\u0000\u01c7\'"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0018\u0000\u0000\u01c9\u01ca"+
		"\u0003\n\u0005\u0000\u01ca\u01cb\u0005#\u0000\u0000\u01cb\u01cc\u0003"+
		"\n\u0005\u0000\u01cc\u01cd\u0005\u0019\u0000\u0000\u01cd)\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d6\u0003(\u0014\u0000\u01cf\u01d0\u0005\u0018\u0000"+
		"\u0000\u01d0\u01d1\u0003\n\u0005\u0000\u01d1\u01d2\u0005\b\u0000\u0000"+
		"\u01d2\u01d3\u0003\n\u0005\u0000\u01d3\u01d4\u0005\u0019\u0000\u0000\u01d4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d5\u01ce\u0001\u0000\u0000\u0000\u01d5"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d6+\u0001\u0000\u0000\u0000\u001f/8"+
		"Ggt\u008e\u0092\u00ab\u00ae\u00b6\u00ca\u00cc\u00d5\u00d9\u00e3\u00f0"+
		"\u00fd\u010a\u0116\u013a\u013e\u0147\u0164\u016d\u0177\u0184\u019b\u01aa"+
		"\u01b6\u01c4\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}