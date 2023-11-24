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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrgaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Course'", "'teached'", "'by'", "'visited'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOrgaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOrgaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOrgaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOrga.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalOrga.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOrga.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOrga.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOrga.g:71:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalOrga.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalOrga.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOrga.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalOrga.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalOrga.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
            	    					"swa.dsl.courses.Orga.Declaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalOrga.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalOrga.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalOrga.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalOrga.g:107:1: ruleDeclaration returns [EObject current=null] : this_Course_0= ruleCourse ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Course_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:113:2: (this_Course_0= ruleCourse )
            // InternalOrga.g:114:2: this_Course_0= ruleCourse
            {

            		newCompositeNode(grammarAccess.getDeclarationAccess().getCourseParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Course_0=ruleCourse();

            state._fsp--;


            		current = this_Course_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleCourse"
    // InternalOrga.g:125:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalOrga.g:125:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalOrga.g:126:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalOrga.g:132:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'teached' otherlv_3= 'by' ( (lv_teachers_4_0= ruleTeacher ) )+ otherlv_5= 'visited' otherlv_6= 'by' ( (lv_students_7_0= ruleStudent ) )+ ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_teachers_4_0 = null;

        EObject lv_students_7_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:138:2: ( (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'teached' otherlv_3= 'by' ( (lv_teachers_4_0= ruleTeacher ) )+ otherlv_5= 'visited' otherlv_6= 'by' ( (lv_students_7_0= ruleStudent ) )+ ) )
            // InternalOrga.g:139:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'teached' otherlv_3= 'by' ( (lv_teachers_4_0= ruleTeacher ) )+ otherlv_5= 'visited' otherlv_6= 'by' ( (lv_students_7_0= ruleStudent ) )+ )
            {
            // InternalOrga.g:139:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'teached' otherlv_3= 'by' ( (lv_teachers_4_0= ruleTeacher ) )+ otherlv_5= 'visited' otherlv_6= 'by' ( (lv_students_7_0= ruleStudent ) )+ )
            // InternalOrga.g:140:3: otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'teached' otherlv_3= 'by' ( (lv_teachers_4_0= ruleTeacher ) )+ otherlv_5= 'visited' otherlv_6= 'by' ( (lv_students_7_0= ruleStudent ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalOrga.g:144:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalOrga.g:145:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalOrga.g:145:4: (lv_title_1_0= RULE_STRING )
            // InternalOrga.g:146:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_title_1_0, grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getTeachedKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getByKeyword_3());
            		
            // InternalOrga.g:170:3: ( (lv_teachers_4_0= ruleTeacher ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOrga.g:171:4: (lv_teachers_4_0= ruleTeacher )
            	    {
            	    // InternalOrga.g:171:4: (lv_teachers_4_0= ruleTeacher )
            	    // InternalOrga.g:172:5: lv_teachers_4_0= ruleTeacher
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_teachers_4_0=ruleTeacher();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teachers",
            	    						lv_teachers_4_0,
            	    						"swa.dsl.courses.Orga.Teacher");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getVisitedKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getByKeyword_6());
            		
            // InternalOrga.g:197:3: ( (lv_students_7_0= ruleStudent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOrga.g:198:4: (lv_students_7_0= ruleStudent )
            	    {
            	    // InternalOrga.g:198:4: (lv_students_7_0= ruleStudent )
            	    // InternalOrga.g:199:5: lv_students_7_0= ruleStudent
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_students_7_0=ruleStudent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"students",
            	    						lv_students_7_0,
            	    						"swa.dsl.courses.Orga.Student");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleTeacher"
    // InternalOrga.g:220:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalOrga.g:220:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalOrga.g:221:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalOrga.g:227:1: ruleTeacher returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:233:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:234:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:234:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:235:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:235:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:236:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTeacherRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalOrga.g:255:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalOrga.g:255:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalOrga.g:256:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalOrga.g:262:1: ruleStudent returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:268:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:269:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:269:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:270:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:270:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:271:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStudentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStudent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});

}