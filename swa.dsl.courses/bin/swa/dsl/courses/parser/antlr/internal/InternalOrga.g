/*
 * generated by Xtext 2.32.0
 */
grammar InternalOrga;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package swa.dsl.courses.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package swa.dsl.courses.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import swa.dsl.courses.services.OrgaGrammarAccess;

}

@parser::members {

 	private OrgaGrammarAccess grammarAccess;

    public InternalOrgaParser(TokenStream input, OrgaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected OrgaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
			}
			lv_declarations_0_0=ruleDeclaration
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"declarations",
					lv_declarations_0_0,
					"swa.dsl.courses.Orga.Declaration");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDeclarationAccess().getCourseParserRuleCall());
	}
	this_Course_0=ruleCourse
	{
		$current = $this_Course_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleCourse
entryRuleCourse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCourseRule()); }
	iv_ruleCourse=ruleCourse
	{ $current=$iv_ruleCourse.current; }
	EOF;

// Rule Course
ruleCourse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Course'
		{
			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
		}
		(
			(
				lv_title_1_0=RULE_STRING
				{
					newLeafNode(lv_title_1_0, grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCourseRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='teached'
		{
			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getTeachedKeyword_2());
		}
		otherlv_3='by'
		{
			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getByKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_4_0());
				}
				lv_teachers_4_0=ruleTeacher
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCourseRule());
					}
					add(
						$current,
						"teachers",
						lv_teachers_4_0,
						"swa.dsl.courses.Orga.Teacher");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='visited'
		{
			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getVisitedKeyword_5());
		}
		otherlv_6='by'
		{
			newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getByKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_7_0());
				}
				lv_students_7_0=ruleStudent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCourseRule());
					}
					add(
						$current,
						"students",
						lv_students_7_0,
						"swa.dsl.courses.Orga.Student");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleTeacher
entryRuleTeacher returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTeacherRule()); }
	iv_ruleTeacher=ruleTeacher
	{ $current=$iv_ruleTeacher.current; }
	EOF;

// Rule Teacher
ruleTeacher returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTeacherRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleStudent
entryRuleStudent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStudentRule()); }
	iv_ruleStudent=ruleStudent
	{ $current=$iv_ruleStudent.current; }
	EOF;

// Rule Student
ruleStudent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStudentRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
