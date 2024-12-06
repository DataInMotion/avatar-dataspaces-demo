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
import org.eclipse.emf.ecore.EStructuralFeature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.SortEntity#getSortOrder <em>Sort Order</em>}</li>
 *   <li>{@link de.avatar.query.SortEntity#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getSortEntity()
 * @model
 * @generated
 */
@ProviderType
public interface SortEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort Order</b></em>' attribute.
	 * The default value is <code>"DESC"</code>.
	 * The literals are from the enumeration {@link de.avatar.query.SortOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Order</em>' attribute.
	 * @see de.avatar.query.SortOrder
	 * @see #setSortOrder(SortOrder)
	 * @see de.avatar.query.QueryPackage#getSortEntity_SortOrder()
	 * @model default="DESC" required="true"
	 * @generated
	 */
	SortOrder getSortOrder();

	/**
	 * Sets the value of the '{@link de.avatar.query.SortEntity#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Order</em>' attribute.
	 * @see de.avatar.query.SortOrder
	 * @see #getSortOrder()
	 * @generated
	 */
	void setSortOrder(SortOrder value);

	/**
	 * Returns the value of the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Path</em>' containment reference.
	 * @see #setFeaturePath(EStructuralFeature)
	 * @see de.avatar.query.QueryPackage#getSortEntity_FeaturePath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EStructuralFeature getFeaturePath();

	/**
	 * Sets the value of the '{@link de.avatar.query.SortEntity#getFeaturePath <em>Feature Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Path</em>' containment reference.
	 * @see #getFeaturePath()
	 * @generated
	 */
	void setFeaturePath(EStructuralFeature value);

} // SortEntity
