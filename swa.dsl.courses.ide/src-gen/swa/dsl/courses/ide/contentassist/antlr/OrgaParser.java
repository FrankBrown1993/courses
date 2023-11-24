/*
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import swa.dsl.courses.ide.contentassist.antlr.internal.InternalOrgaParser;
import swa.dsl.courses.services.OrgaGrammarAccess;

public class OrgaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OrgaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OrgaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCourseAccess().getGroup(), "rule__Course__Group__0");
			builder.put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
			builder.put(grammarAccess.getCourseAccess().getTitleAssignment_1(), "rule__Course__TitleAssignment_1");
			builder.put(grammarAccess.getCourseAccess().getTeachersAssignment_4(), "rule__Course__TeachersAssignment_4");
			builder.put(grammarAccess.getCourseAccess().getStudentsAssignment_7(), "rule__Course__StudentsAssignment_7");
			builder.put(grammarAccess.getTeacherAccess().getNameAssignment(), "rule__Teacher__NameAssignment");
			builder.put(grammarAccess.getStudentAccess().getNameAssignment(), "rule__Student__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OrgaGrammarAccess grammarAccess;

	@Override
	protected InternalOrgaParser createParser() {
		InternalOrgaParser result = new InternalOrgaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OrgaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OrgaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
