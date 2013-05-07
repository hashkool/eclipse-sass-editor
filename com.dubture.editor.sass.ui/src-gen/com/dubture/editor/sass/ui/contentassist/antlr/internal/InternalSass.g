/*
* generated by Xtext
*/
grammar InternalSass;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.dubture.editor.sass.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.dubture.editor.sass.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.dubture.editor.sass.services.SassGrammarAccess;

}

@parser::members {
 
 	private SassGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SassGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleSass
entryRuleSass 
:
{ before(grammarAccess.getSassRule()); }
	 ruleSass
{ after(grammarAccess.getSassRule()); } 
	 EOF 
;

// Rule Sass
ruleSass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSassAccess().getGroup()); }
(rule__Sass__Group__0)
{ after(grammarAccess.getSassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration 
:
{ before(grammarAccess.getVariableDeclarationRule()); }
	 ruleVariableDeclaration
{ after(grammarAccess.getVariableDeclarationRule()); } 
	 EOF 
;

// Rule VariableDeclaration
ruleVariableDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableDeclarationAccess().getGroup()); }
(rule__VariableDeclaration__Group__0)
{ after(grammarAccess.getVariableDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRule
entryRuleRule 
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleAccess().getGroup()); }
(rule__Rule__Group__0)
{ after(grammarAccess.getRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRuleHead
entryRuleRuleHead 
:
{ before(grammarAccess.getRuleHeadRule()); }
	 ruleRuleHead
{ after(grammarAccess.getRuleHeadRule()); } 
	 EOF 
;

// Rule RuleHead
ruleRuleHead
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleHeadAccess().getGroup()); }
(rule__RuleHead__Group__0)
{ after(grammarAccess.getRuleHeadAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRuleBody
entryRuleRuleBody 
:
{ before(grammarAccess.getRuleBodyRule()); }
	 ruleRuleBody
{ after(grammarAccess.getRuleBodyRule()); } 
	 EOF 
;

// Rule RuleBody
ruleRuleBody
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleBodyAccess().getAlternatives()); }
(rule__RuleBody__Alternatives)*
{ after(grammarAccess.getRuleBodyAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePropertyDeclaration
entryRulePropertyDeclaration 
:
{ before(grammarAccess.getPropertyDeclarationRule()); }
	 rulePropertyDeclaration
{ after(grammarAccess.getPropertyDeclarationRule()); } 
	 EOF 
;

// Rule PropertyDeclaration
rulePropertyDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getGroup()); }
(rule__PropertyDeclaration__Group__0)
{ after(grammarAccess.getPropertyDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCharset
entryRuleCharset 
:
{ before(grammarAccess.getCharsetRule()); }
	 ruleCharset
{ after(grammarAccess.getCharsetRule()); } 
	 EOF 
;

// Rule Charset
ruleCharset
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCharsetAccess().getGroup()); }
(rule__Charset__Group__0)
{ after(grammarAccess.getCharsetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInclude
entryRuleInclude 
:
{ before(grammarAccess.getIncludeRule()); }
	 ruleInclude
{ after(grammarAccess.getIncludeRule()); } 
	 EOF 
;

// Rule Include
ruleInclude
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIncludeAccess().getGroup()); }
(rule__Include__Group__0)
{ after(grammarAccess.getIncludeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMixin
entryRuleMixin 
:
{ before(grammarAccess.getMixinRule()); }
	 ruleMixin
{ after(grammarAccess.getMixinRule()); } 
	 EOF 
;

// Rule Mixin
ruleMixin
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMixinAccess().getGroup()); }
(rule__Mixin__Group__0)
{ after(grammarAccess.getMixinAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSelector
entryRuleSelector 
:
{ before(grammarAccess.getSelectorRule()); }
	 ruleSelector
{ after(grammarAccess.getSelectorRule()); } 
	 EOF 
;

// Rule Selector
ruleSelector
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSelectorAccess().getAlternatives()); }
(rule__Selector__Alternatives)
{ after(grammarAccess.getSelectorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariable
entryRuleVariable 
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableAccess().getGroup()); }
(rule__Variable__Group__0)
{ after(grammarAccess.getVariableAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Rule__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); }
	ruleRuleHead
{ after(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); }
	ruleMixin
{ after(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); }
	rulePropertyDeclaration
{ after(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); }
	ruleInclude
{ after(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); }
	ruleRule
{ after(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); }
(rule__PropertyDeclaration__Group_2_0__0)
{ after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); }
)

    |(
{ before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); }
(rule__PropertyDeclaration__Group_2_1__0)
{ after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Alternatives_2_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); }
	RULE_WORD
{ after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); }
)

    |(
{ before(grammarAccess.getPropertyDeclarationAccess().getVariableParserRuleCall_2_0_0_1()); }
	ruleVariable
{ after(grammarAccess.getPropertyDeclarationAccess().getVariableParserRuleCall_2_0_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getGroup_0()); }
(rule__Selector__Group_0__0)
{ after(grammarAccess.getSelectorAccess().getGroup_0()); }
)

    |(
(
{ before(grammarAccess.getSelectorAccess().getGroup_1()); }
(rule__Selector__Group_1__0)
{ after(grammarAccess.getSelectorAccess().getGroup_1()); }
)
(
{ before(grammarAccess.getSelectorAccess().getGroup_1()); }
(rule__Selector__Group_1__0)*
{ after(grammarAccess.getSelectorAccess().getGroup_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Alternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getSHARPTerminalRuleCall_1_0_0()); }
	RULE_SHARP
{ after(grammarAccess.getSelectorAccess().getSHARPTerminalRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getSelectorAccess().getDOTTerminalRuleCall_1_0_1()); }
	RULE_DOT
{ after(grammarAccess.getSelectorAccess().getDOTTerminalRuleCall_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Sass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sass__Group__0__Impl
	rule__Sass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSassAccess().getSassAction_0()); }
(

)
{ after(grammarAccess.getSassAccess().getSassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sass__Group__1__Impl
	rule__Sass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); }
(	ruleCharset)?
{ after(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sass__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sass__Group__2__Impl
	rule__Sass__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sass__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); }
(	ruleVariableDeclaration)*
{ after(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sass__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sass__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sass__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSassAccess().getStatementsAssignment_3()); }
(rule__Sass__StatementsAssignment_3)*
{ after(grammarAccess.getSassAccess().getStatementsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__VariableDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDeclaration__Group__0__Impl
	rule__VariableDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0()); }
	ruleVariable
{ after(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDeclaration__Group__1__Impl
	rule__VariableDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); }
	RULE_COLON
{ after(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableDeclaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDeclaration__Group__2__Impl
	rule__VariableDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDeclaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); }
	RULE_WORD
{ after(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableDeclaration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDeclaration__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDeclaration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); }
	RULE_SEMI_COLON
{ after(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Rule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getAlternatives_0()); }
(rule__Rule__Alternatives_0)
{ after(grammarAccess.getRuleAccess().getAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); }
	RULE_BRACE_LEFT
{ after(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); }
	ruleRuleBody
{ after(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); }
	RULE_BRACE_RIGHT
{ after(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__RuleHead__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleHead__Group__0__Impl
	rule__RuleHead__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleHead__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_0()); }
	ruleSelector
{ after(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleHead__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleHead__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleHead__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleHeadAccess().getGroup_1()); }
(rule__RuleHead__Group_1__0)*
{ after(grammarAccess.getRuleHeadAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RuleHead__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleHead__Group_1__0__Impl
	rule__RuleHead__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleHead__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); }
	RULE_COMMA
{ after(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RuleHead__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RuleHead__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleHead__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_1_1()); }
	ruleSelector
{ after(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PropertyDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group__0__Impl
	rule__PropertyDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); }
	RULE_WORD
{ after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group__1__Impl
	rule__PropertyDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); }
	RULE_COLON
{ after(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDeclaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); }
(rule__PropertyDeclaration__Alternatives_2)
{ after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__PropertyDeclaration__Group_2_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group_2_0__0__Impl
	rule__PropertyDeclaration__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group_2_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); }
(rule__PropertyDeclaration__Alternatives_2_0_0)
{ after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); }
)
(
{ before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); }
(rule__PropertyDeclaration__Alternatives_2_0_0)*
{ after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDeclaration__Group_2_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group_2_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); }
	RULE_SEMI_COLON
{ after(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PropertyDeclaration__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group_2_1__0__Impl
	rule__PropertyDeclaration__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); }
	RULE_BRACE_LEFT
{ after(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDeclaration__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group_2_1__1__Impl
	rule__PropertyDeclaration__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); }
(	rulePropertyDeclaration)*
{ after(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDeclaration__Group_2_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PropertyDeclaration__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDeclaration__Group_2_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); }
	RULE_BRACE_RIGHT
{ after(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Charset__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Charset__Group__0__Impl
	rule__Charset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Charset__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); }
	RULE_CHARSET_ID
{ after(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Charset__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Charset__Group__1__Impl
	rule__Charset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Charset__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Charset__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Charset__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Charset__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); }
	RULE_SEMI_COLON
{ after(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Include__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Include__Group__0__Impl
	rule__Include__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Include__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); }
	RULE_INCLUDE_ID
{ after(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Include__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Include__Group__1__Impl
	rule__Include__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Include__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); }
	RULE_WORD
{ after(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Include__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Include__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Include__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); }
	RULE_SEMI_COLON
{ after(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Mixin__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group__0__Impl
	rule__Mixin__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); }
	RULE_MIXIN_ID
{ after(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mixin__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group__1__Impl
	rule__Mixin__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); }
	RULE_WORD
{ after(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mixin__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getGroup_2()); }
(rule__Mixin__Group_2__0)?
{ after(grammarAccess.getMixinAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Mixin__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group_2__0__Impl
	rule__Mixin__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); }
	RULE_PAREN_LEFT
{ after(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mixin__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group_2__1__Impl
	rule__Mixin__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getVariableParserRuleCall_2_1()); }
	ruleVariable
{ after(grammarAccess.getMixinAccess().getVariableParserRuleCall_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mixin__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mixin__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mixin__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); }
	RULE_PAREN_RIGHT
{ after(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Selector__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Selector__Group_0__0__Impl
	rule__Selector__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getAMPTerminalRuleCall_0_0()); }
	RULE_AMP
{ after(grammarAccess.getSelectorAccess().getAMPTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Selector__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Selector__Group_0__1__Impl
	rule__Selector__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getCOLONTerminalRuleCall_0_1()); }
	RULE_COLON
{ after(grammarAccess.getSelectorAccess().getCOLONTerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Selector__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Selector__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_0_2()); }
	RULE_WORD
{ after(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Selector__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Selector__Group_1__0__Impl
	rule__Selector__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getAlternatives_1_0()); }
(rule__Selector__Alternatives_1_0)?
{ after(grammarAccess.getSelectorAccess().getAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Selector__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Selector__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_1_1()); }
	RULE_WORD
{ after(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Variable__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getDOLLARTerminalRuleCall_0()); }
	RULE_DOLLAR
{ after(grammarAccess.getVariableAccess().getDOLLARTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getWORDTerminalRuleCall_1()); }
	RULE_WORD
{ after(grammarAccess.getVariableAccess().getWORDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Sass__StatementsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); }
	ruleRule{ after(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_DOT : '.';

RULE_COMMA : ',';

RULE_SHARP : '#';

RULE_COLON : ':';

RULE_SEMI_COLON : ';';

RULE_PAREN_LEFT : '(';

RULE_PAREN_RIGHT : ')';

RULE_BRACE_LEFT : '{';

RULE_BRACE_RIGHT : '}';

RULE_DOLLAR : '$';

RULE_AMP : '&';

RULE_CHARSET_ID : '@charset ';

RULE_INCLUDE_ID : '@include ';

RULE_MIXIN_ID : '@mixin ';

RULE_WORD : ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'%')+;

RULE_INT : 'INT has been deactivated';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


