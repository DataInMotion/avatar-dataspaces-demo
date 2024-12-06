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
 *   <li>{@link de.avatar.query.Operator#getComperator <em>Comperator</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperator</em>' containment reference.
	 * @see #setComperator(Comperator)
	 * @see de.avatar.query.QueryPackage#getOperator_Comperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Comperator getComperator();

	/**
	 * Sets the value of the '{@link de.avatar.query.Operator#getComperator <em>Comperator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperator</em>' containment reference.
	 * @see #getComperator()
	 * @generated
	 */
	void setComperator(Comperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean execute();

} // Operator
