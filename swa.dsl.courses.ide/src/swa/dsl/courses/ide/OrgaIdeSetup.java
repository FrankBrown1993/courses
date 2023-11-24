/*
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import swa.dsl.courses.OrgaRuntimeModule;
import swa.dsl.courses.OrgaStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class OrgaIdeSetup extends OrgaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new OrgaRuntimeModule(), new OrgaIdeModule()));
	}
	
}