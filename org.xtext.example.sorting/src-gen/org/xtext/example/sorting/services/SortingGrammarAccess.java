/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SortingGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Config");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConfigKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cComponentsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cComponentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComponentsComponentParserRuleCall_3_0 = (RuleCall)cComponentsAssignment_3.eContents().get(0);
		private final Keyword cTransitionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTransitionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTransitionsTransitionParserRuleCall_5_0 = (RuleCall)cTransitionsAssignment_5.eContents().get(0);
		
		//Config:
		//	'config:' name=ID
		//	'components:' components+=Component
		//	'transitions:' transitions+=Transition;
		@Override public ParserRule getRule() { return rule; }
		
		//'config:' name=ID 'components:' components+=Component 'transitions:' transitions+=Transition
		public Group getGroup() { return cGroup; }
		
		//'config:'
		public Keyword getConfigKeyword_0() { return cConfigKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'components:'
		public Keyword getComponentsKeyword_2() { return cComponentsKeyword_2; }
		
		//components+=Component
		public Assignment getComponentsAssignment_3() { return cComponentsAssignment_3; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_3_0() { return cComponentsComponentParserRuleCall_3_0; }
		
		//'transitions:'
		public Keyword getTransitionsKeyword_4() { return cTransitionsKeyword_4; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_5() { return cTransitionsAssignment_5; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_5_0() { return cTransitionsTransitionParserRuleCall_5_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cTypeAlternatives_0_0 = (Alternatives)cTypeAssignment_0.eContents().get(0);
		private final Keyword cTypeIntKeyword_0_0_0 = (Keyword)cTypeAlternatives_0_0.eContents().get(0);
		private final Keyword cTypeStringKeyword_0_0_1 = (Keyword)cTypeAlternatives_0_0.eContents().get(1);
		private final Keyword cTypeDoubleKeyword_0_0_2 = (Keyword)cTypeAlternatives_0_0.eContents().get(2);
		private final Keyword cTypeLongKeyword_0_0_3 = (Keyword)cTypeAlternatives_0_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Type:
		//	type=('int' | 'String' | 'double' | 'long') ('[' ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=('int' | 'String' | 'double' | 'long') ('[' ']')?
		public Group getGroup() { return cGroup; }
		
		//type=('int' | 'String' | 'double' | 'long')
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//('int' | 'String' | 'double' | 'long')
		public Alternatives getTypeAlternatives_0_0() { return cTypeAlternatives_0_0; }
		
		//'int'
		public Keyword getTypeIntKeyword_0_0_0() { return cTypeIntKeyword_0_0_0; }
		
		//'String'
		public Keyword getTypeStringKeyword_0_0_1() { return cTypeStringKeyword_0_0_1; }
		
		//'double'
		public Keyword getTypeDoubleKeyword_0_0_2() { return cTypeDoubleKeyword_0_0_2; }
		
		//'long'
		public Keyword getTypeLongKeyword_0_0_3() { return cTypeLongKeyword_0_0_3; }
		
		//('[' ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_1() { return cRightSquareBracketKeyword_1_1; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Component");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSourceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cInstanceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Component:
		//	Source | Sink | Filter | Instance;
		@Override public ParserRule getRule() { return rule; }
		
		//Source | Sink | Filter | Instance
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Source
		public RuleCall getSourceParserRuleCall_0() { return cSourceParserRuleCall_0; }
		
		//Sink
		public RuleCall getSinkParserRuleCall_1() { return cSinkParserRuleCall_1; }
		
		//Filter
		public RuleCall getFilterParserRuleCall_2() { return cFilterParserRuleCall_2; }
		
		//Instance
		public RuleCall getInstanceParserRuleCall_3() { return cInstanceParserRuleCall_3; }
	}
	public class SourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Source");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cOutKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeTypeParserRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cInputMethodKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMethodAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMethodSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cMethodAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cFullStopKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_5_2_1 = (RuleCall)cGroup_5_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Source:
		//	'source' name=ID '{'
		//	'out:' type=Type ('input-method:' method=STRING ('.' STRING)*)? //default and optional
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'source' name=ID '{' 'out:' type=Type ('input-method:' method=STRING ('.' STRING)*)? //default and optional
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'source'
		public Keyword getSourceKeyword_0() { return cSourceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'out:'
		public Keyword getOutKeyword_3() { return cOutKeyword_3; }
		
		//type=Type
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_4_0() { return cTypeTypeParserRuleCall_4_0; }
		
		//('input-method:' method=STRING ('.' STRING)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'input-method:'
		public Keyword getInputMethodKeyword_5_0() { return cInputMethodKeyword_5_0; }
		
		//method=STRING
		public Assignment getMethodAssignment_5_1() { return cMethodAssignment_5_1; }
		
		//STRING
		public RuleCall getMethodSTRINGTerminalRuleCall_5_1_0() { return cMethodSTRINGTerminalRuleCall_5_1_0; }
		
		//('.' STRING)*
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//'.'
		public Keyword getFullStopKeyword_5_2_0() { return cFullStopKeyword_5_2_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5_2_1() { return cSTRINGTerminalRuleCall_5_2_1; }
		
		////default and optional
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInTypeTypeParserRuleCall_4_0 = (RuleCall)cInTypeAssignment_4.eContents().get(0);
		private final Keyword cOutKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cOutTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOutTypeTypeParserRuleCall_6_0 = (RuleCall)cOutTypeAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cMethodKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cMethodAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cMethodSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cMethodAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cFullStopKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_7_2_1 = (RuleCall)cGroup_7_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Filter:
		//	'filter' name=ID '{'
		//	'in:' inType=Type
		//	'out:' outType=Type ('method:' method=STRING ('.' STRING)*)? //default and optional
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'filter' name=ID '{' 'in:' inType=Type 'out:' outType=Type ('method:' method=STRING ('.' STRING)*)? //default and optional
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'filter'
		public Keyword getFilterKeyword_0() { return cFilterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'in:'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//inType=Type
		public Assignment getInTypeAssignment_4() { return cInTypeAssignment_4; }
		
		//Type
		public RuleCall getInTypeTypeParserRuleCall_4_0() { return cInTypeTypeParserRuleCall_4_0; }
		
		//'out:'
		public Keyword getOutKeyword_5() { return cOutKeyword_5; }
		
		//outType=Type
		public Assignment getOutTypeAssignment_6() { return cOutTypeAssignment_6; }
		
		//Type
		public RuleCall getOutTypeTypeParserRuleCall_6_0() { return cOutTypeTypeParserRuleCall_6_0; }
		
		//('method:' method=STRING ('.' STRING)*)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'method:'
		public Keyword getMethodKeyword_7_0() { return cMethodKeyword_7_0; }
		
		//method=STRING
		public Assignment getMethodAssignment_7_1() { return cMethodAssignment_7_1; }
		
		//STRING
		public RuleCall getMethodSTRINGTerminalRuleCall_7_1_0() { return cMethodSTRINGTerminalRuleCall_7_1_0; }
		
		//('.' STRING)*
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'.'
		public Keyword getFullStopKeyword_7_2_0() { return cFullStopKeyword_7_2_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_7_2_1() { return cSTRINGTerminalRuleCall_7_2_1; }
		
		////default and optional
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class SinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Sink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInTypeTypeParserRuleCall_4_0 = (RuleCall)cInTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cOutputMethodKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMethodAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMethodSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cMethodAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cFullStopKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_5_2_1 = (RuleCall)cGroup_5_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Sink:
		//	'sink' name=ID '{'
		//	'in:' inType=Type ('output-method:' method=STRING ('.' STRING)*)? //default and optional
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'sink' name=ID '{' 'in:' inType=Type ('output-method:' method=STRING ('.' STRING)*)? //default and optional
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'sink'
		public Keyword getSinkKeyword_0() { return cSinkKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'in:'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//inType=Type
		public Assignment getInTypeAssignment_4() { return cInTypeAssignment_4; }
		
		//Type
		public RuleCall getInTypeTypeParserRuleCall_4_0() { return cInTypeTypeParserRuleCall_4_0; }
		
		//('output-method:' method=STRING ('.' STRING)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'output-method:'
		public Keyword getOutputMethodKeyword_5_0() { return cOutputMethodKeyword_5_0; }
		
		//method=STRING
		public Assignment getMethodAssignment_5_1() { return cMethodAssignment_5_1; }
		
		//STRING
		public RuleCall getMethodSTRINGTerminalRuleCall_5_1_0() { return cMethodSTRINGTerminalRuleCall_5_1_0; }
		
		//('.' STRING)*
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//'.'
		public Keyword getFullStopKeyword_5_2_0() { return cFullStopKeyword_5_2_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5_2_1() { return cSTRINGTerminalRuleCall_5_2_1; }
		
		////default and optional
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentComponentCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentComponentIDTerminalRuleCall_1_0_1 = (RuleCall)cComponentComponentCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cCallKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cMethodAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cMethodSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cMethodAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cFullStopKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_3_0_2_1 = (RuleCall)cGroup_3_0_2.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cArgsKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cArgsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cArgsSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cArgsAssignment_3_1_1.eContents().get(0);
		
		//Instance:
		//	'inst:' component=[Component] name=ID ('call:' method=STRING ('.' STRING)* | 'args:' args+=STRING*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'inst:' component=[Component] name=ID ('call:' method=STRING ('.' STRING)* | 'args:' args+=STRING*)?
		public Group getGroup() { return cGroup; }
		
		//'inst:'
		public Keyword getInstKeyword_0() { return cInstKeyword_0; }
		
		//component=[Component]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }
		
		//[Component]
		public CrossReference getComponentComponentCrossReference_1_0() { return cComponentComponentCrossReference_1_0; }
		
		//ID
		public RuleCall getComponentComponentIDTerminalRuleCall_1_0_1() { return cComponentComponentIDTerminalRuleCall_1_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('call:' method=STRING ('.' STRING)* | 'args:' args+=STRING*)?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'call:' method=STRING ('.' STRING)*
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'call:'
		public Keyword getCallKeyword_3_0_0() { return cCallKeyword_3_0_0; }
		
		//method=STRING
		public Assignment getMethodAssignment_3_0_1() { return cMethodAssignment_3_0_1; }
		
		//STRING
		public RuleCall getMethodSTRINGTerminalRuleCall_3_0_1_0() { return cMethodSTRINGTerminalRuleCall_3_0_1_0; }
		
		//('.' STRING)*
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//'.'
		public Keyword getFullStopKeyword_3_0_2_0() { return cFullStopKeyword_3_0_2_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3_0_2_1() { return cSTRINGTerminalRuleCall_3_0_2_1; }
		
		//'args:' args+=STRING*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'args:'
		public Keyword getArgsKeyword_3_1_0() { return cArgsKeyword_3_1_0; }
		
		//args+=STRING*
		public Assignment getArgsAssignment_3_1_1() { return cArgsAssignment_3_1_1; }
		
		//STRING
		public RuleCall getArgsSTRINGTerminalRuleCall_3_1_1_0() { return cArgsSTRINGTerminalRuleCall_3_1_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.sorting.Sorting.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSourceComponentCrossReference_0_0 = (CrossReference)cSourceAssignment_0.eContents().get(0);
		private final RuleCall cSourceComponentIDTerminalRuleCall_0_0_1 = (RuleCall)cSourceComponentCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetComponentCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetComponentIDTerminalRuleCall_2_0_1 = (RuleCall)cTargetComponentCrossReference_2_0.eContents().get(1);
		
		//Transition:
		//	source=[Component] "=>" target=[Component];
		@Override public ParserRule getRule() { return rule; }
		
		////	(source=[Source]|source=[Filter]) "=>" (target=[Filter]|target=[Sink])|
		//source=[Component] "=>" target=[Component]
		public Group getGroup() { return cGroup; }
		
		////	(source=[Source]|source=[Filter]) "=>" (target=[Filter]|target=[Sink])|
		//source=[Component]
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }
		
		//[Component]
		public CrossReference getSourceComponentCrossReference_0_0() { return cSourceComponentCrossReference_0_0; }
		
		//ID
		public RuleCall getSourceComponentIDTerminalRuleCall_0_0_1() { return cSourceComponentIDTerminalRuleCall_0_0_1; }
		
		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//target=[Component]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }
		
		//[Component]
		public CrossReference getTargetComponentCrossReference_2_0() { return cTargetComponentCrossReference_2_0; }
		
		//ID
		public RuleCall getTargetComponentIDTerminalRuleCall_2_0_1() { return cTargetComponentIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final ConfigElements pConfig;
	private final TypeElements pType;
	private final ComponentElements pComponent;
	private final SourceElements pSource;
	private final FilterElements pFilter;
	private final SinkElements pSink;
	private final InstanceElements pInstance;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SortingGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pConfig = new ConfigElements();
		this.pType = new TypeElements();
		this.pComponent = new ComponentElements();
		this.pSource = new SourceElements();
		this.pFilter = new FilterElements();
		this.pSink = new SinkElements();
		this.pInstance = new InstanceElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.sorting.Sorting".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Config:
	//	'config:' name=ID
	//	'components:' components+=Component
	//	'transitions:' transitions+=Transition;
	public ConfigElements getConfigAccess() {
		return pConfig;
	}
	
	public ParserRule getConfigRule() {
		return getConfigAccess().getRule();
	}
	
	//Type:
	//	type=('int' | 'String' | 'double' | 'long') ('[' ']')?;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Component:
	//	Source | Sink | Filter | Instance;
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Source:
	//	'source' name=ID '{'
	//	'out:' type=Type ('input-method:' method=STRING ('.' STRING)*)? //default and optional
	//	'}';
	public SourceElements getSourceAccess() {
		return pSource;
	}
	
	public ParserRule getSourceRule() {
		return getSourceAccess().getRule();
	}
	
	//Filter:
	//	'filter' name=ID '{'
	//	'in:' inType=Type
	//	'out:' outType=Type ('method:' method=STRING ('.' STRING)*)? //default and optional
	//	'}';
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//Sink:
	//	'sink' name=ID '{'
	//	'in:' inType=Type ('output-method:' method=STRING ('.' STRING)*)? //default and optional
	//	'}';
	public SinkElements getSinkAccess() {
		return pSink;
	}
	
	public ParserRule getSinkRule() {
		return getSinkAccess().getRule();
	}
	
	//Instance:
	//	'inst:' component=[Component] name=ID ('call:' method=STRING ('.' STRING)* | 'args:' args+=STRING*)?;
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}
	
	//Transition:
	//	source=[Component] "=>" target=[Component];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
