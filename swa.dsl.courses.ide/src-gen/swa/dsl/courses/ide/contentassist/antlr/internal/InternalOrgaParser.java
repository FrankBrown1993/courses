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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrgaParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleModel"
    // InternalOrga.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOrga.g:54:1: ( ruleModel EOF )
            // InternalOrga.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOrga.g:62:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:66:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // InternalOrga.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // InternalOrga.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            // InternalOrga.g:68:3: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // InternalOrga.g:69:3: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOrga.g:69:4: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalOrga.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalOrga.g:79:1: ( ruleDeclaration EOF )
            // InternalOrga.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalOrga.g:87:1: ruleDeclaration : ( ruleCourse ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:91:2: ( ( ruleCourse ) )
            // InternalOrga.g:92:2: ( ruleCourse )
            {
            // InternalOrga.g:92:2: ( ruleCourse )
            // InternalOrga.g:93:3: ruleCourse
            {
             before(grammarAccess.getDeclarationAccess().getCourseParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getCourseParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleCourse"
    // InternalOrga.g:103:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalOrga.g:104:1: ( ruleCourse EOF )
            // InternalOrga.g:105:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalOrga.g:112:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:116:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalOrga.g:117:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalOrga.g:117:2: ( ( rule__Course__Group__0 ) )
            // InternalOrga.g:118:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalOrga.g:119:3: ( rule__Course__Group__0 )
            // InternalOrga.g:119:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleTeacher"
    // InternalOrga.g:128:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalOrga.g:129:1: ( ruleTeacher EOF )
            // InternalOrga.g:130:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalOrga.g:137:1: ruleTeacher : ( ( rule__Teacher__NameAssignment ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:141:2: ( ( ( rule__Teacher__NameAssignment ) ) )
            // InternalOrga.g:142:2: ( ( rule__Teacher__NameAssignment ) )
            {
            // InternalOrga.g:142:2: ( ( rule__Teacher__NameAssignment ) )
            // InternalOrga.g:143:3: ( rule__Teacher__NameAssignment )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment()); 
            // InternalOrga.g:144:3: ( rule__Teacher__NameAssignment )
            // InternalOrga.g:144:4: rule__Teacher__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalOrga.g:153:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalOrga.g:154:1: ( ruleStudent EOF )
            // InternalOrga.g:155:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalOrga.g:162:1: ruleStudent : ( ( rule__Student__NameAssignment ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:166:2: ( ( ( rule__Student__NameAssignment ) ) )
            // InternalOrga.g:167:2: ( ( rule__Student__NameAssignment ) )
            {
            // InternalOrga.g:167:2: ( ( rule__Student__NameAssignment ) )
            // InternalOrga.g:168:3: ( rule__Student__NameAssignment )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment()); 
            // InternalOrga.g:169:3: ( rule__Student__NameAssignment )
            // InternalOrga.g:169:4: rule__Student__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "rule__Course__Group__0"
    // InternalOrga.g:177:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:181:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalOrga.g:182:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalOrga.g:189:1: rule__Course__Group__0__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:193:1: ( ( 'Course' ) )
            // InternalOrga.g:194:1: ( 'Course' )
            {
            // InternalOrga.g:194:1: ( 'Course' )
            // InternalOrga.g:195:2: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalOrga.g:204:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:208:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalOrga.g:209:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalOrga.g:216:1: rule__Course__Group__1__Impl : ( ( rule__Course__TitleAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:220:1: ( ( ( rule__Course__TitleAssignment_1 ) ) )
            // InternalOrga.g:221:1: ( ( rule__Course__TitleAssignment_1 ) )
            {
            // InternalOrga.g:221:1: ( ( rule__Course__TitleAssignment_1 ) )
            // InternalOrga.g:222:2: ( rule__Course__TitleAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getTitleAssignment_1()); 
            // InternalOrga.g:223:2: ( rule__Course__TitleAssignment_1 )
            // InternalOrga.g:223:3: rule__Course__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalOrga.g:231:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:235:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalOrga.g:236:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalOrga.g:243:1: rule__Course__Group__2__Impl : ( 'teached' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:247:1: ( ( 'teached' ) )
            // InternalOrga.g:248:1: ( 'teached' )
            {
            // InternalOrga.g:248:1: ( 'teached' )
            // InternalOrga.g:249:2: 'teached'
            {
             before(grammarAccess.getCourseAccess().getTeachedKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTeachedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalOrga.g:258:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:262:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalOrga.g:263:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalOrga.g:270:1: rule__Course__Group__3__Impl : ( 'by' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:274:1: ( ( 'by' ) )
            // InternalOrga.g:275:1: ( 'by' )
            {
            // InternalOrga.g:275:1: ( 'by' )
            // InternalOrga.g:276:2: 'by'
            {
             before(grammarAccess.getCourseAccess().getByKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getByKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalOrga.g:285:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:289:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalOrga.g:290:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalOrga.g:297:1: rule__Course__Group__4__Impl : ( ( ( rule__Course__TeachersAssignment_4 ) ) ( ( rule__Course__TeachersAssignment_4 )* ) ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:301:1: ( ( ( ( rule__Course__TeachersAssignment_4 ) ) ( ( rule__Course__TeachersAssignment_4 )* ) ) )
            // InternalOrga.g:302:1: ( ( ( rule__Course__TeachersAssignment_4 ) ) ( ( rule__Course__TeachersAssignment_4 )* ) )
            {
            // InternalOrga.g:302:1: ( ( ( rule__Course__TeachersAssignment_4 ) ) ( ( rule__Course__TeachersAssignment_4 )* ) )
            // InternalOrga.g:303:2: ( ( rule__Course__TeachersAssignment_4 ) ) ( ( rule__Course__TeachersAssignment_4 )* )
            {
            // InternalOrga.g:303:2: ( ( rule__Course__TeachersAssignment_4 ) )
            // InternalOrga.g:304:3: ( rule__Course__TeachersAssignment_4 )
            {
             before(grammarAccess.getCourseAccess().getTeachersAssignment_4()); 
            // InternalOrga.g:305:3: ( rule__Course__TeachersAssignment_4 )
            // InternalOrga.g:305:4: rule__Course__TeachersAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Course__TeachersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTeachersAssignment_4()); 

            }

            // InternalOrga.g:308:2: ( ( rule__Course__TeachersAssignment_4 )* )
            // InternalOrga.g:309:3: ( rule__Course__TeachersAssignment_4 )*
            {
             before(grammarAccess.getCourseAccess().getTeachersAssignment_4()); 
            // InternalOrga.g:310:3: ( rule__Course__TeachersAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOrga.g:310:4: rule__Course__TeachersAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Course__TeachersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getTeachersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalOrga.g:319:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:323:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalOrga.g:324:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalOrga.g:331:1: rule__Course__Group__5__Impl : ( 'visited' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:335:1: ( ( 'visited' ) )
            // InternalOrga.g:336:1: ( 'visited' )
            {
            // InternalOrga.g:336:1: ( 'visited' )
            // InternalOrga.g:337:2: 'visited'
            {
             before(grammarAccess.getCourseAccess().getVisitedKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getVisitedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalOrga.g:346:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:350:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalOrga.g:351:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalOrga.g:358:1: rule__Course__Group__6__Impl : ( 'by' ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:362:1: ( ( 'by' ) )
            // InternalOrga.g:363:1: ( 'by' )
            {
            // InternalOrga.g:363:1: ( 'by' )
            // InternalOrga.g:364:2: 'by'
            {
             before(grammarAccess.getCourseAccess().getByKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getByKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalOrga.g:373:1: rule__Course__Group__7 : rule__Course__Group__7__Impl ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:377:1: ( rule__Course__Group__7__Impl )
            // InternalOrga.g:378:2: rule__Course__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalOrga.g:384:1: rule__Course__Group__7__Impl : ( ( ( rule__Course__StudentsAssignment_7 ) ) ( ( rule__Course__StudentsAssignment_7 )* ) ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:388:1: ( ( ( ( rule__Course__StudentsAssignment_7 ) ) ( ( rule__Course__StudentsAssignment_7 )* ) ) )
            // InternalOrga.g:389:1: ( ( ( rule__Course__StudentsAssignment_7 ) ) ( ( rule__Course__StudentsAssignment_7 )* ) )
            {
            // InternalOrga.g:389:1: ( ( ( rule__Course__StudentsAssignment_7 ) ) ( ( rule__Course__StudentsAssignment_7 )* ) )
            // InternalOrga.g:390:2: ( ( rule__Course__StudentsAssignment_7 ) ) ( ( rule__Course__StudentsAssignment_7 )* )
            {
            // InternalOrga.g:390:2: ( ( rule__Course__StudentsAssignment_7 ) )
            // InternalOrga.g:391:3: ( rule__Course__StudentsAssignment_7 )
            {
             before(grammarAccess.getCourseAccess().getStudentsAssignment_7()); 
            // InternalOrga.g:392:3: ( rule__Course__StudentsAssignment_7 )
            // InternalOrga.g:392:4: rule__Course__StudentsAssignment_7
            {
            pushFollow(FOLLOW_8);
            rule__Course__StudentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getStudentsAssignment_7()); 

            }

            // InternalOrga.g:395:2: ( ( rule__Course__StudentsAssignment_7 )* )
            // InternalOrga.g:396:3: ( rule__Course__StudentsAssignment_7 )*
            {
             before(grammarAccess.getCourseAccess().getStudentsAssignment_7()); 
            // InternalOrga.g:397:3: ( rule__Course__StudentsAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOrga.g:397:4: rule__Course__StudentsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Course__StudentsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getStudentsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalOrga.g:407:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:411:1: ( ( ruleDeclaration ) )
            // InternalOrga.g:412:2: ( ruleDeclaration )
            {
            // InternalOrga.g:412:2: ( ruleDeclaration )
            // InternalOrga.g:413:3: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__Course__TitleAssignment_1"
    // InternalOrga.g:422:1: rule__Course__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Course__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:426:1: ( ( RULE_STRING ) )
            // InternalOrga.g:427:2: ( RULE_STRING )
            {
            // InternalOrga.g:427:2: ( RULE_STRING )
            // InternalOrga.g:428:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__TitleAssignment_1"


    // $ANTLR start "rule__Course__TeachersAssignment_4"
    // InternalOrga.g:437:1: rule__Course__TeachersAssignment_4 : ( ruleTeacher ) ;
    public final void rule__Course__TeachersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:441:1: ( ( ruleTeacher ) )
            // InternalOrga.g:442:2: ( ruleTeacher )
            {
            // InternalOrga.g:442:2: ( ruleTeacher )
            // InternalOrga.g:443:3: ruleTeacher
            {
             before(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__TeachersAssignment_4"


    // $ANTLR start "rule__Course__StudentsAssignment_7"
    // InternalOrga.g:452:1: rule__Course__StudentsAssignment_7 : ( ruleStudent ) ;
    public final void rule__Course__StudentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:456:1: ( ( ruleStudent ) )
            // InternalOrga.g:457:2: ( ruleStudent )
            {
            // InternalOrga.g:457:2: ( ruleStudent )
            // InternalOrga.g:458:3: ruleStudent
            {
             before(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__StudentsAssignment_7"


    // $ANTLR start "rule__Teacher__NameAssignment"
    // InternalOrga.g:467:1: rule__Teacher__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Teacher__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:471:1: ( ( RULE_STRING ) )
            // InternalOrga.g:472:2: ( RULE_STRING )
            {
            // InternalOrga.g:472:2: ( RULE_STRING )
            // InternalOrga.g:473:3: RULE_STRING
            {
             before(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__NameAssignment"


    // $ANTLR start "rule__Student__NameAssignment"
    // InternalOrga.g:482:1: rule__Student__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Student__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:486:1: ( ( RULE_STRING ) )
            // InternalOrga.g:487:2: ( RULE_STRING )
            {
            // InternalOrga.g:487:2: ( RULE_STRING )
            // InternalOrga.g:488:3: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});

}