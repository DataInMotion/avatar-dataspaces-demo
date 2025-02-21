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
package de.avatar.connector.api;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

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
 * @see de.avatar.connector.api.ApiFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ApiPackage.eNS_URI, genModel = "/model/avatar-connector-api.genmodel", genModelSourceLocations = {"model/avatar-connector-api.genmodel","de.avatar.connector.api/model/avatar-connector-api.genmodel"}, ecore="/model/avatar-connector-api.ecore", ecoreSourceLocations="/model/avatar-connector-api.ecore")
public interface ApiPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "api";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.avatar-projekt.de/connector/api";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiPackage eINSTANCE = de.avatar.connector.api.impl.ApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.connector.api.AvatarConnectorInfo <em>Avatar Connector Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.api.AvatarConnectorInfo
	 * @see de.avatar.connector.api.impl.ApiPackageImpl#getAvatarConnectorInfo()
	 * @generated
	 */
	int AVATAR_CONNECTOR_INFO = 1;

	/**
	 * The number of structural features of the '<em>Avatar Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO___GET_ENDPOINTS = 0;

	/**
	 * The operation id for the '<em>Get Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO___GET_INFO = 1;

	/**
	 * The operation id for the '<em>Get Model Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO___GET_MODEL_INFOS = 2;

	/**
	 * The operation id for the '<em>Get Consent Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO___GET_CONSENT_INFOS = 3;

	/**
	 * The number of operations of the '<em>Avatar Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_INFO_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.avatar.connector.api.AvatarConnector <em>Avatar Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.api.AvatarConnector
	 * @see de.avatar.connector.api.impl.ApiPackageImpl#getAvatarConnector()
	 * @generated
	 */
	int AVATAR_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Avatar Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_FEATURE_COUNT = AVATAR_CONNECTOR_INFO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Endpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___GET_ENDPOINTS = AVATAR_CONNECTOR_INFO___GET_ENDPOINTS;

	/**
	 * The operation id for the '<em>Get Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___GET_INFO = AVATAR_CONNECTOR_INFO___GET_INFO;

	/**
	 * The operation id for the '<em>Get Model Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___GET_MODEL_INFOS = AVATAR_CONNECTOR_INFO___GET_MODEL_INFOS;

	/**
	 * The operation id for the '<em>Get Consent Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___GET_CONSENT_INFOS = AVATAR_CONNECTOR_INFO___GET_CONSENT_INFOS;

	/**
	 * The operation id for the '<em>Dry Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___DRY_REQUEST__ENDPOINTREQUEST = AVATAR_CONNECTOR_INFO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR___EXECUTE_REQUEST__ENDPOINTREQUEST = AVATAR_CONNECTOR_INFO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Avatar Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_CONNECTOR_OPERATION_COUNT = AVATAR_CONNECTOR_INFO_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.avatar.connector.api.AvatarConnector <em>Avatar Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avatar Connector</em>'.
	 * @see de.avatar.connector.api.AvatarConnector
	 * @generated
	 */
	EClass getAvatarConnector();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnector#dryRequest(de.avatar.model.connector.EndpointRequest) <em>Dry Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dry Request</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnector#dryRequest(de.avatar.model.connector.EndpointRequest)
	 * @generated
	 */
	EOperation getAvatarConnector__DryRequest__EndpointRequest();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest) <em>Execute Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Request</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest)
	 * @generated
	 */
	EOperation getAvatarConnector__ExecuteRequest__EndpointRequest();

	/**
	 * Returns the meta object for class '{@link de.avatar.connector.api.AvatarConnectorInfo <em>Avatar Connector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avatar Connector Info</em>'.
	 * @see de.avatar.connector.api.AvatarConnectorInfo
	 * @generated
	 */
	EClass getAvatarConnectorInfo();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnectorInfo#getEndpoints() <em>Get Endpoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Endpoints</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 * @generated
	 */
	EOperation getAvatarConnectorInfo__GetEndpoints();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnectorInfo#getInfo() <em>Get Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Info</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getInfo()
	 * @generated
	 */
	EOperation getAvatarConnectorInfo__GetInfo();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnectorInfo#getModelInfos() <em>Get Model Infos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Infos</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getModelInfos()
	 * @generated
	 */
	EOperation getAvatarConnectorInfo__GetModelInfos();

	/**
	 * Returns the meta object for the '{@link de.avatar.connector.api.AvatarConnectorInfo#getConsentInfos() <em>Get Consent Infos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Consent Infos</em>' operation.
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getConsentInfos()
	 * @generated
	 */
	EOperation getAvatarConnectorInfo__GetConsentInfos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApiFactory getApiFactory();

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
		 * The meta object literal for the '{@link de.avatar.connector.api.AvatarConnector <em>Avatar Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.api.AvatarConnector
		 * @see de.avatar.connector.api.impl.ApiPackageImpl#getAvatarConnector()
		 * @generated
		 */
		EClass AVATAR_CONNECTOR = eINSTANCE.getAvatarConnector();

		/**
		 * The meta object literal for the '<em><b>Dry Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR___DRY_REQUEST__ENDPOINTREQUEST = eINSTANCE.getAvatarConnector__DryRequest__EndpointRequest();

		/**
		 * The meta object literal for the '<em><b>Execute Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR___EXECUTE_REQUEST__ENDPOINTREQUEST = eINSTANCE.getAvatarConnector__ExecuteRequest__EndpointRequest();

		/**
		 * The meta object literal for the '{@link de.avatar.connector.api.AvatarConnectorInfo <em>Avatar Connector Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.api.AvatarConnectorInfo
		 * @see de.avatar.connector.api.impl.ApiPackageImpl#getAvatarConnectorInfo()
		 * @generated
		 */
		EClass AVATAR_CONNECTOR_INFO = eINSTANCE.getAvatarConnectorInfo();

		/**
		 * The meta object literal for the '<em><b>Get Endpoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR_INFO___GET_ENDPOINTS = eINSTANCE.getAvatarConnectorInfo__GetEndpoints();

		/**
		 * The meta object literal for the '<em><b>Get Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR_INFO___GET_INFO = eINSTANCE.getAvatarConnectorInfo__GetInfo();

		/**
		 * The meta object literal for the '<em><b>Get Model Infos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR_INFO___GET_MODEL_INFOS = eINSTANCE.getAvatarConnectorInfo__GetModelInfos();

		/**
		 * The meta object literal for the '<em><b>Get Consent Infos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_CONNECTOR_INFO___GET_CONSENT_INFOS = eINSTANCE.getAvatarConnectorInfo__GetConsentInfos();

	}

} //ApiPackage
