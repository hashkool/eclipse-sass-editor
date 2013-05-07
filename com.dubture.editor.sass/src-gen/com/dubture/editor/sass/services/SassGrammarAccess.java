/*
* generated by Xtext
*/
package com.dubture.editor.sass.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SassGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSassAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cCharsetParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cVariableDeclarationParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsRuleParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		
		//Sass:
		//	{Sass} Charset? VariableDeclaration* statements+=Rule*;
		public ParserRule getRule() { return rule; }

		//{Sass} Charset? VariableDeclaration* statements+=Rule*
		public Group getGroup() { return cGroup; }

		//{Sass}
		public Action getSassAction_0() { return cSassAction_0; }

		//Charset?
		public RuleCall getCharsetParserRuleCall_1() { return cCharsetParserRuleCall_1; }

		//VariableDeclaration*
		public RuleCall getVariableDeclarationParserRuleCall_2() { return cVariableDeclarationParserRuleCall_2; }

		//statements+=Rule*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }

		//Rule
		public RuleCall getStatementsRuleParserRuleCall_3_0() { return cStatementsRuleParserRuleCall_3_0; }
	}

	public class CharsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Charset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCHARSET_IDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSEMI_COLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Charset:
		//	CHARSET_ID STRING SEMI_COLON;
		public ParserRule getRule() { return rule; }

		//CHARSET_ID STRING SEMI_COLON
		public Group getGroup() { return cGroup; }

		//CHARSET_ID
		public RuleCall getCHARSET_IDTerminalRuleCall_0() { return cCHARSET_IDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }

		//SEMI_COLON
		public RuleCall getSEMI_COLONTerminalRuleCall_2() { return cSEMI_COLONTerminalRuleCall_2; }
	}

	public class IncludeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Include");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINCLUDE_IDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSEMI_COLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Include:
		//	INCLUDE_ID WORD SEMI_COLON;
		public ParserRule getRule() { return rule; }

		//INCLUDE_ID WORD SEMI_COLON
		public Group getGroup() { return cGroup; }

		//INCLUDE_ID
		public RuleCall getINCLUDE_IDTerminalRuleCall_0() { return cINCLUDE_IDTerminalRuleCall_0; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_1() { return cWORDTerminalRuleCall_1; }

		//SEMI_COLON
		public RuleCall getSEMI_COLONTerminalRuleCall_2() { return cSEMI_COLONTerminalRuleCall_2; }
	}

	public class VariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVARIABLETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSEMI_COLONTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//VariableDeclaration:
		//	VARIABLE COLON WORD SEMI_COLON;
		public ParserRule getRule() { return rule; }

		//VARIABLE COLON WORD SEMI_COLON
		public Group getGroup() { return cGroup; }

		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_0() { return cVARIABLETerminalRuleCall_0; }

		//COLON
		public RuleCall getCOLONTerminalRuleCall_1() { return cCOLONTerminalRuleCall_1; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_2() { return cWORDTerminalRuleCall_2; }

		//SEMI_COLON
		public RuleCall getSEMI_COLONTerminalRuleCall_3() { return cSEMI_COLONTerminalRuleCall_3; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cRuleHeadParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cMixinParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cBRACE_LEFTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cRuleBodyParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cBRACE_RIGHTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Rule:
		//	(RuleHead | Mixin) BRACE_LEFT RuleBody BRACE_RIGHT;
		public ParserRule getRule() { return rule; }

		//(RuleHead | Mixin) BRACE_LEFT RuleBody BRACE_RIGHT
		public Group getGroup() { return cGroup; }

		//RuleHead | Mixin
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//RuleHead
		public RuleCall getRuleHeadParserRuleCall_0_0() { return cRuleHeadParserRuleCall_0_0; }

		//Mixin
		public RuleCall getMixinParserRuleCall_0_1() { return cMixinParserRuleCall_0_1; }

		//BRACE_LEFT
		public RuleCall getBRACE_LEFTTerminalRuleCall_1() { return cBRACE_LEFTTerminalRuleCall_1; }

		//RuleBody
		public RuleCall getRuleBodyParserRuleCall_2() { return cRuleBodyParserRuleCall_2; }

		//BRACE_RIGHT
		public RuleCall getBRACE_RIGHTTerminalRuleCall_3() { return cBRACE_RIGHTTerminalRuleCall_3; }
	}

	public class RuleHeadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleHead");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSELECTORTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cSELECTORTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//RuleHead:
		//	SELECTOR (COMMA SELECTOR)*;
		public ParserRule getRule() { return rule; }

		//SELECTOR (COMMA SELECTOR)*
		public Group getGroup() { return cGroup; }

		//SELECTOR
		public RuleCall getSELECTORTerminalRuleCall_0() { return cSELECTORTerminalRuleCall_0; }

		//(COMMA SELECTOR)*
		public Group getGroup_1() { return cGroup_1; }

		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_0() { return cCOMMATerminalRuleCall_1_0; }

		//SELECTOR
		public RuleCall getSELECTORTerminalRuleCall_1_1() { return cSELECTORTerminalRuleCall_1_1; }
	}

	public class RuleBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleBody");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIncludeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//RuleBody:
		//	(PropertyDeclaration | Include | Rule)*;
		public ParserRule getRule() { return rule; }

		//(PropertyDeclaration | Include | Rule)*
		public Alternatives getAlternatives() { return cAlternatives; }

		//PropertyDeclaration
		public RuleCall getPropertyDeclarationParserRuleCall_0() { return cPropertyDeclarationParserRuleCall_0; }

		//Include
		public RuleCall getIncludeParserRuleCall_1() { return cIncludeParserRuleCall_1; }

		//Rule
		public RuleCall getRuleParserRuleCall_2() { return cRuleParserRuleCall_2; }
	}

	public class PropertyDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Alternatives cAlternatives_2_0_0 = (Alternatives)cGroup_2_0.eContents().get(0);
		private final RuleCall cWORDTerminalRuleCall_2_0_0_0 = (RuleCall)cAlternatives_2_0_0.eContents().get(0);
		private final RuleCall cVARIABLETerminalRuleCall_2_0_0_1 = (RuleCall)cAlternatives_2_0_0.eContents().get(1);
		private final RuleCall cSEMI_COLONTerminalRuleCall_2_0_1 = (RuleCall)cGroup_2_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cBRACE_LEFTTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final RuleCall cPropertyDeclarationParserRuleCall_2_1_1 = (RuleCall)cGroup_2_1.eContents().get(1);
		private final RuleCall cBRACE_RIGHTTerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//PropertyDeclaration:
		//	WORD COLON ((WORD | VARIABLE)+ SEMI_COLON | BRACE_LEFT PropertyDeclaration* BRACE_RIGHT);
		public ParserRule getRule() { return rule; }

		//WORD COLON ((WORD | VARIABLE)+ SEMI_COLON | BRACE_LEFT PropertyDeclaration* BRACE_RIGHT)
		public Group getGroup() { return cGroup; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_0() { return cWORDTerminalRuleCall_0; }

		//COLON
		public RuleCall getCOLONTerminalRuleCall_1() { return cCOLONTerminalRuleCall_1; }

		//(WORD | VARIABLE)+ SEMI_COLON | BRACE_LEFT PropertyDeclaration* BRACE_RIGHT
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//(WORD | VARIABLE)+ SEMI_COLON
		public Group getGroup_2_0() { return cGroup_2_0; }

		//(WORD | VARIABLE)+
		public Alternatives getAlternatives_2_0_0() { return cAlternatives_2_0_0; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_2_0_0_0() { return cWORDTerminalRuleCall_2_0_0_0; }

		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_2_0_0_1() { return cVARIABLETerminalRuleCall_2_0_0_1; }

		//SEMI_COLON
		public RuleCall getSEMI_COLONTerminalRuleCall_2_0_1() { return cSEMI_COLONTerminalRuleCall_2_0_1; }

		//BRACE_LEFT PropertyDeclaration* BRACE_RIGHT
		public Group getGroup_2_1() { return cGroup_2_1; }

		//BRACE_LEFT
		public RuleCall getBRACE_LEFTTerminalRuleCall_2_1_0() { return cBRACE_LEFTTerminalRuleCall_2_1_0; }

		//PropertyDeclaration*
		public RuleCall getPropertyDeclarationParserRuleCall_2_1_1() { return cPropertyDeclarationParserRuleCall_2_1_1; }

		//BRACE_RIGHT
		public RuleCall getBRACE_RIGHTTerminalRuleCall_2_1_2() { return cBRACE_RIGHTTerminalRuleCall_2_1_2; }
	}

	public class MixinElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mixin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMIXIN_IDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cPAREN_LEFTTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cVARIABLETerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cPAREN_RIGHTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//Mixin:
		//	MIXIN_ID WORD (PAREN_LEFT VARIABLE PAREN_RIGHT)?;
		public ParserRule getRule() { return rule; }

		//MIXIN_ID WORD (PAREN_LEFT VARIABLE PAREN_RIGHT)?
		public Group getGroup() { return cGroup; }

		//MIXIN_ID
		public RuleCall getMIXIN_IDTerminalRuleCall_0() { return cMIXIN_IDTerminalRuleCall_0; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_1() { return cWORDTerminalRuleCall_1; }

		//(PAREN_LEFT VARIABLE PAREN_RIGHT)?
		public Group getGroup_2() { return cGroup_2; }

		//PAREN_LEFT
		public RuleCall getPAREN_LEFTTerminalRuleCall_2_0() { return cPAREN_LEFTTerminalRuleCall_2_0; }

		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_2_1() { return cVARIABLETerminalRuleCall_2_1; }

		//PAREN_RIGHT
		public RuleCall getPAREN_RIGHTTerminalRuleCall_2_2() { return cPAREN_RIGHTTerminalRuleCall_2_2; }
	}
	
	
	private SassElements pSass;
	private CharsetElements pCharset;
	private IncludeElements pInclude;
	private VariableDeclarationElements pVariableDeclaration;
	private RuleElements pRule;
	private RuleHeadElements pRuleHead;
	private RuleBodyElements pRuleBody;
	private PropertyDeclarationElements pPropertyDeclaration;
	private MixinElements pMixin;
	private TerminalRule tDOT;
	private TerminalRule tCOMMA;
	private TerminalRule tSHARP;
	private TerminalRule tCOLON;
	private TerminalRule tSEMI_COLON;
	private TerminalRule tPAREN_LEFT;
	private TerminalRule tPAREN_RIGHT;
	private TerminalRule tBRACE_LEFT;
	private TerminalRule tBRACE_RIGHT;
	private TerminalRule tDOLLAR;
	private TerminalRule tAMP;
	private TerminalRule tCHARSET_ID;
	private TerminalRule tINCLUDE_ID;
	private TerminalRule tMIXIN_ID;
	private TerminalRule tWORD;
	private TerminalRule tVARIABLE;
	private TerminalRule tSELECTOR;
	private TerminalRule tINT;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SassGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.dubture.editor.sass.Sass".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Sass:
	//	{Sass} Charset? VariableDeclaration* statements+=Rule*;
	public SassElements getSassAccess() {
		return (pSass != null) ? pSass : (pSass = new SassElements());
	}
	
	public ParserRule getSassRule() {
		return getSassAccess().getRule();
	}

	//Charset:
	//	CHARSET_ID STRING SEMI_COLON;
	public CharsetElements getCharsetAccess() {
		return (pCharset != null) ? pCharset : (pCharset = new CharsetElements());
	}
	
	public ParserRule getCharsetRule() {
		return getCharsetAccess().getRule();
	}

	//Include:
	//	INCLUDE_ID WORD SEMI_COLON;
	public IncludeElements getIncludeAccess() {
		return (pInclude != null) ? pInclude : (pInclude = new IncludeElements());
	}
	
	public ParserRule getIncludeRule() {
		return getIncludeAccess().getRule();
	}

	//VariableDeclaration:
	//	VARIABLE COLON WORD SEMI_COLON;
	public VariableDeclarationElements getVariableDeclarationAccess() {
		return (pVariableDeclaration != null) ? pVariableDeclaration : (pVariableDeclaration = new VariableDeclarationElements());
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}

	//Rule:
	//	(RuleHead | Mixin) BRACE_LEFT RuleBody BRACE_RIGHT;
	public RuleElements getRuleAccess() {
		return (pRule != null) ? pRule : (pRule = new RuleElements());
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//RuleHead:
	//	SELECTOR (COMMA SELECTOR)*;
	public RuleHeadElements getRuleHeadAccess() {
		return (pRuleHead != null) ? pRuleHead : (pRuleHead = new RuleHeadElements());
	}
	
	public ParserRule getRuleHeadRule() {
		return getRuleHeadAccess().getRule();
	}

	//RuleBody:
	//	(PropertyDeclaration | Include | Rule)*;
	public RuleBodyElements getRuleBodyAccess() {
		return (pRuleBody != null) ? pRuleBody : (pRuleBody = new RuleBodyElements());
	}
	
	public ParserRule getRuleBodyRule() {
		return getRuleBodyAccess().getRule();
	}

	//PropertyDeclaration:
	//	WORD COLON ((WORD | VARIABLE)+ SEMI_COLON | BRACE_LEFT PropertyDeclaration* BRACE_RIGHT);
	public PropertyDeclarationElements getPropertyDeclarationAccess() {
		return (pPropertyDeclaration != null) ? pPropertyDeclaration : (pPropertyDeclaration = new PropertyDeclarationElements());
	}
	
	public ParserRule getPropertyDeclarationRule() {
		return getPropertyDeclarationAccess().getRule();
	}

	//Mixin:
	//	MIXIN_ID WORD (PAREN_LEFT VARIABLE PAREN_RIGHT)?;
	public MixinElements getMixinAccess() {
		return (pMixin != null) ? pMixin : (pMixin = new MixinElements());
	}
	
	public ParserRule getMixinRule() {
		return getMixinAccess().getRule();
	}

	//terminal DOT:
	//	".";
	public TerminalRule getDOTRule() {
		return (tDOT != null) ? tDOT : (tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOT"));
	} 

	//terminal COMMA:
	//	",";
	public TerminalRule getCOMMARule() {
		return (tCOMMA != null) ? tCOMMA : (tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMMA"));
	} 

	//terminal SHARP:
	//	"#";
	public TerminalRule getSHARPRule() {
		return (tSHARP != null) ? tSHARP : (tSHARP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SHARP"));
	} 

	//terminal COLON:
	//	":";
	public TerminalRule getCOLONRule() {
		return (tCOLON != null) ? tCOLON : (tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COLON"));
	} 

	//terminal SEMI_COLON:
	//	";";
	public TerminalRule getSEMI_COLONRule() {
		return (tSEMI_COLON != null) ? tSEMI_COLON : (tSEMI_COLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SEMI_COLON"));
	} 

	//terminal PAREN_LEFT:
	//	"(";
	public TerminalRule getPAREN_LEFTRule() {
		return (tPAREN_LEFT != null) ? tPAREN_LEFT : (tPAREN_LEFT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PAREN_LEFT"));
	} 

	//terminal PAREN_RIGHT:
	//	")";
	public TerminalRule getPAREN_RIGHTRule() {
		return (tPAREN_RIGHT != null) ? tPAREN_RIGHT : (tPAREN_RIGHT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PAREN_RIGHT"));
	} 

	//terminal BRACE_LEFT:
	//	"{";
	public TerminalRule getBRACE_LEFTRule() {
		return (tBRACE_LEFT != null) ? tBRACE_LEFT : (tBRACE_LEFT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BRACE_LEFT"));
	} 

	//terminal BRACE_RIGHT:
	//	"}";
	public TerminalRule getBRACE_RIGHTRule() {
		return (tBRACE_RIGHT != null) ? tBRACE_RIGHT : (tBRACE_RIGHT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BRACE_RIGHT"));
	} 

	//terminal DOLLAR:
	//	"$";
	public TerminalRule getDOLLARRule() {
		return (tDOLLAR != null) ? tDOLLAR : (tDOLLAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOLLAR"));
	} 

	//terminal AMP:
	//	"&";
	public TerminalRule getAMPRule() {
		return (tAMP != null) ? tAMP : (tAMP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AMP"));
	} 

	//terminal CHARSET_ID:
	//	"@charset ";
	public TerminalRule getCHARSET_IDRule() {
		return (tCHARSET_ID != null) ? tCHARSET_ID : (tCHARSET_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CHARSET_ID"));
	} 

	//terminal INCLUDE_ID:
	//	"@include ";
	public TerminalRule getINCLUDE_IDRule() {
		return (tINCLUDE_ID != null) ? tINCLUDE_ID : (tINCLUDE_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INCLUDE_ID"));
	} 

	//terminal MIXIN_ID:
	//	"@mixin ";
	public TerminalRule getMIXIN_IDRule() {
		return (tMIXIN_ID != null) ? tMIXIN_ID : (tMIXIN_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "MIXIN_ID"));
	} 

	//terminal WORD:
	//	("a".."z" | "A".."Z" | "0".."9" | "-" | "%")+;
	public TerminalRule getWORDRule() {
		return (tWORD != null) ? tWORD : (tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WORD"));
	} 

	//terminal VARIABLE:
	//	DOLLAR WORD;
	public TerminalRule getVARIABLERule() {
		return (tVARIABLE != null) ? tVARIABLE : (tVARIABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VARIABLE"));
	} 

	//terminal SELECTOR:
	//	AMP COLON WORD | ((SHARP | DOT)? WORD)+;
	public TerminalRule getSELECTORRule() {
		return (tSELECTOR != null) ? tSELECTOR : (tSELECTOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SELECTOR"));
	} 

	/// *Deactivate INT to prevent warnings * / terminal INT returns ecore::EInt:
	//	"INT has been deactivated";
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
