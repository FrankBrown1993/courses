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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Course'", "'department'", "'is'", "'type'", "'audience'", "'course'", "'category'", "'teached'", "'by'", "'visited'", "'Room'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==11||LA1_0==21) ) {
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
    // InternalOrga.g:107:1: ruleDeclaration returns [EObject current=null] : (this_Course_0= ruleCourse | this_Room_1= ruleRoom ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Course_0 = null;

        EObject this_Room_1 = null;



        	enterRule();

        try {
            // InternalOrga.g:113:2: ( (this_Course_0= ruleCourse | this_Room_1= ruleRoom ) )
            // InternalOrga.g:114:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom )
            {
            // InternalOrga.g:114:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOrga.g:115:3: this_Course_0= ruleCourse
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getCourseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Course_0=ruleCourse();

                    state._fsp--;


                    			current = this_Course_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOrga.g:124:3: this_Room_1= ruleRoom
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRoomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Room_1=ruleRoom();

                    state._fsp--;


                    			current = this_Room_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleCourse"
    // InternalOrga.g:136:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalOrga.g:136:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalOrga.g:137:2: iv_ruleCourse= ruleCourse EOF
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
    // InternalOrga.g:143:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'department' otherlv_3= 'is' ( (lv_department_4_0= RULE_STRING ) ) otherlv_5= 'type' otherlv_6= 'is' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'audience' otherlv_9= 'is' ( (lv_audience_10_0= RULE_ID ) ) otherlv_11= 'course' otherlv_12= 'category' ( (lv_course_cat_13_0= RULE_STRING ) ) otherlv_14= 'teached' otherlv_15= 'by' ( (lv_teachers_16_0= ruleTeacher ) )+ otherlv_17= 'visited' otherlv_18= 'by' ( (lv_students_19_0= ruleStudent ) )+ ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_department_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_audience_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_course_cat_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_teachers_16_0 = null;

        EObject lv_students_19_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:149:2: ( (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'department' otherlv_3= 'is' ( (lv_department_4_0= RULE_STRING ) ) otherlv_5= 'type' otherlv_6= 'is' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'audience' otherlv_9= 'is' ( (lv_audience_10_0= RULE_ID ) ) otherlv_11= 'course' otherlv_12= 'category' ( (lv_course_cat_13_0= RULE_STRING ) ) otherlv_14= 'teached' otherlv_15= 'by' ( (lv_teachers_16_0= ruleTeacher ) )+ otherlv_17= 'visited' otherlv_18= 'by' ( (lv_students_19_0= ruleStudent ) )+ ) )
            // InternalOrga.g:150:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'department' otherlv_3= 'is' ( (lv_department_4_0= RULE_STRING ) ) otherlv_5= 'type' otherlv_6= 'is' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'audience' otherlv_9= 'is' ( (lv_audience_10_0= RULE_ID ) ) otherlv_11= 'course' otherlv_12= 'category' ( (lv_course_cat_13_0= RULE_STRING ) ) otherlv_14= 'teached' otherlv_15= 'by' ( (lv_teachers_16_0= ruleTeacher ) )+ otherlv_17= 'visited' otherlv_18= 'by' ( (lv_students_19_0= ruleStudent ) )+ )
            {
            // InternalOrga.g:150:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'department' otherlv_3= 'is' ( (lv_department_4_0= RULE_STRING ) ) otherlv_5= 'type' otherlv_6= 'is' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'audience' otherlv_9= 'is' ( (lv_audience_10_0= RULE_ID ) ) otherlv_11= 'course' otherlv_12= 'category' ( (lv_course_cat_13_0= RULE_STRING ) ) otherlv_14= 'teached' otherlv_15= 'by' ( (lv_teachers_16_0= ruleTeacher ) )+ otherlv_17= 'visited' otherlv_18= 'by' ( (lv_students_19_0= ruleStudent ) )+ )
            // InternalOrga.g:151:3: otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'department' otherlv_3= 'is' ( (lv_department_4_0= RULE_STRING ) ) otherlv_5= 'type' otherlv_6= 'is' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'audience' otherlv_9= 'is' ( (lv_audience_10_0= RULE_ID ) ) otherlv_11= 'course' otherlv_12= 'category' ( (lv_course_cat_13_0= RULE_STRING ) ) otherlv_14= 'teached' otherlv_15= 'by' ( (lv_teachers_16_0= ruleTeacher ) )+ otherlv_17= 'visited' otherlv_18= 'by' ( (lv_students_19_0= ruleStudent ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalOrga.g:155:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalOrga.g:156:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalOrga.g:156:4: (lv_title_1_0= RULE_STRING )
            // InternalOrga.g:157:5: lv_title_1_0= RULE_STRING
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

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getDepartmentKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getIsKeyword_3());
            		
            // InternalOrga.g:181:3: ( (lv_department_4_0= RULE_STRING ) )
            // InternalOrga.g:182:4: (lv_department_4_0= RULE_STRING )
            {
            // InternalOrga.g:182:4: (lv_department_4_0= RULE_STRING )
            // InternalOrga.g:183:5: lv_department_4_0= RULE_STRING
            {
            lv_department_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_department_4_0, grammarAccess.getCourseAccess().getDepartmentSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"department",
            						lv_department_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getIsKeyword_6());
            		
            // InternalOrga.g:207:3: ( (lv_type_7_0= RULE_STRING ) )
            // InternalOrga.g:208:4: (lv_type_7_0= RULE_STRING )
            {
            // InternalOrga.g:208:4: (lv_type_7_0= RULE_STRING )
            // InternalOrga.g:209:5: lv_type_7_0= RULE_STRING
            {
            lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_type_7_0, grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getAudienceKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getCourseAccess().getIsKeyword_9());
            		
            // InternalOrga.g:233:3: ( (lv_audience_10_0= RULE_ID ) )
            // InternalOrga.g:234:4: (lv_audience_10_0= RULE_ID )
            {
            // InternalOrga.g:234:4: (lv_audience_10_0= RULE_ID )
            // InternalOrga.g:235:5: lv_audience_10_0= RULE_ID
            {
            lv_audience_10_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_audience_10_0, grammarAccess.getCourseAccess().getAudienceIDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"audience",
            						lv_audience_10_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getCourseKeyword_11());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getCourseAccess().getCategoryKeyword_12());
            		
            // InternalOrga.g:259:3: ( (lv_course_cat_13_0= RULE_STRING ) )
            // InternalOrga.g:260:4: (lv_course_cat_13_0= RULE_STRING )
            {
            // InternalOrga.g:260:4: (lv_course_cat_13_0= RULE_STRING )
            // InternalOrga.g:261:5: lv_course_cat_13_0= RULE_STRING
            {
            lv_course_cat_13_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_course_cat_13_0, grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"course_cat",
            						lv_course_cat_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getCourseAccess().getTeachedKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getCourseAccess().getByKeyword_15());
            		
            // InternalOrga.g:285:3: ( (lv_teachers_16_0= ruleTeacher ) )+
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
            	    // InternalOrga.g:286:4: (lv_teachers_16_0= ruleTeacher )
            	    {
            	    // InternalOrga.g:286:4: (lv_teachers_16_0= ruleTeacher )
            	    // InternalOrga.g:287:5: lv_teachers_16_0= ruleTeacher
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_teachers_16_0=ruleTeacher();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teachers",
            	    						lv_teachers_16_0,
            	    						"swa.dsl.courses.Orga.Teacher");
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

            otherlv_17=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getCourseAccess().getVisitedKeyword_17());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getCourseAccess().getByKeyword_18());
            		
            // InternalOrga.g:312:3: ( (lv_students_19_0= ruleStudent ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOrga.g:313:4: (lv_students_19_0= ruleStudent )
            	    {
            	    // InternalOrga.g:313:4: (lv_students_19_0= ruleStudent )
            	    // InternalOrga.g:314:5: lv_students_19_0= ruleStudent
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_19_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_students_19_0=ruleStudent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"students",
            	    						lv_students_19_0,
            	    						"swa.dsl.courses.Orga.Student");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalOrga.g:335:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalOrga.g:335:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalOrga.g:336:2: iv_ruleTeacher= ruleTeacher EOF
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
    // InternalOrga.g:342:1: ruleTeacher returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:348:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:349:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:349:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:350:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:350:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:351:4: lv_name_0_0= RULE_STRING
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
    // InternalOrga.g:370:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalOrga.g:370:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalOrga.g:371:2: iv_ruleStudent= ruleStudent EOF
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
    // InternalOrga.g:377:1: ruleStudent returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:383:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:384:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:384:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:385:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:385:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:386:4: lv_name_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleRoom"
    // InternalOrga.g:405:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalOrga.g:405:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalOrga.g:406:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalOrga.g:412:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;
        Token otherlv_2=null;
        Token lv_audience_3_0=null;


        	enterRule();

        try {
            // InternalOrga.g:418:2: ( (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= RULE_ID ) ) ) )
            // InternalOrga.g:419:2: (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= RULE_ID ) ) )
            {
            // InternalOrga.g:419:2: (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= RULE_ID ) ) )
            // InternalOrga.g:420:3: otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalOrga.g:424:3: ( (lv_location_1_0= RULE_STRING ) )
            // InternalOrga.g:425:4: (lv_location_1_0= RULE_STRING )
            {
            // InternalOrga.g:425:4: (lv_location_1_0= RULE_STRING )
            // InternalOrga.g:426:5: lv_location_1_0= RULE_STRING
            {
            lv_location_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_location_1_0, grammarAccess.getRoomAccess().getLocationSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getIsKeyword_2());
            		
            // InternalOrga.g:446:3: ( (lv_audience_3_0= RULE_ID ) )
            // InternalOrga.g:447:4: (lv_audience_3_0= RULE_ID )
            {
            // InternalOrga.g:447:4: (lv_audience_3_0= RULE_ID )
            // InternalOrga.g:448:5: lv_audience_3_0= RULE_ID
            {
            lv_audience_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_audience_3_0, grammarAccess.getRoomAccess().getAudienceIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"audience",
            						lv_audience_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleRoom"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});

}