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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'small'", "'medium'", "'big'", "'Course'", "'major'", "'type'", "'is'", "'audience'", "'course'", "'category'", "'taught'", "'by'", "'visited'", "'Room'"
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

                if ( (LA1_0==14||LA1_0==24) ) {
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
    // InternalOrga.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalOrga.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalOrga.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalOrga.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalOrga.g:94:3: ( rule__Declaration__Alternatives )
            // InternalOrga.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleRoom"
    // InternalOrga.g:178:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalOrga.g:179:1: ( ruleRoom EOF )
            // InternalOrga.g:180:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalOrga.g:187:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:191:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalOrga.g:192:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalOrga.g:192:2: ( ( rule__Room__Group__0 ) )
            // InternalOrga.g:193:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalOrga.g:194:3: ( rule__Room__Group__0 )
            // InternalOrga.g:194:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "ruleAudienceSize"
    // InternalOrga.g:203:1: ruleAudienceSize : ( ( rule__AudienceSize__Alternatives ) ) ;
    public final void ruleAudienceSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:207:1: ( ( ( rule__AudienceSize__Alternatives ) ) )
            // InternalOrga.g:208:2: ( ( rule__AudienceSize__Alternatives ) )
            {
            // InternalOrga.g:208:2: ( ( rule__AudienceSize__Alternatives ) )
            // InternalOrga.g:209:3: ( rule__AudienceSize__Alternatives )
            {
             before(grammarAccess.getAudienceSizeAccess().getAlternatives()); 
            // InternalOrga.g:210:3: ( rule__AudienceSize__Alternatives )
            // InternalOrga.g:210:4: rule__AudienceSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AudienceSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAudienceSizeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAudienceSize"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalOrga.g:218:1: rule__Declaration__Alternatives : ( ( ruleCourse ) | ( ruleRoom ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:222:1: ( ( ruleCourse ) | ( ruleRoom ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOrga.g:223:2: ( ruleCourse )
                    {
                    // InternalOrga.g:223:2: ( ruleCourse )
                    // InternalOrga.g:224:3: ruleCourse
                    {
                     before(grammarAccess.getDeclarationAccess().getCourseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCourse();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getCourseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrga.g:229:2: ( ruleRoom )
                    {
                    // InternalOrga.g:229:2: ( ruleRoom )
                    // InternalOrga.g:230:3: ruleRoom
                    {
                     before(grammarAccess.getDeclarationAccess().getRoomParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoom();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRoomParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__AudienceSize__Alternatives"
    // InternalOrga.g:239:1: rule__AudienceSize__Alternatives : ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'big' ) ) );
    public final void rule__AudienceSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:243:1: ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'big' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOrga.g:244:2: ( ( 'small' ) )
                    {
                    // InternalOrga.g:244:2: ( ( 'small' ) )
                    // InternalOrga.g:245:3: ( 'small' )
                    {
                     before(grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0()); 
                    // InternalOrga.g:246:3: ( 'small' )
                    // InternalOrga.g:246:4: 'small'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAudienceSizeAccess().getSMALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrga.g:250:2: ( ( 'medium' ) )
                    {
                    // InternalOrga.g:250:2: ( ( 'medium' ) )
                    // InternalOrga.g:251:3: ( 'medium' )
                    {
                     before(grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalOrga.g:252:3: ( 'medium' )
                    // InternalOrga.g:252:4: 'medium'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAudienceSizeAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOrga.g:256:2: ( ( 'big' ) )
                    {
                    // InternalOrga.g:256:2: ( ( 'big' ) )
                    // InternalOrga.g:257:3: ( 'big' )
                    {
                     before(grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2()); 
                    // InternalOrga.g:258:3: ( 'big' )
                    // InternalOrga.g:258:4: 'big'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAudienceSizeAccess().getBIGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AudienceSize__Alternatives"


    // $ANTLR start "rule__Course__Group__0"
    // InternalOrga.g:266:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:270:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalOrga.g:271:2: rule__Course__Group__0__Impl rule__Course__Group__1
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
    // InternalOrga.g:278:1: rule__Course__Group__0__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:282:1: ( ( 'Course' ) )
            // InternalOrga.g:283:1: ( 'Course' )
            {
            // InternalOrga.g:283:1: ( 'Course' )
            // InternalOrga.g:284:2: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalOrga.g:293:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:297:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalOrga.g:298:2: rule__Course__Group__1__Impl rule__Course__Group__2
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
    // InternalOrga.g:305:1: rule__Course__Group__1__Impl : ( ( rule__Course__TitleAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:309:1: ( ( ( rule__Course__TitleAssignment_1 ) ) )
            // InternalOrga.g:310:1: ( ( rule__Course__TitleAssignment_1 ) )
            {
            // InternalOrga.g:310:1: ( ( rule__Course__TitleAssignment_1 ) )
            // InternalOrga.g:311:2: ( rule__Course__TitleAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getTitleAssignment_1()); 
            // InternalOrga.g:312:2: ( rule__Course__TitleAssignment_1 )
            // InternalOrga.g:312:3: rule__Course__TitleAssignment_1
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
    // InternalOrga.g:320:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:324:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalOrga.g:325:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalOrga.g:332:1: rule__Course__Group__2__Impl : ( 'major' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:336:1: ( ( 'major' ) )
            // InternalOrga.g:337:1: ( 'major' )
            {
            // InternalOrga.g:337:1: ( 'major' )
            // InternalOrga.g:338:2: 'major'
            {
             before(grammarAccess.getCourseAccess().getMajorKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getMajorKeyword_2()); 

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
    // InternalOrga.g:347:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:351:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalOrga.g:352:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalOrga.g:359:1: rule__Course__Group__3__Impl : ( ( rule__Course__MajorAssignment_3 ) ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:363:1: ( ( ( rule__Course__MajorAssignment_3 ) ) )
            // InternalOrga.g:364:1: ( ( rule__Course__MajorAssignment_3 ) )
            {
            // InternalOrga.g:364:1: ( ( rule__Course__MajorAssignment_3 ) )
            // InternalOrga.g:365:2: ( rule__Course__MajorAssignment_3 )
            {
             before(grammarAccess.getCourseAccess().getMajorAssignment_3()); 
            // InternalOrga.g:366:2: ( rule__Course__MajorAssignment_3 )
            // InternalOrga.g:366:3: rule__Course__MajorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Course__MajorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getMajorAssignment_3()); 

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
    // InternalOrga.g:374:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:378:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalOrga.g:379:2: rule__Course__Group__4__Impl rule__Course__Group__5
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
    // InternalOrga.g:386:1: rule__Course__Group__4__Impl : ( 'type' ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:390:1: ( ( 'type' ) )
            // InternalOrga.g:391:1: ( 'type' )
            {
            // InternalOrga.g:391:1: ( 'type' )
            // InternalOrga.g:392:2: 'type'
            {
             before(grammarAccess.getCourseAccess().getTypeKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTypeKeyword_4()); 

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
    // InternalOrga.g:401:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:405:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalOrga.g:406:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalOrga.g:413:1: rule__Course__Group__5__Impl : ( 'is' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:417:1: ( ( 'is' ) )
            // InternalOrga.g:418:1: ( 'is' )
            {
            // InternalOrga.g:418:1: ( 'is' )
            // InternalOrga.g:419:2: 'is'
            {
             before(grammarAccess.getCourseAccess().getIsKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getIsKeyword_5()); 

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
    // InternalOrga.g:428:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:432:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalOrga.g:433:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalOrga.g:440:1: rule__Course__Group__6__Impl : ( ( rule__Course__TypeAssignment_6 ) ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:444:1: ( ( ( rule__Course__TypeAssignment_6 ) ) )
            // InternalOrga.g:445:1: ( ( rule__Course__TypeAssignment_6 ) )
            {
            // InternalOrga.g:445:1: ( ( rule__Course__TypeAssignment_6 ) )
            // InternalOrga.g:446:2: ( rule__Course__TypeAssignment_6 )
            {
             before(grammarAccess.getCourseAccess().getTypeAssignment_6()); 
            // InternalOrga.g:447:2: ( rule__Course__TypeAssignment_6 )
            // InternalOrga.g:447:3: rule__Course__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Course__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTypeAssignment_6()); 

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
    // InternalOrga.g:455:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:459:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // InternalOrga.g:460:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__8();

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
    // InternalOrga.g:467:1: rule__Course__Group__7__Impl : ( 'audience' ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:471:1: ( ( 'audience' ) )
            // InternalOrga.g:472:1: ( 'audience' )
            {
            // InternalOrga.g:472:1: ( 'audience' )
            // InternalOrga.g:473:2: 'audience'
            {
             before(grammarAccess.getCourseAccess().getAudienceKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getAudienceKeyword_7()); 

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


    // $ANTLR start "rule__Course__Group__8"
    // InternalOrga.g:482:1: rule__Course__Group__8 : rule__Course__Group__8__Impl rule__Course__Group__9 ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:486:1: ( rule__Course__Group__8__Impl rule__Course__Group__9 )
            // InternalOrga.g:487:2: rule__Course__Group__8__Impl rule__Course__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Course__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__9();

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
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // InternalOrga.g:494:1: rule__Course__Group__8__Impl : ( 'is' ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:498:1: ( ( 'is' ) )
            // InternalOrga.g:499:1: ( 'is' )
            {
            // InternalOrga.g:499:1: ( 'is' )
            // InternalOrga.g:500:2: 'is'
            {
             before(grammarAccess.getCourseAccess().getIsKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getIsKeyword_8()); 

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
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group__9"
    // InternalOrga.g:509:1: rule__Course__Group__9 : rule__Course__Group__9__Impl rule__Course__Group__10 ;
    public final void rule__Course__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:513:1: ( rule__Course__Group__9__Impl rule__Course__Group__10 )
            // InternalOrga.g:514:2: rule__Course__Group__9__Impl rule__Course__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Course__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__10();

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
    // $ANTLR end "rule__Course__Group__9"


    // $ANTLR start "rule__Course__Group__9__Impl"
    // InternalOrga.g:521:1: rule__Course__Group__9__Impl : ( ( rule__Course__AudienceAssignment_9 ) ) ;
    public final void rule__Course__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:525:1: ( ( ( rule__Course__AudienceAssignment_9 ) ) )
            // InternalOrga.g:526:1: ( ( rule__Course__AudienceAssignment_9 ) )
            {
            // InternalOrga.g:526:1: ( ( rule__Course__AudienceAssignment_9 ) )
            // InternalOrga.g:527:2: ( rule__Course__AudienceAssignment_9 )
            {
             before(grammarAccess.getCourseAccess().getAudienceAssignment_9()); 
            // InternalOrga.g:528:2: ( rule__Course__AudienceAssignment_9 )
            // InternalOrga.g:528:3: rule__Course__AudienceAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Course__AudienceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getAudienceAssignment_9()); 

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
    // $ANTLR end "rule__Course__Group__9__Impl"


    // $ANTLR start "rule__Course__Group__10"
    // InternalOrga.g:536:1: rule__Course__Group__10 : rule__Course__Group__10__Impl rule__Course__Group__11 ;
    public final void rule__Course__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:540:1: ( rule__Course__Group__10__Impl rule__Course__Group__11 )
            // InternalOrga.g:541:2: rule__Course__Group__10__Impl rule__Course__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Course__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__11();

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
    // $ANTLR end "rule__Course__Group__10"


    // $ANTLR start "rule__Course__Group__10__Impl"
    // InternalOrga.g:548:1: rule__Course__Group__10__Impl : ( 'course' ) ;
    public final void rule__Course__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:552:1: ( ( 'course' ) )
            // InternalOrga.g:553:1: ( 'course' )
            {
            // InternalOrga.g:553:1: ( 'course' )
            // InternalOrga.g:554:2: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_10()); 

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
    // $ANTLR end "rule__Course__Group__10__Impl"


    // $ANTLR start "rule__Course__Group__11"
    // InternalOrga.g:563:1: rule__Course__Group__11 : rule__Course__Group__11__Impl rule__Course__Group__12 ;
    public final void rule__Course__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:567:1: ( rule__Course__Group__11__Impl rule__Course__Group__12 )
            // InternalOrga.g:568:2: rule__Course__Group__11__Impl rule__Course__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__12();

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
    // $ANTLR end "rule__Course__Group__11"


    // $ANTLR start "rule__Course__Group__11__Impl"
    // InternalOrga.g:575:1: rule__Course__Group__11__Impl : ( 'category' ) ;
    public final void rule__Course__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:579:1: ( ( 'category' ) )
            // InternalOrga.g:580:1: ( 'category' )
            {
            // InternalOrga.g:580:1: ( 'category' )
            // InternalOrga.g:581:2: 'category'
            {
             before(grammarAccess.getCourseAccess().getCategoryKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCategoryKeyword_11()); 

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
    // $ANTLR end "rule__Course__Group__11__Impl"


    // $ANTLR start "rule__Course__Group__12"
    // InternalOrga.g:590:1: rule__Course__Group__12 : rule__Course__Group__12__Impl rule__Course__Group__13 ;
    public final void rule__Course__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:594:1: ( rule__Course__Group__12__Impl rule__Course__Group__13 )
            // InternalOrga.g:595:2: rule__Course__Group__12__Impl rule__Course__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Course__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__13();

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
    // $ANTLR end "rule__Course__Group__12"


    // $ANTLR start "rule__Course__Group__12__Impl"
    // InternalOrga.g:602:1: rule__Course__Group__12__Impl : ( ( rule__Course__Course_catAssignment_12 ) ) ;
    public final void rule__Course__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:606:1: ( ( ( rule__Course__Course_catAssignment_12 ) ) )
            // InternalOrga.g:607:1: ( ( rule__Course__Course_catAssignment_12 ) )
            {
            // InternalOrga.g:607:1: ( ( rule__Course__Course_catAssignment_12 ) )
            // InternalOrga.g:608:2: ( rule__Course__Course_catAssignment_12 )
            {
             before(grammarAccess.getCourseAccess().getCourse_catAssignment_12()); 
            // InternalOrga.g:609:2: ( rule__Course__Course_catAssignment_12 )
            // InternalOrga.g:609:3: rule__Course__Course_catAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Course__Course_catAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourse_catAssignment_12()); 

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
    // $ANTLR end "rule__Course__Group__12__Impl"


    // $ANTLR start "rule__Course__Group__13"
    // InternalOrga.g:617:1: rule__Course__Group__13 : rule__Course__Group__13__Impl rule__Course__Group__14 ;
    public final void rule__Course__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:621:1: ( rule__Course__Group__13__Impl rule__Course__Group__14 )
            // InternalOrga.g:622:2: rule__Course__Group__13__Impl rule__Course__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Course__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__14();

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
    // $ANTLR end "rule__Course__Group__13"


    // $ANTLR start "rule__Course__Group__13__Impl"
    // InternalOrga.g:629:1: rule__Course__Group__13__Impl : ( 'taught' ) ;
    public final void rule__Course__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:633:1: ( ( 'taught' ) )
            // InternalOrga.g:634:1: ( 'taught' )
            {
            // InternalOrga.g:634:1: ( 'taught' )
            // InternalOrga.g:635:2: 'taught'
            {
             before(grammarAccess.getCourseAccess().getTaughtKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTaughtKeyword_13()); 

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
    // $ANTLR end "rule__Course__Group__13__Impl"


    // $ANTLR start "rule__Course__Group__14"
    // InternalOrga.g:644:1: rule__Course__Group__14 : rule__Course__Group__14__Impl rule__Course__Group__15 ;
    public final void rule__Course__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:648:1: ( rule__Course__Group__14__Impl rule__Course__Group__15 )
            // InternalOrga.g:649:2: rule__Course__Group__14__Impl rule__Course__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__15();

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
    // $ANTLR end "rule__Course__Group__14"


    // $ANTLR start "rule__Course__Group__14__Impl"
    // InternalOrga.g:656:1: rule__Course__Group__14__Impl : ( 'by' ) ;
    public final void rule__Course__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:660:1: ( ( 'by' ) )
            // InternalOrga.g:661:1: ( 'by' )
            {
            // InternalOrga.g:661:1: ( 'by' )
            // InternalOrga.g:662:2: 'by'
            {
             before(grammarAccess.getCourseAccess().getByKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getByKeyword_14()); 

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
    // $ANTLR end "rule__Course__Group__14__Impl"


    // $ANTLR start "rule__Course__Group__15"
    // InternalOrga.g:671:1: rule__Course__Group__15 : rule__Course__Group__15__Impl rule__Course__Group__16 ;
    public final void rule__Course__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:675:1: ( rule__Course__Group__15__Impl rule__Course__Group__16 )
            // InternalOrga.g:676:2: rule__Course__Group__15__Impl rule__Course__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Course__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__16();

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
    // $ANTLR end "rule__Course__Group__15"


    // $ANTLR start "rule__Course__Group__15__Impl"
    // InternalOrga.g:683:1: rule__Course__Group__15__Impl : ( ( ( rule__Course__TeachersAssignment_15 ) ) ( ( rule__Course__TeachersAssignment_15 )* ) ) ;
    public final void rule__Course__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:687:1: ( ( ( ( rule__Course__TeachersAssignment_15 ) ) ( ( rule__Course__TeachersAssignment_15 )* ) ) )
            // InternalOrga.g:688:1: ( ( ( rule__Course__TeachersAssignment_15 ) ) ( ( rule__Course__TeachersAssignment_15 )* ) )
            {
            // InternalOrga.g:688:1: ( ( ( rule__Course__TeachersAssignment_15 ) ) ( ( rule__Course__TeachersAssignment_15 )* ) )
            // InternalOrga.g:689:2: ( ( rule__Course__TeachersAssignment_15 ) ) ( ( rule__Course__TeachersAssignment_15 )* )
            {
            // InternalOrga.g:689:2: ( ( rule__Course__TeachersAssignment_15 ) )
            // InternalOrga.g:690:3: ( rule__Course__TeachersAssignment_15 )
            {
             before(grammarAccess.getCourseAccess().getTeachersAssignment_15()); 
            // InternalOrga.g:691:3: ( rule__Course__TeachersAssignment_15 )
            // InternalOrga.g:691:4: rule__Course__TeachersAssignment_15
            {
            pushFollow(FOLLOW_15);
            rule__Course__TeachersAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTeachersAssignment_15()); 

            }

            // InternalOrga.g:694:2: ( ( rule__Course__TeachersAssignment_15 )* )
            // InternalOrga.g:695:3: ( rule__Course__TeachersAssignment_15 )*
            {
             before(grammarAccess.getCourseAccess().getTeachersAssignment_15()); 
            // InternalOrga.g:696:3: ( rule__Course__TeachersAssignment_15 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOrga.g:696:4: rule__Course__TeachersAssignment_15
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Course__TeachersAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getTeachersAssignment_15()); 

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
    // $ANTLR end "rule__Course__Group__15__Impl"


    // $ANTLR start "rule__Course__Group__16"
    // InternalOrga.g:705:1: rule__Course__Group__16 : rule__Course__Group__16__Impl rule__Course__Group__17 ;
    public final void rule__Course__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:709:1: ( rule__Course__Group__16__Impl rule__Course__Group__17 )
            // InternalOrga.g:710:2: rule__Course__Group__16__Impl rule__Course__Group__17
            {
            pushFollow(FOLLOW_13);
            rule__Course__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__17();

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
    // $ANTLR end "rule__Course__Group__16"


    // $ANTLR start "rule__Course__Group__16__Impl"
    // InternalOrga.g:717:1: rule__Course__Group__16__Impl : ( 'visited' ) ;
    public final void rule__Course__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:721:1: ( ( 'visited' ) )
            // InternalOrga.g:722:1: ( 'visited' )
            {
            // InternalOrga.g:722:1: ( 'visited' )
            // InternalOrga.g:723:2: 'visited'
            {
             before(grammarAccess.getCourseAccess().getVisitedKeyword_16()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getVisitedKeyword_16()); 

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
    // $ANTLR end "rule__Course__Group__16__Impl"


    // $ANTLR start "rule__Course__Group__17"
    // InternalOrga.g:732:1: rule__Course__Group__17 : rule__Course__Group__17__Impl rule__Course__Group__18 ;
    public final void rule__Course__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:736:1: ( rule__Course__Group__17__Impl rule__Course__Group__18 )
            // InternalOrga.g:737:2: rule__Course__Group__17__Impl rule__Course__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__18();

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
    // $ANTLR end "rule__Course__Group__17"


    // $ANTLR start "rule__Course__Group__17__Impl"
    // InternalOrga.g:744:1: rule__Course__Group__17__Impl : ( 'by' ) ;
    public final void rule__Course__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:748:1: ( ( 'by' ) )
            // InternalOrga.g:749:1: ( 'by' )
            {
            // InternalOrga.g:749:1: ( 'by' )
            // InternalOrga.g:750:2: 'by'
            {
             before(grammarAccess.getCourseAccess().getByKeyword_17()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getByKeyword_17()); 

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
    // $ANTLR end "rule__Course__Group__17__Impl"


    // $ANTLR start "rule__Course__Group__18"
    // InternalOrga.g:759:1: rule__Course__Group__18 : rule__Course__Group__18__Impl ;
    public final void rule__Course__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:763:1: ( rule__Course__Group__18__Impl )
            // InternalOrga.g:764:2: rule__Course__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__18__Impl();

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
    // $ANTLR end "rule__Course__Group__18"


    // $ANTLR start "rule__Course__Group__18__Impl"
    // InternalOrga.g:770:1: rule__Course__Group__18__Impl : ( ( rule__Course__StudentsAssignment_18 )* ) ;
    public final void rule__Course__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:774:1: ( ( ( rule__Course__StudentsAssignment_18 )* ) )
            // InternalOrga.g:775:1: ( ( rule__Course__StudentsAssignment_18 )* )
            {
            // InternalOrga.g:775:1: ( ( rule__Course__StudentsAssignment_18 )* )
            // InternalOrga.g:776:2: ( rule__Course__StudentsAssignment_18 )*
            {
             before(grammarAccess.getCourseAccess().getStudentsAssignment_18()); 
            // InternalOrga.g:777:2: ( rule__Course__StudentsAssignment_18 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOrga.g:777:3: rule__Course__StudentsAssignment_18
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Course__StudentsAssignment_18();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getStudentsAssignment_18()); 

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
    // $ANTLR end "rule__Course__Group__18__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalOrga.g:786:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:790:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalOrga.g:791:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalOrga.g:798:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:802:1: ( ( 'Room' ) )
            // InternalOrga.g:803:1: ( 'Room' )
            {
            // InternalOrga.g:803:1: ( 'Room' )
            // InternalOrga.g:804:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

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
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalOrga.g:813:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:817:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalOrga.g:818:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalOrga.g:825:1: rule__Room__Group__1__Impl : ( ( rule__Room__LocationAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:829:1: ( ( ( rule__Room__LocationAssignment_1 ) ) )
            // InternalOrga.g:830:1: ( ( rule__Room__LocationAssignment_1 ) )
            {
            // InternalOrga.g:830:1: ( ( rule__Room__LocationAssignment_1 ) )
            // InternalOrga.g:831:2: ( rule__Room__LocationAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getLocationAssignment_1()); 
            // InternalOrga.g:832:2: ( rule__Room__LocationAssignment_1 )
            // InternalOrga.g:832:3: rule__Room__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getLocationAssignment_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalOrga.g:840:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:844:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalOrga.g:845:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalOrga.g:852:1: rule__Room__Group__2__Impl : ( 'is' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:856:1: ( ( 'is' ) )
            // InternalOrga.g:857:1: ( 'is' )
            {
            // InternalOrga.g:857:1: ( 'is' )
            // InternalOrga.g:858:2: 'is'
            {
             before(grammarAccess.getRoomAccess().getIsKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalOrga.g:867:1: rule__Room__Group__3 : rule__Room__Group__3__Impl ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:871:1: ( rule__Room__Group__3__Impl )
            // InternalOrga.g:872:2: rule__Room__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__3__Impl();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalOrga.g:878:1: rule__Room__Group__3__Impl : ( ( rule__Room__AudienceAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:882:1: ( ( ( rule__Room__AudienceAssignment_3 ) ) )
            // InternalOrga.g:883:1: ( ( rule__Room__AudienceAssignment_3 ) )
            {
            // InternalOrga.g:883:1: ( ( rule__Room__AudienceAssignment_3 ) )
            // InternalOrga.g:884:2: ( rule__Room__AudienceAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getAudienceAssignment_3()); 
            // InternalOrga.g:885:2: ( rule__Room__AudienceAssignment_3 )
            // InternalOrga.g:885:3: rule__Room__AudienceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Room__AudienceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAudienceAssignment_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalOrga.g:894:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:898:1: ( ( ruleDeclaration ) )
            // InternalOrga.g:899:2: ( ruleDeclaration )
            {
            // InternalOrga.g:899:2: ( ruleDeclaration )
            // InternalOrga.g:900:3: ruleDeclaration
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
    // InternalOrga.g:909:1: rule__Course__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Course__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:913:1: ( ( RULE_STRING ) )
            // InternalOrga.g:914:2: ( RULE_STRING )
            {
            // InternalOrga.g:914:2: ( RULE_STRING )
            // InternalOrga.g:915:3: RULE_STRING
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


    // $ANTLR start "rule__Course__MajorAssignment_3"
    // InternalOrga.g:924:1: rule__Course__MajorAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Course__MajorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:928:1: ( ( RULE_STRING ) )
            // InternalOrga.g:929:2: ( RULE_STRING )
            {
            // InternalOrga.g:929:2: ( RULE_STRING )
            // InternalOrga.g:930:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getMajorSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getMajorSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Course__MajorAssignment_3"


    // $ANTLR start "rule__Course__TypeAssignment_6"
    // InternalOrga.g:939:1: rule__Course__TypeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Course__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:943:1: ( ( RULE_STRING ) )
            // InternalOrga.g:944:2: ( RULE_STRING )
            {
            // InternalOrga.g:944:2: ( RULE_STRING )
            // InternalOrga.g:945:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTypeSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Course__TypeAssignment_6"


    // $ANTLR start "rule__Course__AudienceAssignment_9"
    // InternalOrga.g:954:1: rule__Course__AudienceAssignment_9 : ( ruleAudienceSize ) ;
    public final void rule__Course__AudienceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:958:1: ( ( ruleAudienceSize ) )
            // InternalOrga.g:959:2: ( ruleAudienceSize )
            {
            // InternalOrga.g:959:2: ( ruleAudienceSize )
            // InternalOrga.g:960:3: ruleAudienceSize
            {
             before(grammarAccess.getCourseAccess().getAudienceAudienceSizeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAudienceSize();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getAudienceAudienceSizeEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__Course__AudienceAssignment_9"


    // $ANTLR start "rule__Course__Course_catAssignment_12"
    // InternalOrga.g:969:1: rule__Course__Course_catAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Course__Course_catAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:973:1: ( ( RULE_STRING ) )
            // InternalOrga.g:974:2: ( RULE_STRING )
            {
            // InternalOrga.g:974:2: ( RULE_STRING )
            // InternalOrga.g:975:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourse_catSTRINGTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Course__Course_catAssignment_12"


    // $ANTLR start "rule__Course__TeachersAssignment_15"
    // InternalOrga.g:984:1: rule__Course__TeachersAssignment_15 : ( ruleTeacher ) ;
    public final void rule__Course__TeachersAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:988:1: ( ( ruleTeacher ) )
            // InternalOrga.g:989:2: ( ruleTeacher )
            {
            // InternalOrga.g:989:2: ( ruleTeacher )
            // InternalOrga.g:990:3: ruleTeacher
            {
             before(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getTeachersTeacherParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Course__TeachersAssignment_15"


    // $ANTLR start "rule__Course__StudentsAssignment_18"
    // InternalOrga.g:999:1: rule__Course__StudentsAssignment_18 : ( ruleStudent ) ;
    public final void rule__Course__StudentsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:1003:1: ( ( ruleStudent ) )
            // InternalOrga.g:1004:2: ( ruleStudent )
            {
            // InternalOrga.g:1004:2: ( ruleStudent )
            // InternalOrga.g:1005:3: ruleStudent
            {
             before(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getStudentsStudentParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Course__StudentsAssignment_18"


    // $ANTLR start "rule__Teacher__NameAssignment"
    // InternalOrga.g:1014:1: rule__Teacher__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Teacher__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:1018:1: ( ( RULE_STRING ) )
            // InternalOrga.g:1019:2: ( RULE_STRING )
            {
            // InternalOrga.g:1019:2: ( RULE_STRING )
            // InternalOrga.g:1020:3: RULE_STRING
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
    // InternalOrga.g:1029:1: rule__Student__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Student__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:1033:1: ( ( RULE_STRING ) )
            // InternalOrga.g:1034:2: ( RULE_STRING )
            {
            // InternalOrga.g:1034:2: ( RULE_STRING )
            // InternalOrga.g:1035:3: RULE_STRING
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


    // $ANTLR start "rule__Room__LocationAssignment_1"
    // InternalOrga.g:1044:1: rule__Room__LocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Room__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:1048:1: ( ( RULE_STRING ) )
            // InternalOrga.g:1049:2: ( RULE_STRING )
            {
            // InternalOrga.g:1049:2: ( RULE_STRING )
            // InternalOrga.g:1050:3: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getLocationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLocationSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Room__LocationAssignment_1"


    // $ANTLR start "rule__Room__AudienceAssignment_3"
    // InternalOrga.g:1059:1: rule__Room__AudienceAssignment_3 : ( ruleAudienceSize ) ;
    public final void rule__Room__AudienceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrga.g:1063:1: ( ( ruleAudienceSize ) )
            // InternalOrga.g:1064:2: ( ruleAudienceSize )
            {
            // InternalOrga.g:1064:2: ( ruleAudienceSize )
            // InternalOrga.g:1065:3: ruleAudienceSize
            {
             before(grammarAccess.getRoomAccess().getAudienceAudienceSizeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAudienceSize();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAudienceAudienceSizeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Room__AudienceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});

}