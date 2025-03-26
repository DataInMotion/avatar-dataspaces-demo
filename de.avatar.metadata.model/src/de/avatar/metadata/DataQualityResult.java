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
package de.avatar.metadata;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Quality Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.DataQualityResult#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link de.avatar.metadata.DataQualityResult#getElementsBeforeQualityFilter <em>Elements Before Quality Filter</em>}</li>
 *   <li>{@link de.avatar.metadata.DataQualityResult#getElementsAfterQualityFilter <em>Elements After Quality Filter</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getDataQualityResult()
 * @model
 * @generated
 */
@ProviderType
public interface DataQualityResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityResult_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.DataQualityResult#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Elements Before Quality Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Before Quality Filter</em>' attribute.
	 * @see #setElementsBeforeQualityFilter(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityResult_ElementsBeforeQualityFilter()
	 * @model
	 * @generated
	 */
	Integer getElementsBeforeQualityFilter();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.DataQualityResult#getElementsBeforeQualityFilter <em>Elements Before Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Before Quality Filter</em>' attribute.
	 * @see #getElementsBeforeQualityFilter()
	 * @generated
	 */
	void setElementsBeforeQualityFilter(Integer value);

	/**
	 * Returns the value of the '<em><b>Elements After Quality Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements After Quality Filter</em>' attribute.
	 * @see #setElementsAfterQualityFilter(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityResult_ElementsAfterQualityFilter()
	 * @model
	 * @generated
	 */
	Integer getElementsAfterQualityFilter();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.DataQualityResult#getElementsAfterQualityFilter <em>Elements After Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements After Quality Filter</em>' attribute.
	 * @see #getElementsAfterQualityFilter()
	 * @generated
	 */
	void setElementsAfterQualityFilter(Integer value);

} // DataQualityResult
