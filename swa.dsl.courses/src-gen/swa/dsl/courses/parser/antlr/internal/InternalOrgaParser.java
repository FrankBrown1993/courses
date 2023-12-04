package swa.dsl.courses.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Course'", "'major'", "'type'", "'is'", "'audience'", "'course'", "'category'", "'taught'", "'by'", "'visited'", "'Room'", "'small'", "'medium'", "'big'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalOrga.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOrga.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOrga.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalOrga.g:72:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:78:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalOrga.g:79:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalOrga.g:79:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOrga.g:80:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalOrga.g:80:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalOrga.g:81:4: lv_declarations_0_0= ruleDeclaration
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
    // InternalOrga.g:101:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalOrga.g:101:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalOrga.g:102:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalOrga.g:108:1: ruleDeclaration returns [EObject current=null] : (this_Course_0= ruleCourse | this_Room_1= ruleRoom ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Course_0 = null;

        EObject this_Room_1 = null;



        	enterRule();

        try {
            // InternalOrga.g:114:2: ( (this_Course_0= ruleCourse | this_Room_1= ruleRoom ) )
            // InternalOrga.g:115:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom )
            {
            // InternalOrga.g:115:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom )
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
                    // InternalOrga.g:116:3: this_Course_0= ruleCourse
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
                    // InternalOrga.g:125:3: this_Room_1= ruleRoom
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
    // InternalOrga.g:137:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalOrga.g:137:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalOrga.g:138:2: iv_ruleCourse= ruleCourse EOF
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
    // InternalOrga.g:144:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'major' ( (lv_major_3_0= RULE_STRING ) ) otherlv_4= 'type' otherlv_5= 'is' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'audience' otherlv_8= 'is' ( (lv_audience_9_0= ruleAudienceSize ) ) otherlv_10= 'course' otherlv_11= 'category' ( (lv_course_cat_12_0= RULE_STRING ) ) otherlv_13= 'taught' otherlv_14= 'by' ( (lv_teachers_15_0= ruleTeacher ) )+ otherlv_16= 'visited' otherlv_17= 'by' ( (lv_students_18_0= ruleStudent ) )* ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_major_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_course_cat_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_audience_9_0 = null;

        EObject lv_teachers_15_0 = null;

        EObject lv_students_18_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:150:2: ( (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'major' ( (lv_major_3_0= RULE_STRING ) ) otherlv_4= 'type' otherlv_5= 'is' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'audience' otherlv_8= 'is' ( (lv_audience_9_0= ruleAudienceSize ) ) otherlv_10= 'course' otherlv_11= 'category' ( (lv_course_cat_12_0= RULE_STRING ) ) otherlv_13= 'taught' otherlv_14= 'by' ( (lv_teachers_15_0= ruleTeacher ) )+ otherlv_16= 'visited' otherlv_17= 'by' ( (lv_students_18_0= ruleStudent ) )* ) )
            // InternalOrga.g:151:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'major' ( (lv_major_3_0= RULE_STRING ) ) otherlv_4= 'type' otherlv_5= 'is' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'audience' otherlv_8= 'is' ( (lv_audience_9_0= ruleAudienceSize ) ) otherlv_10= 'course' otherlv_11= 'category' ( (lv_course_cat_12_0= RULE_STRING ) ) otherlv_13= 'taught' otherlv_14= 'by' ( (lv_teachers_15_0= ruleTeacher ) )+ otherlv_16= 'visited' otherlv_17= 'by' ( (lv_students_18_0= ruleStudent ) )* )
            {
            // InternalOrga.g:151:2: (otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'major' ( (lv_major_3_0= RULE_STRING ) ) otherlv_4= 'type' otherlv_5= 'is' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'audience' otherlv_8= 'is' ( (lv_audience_9_0= ruleAudienceSize ) ) otherlv_10= 'course' otherlv_11= 'category' ( (lv_course_cat_12_0= RULE_STRING ) ) otherlv_13= 'taught' otherlv_14= 'by' ( (lv_teachers_15_0= ruleTeacher ) )+ otherlv_16= 'visited' otherlv_17= 'by' ( (lv_students_18_0= ruleStudent ) )* )
            // InternalOrga.g:152:3: otherlv_0= 'Course' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'major' ( (lv_major_3_0= RULE_STRING ) ) otherlv_4= 'type' otherlv_5= 'is' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'audience' otherlv_8= 'is' ( (lv_audience_9_0= ruleAudienceSize ) ) otherlv_10= 'course' otherlv_11= 'category' ( (lv_course_cat_12_0= RULE_STRING ) ) otherlv_13= 'taught' otherlv_14= 'by' ( (lv_teachers_15_0= ruleTeacher ) )+ otherlv_16= 'visited' otherlv_17= 'by' ( (lv_students_18_0= ruleStudent ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalOrga.g:156:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalOrga.g:157:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalOrga.g:157:4: (lv_title_1_0= RULE_STRING )
            // InternalOrga.g:158:5: lv_title_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getMajorKeyword_2());
            		
            // InternalOrga.g:178:3: ( (lv_major_3_0= RULE_STRING ) )
            // InternalOrga.g:179:4: (lv_major_3_0= RULE_STRING )
            {
            // InternalOrga.g:179:4: (lv_major_3_0= RULE_STRING )
            // InternalOrga.g:180:5: lv_major_3_0= RULE_STRING
            {
            lv_major_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_major_3_0, grammarAccess.getCourseAccess().getMajorSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"major",
            						lv_major_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getIsKeyword_5());
            		
            // InternalOrga.g:204:3: ( (lv_type_6_0= RULE_STRING ) )
            // InternalOrga.g:205:4: (lv_type_6_0= RULE_STRING )
            {
            // InternalOrga.g:205:4: (lv_type_6_0= RULE_STRING )
            // InternalOrga.g:206:5: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_type_6_0, grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getCourseAccess().getAudienceKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getIsKeyword_8());
            		
            // InternalOrga.g:230:3: ( (lv_audience_9_0= ruleAudienceSize ) )
            // InternalOrga.g:231:4: (lv_audience_9_0= ruleAudienceSize )
            {
            // InternalOrga.g:231:4: (lv_audience_9_0= ruleAudienceSize )
            // InternalOrga.g:232:5: lv_audience_9_0= ruleAudienceSize
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getAudienceAudienceSizeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_audience_9_0=ruleAudienceSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"audience",
            						lv_audience_9_0,
            						"swa.dsl.courses.Orga.AudienceSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getCourseKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getCategoryKeyword_11());
            		
            // InternalOrga.g:257:3: ( (lv_course_cat_12_0= RULE_STRING ) )
            // InternalOrga.g:258:4: (lv_course_cat_12_0= RULE_STRING )
            {
            // InternalOrga.g:258:4: (lv_course_cat_12_0= RULE_STRING )
            // InternalOrga.g:259:5: lv_course_cat_12_0= RULE_STRING
            {
            lv_course_cat_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_course_cat_12_0, grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"course_cat",
            						lv_course_cat_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getCourseAccess().getTaughtKeyword_13());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getCourseAccess().getByKeyword_14());
            		
            // InternalOrga.g:283:3: ( (lv_teachers_15_0= ruleTeacher ) )+
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
            	    // InternalOrga.g:284:4: (lv_teachers_15_0= ruleTeacher )
            	    {
            	    // InternalOrga.g:284:4: (lv_teachers_15_0= ruleTeacher )
            	    // InternalOrga.g:285:5: lv_teachers_15_0= ruleTeacher
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_teachers_15_0=ruleTeacher();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teachers",
            	    						lv_teachers_15_0,
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

            otherlv_16=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getCourseAccess().getVisitedKeyword_16());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getCourseAccess().getByKeyword_17());
            		
            // InternalOrga.g:310:3: ( (lv_students_18_0= ruleStudent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOrga.g:311:4: (lv_students_18_0= ruleStudent )
            	    {
            	    // InternalOrga.g:311:4: (lv_students_18_0= ruleStudent )
            	    // InternalOrga.g:312:5: lv_students_18_0= ruleStudent
            	    {

            	    					newCompositeNode(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_students_18_0=ruleStudent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"students",
            	    						lv_students_18_0,
            	    						"swa.dsl.courses.Orga.Student");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // InternalOrga.g:333:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalOrga.g:333:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalOrga.g:334:2: iv_ruleTeacher= ruleTeacher EOF
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
    // InternalOrga.g:340:1: ruleTeacher returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:346:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:347:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:347:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:348:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:348:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:349:4: lv_name_0_0= RULE_STRING
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
    // InternalOrga.g:368:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalOrga.g:368:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalOrga.g:369:2: iv_ruleStudent= ruleStudent EOF
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
    // InternalOrga.g:375:1: ruleStudent returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOrga.g:381:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOrga.g:382:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOrga.g:382:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOrga.g:383:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOrga.g:383:3: (lv_name_0_0= RULE_STRING )
            // InternalOrga.g:384:4: lv_name_0_0= RULE_STRING
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
    // InternalOrga.g:403:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalOrga.g:403:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalOrga.g:404:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalOrga.g:410:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= ruleAudienceSize ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_audience_3_0 = null;



        	enterRule();

        try {
            // InternalOrga.g:416:2: ( (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= ruleAudienceSize ) ) ) )
            // InternalOrga.g:417:2: (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= ruleAudienceSize ) ) )
            {
            // InternalOrga.g:417:2: (otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= ruleAudienceSize ) ) )
            // InternalOrga.g:418:3: otherlv_0= 'Room' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_audience_3_0= ruleAudienceSize ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalOrga.g:422:3: ( (lv_location_1_0= RULE_STRING ) )
            // InternalOrga.g:423:4: (lv_location_1_0= RULE_STRING )
            {
            // InternalOrga.g:423:4: (lv_location_1_0= RULE_STRING )
            // InternalOrga.g:424:5: lv_location_1_0= RULE_STRING
            {
            lv_location_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getIsKeyword_2());
            		
            // InternalOrga.g:444:3: ( (lv_audience_3_0= ruleAudienceSize ) )
            // InternalOrga.g:445:4: (lv_audience_3_0= ruleAudienceSize )
            {
            // InternalOrga.g:445:4: (lv_audience_3_0= ruleAudienceSize )
            // InternalOrga.g:446:5: lv_audience_3_0= ruleAudienceSize
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAudienceAudienceSizeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_audience_3_0=ruleAudienceSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"audience",
            						lv_audience_3_0,
            						"swa.dsl.courses.Orga.AudienceSize");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "ruleAudienceSize"
    // InternalOrga.g:467:1: ruleAudienceSize returns [Enumerator current=null] : ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'big' ) ) ;
    public final Enumerator ruleAudienceSize() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOrga.g:473:2: ( ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'big' ) ) )
            // InternalOrga.g:474:2: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'big' ) )
            {
            // InternalOrga.g:474:2: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'big' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOrga.g:475:3: (enumLiteral_0= 'small' )
                    {
                    // InternalOrga.g:475:3: (enumLiteral_0= 'small' )
                    // InternalOrga.g:476:4: enumLiteral_0= 'small'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOrga.g:483:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalOrga.g:483:3: (enumLiteral_1= 'medium' )
                    // InternalOrga.g:484:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOrga.g:491:3: (enumLiteral_2= 'big' )
                    {
                    // InternalOrga.g:491:3: (enumLiteral_2= 'big' )
                    // InternalOrga.g:492:4: enumLiteral_2= 'big'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleAudienceSize"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});

}