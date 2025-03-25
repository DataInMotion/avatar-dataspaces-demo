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
package de.avatar.metadata.util;

import de.avatar.metadata.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.metadata.MetadataPackage
 * @generated
 */
public class MetadataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetadataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetadataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataSwitch<Adapter> modelSwitch =
		new MetadataSwitch<Adapter>() {
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseConnectorMetadata(ConnectorMetadata object) {
				return createConnectorMetadataAdapter();
			}
			@Override
			public Adapter caseConsentMetadata(ConsentMetadata object) {
				return createConsentMetadataAdapter();
			}
			@Override
			public Adapter caseAnonymizationMetadata(AnonymizationMetadata object) {
				return createAnonymizationMetadataAdapter();
			}
			@Override
			public Adapter caseConsentInfo(ConsentInfo object) {
				return createConsentInfoAdapter();
			}
			@Override
			public Adapter caseAnonymizationInfo(AnonymizationInfo object) {
				return createAnonymizationInfoAdapter();
			}
			@Override
			public Adapter caseAnonymizationModelConfig(AnonymizationModelConfig object) {
				return createAnonymizationModelConfigAdapter();
			}
			@Override
			public Adapter caseAnonymizationModelFeatureConfig(AnonymizationModelFeatureConfig object) {
				return createAnonymizationModelFeatureConfigAdapter();
			}
			@Override
			public Adapter caseDataQualityMetadata(DataQualityMetadata object) {
				return createDataQualityMetadataAdapter();
			}
			@Override
			public Adapter caseDataQualityFilter(DataQualityFilter object) {
				return createDataQualityFilterAdapter();
			}
			@Override
			public Adapter caseDataQualityResult(DataQualityResult object) {
				return createDataQualityResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.ConnectorMetadata <em>Connector Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.ConnectorMetadata
	 * @generated
	 */
	public Adapter createConnectorMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.ConsentMetadata <em>Consent Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.ConsentMetadata
	 * @generated
	 */
	public Adapter createConsentMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.AnonymizationMetadata <em>Anonymization Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.AnonymizationMetadata
	 * @generated
	 */
	public Adapter createAnonymizationMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.ConsentInfo <em>Consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.ConsentInfo
	 * @generated
	 */
	public Adapter createConsentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.AnonymizationInfo <em>Anonymization Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.AnonymizationInfo
	 * @generated
	 */
	public Adapter createAnonymizationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.AnonymizationModelConfig <em>Anonymization Model Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.AnonymizationModelConfig
	 * @generated
	 */
	public Adapter createAnonymizationModelConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.AnonymizationModelFeatureConfig <em>Anonymization Model Feature Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.AnonymizationModelFeatureConfig
	 * @generated
	 */
	public Adapter createAnonymizationModelFeatureConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.DataQualityMetadata <em>Data Quality Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.DataQualityMetadata
	 * @generated
	 */
	public Adapter createDataQualityMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.DataQualityFilter <em>Data Quality Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.DataQualityFilter
	 * @generated
	 */
	public Adapter createDataQualityFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.metadata.DataQualityResult <em>Data Quality Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.metadata.DataQualityResult
	 * @generated
	 */
	public Adapter createDataQualityResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetadataAdapterFactory
