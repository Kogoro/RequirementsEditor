/*
 * generated by Xtext 2.10.0
 */
package de.tubs.cs.isf.reqeditor.administration.ui.tests;

import com.google.inject.Injector;
import de.tubs.cs.isf.reqeditor.administration.ui.internal.AdministrationActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ReqAdminUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AdministrationActivator.getInstance().getInjector("de.tubs.cs.isf.reqeditor.administration.ReqAdmin");
	}

}
