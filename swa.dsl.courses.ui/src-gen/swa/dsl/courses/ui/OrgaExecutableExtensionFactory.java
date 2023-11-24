/*
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import swa.dsl.courses.ui.internal.CoursesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OrgaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CoursesActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CoursesActivator activator = CoursesActivator.getInstance();
		return activator != null ? activator.getInjector(CoursesActivator.SWA_DSL_COURSES_ORGA) : null;
	}

}