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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.avatar.metadata.MetadataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = MetadataPackage.eNS_URI, genModel = "/model/metadata.genmodel", genModelSourceLocations = {"model/metadata.genmodel","de.avatar.metadata.model/model/metadata.genmodel"}, ecore="/model/metadata.ecore", ecoreSourceLocations="/model/metadata.ecore")
public interface MetadataPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metadata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://avatar-project.de/metadata/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metadata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetadataPackage eINSTANCE = de.avatar.metadata.impl.MetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.MetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.ResponseMetadataImpl <em>Response Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.ResponseMetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getResponseMetadata()
	 * @generated
	 */
	int RESPONSE_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__ID = METADATA__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__RESPONSE_ID = METADATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__REQUEST_ID = METADATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__RESPONSE_TIME = METADATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tot Connectors Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST = METADATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Response Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Response Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METADATA_OPERATION_COUNT = METADATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.ConnectorMetadataImpl <em>Connector Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.ConnectorMetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConnectorMetadata()
	 * @generated
	 */
	int CONNECTOR_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA__ID = METADATA__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA__CONNECTOR_ID = METADATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA__CONNECTOR_NAME = METADATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Relative Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER = METADATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connector Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METADATA_OPERATION_COUNT = METADATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.ConsentMetadataImpl <em>Consent Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.ConsentMetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConsentMetadata()
	 * @generated
	 */
	int CONSENT_METADATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA__ID = METADATA__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Consent Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA__CONSENT_INFO = METADATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results Before Consent Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER = METADATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results After Consent Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER = METADATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Consent Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Consent Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_METADATA_OPERATION_COUNT = METADATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.AnonymizationMetadataImpl <em>Anonymization Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.AnonymizationMetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationMetadata()
	 * @generated
	 */
	int ANONYMIZATION_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_METADATA__ID = METADATA__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Anonymization Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_METADATA__ANONYMIZATION_INFO = METADATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymization Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anonymization Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_METADATA_OPERATION_COUNT = METADATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.ConsentInfoImpl <em>Consent Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.ConsentInfoImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConsentInfo()
	 * @generated
	 */
	int CONSENT_INFO = 5;

	/**
	 * The feature id for the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__DOMAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__POLICY_ID = 1;

	/**
	 * The feature id for the '<em><b>Policy Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__POLICY_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Consent Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__CONSENT_ID_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Consent Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Consent Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.AnonymizationInfoImpl <em>Anonymization Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.AnonymizationInfoImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationInfo()
	 * @generated
	 */
	int ANONYMIZATION_INFO = 6;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO__MODEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO__MODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO__MODEL_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Model Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO__MODEL_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Model Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO__MODEL_CONFIG = 4;

	/**
	 * The number of structural features of the '<em>Anonymization Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Anonymization Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.AnonymizationModelConfigImpl <em>Anonymization Model Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.AnonymizationModelConfigImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationModelConfig()
	 * @generated
	 */
	int ANONYMIZATION_MODEL_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Feature Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Anonymization Model Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Anonymization Model Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl <em>Anonymization Model Feature Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationModelFeatureConfig()
	 * @generated
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG = 8;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC = 2;

	/**
	 * The number of structural features of the '<em>Anonymization Model Feature Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anonymization Model Feature Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_MODEL_FEATURE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.DataQualityMetadataImpl <em>Data Quality Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.DataQualityMetadataImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityMetadata()
	 * @generated
	 */
	int DATA_QUALITY_METADATA = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_METADATA__ID = METADATA__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Quality Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_METADATA__DATA_QUALITY_FILTER = METADATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Quality Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Quality Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_METADATA_OPERATION_COUNT = METADATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.DataQualityFilterImpl <em>Data Quality Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.DataQualityFilterImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityFilter()
	 * @generated
	 */
	int DATA_QUALITY_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_FILTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_FILTER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Data Quality Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_FILTER__DATA_QUALITY_RESULT = 2;

	/**
	 * The number of structural features of the '<em>Data Quality Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_FILTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Quality Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.metadata.impl.DataQualityResultImpl <em>Data Quality Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.metadata.impl.DataQualityResultImpl
	 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityResult()
	 * @generated
	 */
	int DATA_QUALITY_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_RESULT__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements Before Quality Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Elements After Quality Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER = 2;

	/**
	 * The number of structural features of the '<em>Data Quality Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Quality Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUALITY_RESULT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see de.avatar.metadata.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.Metadata#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.metadata.Metadata#getId()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.Metadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.avatar.metadata.Metadata#getDescription()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Description();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.ResponseMetadata <em>Response Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Metadata</em>'.
	 * @see de.avatar.metadata.ResponseMetadata
	 * @generated
	 */
	EClass getResponseMetadata();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ResponseMetadata#getResponseId <em>Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Id</em>'.
	 * @see de.avatar.metadata.ResponseMetadata#getResponseId()
	 * @see #getResponseMetadata()
	 * @generated
	 */
	EAttribute getResponseMetadata_ResponseId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ResponseMetadata#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.avatar.metadata.ResponseMetadata#getRequestId()
	 * @see #getResponseMetadata()
	 * @generated
	 */
	EAttribute getResponseMetadata_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ResponseMetadata#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see de.avatar.metadata.ResponseMetadata#getResponseTime()
	 * @see #getResponseMetadata()
	 * @generated
	 */
	EAttribute getResponseMetadata_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ResponseMetadata#getTotConnectorsPerRequest <em>Tot Connectors Per Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tot Connectors Per Request</em>'.
	 * @see de.avatar.metadata.ResponseMetadata#getTotConnectorsPerRequest()
	 * @see #getResponseMetadata()
	 * @generated
	 */
	EAttribute getResponseMetadata_TotConnectorsPerRequest();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.ConnectorMetadata <em>Connector Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Metadata</em>'.
	 * @see de.avatar.metadata.ConnectorMetadata
	 * @generated
	 */
	EClass getConnectorMetadata();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConnectorMetadata#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.avatar.metadata.ConnectorMetadata#getConnectorId()
	 * @see #getConnectorMetadata()
	 * @generated
	 */
	EAttribute getConnectorMetadata_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConnectorMetadata#getConnectorName <em>Connector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Name</em>'.
	 * @see de.avatar.metadata.ConnectorMetadata#getConnectorName()
	 * @see #getConnectorMetadata()
	 * @generated
	 */
	EAttribute getConnectorMetadata_ConnectorName();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConnectorMetadata#getConnectorRelativeNumber <em>Connector Relative Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Relative Number</em>'.
	 * @see de.avatar.metadata.ConnectorMetadata#getConnectorRelativeNumber()
	 * @see #getConnectorMetadata()
	 * @generated
	 */
	EAttribute getConnectorMetadata_ConnectorRelativeNumber();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.ConsentMetadata <em>Consent Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Metadata</em>'.
	 * @see de.avatar.metadata.ConsentMetadata
	 * @generated
	 */
	EClass getConsentMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.metadata.ConsentMetadata#getConsentInfo <em>Consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Info</em>'.
	 * @see de.avatar.metadata.ConsentMetadata#getConsentInfo()
	 * @see #getConsentMetadata()
	 * @generated
	 */
	EReference getConsentMetadata_ConsentInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentMetadata#getResultsBeforeConsentFilter <em>Results Before Consent Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Before Consent Filter</em>'.
	 * @see de.avatar.metadata.ConsentMetadata#getResultsBeforeConsentFilter()
	 * @see #getConsentMetadata()
	 * @generated
	 */
	EAttribute getConsentMetadata_ResultsBeforeConsentFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentMetadata#getResultsAfterConsentFilter <em>Results After Consent Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results After Consent Filter</em>'.
	 * @see de.avatar.metadata.ConsentMetadata#getResultsAfterConsentFilter()
	 * @see #getConsentMetadata()
	 * @generated
	 */
	EAttribute getConsentMetadata_ResultsAfterConsentFilter();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.AnonymizationMetadata <em>Anonymization Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Metadata</em>'.
	 * @see de.avatar.metadata.AnonymizationMetadata
	 * @generated
	 */
	EClass getAnonymizationMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.metadata.AnonymizationMetadata#getAnonymizationInfo <em>Anonymization Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymization Info</em>'.
	 * @see de.avatar.metadata.AnonymizationMetadata#getAnonymizationInfo()
	 * @see #getAnonymizationMetadata()
	 * @generated
	 */
	EReference getAnonymizationMetadata_AnonymizationInfo();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.ConsentInfo <em>Consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Info</em>'.
	 * @see de.avatar.metadata.ConsentInfo
	 * @generated
	 */
	EClass getConsentInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentInfo#getDomainId <em>Domain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Id</em>'.
	 * @see de.avatar.metadata.ConsentInfo#getDomainId()
	 * @see #getConsentInfo()
	 * @generated
	 */
	EAttribute getConsentInfo_DomainId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentInfo#getPolicyId <em>Policy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Id</em>'.
	 * @see de.avatar.metadata.ConsentInfo#getPolicyId()
	 * @see #getConsentInfo()
	 * @generated
	 */
	EAttribute getConsentInfo_PolicyId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentInfo#getPolicyVersion <em>Policy Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Version</em>'.
	 * @see de.avatar.metadata.ConsentInfo#getPolicyVersion()
	 * @see #getConsentInfo()
	 * @generated
	 */
	EAttribute getConsentInfo_PolicyVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.ConsentInfo#getConsentIdType <em>Consent Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consent Id Type</em>'.
	 * @see de.avatar.metadata.ConsentInfo#getConsentIdType()
	 * @see #getConsentInfo()
	 * @generated
	 */
	EAttribute getConsentInfo_ConsentIdType();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.AnonymizationInfo <em>Anonymization Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Info</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo
	 * @generated
	 */
	EClass getAnonymizationInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationInfo#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo#getModelName()
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	EAttribute getAnonymizationInfo_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationInfo#getModelDescription <em>Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Description</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo#getModelDescription()
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	EAttribute getAnonymizationInfo_ModelDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationInfo#getModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Version</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo#getModelVersion()
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	EAttribute getAnonymizationInfo_ModelVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationInfo#getModelProvider <em>Model Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Provider</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo#getModelProvider()
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	EAttribute getAnonymizationInfo_ModelProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.metadata.AnonymizationInfo#getModelConfig <em>Model Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Config</em>'.
	 * @see de.avatar.metadata.AnonymizationInfo#getModelConfig()
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	EReference getAnonymizationInfo_ModelConfig();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.AnonymizationModelConfig <em>Anonymization Model Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Model Config</em>'.
	 * @see de.avatar.metadata.AnonymizationModelConfig
	 * @generated
	 */
	EClass getAnonymizationModelConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.metadata.AnonymizationModelConfig#getFeatureConfig <em>Feature Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Config</em>'.
	 * @see de.avatar.metadata.AnonymizationModelConfig#getFeatureConfig()
	 * @see #getAnonymizationModelConfig()
	 * @generated
	 */
	EReference getAnonymizationModelConfig_FeatureConfig();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.AnonymizationModelFeatureConfig <em>Anonymization Model Feature Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Model Feature Config</em>'.
	 * @see de.avatar.metadata.AnonymizationModelFeatureConfig
	 * @generated
	 */
	EClass getAnonymizationModelFeatureConfig();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see de.avatar.metadata.AnonymizationModelFeatureConfig#getFeatureName()
	 * @see #getAnonymizationModelFeatureConfig()
	 * @generated
	 */
	EAttribute getAnonymizationModelFeatureConfig_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see de.avatar.metadata.AnonymizationModelFeatureConfig#getStrategy()
	 * @see #getAnonymizationModelFeatureConfig()
	 * @generated
	 */
	EAttribute getAnonymizationModelFeatureConfig_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.AnonymizationModelFeatureConfig#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.avatar.metadata.AnonymizationModelFeatureConfig#getMetric()
	 * @see #getAnonymizationModelFeatureConfig()
	 * @generated
	 */
	EAttribute getAnonymizationModelFeatureConfig_Metric();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.DataQualityMetadata <em>Data Quality Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Quality Metadata</em>'.
	 * @see de.avatar.metadata.DataQualityMetadata
	 * @generated
	 */
	EClass getDataQualityMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.metadata.DataQualityMetadata#getDataQualityFilter <em>Data Quality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Quality Filter</em>'.
	 * @see de.avatar.metadata.DataQualityMetadata#getDataQualityFilter()
	 * @see #getDataQualityMetadata()
	 * @generated
	 */
	EReference getDataQualityMetadata_DataQualityFilter();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.DataQualityFilter <em>Data Quality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Quality Filter</em>'.
	 * @see de.avatar.metadata.DataQualityFilter
	 * @generated
	 */
	EClass getDataQualityFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.DataQualityFilter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.metadata.DataQualityFilter#getName()
	 * @see #getDataQualityFilter()
	 * @generated
	 */
	EAttribute getDataQualityFilter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.DataQualityFilter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.avatar.metadata.DataQualityFilter#getDescription()
	 * @see #getDataQualityFilter()
	 * @generated
	 */
	EAttribute getDataQualityFilter_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.metadata.DataQualityFilter#getDataQualityResult <em>Data Quality Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Quality Result</em>'.
	 * @see de.avatar.metadata.DataQualityFilter#getDataQualityResult()
	 * @see #getDataQualityFilter()
	 * @generated
	 */
	EReference getDataQualityFilter_DataQualityResult();

	/**
	 * Returns the meta object for class '{@link de.avatar.metadata.DataQualityResult <em>Data Quality Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Quality Result</em>'.
	 * @see de.avatar.metadata.DataQualityResult
	 * @generated
	 */
	EClass getDataQualityResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.DataQualityResult#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see de.avatar.metadata.DataQualityResult#getFeatureName()
	 * @see #getDataQualityResult()
	 * @generated
	 */
	EAttribute getDataQualityResult_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.DataQualityResult#getElementsBeforeQualityFilter <em>Elements Before Quality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements Before Quality Filter</em>'.
	 * @see de.avatar.metadata.DataQualityResult#getElementsBeforeQualityFilter()
	 * @see #getDataQualityResult()
	 * @generated
	 */
	EAttribute getDataQualityResult_ElementsBeforeQualityFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.metadata.DataQualityResult#getElementsAfterQualityFilter <em>Elements After Quality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements After Quality Filter</em>'.
	 * @see de.avatar.metadata.DataQualityResult#getElementsAfterQualityFilter()
	 * @see #getDataQualityResult()
	 * @generated
	 */
	EAttribute getDataQualityResult_ElementsAfterQualityFilter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetadataFactory getMetadataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.MetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__ID = eINSTANCE.getMetadata_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__DESCRIPTION = eINSTANCE.getMetadata_Description();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.ResponseMetadataImpl <em>Response Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.ResponseMetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getResponseMetadata()
		 * @generated
		 */
		EClass RESPONSE_METADATA = eINSTANCE.getResponseMetadata();

		/**
		 * The meta object literal for the '<em><b>Response Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METADATA__RESPONSE_ID = eINSTANCE.getResponseMetadata_ResponseId();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METADATA__REQUEST_ID = eINSTANCE.getResponseMetadata_RequestId();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METADATA__RESPONSE_TIME = eINSTANCE.getResponseMetadata_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Tot Connectors Per Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST = eINSTANCE.getResponseMetadata_TotConnectorsPerRequest();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.ConnectorMetadataImpl <em>Connector Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.ConnectorMetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConnectorMetadata()
		 * @generated
		 */
		EClass CONNECTOR_METADATA = eINSTANCE.getConnectorMetadata();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METADATA__CONNECTOR_ID = eINSTANCE.getConnectorMetadata_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Connector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METADATA__CONNECTOR_NAME = eINSTANCE.getConnectorMetadata_ConnectorName();

		/**
		 * The meta object literal for the '<em><b>Connector Relative Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER = eINSTANCE.getConnectorMetadata_ConnectorRelativeNumber();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.ConsentMetadataImpl <em>Consent Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.ConsentMetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConsentMetadata()
		 * @generated
		 */
		EClass CONSENT_METADATA = eINSTANCE.getConsentMetadata();

		/**
		 * The meta object literal for the '<em><b>Consent Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSENT_METADATA__CONSENT_INFO = eINSTANCE.getConsentMetadata_ConsentInfo();

		/**
		 * The meta object literal for the '<em><b>Results Before Consent Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER = eINSTANCE.getConsentMetadata_ResultsBeforeConsentFilter();

		/**
		 * The meta object literal for the '<em><b>Results After Consent Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER = eINSTANCE.getConsentMetadata_ResultsAfterConsentFilter();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.AnonymizationMetadataImpl <em>Anonymization Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.AnonymizationMetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationMetadata()
		 * @generated
		 */
		EClass ANONYMIZATION_METADATA = eINSTANCE.getAnonymizationMetadata();

		/**
		 * The meta object literal for the '<em><b>Anonymization Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMIZATION_METADATA__ANONYMIZATION_INFO = eINSTANCE.getAnonymizationMetadata_AnonymizationInfo();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.ConsentInfoImpl <em>Consent Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.ConsentInfoImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getConsentInfo()
		 * @generated
		 */
		EClass CONSENT_INFO = eINSTANCE.getConsentInfo();

		/**
		 * The meta object literal for the '<em><b>Domain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__DOMAIN_ID = eINSTANCE.getConsentInfo_DomainId();

		/**
		 * The meta object literal for the '<em><b>Policy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__POLICY_ID = eINSTANCE.getConsentInfo_PolicyId();

		/**
		 * The meta object literal for the '<em><b>Policy Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__POLICY_VERSION = eINSTANCE.getConsentInfo_PolicyVersion();

		/**
		 * The meta object literal for the '<em><b>Consent Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__CONSENT_ID_TYPE = eINSTANCE.getConsentInfo_ConsentIdType();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.AnonymizationInfoImpl <em>Anonymization Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.AnonymizationInfoImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationInfo()
		 * @generated
		 */
		EClass ANONYMIZATION_INFO = eINSTANCE.getAnonymizationInfo();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_INFO__MODEL_NAME = eINSTANCE.getAnonymizationInfo_ModelName();

		/**
		 * The meta object literal for the '<em><b>Model Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_INFO__MODEL_DESCRIPTION = eINSTANCE.getAnonymizationInfo_ModelDescription();

		/**
		 * The meta object literal for the '<em><b>Model Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_INFO__MODEL_VERSION = eINSTANCE.getAnonymizationInfo_ModelVersion();

		/**
		 * The meta object literal for the '<em><b>Model Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_INFO__MODEL_PROVIDER = eINSTANCE.getAnonymizationInfo_ModelProvider();

		/**
		 * The meta object literal for the '<em><b>Model Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMIZATION_INFO__MODEL_CONFIG = eINSTANCE.getAnonymizationInfo_ModelConfig();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.AnonymizationModelConfigImpl <em>Anonymization Model Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.AnonymizationModelConfigImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationModelConfig()
		 * @generated
		 */
		EClass ANONYMIZATION_MODEL_CONFIG = eINSTANCE.getAnonymizationModelConfig();

		/**
		 * The meta object literal for the '<em><b>Feature Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG = eINSTANCE.getAnonymizationModelConfig_FeatureConfig();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl <em>Anonymization Model Feature Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getAnonymizationModelFeatureConfig()
		 * @generated
		 */
		EClass ANONYMIZATION_MODEL_FEATURE_CONFIG = eINSTANCE.getAnonymizationModelFeatureConfig();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME = eINSTANCE.getAnonymizationModelFeatureConfig_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY = eINSTANCE.getAnonymizationModelFeatureConfig_Strategy();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC = eINSTANCE.getAnonymizationModelFeatureConfig_Metric();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.DataQualityMetadataImpl <em>Data Quality Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.DataQualityMetadataImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityMetadata()
		 * @generated
		 */
		EClass DATA_QUALITY_METADATA = eINSTANCE.getDataQualityMetadata();

		/**
		 * The meta object literal for the '<em><b>Data Quality Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_QUALITY_METADATA__DATA_QUALITY_FILTER = eINSTANCE.getDataQualityMetadata_DataQualityFilter();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.DataQualityFilterImpl <em>Data Quality Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.DataQualityFilterImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityFilter()
		 * @generated
		 */
		EClass DATA_QUALITY_FILTER = eINSTANCE.getDataQualityFilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUALITY_FILTER__NAME = eINSTANCE.getDataQualityFilter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUALITY_FILTER__DESCRIPTION = eINSTANCE.getDataQualityFilter_Description();

		/**
		 * The meta object literal for the '<em><b>Data Quality Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_QUALITY_FILTER__DATA_QUALITY_RESULT = eINSTANCE.getDataQualityFilter_DataQualityResult();

		/**
		 * The meta object literal for the '{@link de.avatar.metadata.impl.DataQualityResultImpl <em>Data Quality Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.metadata.impl.DataQualityResultImpl
		 * @see de.avatar.metadata.impl.MetadataPackageImpl#getDataQualityResult()
		 * @generated
		 */
		EClass DATA_QUALITY_RESULT = eINSTANCE.getDataQualityResult();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUALITY_RESULT__FEATURE_NAME = eINSTANCE.getDataQualityResult_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Elements Before Quality Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER = eINSTANCE.getDataQualityResult_ElementsBeforeQualityFilter();

		/**
		 * The meta object literal for the '<em><b>Elements After Quality Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER = eINSTANCE.getDataQualityResult_ElementsAfterQualityFilter();

	}

} //MetadataPackage
