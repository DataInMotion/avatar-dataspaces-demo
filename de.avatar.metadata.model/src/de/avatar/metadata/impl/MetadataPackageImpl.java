/**
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
package de.avatar.metadata.impl;

import de.avatar.metadata.AnonymizationInfo;
import de.avatar.metadata.AnonymizationMetadata;
import de.avatar.metadata.AnonymizationModelConfig;
import de.avatar.metadata.AnonymizationModelFeatureConfig;
import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.ConsentInfo;
import de.avatar.metadata.ConsentMetadata;
import de.avatar.metadata.DataQualityFilter;
import de.avatar.metadata.DataQualityMetadata;
import de.avatar.metadata.DataQualityResult;
import de.avatar.metadata.Metadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.metadata.MetadataPackage;
import de.avatar.metadata.ResponseMetadata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataPackageImpl extends EPackageImpl implements MetadataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationModelConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationModelFeatureConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQualityMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQualityFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQualityResultEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.avatar.metadata.MetadataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetadataPackageImpl() {
		super(eNS_URI, MetadataFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetadataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetadataPackage init() {
		if (isInited) return (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetadataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetadataPackageImpl theMetadataPackage = registeredMetadataPackage instanceof MetadataPackageImpl ? (MetadataPackageImpl)registeredMetadataPackage : new MetadataPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetadataPackage.createPackageContents();

		// Initialize created meta-data
		theMetadataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetadataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetadataPackage.eNS_URI, theMetadataPackage);
		return theMetadataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Id() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Description() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseMetadata() {
		return responseMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseMetadata_ResponseId() {
		return (EAttribute)responseMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseMetadata_RequestId() {
		return (EAttribute)responseMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseMetadata_ResponseTime() {
		return (EAttribute)responseMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseMetadata_TotConnectorsPerRequest() {
		return (EAttribute)responseMetadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorMetadata() {
		return connectorMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetadata_ConnectorId() {
		return (EAttribute)connectorMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetadata_ConnectorName() {
		return (EAttribute)connectorMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetadata_ConnectorRelativeNumber() {
		return (EAttribute)connectorMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentMetadata() {
		return consentMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentMetadata_ConsentInfo() {
		return (EReference)consentMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentMetadata_ResultsBeforeConsentFilter() {
		return (EAttribute)consentMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentMetadata_ResultsAfterConsentFilter() {
		return (EAttribute)consentMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationMetadata() {
		return anonymizationMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymizationMetadata_AnonymizationInfo() {
		return (EReference)anonymizationMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentInfo() {
		return consentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentInfo_DomainId() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentInfo_PolicyId() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentInfo_PolicyVersion() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentInfo_ConsentIdType() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationInfo() {
		return anonymizationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationInfo_ModelName() {
		return (EAttribute)anonymizationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationInfo_ModelDescription() {
		return (EAttribute)anonymizationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationInfo_ModelVersion() {
		return (EAttribute)anonymizationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationInfo_ModelProvider() {
		return (EAttribute)anonymizationInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymizationInfo_ModelConfig() {
		return (EReference)anonymizationInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationModelConfig() {
		return anonymizationModelConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymizationModelConfig_FeatureConfig() {
		return (EReference)anonymizationModelConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationModelFeatureConfig() {
		return anonymizationModelFeatureConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationModelFeatureConfig_FeatureName() {
		return (EAttribute)anonymizationModelFeatureConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationModelFeatureConfig_Strategy() {
		return (EAttribute)anonymizationModelFeatureConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymizationModelFeatureConfig_Metric() {
		return (EAttribute)anonymizationModelFeatureConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQualityMetadata() {
		return dataQualityMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataQualityMetadata_DataQualityFilter() {
		return (EReference)dataQualityMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQualityFilter() {
		return dataQualityFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQualityFilter_Name() {
		return (EAttribute)dataQualityFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQualityFilter_Description() {
		return (EAttribute)dataQualityFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataQualityFilter_DataQualityResult() {
		return (EReference)dataQualityFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataQualityResult() {
		return dataQualityResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQualityResult_FeatureName() {
		return (EAttribute)dataQualityResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQualityResult_ElementsBeforeQualityFilter() {
		return (EAttribute)dataQualityResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataQualityResult_ElementsAfterQualityFilter() {
		return (EAttribute)dataQualityResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFactory getMetadataFactory() {
		return (MetadataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__ID);
		createEAttribute(metadataEClass, METADATA__DESCRIPTION);

		responseMetadataEClass = createEClass(RESPONSE_METADATA);
		createEAttribute(responseMetadataEClass, RESPONSE_METADATA__RESPONSE_ID);
		createEAttribute(responseMetadataEClass, RESPONSE_METADATA__REQUEST_ID);
		createEAttribute(responseMetadataEClass, RESPONSE_METADATA__RESPONSE_TIME);
		createEAttribute(responseMetadataEClass, RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST);

		connectorMetadataEClass = createEClass(CONNECTOR_METADATA);
		createEAttribute(connectorMetadataEClass, CONNECTOR_METADATA__CONNECTOR_ID);
		createEAttribute(connectorMetadataEClass, CONNECTOR_METADATA__CONNECTOR_NAME);
		createEAttribute(connectorMetadataEClass, CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER);

		consentMetadataEClass = createEClass(CONSENT_METADATA);
		createEReference(consentMetadataEClass, CONSENT_METADATA__CONSENT_INFO);
		createEAttribute(consentMetadataEClass, CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER);
		createEAttribute(consentMetadataEClass, CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER);

		anonymizationMetadataEClass = createEClass(ANONYMIZATION_METADATA);
		createEReference(anonymizationMetadataEClass, ANONYMIZATION_METADATA__ANONYMIZATION_INFO);

		consentInfoEClass = createEClass(CONSENT_INFO);
		createEAttribute(consentInfoEClass, CONSENT_INFO__DOMAIN_ID);
		createEAttribute(consentInfoEClass, CONSENT_INFO__POLICY_ID);
		createEAttribute(consentInfoEClass, CONSENT_INFO__POLICY_VERSION);
		createEAttribute(consentInfoEClass, CONSENT_INFO__CONSENT_ID_TYPE);

		anonymizationInfoEClass = createEClass(ANONYMIZATION_INFO);
		createEAttribute(anonymizationInfoEClass, ANONYMIZATION_INFO__MODEL_NAME);
		createEAttribute(anonymizationInfoEClass, ANONYMIZATION_INFO__MODEL_DESCRIPTION);
		createEAttribute(anonymizationInfoEClass, ANONYMIZATION_INFO__MODEL_VERSION);
		createEAttribute(anonymizationInfoEClass, ANONYMIZATION_INFO__MODEL_PROVIDER);
		createEReference(anonymizationInfoEClass, ANONYMIZATION_INFO__MODEL_CONFIG);

		anonymizationModelConfigEClass = createEClass(ANONYMIZATION_MODEL_CONFIG);
		createEReference(anonymizationModelConfigEClass, ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG);

		anonymizationModelFeatureConfigEClass = createEClass(ANONYMIZATION_MODEL_FEATURE_CONFIG);
		createEAttribute(anonymizationModelFeatureConfigEClass, ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME);
		createEAttribute(anonymizationModelFeatureConfigEClass, ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY);
		createEAttribute(anonymizationModelFeatureConfigEClass, ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC);

		dataQualityMetadataEClass = createEClass(DATA_QUALITY_METADATA);
		createEReference(dataQualityMetadataEClass, DATA_QUALITY_METADATA__DATA_QUALITY_FILTER);

		dataQualityFilterEClass = createEClass(DATA_QUALITY_FILTER);
		createEAttribute(dataQualityFilterEClass, DATA_QUALITY_FILTER__NAME);
		createEAttribute(dataQualityFilterEClass, DATA_QUALITY_FILTER__DESCRIPTION);
		createEReference(dataQualityFilterEClass, DATA_QUALITY_FILTER__DATA_QUALITY_RESULT);

		dataQualityResultEClass = createEClass(DATA_QUALITY_RESULT);
		createEAttribute(dataQualityResultEClass, DATA_QUALITY_RESULT__FEATURE_NAME);
		createEAttribute(dataQualityResultEClass, DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER);
		createEAttribute(dataQualityResultEClass, DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		responseMetadataEClass.getESuperTypes().add(this.getMetadata());
		connectorMetadataEClass.getESuperTypes().add(this.getMetadata());
		consentMetadataEClass.getESuperTypes().add(this.getMetadata());
		anonymizationMetadataEClass.getESuperTypes().add(this.getMetadata());
		dataQualityMetadataEClass.getESuperTypes().add(this.getMetadata());

		// Initialize classes, features, and operations; add parameters
		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Id(), ecorePackage.getEString(), "id", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseMetadataEClass, ResponseMetadata.class, "ResponseMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseMetadata_ResponseId(), ecorePackage.getEString(), "responseId", null, 1, 1, ResponseMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetadata_RequestId(), ecorePackage.getEString(), "requestId", null, 1, 1, ResponseMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetadata_ResponseTime(), ecorePackage.getEString(), "responseTime", null, 0, 1, ResponseMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetadata_TotConnectorsPerRequest(), ecorePackage.getEIntegerObject(), "totConnectorsPerRequest", null, 0, 1, ResponseMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorMetadataEClass, ConnectorMetadata.class, "ConnectorMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorMetadata_ConnectorId(), ecorePackage.getEString(), "connectorId", null, 1, 1, ConnectorMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorMetadata_ConnectorName(), ecorePackage.getEString(), "connectorName", null, 0, 1, ConnectorMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorMetadata_ConnectorRelativeNumber(), ecorePackage.getEIntegerObject(), "connectorRelativeNumber", null, 0, 1, ConnectorMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentMetadataEClass, ConsentMetadata.class, "ConsentMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsentMetadata_ConsentInfo(), this.getConsentInfo(), null, "consentInfo", null, 0, 1, ConsentMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentMetadata_ResultsBeforeConsentFilter(), ecorePackage.getEIntegerObject(), "resultsBeforeConsentFilter", null, 0, 1, ConsentMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentMetadata_ResultsAfterConsentFilter(), ecorePackage.getEIntegerObject(), "resultsAfterConsentFilter", null, 0, 1, ConsentMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationMetadataEClass, AnonymizationMetadata.class, "AnonymizationMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymizationMetadata_AnonymizationInfo(), this.getAnonymizationInfo(), null, "anonymizationInfo", null, 0, 1, AnonymizationMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentInfoEClass, ConsentInfo.class, "ConsentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentInfo_DomainId(), ecorePackage.getEString(), "domainId", null, 0, 1, ConsentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentInfo_PolicyId(), ecorePackage.getEString(), "policyId", null, 0, 1, ConsentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentInfo_PolicyVersion(), ecorePackage.getEString(), "policyVersion", null, 0, 1, ConsentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentInfo_ConsentIdType(), ecorePackage.getEString(), "consentIdType", null, 0, 1, ConsentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationInfoEClass, AnonymizationInfo.class, "AnonymizationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymizationInfo_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, AnonymizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizationInfo_ModelDescription(), ecorePackage.getEString(), "modelDescription", null, 0, 1, AnonymizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizationInfo_ModelVersion(), ecorePackage.getEString(), "modelVersion", null, 0, 1, AnonymizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizationInfo_ModelProvider(), ecorePackage.getEString(), "modelProvider", null, 0, 1, AnonymizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnonymizationInfo_ModelConfig(), this.getAnonymizationModelConfig(), null, "modelConfig", null, 0, 1, AnonymizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationModelConfigEClass, AnonymizationModelConfig.class, "AnonymizationModelConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymizationModelConfig_FeatureConfig(), this.getAnonymizationModelFeatureConfig(), null, "featureConfig", null, 0, -1, AnonymizationModelConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationModelFeatureConfigEClass, AnonymizationModelFeatureConfig.class, "AnonymizationModelFeatureConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymizationModelFeatureConfig_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, AnonymizationModelFeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizationModelFeatureConfig_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1, AnonymizationModelFeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizationModelFeatureConfig_Metric(), ecorePackage.getEString(), "metric", null, 0, 1, AnonymizationModelFeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQualityMetadataEClass, DataQualityMetadata.class, "DataQualityMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataQualityMetadata_DataQualityFilter(), this.getDataQualityFilter(), null, "dataQualityFilter", null, 0, -1, DataQualityMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQualityFilterEClass, DataQualityFilter.class, "DataQualityFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataQualityFilter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataQualityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQualityFilter_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataQualityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataQualityFilter_DataQualityResult(), this.getDataQualityResult(), null, "dataQualityResult", null, 0, -1, DataQualityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataQualityResultEClass, DataQualityResult.class, "DataQualityResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataQualityResult_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, DataQualityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQualityResult_ElementsBeforeQualityFilter(), ecorePackage.getEIntegerObject(), "elementsBeforeQualityFilter", null, 0, 1, DataQualityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataQualityResult_ElementsAfterQualityFilter(), ecorePackage.getEIntegerObject(), "elementsAfterQualityFilter", null, 0, 1, DataQualityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //MetadataPackageImpl
