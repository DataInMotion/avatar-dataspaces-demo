/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.query;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.Operator#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(Comparator)
	 * @see de.avatar.query.QueryPackage#getOperator_Comparator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Comparator getComparator();

	/**
	 * Sets the value of the '{@link de.avatar.query.Operator#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean execute();

} // Operator
