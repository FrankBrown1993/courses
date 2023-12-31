/*
 * generated by Xtext 2.32.0
 */
grammar InternalOrga;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package swa.dsl.courses.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package swa.dsl.courses.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import swa.dsl.courses.services.OrgaGrammarAccess;

}
@parser::members {
	private OrgaGrammarAccess grammarAccess;

	public void setGrammarAccess(OrgaGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getDeclarationsAssignment()); }
		(rule__Model__DeclarationsAssignment)*
		{ after(grammarAccess.getModelAccess().getDeclarationsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getAlternatives()); }
		(rule__Declaration__Alternatives)
		{ after(grammarAccess.getDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCourse
entryRuleCourse
:
{ before(grammarAccess.getCourseRule()); }
	 ruleCourse
{ after(grammarAccess.getCourseRule()); } 
	 EOF 
;

// Rule Course
ruleCourse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCourseAccess().getGroup()); }
		(rule__Course__Group__0)
		{ after(grammarAccess.getCourseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTeacher
entryRuleTeacher
:
{ before(grammarAccess.getTeacherRule()); }
	 ruleTeacher
{ after(grammarAccess.getTeacherRule()); } 
	 EOF 
;

// Rule Teacher
ruleTeacher 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTeacherAccess().getNameAssignment()); }
		(rule__Teacher__NameAssignment)
		{ after(grammarAccess.getTeacherAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStudent
entryRuleStudent
:
{ before(grammarAccess.getStudentRule()); }
	 ruleStudent
{ after(grammarAccess.getStudentRule()); } 
	 EOF 
;

// Rule Student
ruleStudent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStudentAccess().getNameAssignment()); }
		(rule__Student__NameAssignment)
		{ after(grammarAccess.getStudentAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoom
entryRuleRoom
:
{ before(grammarAccess.getRoomRule()); }
	 ruleRoom
{ after(grammarAccess.getRoomRule()); } 
	 EOF 
;

// Rule Room
ruleRoom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoomAccess().getGroup()); }
		(rule__Room__Group__0)
		{ after(grammarAccess.getRoomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule AudienceSize
ruleAudienceSize
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAudienceSizeAccess().getAlternatives()); }
		(rule__AudienceSize__Alternatives)
		{ after(grammarAccess.getAudienceSizeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getCourseParserRuleCall_0()); }
		ruleCourse
		{ after(grammarAccess.getDeclarationAccess().getCourseParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getRoomParserRuleCall_1()); }
		ruleRoom
		{ after(grammarAccess.getDeclarationAccess().getRoomParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AudienceSize__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0()); }
		('small')
		{ after(grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1()); }
		('medium')
		{ after(grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2()); }
		('big')
		{ after(grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__0__Impl
	rule__Course__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getCourseKeyword_0()); }
	'Course'
	{ after(grammarAccess.getCourseAccess().getCourseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__1__Impl
	rule__Course__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getTitleAssignment_1()); }
	(rule__Course__TitleAssignment_1)
	{ after(grammarAccess.getCourseAccess().getTitleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__2__Impl
	rule__Course__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getMajorKeyword_2()); }
	'major'
	{ after(grammarAccess.getCourseAccess().getMajorKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__3__Impl
	rule__Course__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getMajorAssignment_3()); }
	(rule__Course__MajorAssignment_3)
	{ after(grammarAccess.getCourseAccess().getMajorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__4__Impl
	rule__Course__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getTypeKeyword_4()); }
	'type'
	{ after(grammarAccess.getCourseAccess().getTypeKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__5__Impl
	rule__Course__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getIsKeyword_5()); }
	'is'
	{ after(grammarAccess.getCourseAccess().getIsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__6__Impl
	rule__Course__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getTypeAssignment_6()); }
	(rule__Course__TypeAssignment_6)
	{ after(grammarAccess.getCourseAccess().getTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__7__Impl
	rule__Course__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getAudienceKeyword_7()); }
	'audience'
	{ after(grammarAccess.getCourseAccess().getAudienceKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__8__Impl
	rule__Course__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getIsKeyword_8()); }
	'is'
	{ after(grammarAccess.getCourseAccess().getIsKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__9__Impl
	rule__Course__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getAudienceAssignment_9()); }
	(rule__Course__AudienceAssignment_9)
	{ after(grammarAccess.getCourseAccess().getAudienceAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__10__Impl
	rule__Course__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getCourseKeyword_10()); }
	'course'
	{ after(grammarAccess.getCourseAccess().getCourseKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__11__Impl
	rule__Course__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getCategoryKeyword_11()); }
	'category'
	{ after(grammarAccess.getCourseAccess().getCategoryKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__12__Impl
	rule__Course__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getCourse_catAssignment_12()); }
	(rule__Course__Course_catAssignment_12)
	{ after(grammarAccess.getCourseAccess().getCourse_catAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__13__Impl
	rule__Course__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getTaughtKeyword_13()); }
	'taught'
	{ after(grammarAccess.getCourseAccess().getTaughtKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__14__Impl
	rule__Course__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getByKeyword_14()); }
	'by'
	{ after(grammarAccess.getCourseAccess().getByKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__15__Impl
	rule__Course__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCourseAccess().getTeachersAssignment_15()); }
		(rule__Course__TeachersAssignment_15)
		{ after(grammarAccess.getCourseAccess().getTeachersAssignment_15()); }
	)
	(
		{ before(grammarAccess.getCourseAccess().getTeachersAssignment_15()); }
		(rule__Course__TeachersAssignment_15)*
		{ after(grammarAccess.getCourseAccess().getTeachersAssignment_15()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__16__Impl
	rule__Course__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getVisitedKeyword_16()); }
	'visited'
	{ after(grammarAccess.getCourseAccess().getVisitedKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__17__Impl
	rule__Course__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getByKeyword_17()); }
	'by'
	{ after(grammarAccess.getCourseAccess().getByKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Course__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCourseAccess().getStudentsAssignment_18()); }
	(rule__Course__StudentsAssignment_18)*
	{ after(grammarAccess.getCourseAccess().getStudentsAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Room__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__0__Impl
	rule__Room__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getRoomKeyword_0()); }
	'Room'
	{ after(grammarAccess.getRoomAccess().getRoomKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__1__Impl
	rule__Room__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getLocationAssignment_1()); }
	(rule__Room__LocationAssignment_1)
	{ after(grammarAccess.getRoomAccess().getLocationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__2__Impl
	rule__Room__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getIsKeyword_2()); }
	'is'
	{ after(grammarAccess.getRoomAccess().getIsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getAudienceAssignment_3()); }
	(rule__Room__AudienceAssignment_3)
	{ after(grammarAccess.getRoomAccess().getAudienceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__DeclarationsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); }
		ruleDeclaration
		{ after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__TitleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__MajorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getMajorSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getCourseAccess().getMajorSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__TypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__AudienceAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getAudienceAudienceSizeEnumRuleCall_9_0()); }
		ruleAudienceSize
		{ after(grammarAccess.getCourseAccess().getAudienceAudienceSizeEnumRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__Course_catAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__TeachersAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_15_0()); }
		ruleTeacher
		{ after(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Course__StudentsAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_18_0()); }
		ruleStudent
		{ after(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Teacher__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Student__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__LocationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomAccess().getLocationSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRoomAccess().getLocationSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__AudienceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomAccess().getAudienceAudienceSizeEnumRuleCall_3_0()); }
		ruleAudienceSize
		{ after(grammarAccess.getRoomAccess().getAudienceAudienceSizeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
