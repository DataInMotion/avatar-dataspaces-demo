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

import de.avatar.metadata.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataFactoryImpl extends EFactoryImpl implements MetadataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetadataFactory init() {
		try {
			MetadataFactory theMetadataFactory = (MetadataFactory)EPackage.Registry.INSTANCE.getEFactory(MetadataPackage.eNS_URI);
			if (theMetadataFactory != null) {
				return theMetadataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetadataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetadataPackage.METADATA: return createMetadata();
			case MetadataPackage.RESPONSE_METADATA: return createResponseMetadata();
			case MetadataPackage.CONNECTOR_METADATA: return createConnectorMetadata();
			case MetadataPackage.CONSENT_METADATA: return createConsentMetadata();
			case MetadataPackage.ANONYMIZATION_METADATA: return createAnonymizationMetadata();
			case MetadataPackage.CONSENT_INFO: return createConsentInfo();
			case MetadataPackage.ANONYMIZATION_INFO: return createAnonymizationInfo();
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG: return createAnonymizationModelConfig();
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG: return createAnonymizationModelFeatureConfig();
			case MetadataPackage.DATA_QUALITY_METADATA: return createDataQualityMetadata();
			case MetadataPackage.DATA_QUALITY_FILTER: return createDataQualityFilter();
			case MetadataPackage.DATA_QUALITY_RESULT: return createDataQualityResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseMetadata createResponseMetadata() {
		ResponseMetadataImpl responseMetadata = new ResponseMetadataImpl();
		return responseMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorMetadata createConnectorMetadata() {
		ConnectorMetadataImpl connectorMetadata = new ConnectorMetadataImpl();
		return connectorMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentMetadata createConsentMetadata() {
		ConsentMetadataImpl consentMetadata = new ConsentMetadataImpl();
		return consentMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationMetadata createAnonymizationMetadata() {
		AnonymizationMetadataImpl anonymizationMetadata = new AnonymizationMetadataImpl();
		return anonymizationMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentInfo createConsentInfo() {
		ConsentInfoImpl consentInfo = new ConsentInfoImpl();
		return consentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationInfo createAnonymizationInfo() {
		AnonymizationInfoImpl anonymizationInfo = new AnonymizationInfoImpl();
		return anonymizationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationModelConfig createAnonymizationModelConfig() {
		AnonymizationModelConfigImpl anonymizationModelConfig = new AnonymizationModelConfigImpl();
		return anonymizationModelConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationModelFeatureConfig createAnonymizationModelFeatureConfig() {
		AnonymizationModelFeatureConfigImpl anonymizationModelFeatureConfig = new AnonymizationModelFeatureConfigImpl();
		return anonymizationModelFeatureConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataQualityMetadata createDataQualityMetadata() {
		DataQualityMetadataImpl dataQualityMetadata = new DataQualityMetadataImpl();
		return dataQualityMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataQualityFilter createDataQualityFilter() {
		DataQualityFilterImpl dataQualityFilter = new DataQualityFilterImpl();
		return dataQualityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataQualityResult createDataQualityResult() {
		DataQualityResultImpl dataQualityResult = new DataQualityResultImpl();
		return dataQualityResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataPackage getMetadataPackage() {
		return (MetadataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetadataPackage getPackage() {
		return MetadataPackage.eINSTANCE;
	}

} //MetadataFactoryImpl
