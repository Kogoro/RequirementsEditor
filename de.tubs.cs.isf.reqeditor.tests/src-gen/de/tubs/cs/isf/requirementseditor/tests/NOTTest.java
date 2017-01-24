/**
 */
package de.tubs.cs.isf.requirementseditor.tests;

import de.tubs.cs.isf.requirementseditor.NOT;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NOT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NOTTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NOTTest.class);
	}

	/**
	 * Constructs a new NOT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NOT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NOT getFixture() {
		return (NOT) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsEditorFactory.eINSTANCE.createNOT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NOTTest
