/**
 */
package edu.kit.ipd.sdq.ASEM.base;

import edu.kit.ipd.sdq.ASEM.classifiers.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.ASEM.base.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.ASEM.base.BasePackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends Named, Identifiable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see edu.kit.ipd.sdq.ASEM.base.BasePackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.ASEM.base.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // TypedElement
