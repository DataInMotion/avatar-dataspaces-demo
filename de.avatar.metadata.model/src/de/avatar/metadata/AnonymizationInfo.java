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
 * A representation of the model object '<em><b>Anonymization Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.AnonymizationInfo#getModelName <em>Model Name</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationInfo#getModelDescription <em>Model Description</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationInfo#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationInfo#getModelProvider <em>Model Provider</em>}</li>
 *   <li>{@link de.avatar.metadata.AnonymizationInfo#getModelConfig <em>Model Config</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo()
 * @model
 * @generated
 */
@ProviderType
public interface AnonymizationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationInfo#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Model Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Description</em>' attribute.
	 * @see #setModelDescription(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo_ModelDescription()
	 * @model
	 * @generated
	 */
	String getModelDescription();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationInfo#getModelDescription <em>Model Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Description</em>' attribute.
	 * @see #getModelDescription()
	 * @generated
	 */
	void setModelDescription(String value);

	/**
	 * Returns the value of the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Version</em>' attribute.
	 * @see #setModelVersion(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo_ModelVersion()
	 * @model
	 * @generated
	 */
	String getModelVersion();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationInfo#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Version</em>' attribute.
	 * @see #getModelVersion()
	 * @generated
	 */
	void setModelVersion(String value);

	/**
	 * Returns the value of the '<em><b>Model Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Provider</em>' attribute.
	 * @see #setModelProvider(String)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo_ModelProvider()
	 * @model
	 * @generated
	 */
	String getModelProvider();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationInfo#getModelProvider <em>Model Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Provider</em>' attribute.
	 * @see #getModelProvider()
	 * @generated
	 */
	void setModelProvider(String value);

	/**
	 * Returns the value of the '<em><b>Model Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Config</em>' containment reference.
	 * @see #setModelConfig(AnonymizationModelConfig)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationInfo_ModelConfig()
	 * @model containment="true"
	 * @generated
	 */
	AnonymizationModelConfig getModelConfig();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationInfo#getModelConfig <em>Model Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Config</em>' containment reference.
	 * @see #getModelConfig()
	 * @generated
	 */
	void setModelConfig(AnonymizationModelConfig value);

} // AnonymizationInfo
