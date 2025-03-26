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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.avatar.metadata.MetadataPackage
 * @generated
 */
public class MetadataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetadataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataSwitch() {
		if (modelPackage == null) {
			modelPackage = MetadataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetadataPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.RESPONSE_METADATA: {
				ResponseMetadata responseMetadata = (ResponseMetadata)theEObject;
				T result = caseResponseMetadata(responseMetadata);
				if (result == null) result = caseMetadata(responseMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.CONNECTOR_METADATA: {
				ConnectorMetadata connectorMetadata = (ConnectorMetadata)theEObject;
				T result = caseConnectorMetadata(connectorMetadata);
				if (result == null) result = caseMetadata(connectorMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.CONSENT_METADATA: {
				ConsentMetadata consentMetadata = (ConsentMetadata)theEObject;
				T result = caseConsentMetadata(consentMetadata);
				if (result == null) result = caseMetadata(consentMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.ANONYMIZATION_METADATA: {
				AnonymizationMetadata anonymizationMetadata = (AnonymizationMetadata)theEObject;
				T result = caseAnonymizationMetadata(anonymizationMetadata);
				if (result == null) result = caseMetadata(anonymizationMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.CONSENT_INFO: {
				ConsentInfo consentInfo = (ConsentInfo)theEObject;
				T result = caseConsentInfo(consentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.ANONYMIZATION_INFO: {
				AnonymizationInfo anonymizationInfo = (AnonymizationInfo)theEObject;
				T result = caseAnonymizationInfo(anonymizationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG: {
				AnonymizationModelConfig anonymizationModelConfig = (AnonymizationModelConfig)theEObject;
				T result = caseAnonymizationModelConfig(anonymizationModelConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG: {
				AnonymizationModelFeatureConfig anonymizationModelFeatureConfig = (AnonymizationModelFeatureConfig)theEObject;
				T result = caseAnonymizationModelFeatureConfig(anonymizationModelFeatureConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.DATA_QUALITY_METADATA: {
				DataQualityMetadata dataQualityMetadata = (DataQualityMetadata)theEObject;
				T result = caseDataQualityMetadata(dataQualityMetadata);
				if (result == null) result = caseMetadata(dataQualityMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.DATA_QUALITY_FILTER: {
				DataQualityFilter dataQualityFilter = (DataQualityFilter)theEObject;
				T result = caseDataQualityFilter(dataQualityFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetadataPackage.DATA_QUALITY_RESULT: {
				DataQualityResult dataQualityResult = (DataQualityResult)theEObject;
				T result = caseDataQualityResult(dataQualityResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMetadata(ResponseMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorMetadata(ConnectorMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentMetadata(ConsentMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationMetadata(AnonymizationMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentInfo(ConsentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationInfo(AnonymizationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Model Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Model Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationModelConfig(AnonymizationModelConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Model Feature Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Model Feature Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationModelFeatureConfig(AnonymizationModelFeatureConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Quality Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Quality Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataQualityMetadata(DataQualityMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Quality Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Quality Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataQualityFilter(DataQualityFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Quality Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Quality Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataQualityResult(DataQualityResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetadataSwitch
