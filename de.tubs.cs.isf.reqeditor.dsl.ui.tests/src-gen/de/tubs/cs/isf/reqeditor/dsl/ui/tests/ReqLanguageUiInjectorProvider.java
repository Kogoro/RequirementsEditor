/*
 * generated by Xtext 2.11.0
 */
package de.tubs.cs.isf.reqeditor.dsl.ui.tests;

import com.google.inject.Injector;
import de.tubs.cs.isf.reqeditor.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ReqLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("de.tubs.cs.isf.reqeditor.dsl.ReqLanguage");
	}

}