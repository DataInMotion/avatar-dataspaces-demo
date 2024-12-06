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
 * A representation of the model object '<em><b>Comperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.Comperator#getSuitableForType <em>Suitable For Type</em>}</li>
 *   <li>{@link de.avatar.query.Comperator#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getComperator()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Comperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suitable For Type</em>' attribute.
	 * @see #setSuitableForType(String)
	 * @see de.avatar.query.QueryPackage#getComperator_SuitableForType()
	 * @model required="true"
	 * @generated
	 */
	String getSuitableForType();

	/**
	 * Sets the value of the '{@link de.avatar.query.Comperator#getSuitableForType <em>Suitable For Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suitable For Type</em>' attribute.
	 * @see #getSuitableForType()
	 * @generated
	 */
	void setSuitableForType(String value);

	/**
	 * Returns the value of the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Path</em>' containment reference.
	 * @see #setFeaturePath(FeaturePath)
	 * @see de.avatar.query.QueryPackage#getComperator_FeaturePath()
	 * @model containment="true"
	 * @generated
	 */
	FeaturePath getFeaturePath();

	/**
	 * Sets the value of the '{@link de.avatar.query.Comperator#getFeaturePath <em>Feature Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Path</em>' containment reference.
	 * @see #getFeaturePath()
	 * @generated
	 */
	void setFeaturePath(FeaturePath value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean compare();

} // Comperator
