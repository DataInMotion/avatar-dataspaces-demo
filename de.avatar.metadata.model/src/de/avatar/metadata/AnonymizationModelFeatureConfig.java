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
import org.eclipse.emf.ecore.EStructuralFeature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymization Model Feature Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelFeatureConfig()
 * @model
 * @generated
 */
@ProviderType
public interface AnonymizationModelFeatureConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelFeatureConfig_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelFeatureConfig_Strategy()
	 * @model
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelFeatureConfig_Metric()
	 * @model
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

} // AnonymizationModelFeatureConfig
