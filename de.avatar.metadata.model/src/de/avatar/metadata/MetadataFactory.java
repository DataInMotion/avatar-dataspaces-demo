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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.metadata.MetadataPackage
 * @generated
 */
@ProviderType
public interface MetadataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetadataFactory eINSTANCE = de.avatar.metadata.impl.MetadataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Response Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Metadata</em>'.
	 * @generated
	 */
	ResponseMetadata createResponseMetadata();

	/**
	 * Returns a new object of class '<em>Connector Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Metadata</em>'.
	 * @generated
	 */
	ConnectorMetadata createConnectorMetadata();

	/**
	 * Returns a new object of class '<em>Consent Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Metadata</em>'.
	 * @generated
	 */
	ConsentMetadata createConsentMetadata();

	/**
	 * Returns a new object of class '<em>Anonymization Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymization Metadata</em>'.
	 * @generated
	 */
	AnonymizationMetadata createAnonymizationMetadata();

	/**
	 * Returns a new object of class '<em>Consent Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Info</em>'.
	 * @generated
	 */
	ConsentInfo createConsentInfo();

	/**
	 * Returns a new object of class '<em>Anonymization Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymization Info</em>'.
	 * @generated
	 */
	AnonymizationInfo createAnonymizationInfo();

	/**
	 * Returns a new object of class '<em>Anonymization Model Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymization Model Config</em>'.
	 * @generated
	 */
	AnonymizationModelConfig createAnonymizationModelConfig();

	/**
	 * Returns a new object of class '<em>Anonymization Model Feature Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymization Model Feature Config</em>'.
	 * @generated
	 */
	AnonymizationModelFeatureConfig createAnonymizationModelFeatureConfig();

	/**
	 * Returns a new object of class '<em>Data Quality Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Quality Metadata</em>'.
	 * @generated
	 */
	DataQualityMetadata createDataQualityMetadata();

	/**
	 * Returns a new object of class '<em>Data Quality Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Quality Filter</em>'.
	 * @generated
	 */
	DataQualityFilter createDataQualityFilter();

	/**
	 * Returns a new object of class '<em>Data Quality Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Quality Result</em>'.
	 * @generated
	 */
	DataQualityResult createDataQualityResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetadataPackage getMetadataPackage();

} //MetadataFactory
