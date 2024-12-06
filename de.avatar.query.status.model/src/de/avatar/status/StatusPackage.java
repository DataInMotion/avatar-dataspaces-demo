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
package de.avatar.status;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.avatar.status.StatusFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = StatusPackage.eNS_URI, genModel = "/model/query-status.genmodel", genModelSourceLocations = {"model/query-status.genmodel","de.avatar.query.status.model/model/query-status.genmodel"}, ecore="/model/query-status.ecore", ecoreSourceLocations="/model/query-status.ecore")
public interface StatusPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "status";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://avatar-project.de/query/status/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "status";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusPackage eINSTANCE = de.avatar.status.impl.StatusPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.StatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__CHANGED = 4;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__RESPONSE = 5;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.QueryStatusImpl <em>Query Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.QueryStatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getQueryStatus()
	 * @generated
	 */
	int QUERY_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__ID = STATUS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__NAME = STATUS__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__USERNAME = STATUS__USERNAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__CREATED = STATUS__CREATED;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__CHANGED = STATUS__CHANGED;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__RESPONSE = STATUS__RESPONSE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__QUERY = STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__MIN_RESULT_COUNT = STATUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__MAX_RESULT_COUNT = STATUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__TIMEOUT = STATUS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__RESULT_FORMAT = STATUS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS__CONNECTOR = STATUS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS_FEATURE_COUNT = STATUS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATUS_OPERATION_COUNT = STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.ResultFormatType <em>Result Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.ResultFormatType
	 * @see de.avatar.status.impl.StatusPackageImpl#getResultFormatType()
	 * @generated
	 */
	int RESULT_FORMAT_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link de.avatar.status.QueryStatus <em>Query Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Status</em>'.
	 * @see de.avatar.status.QueryStatus
	 * @generated
	 */
	EClass getQueryStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.status.QueryStatus#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see de.avatar.status.QueryStatus#getQuery()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EReference getQueryStatus_Query();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryStatus#getMinResultCount <em>Min Result Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Result Count</em>'.
	 * @see de.avatar.status.QueryStatus#getMinResultCount()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EAttribute getQueryStatus_MinResultCount();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryStatus#getMaxResultCount <em>Max Result Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Result Count</em>'.
	 * @see de.avatar.status.QueryStatus#getMaxResultCount()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EAttribute getQueryStatus_MaxResultCount();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryStatus#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see de.avatar.status.QueryStatus#getTimeout()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EAttribute getQueryStatus_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryStatus#getResultFormat <em>Result Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Format</em>'.
	 * @see de.avatar.status.QueryStatus#getResultFormat()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EAttribute getQueryStatus_ResultFormat();

	/**
	 * Returns the meta object for the attribute list '{@link de.avatar.status.QueryStatus#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Connector</em>'.
	 * @see de.avatar.status.QueryStatus#getConnector()
	 * @see #getQueryStatus()
	 * @generated
	 */
	EAttribute getQueryStatus_Connector();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see de.avatar.status.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.Status#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.status.Status#getId()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.Status#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.status.Status#getName()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.Status#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.avatar.status.Status#getUsername()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Username();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.Status#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.avatar.status.Status#getCreated()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.Status#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see de.avatar.status.Status#getChanged()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Changed();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.status.Status#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see de.avatar.status.Status#getResponse()
	 * @see #getStatus()
	 * @generated
	 */
	EReference getStatus_Response();

	/**
	 * Returns the meta object for enum '{@link de.avatar.status.ResultFormatType <em>Result Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Format Type</em>'.
	 * @see de.avatar.status.ResultFormatType
	 * @generated
	 */
	EEnum getResultFormatType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatusFactory getStatusFactory();

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
		 * The meta object literal for the '{@link de.avatar.status.impl.QueryStatusImpl <em>Query Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.QueryStatusImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getQueryStatus()
		 * @generated
		 */
		EClass QUERY_STATUS = eINSTANCE.getQueryStatus();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_STATUS__QUERY = eINSTANCE.getQueryStatus_Query();

		/**
		 * The meta object literal for the '<em><b>Min Result Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATUS__MIN_RESULT_COUNT = eINSTANCE.getQueryStatus_MinResultCount();

		/**
		 * The meta object literal for the '<em><b>Max Result Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATUS__MAX_RESULT_COUNT = eINSTANCE.getQueryStatus_MaxResultCount();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATUS__TIMEOUT = eINSTANCE.getQueryStatus_Timeout();

		/**
		 * The meta object literal for the '<em><b>Result Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATUS__RESULT_FORMAT = eINSTANCE.getQueryStatus_ResultFormat();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATUS__CONNECTOR = eINSTANCE.getQueryStatus_Connector();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.StatusImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__ID = eINSTANCE.getStatus_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__NAME = eINSTANCE.getStatus_Name();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__USERNAME = eINSTANCE.getStatus_Username();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__CREATED = eINSTANCE.getStatus_Created();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__CHANGED = eINSTANCE.getStatus_Changed();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS__RESPONSE = eINSTANCE.getStatus_Response();

		/**
		 * The meta object literal for the '{@link de.avatar.status.ResultFormatType <em>Result Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.ResultFormatType
		 * @see de.avatar.status.impl.StatusPackageImpl#getResultFormatType()
		 * @generated
		 */
		EEnum RESULT_FORMAT_TYPE = eINSTANCE.getResultFormatType();

	}

} //StatusPackage
