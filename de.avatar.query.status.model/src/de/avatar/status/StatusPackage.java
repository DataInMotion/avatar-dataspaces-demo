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
	 * The meta object id for the '{@link de.avatar.status.impl.QueryRequestImpl <em>Query Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.QueryRequestImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getQueryRequest()
	 * @generated
	 */
	int QUERY_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST__REQUEST_ID = 0;

	/**
	 * The feature id for the '<em><b>Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST__CONSUMER_ID = 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST__QUERY = 2;

	/**
	 * The feature id for the '<em><b>Src Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST__SRC_URI = 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST__CONTENT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Query Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Query Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.QueryResponseImpl <em>Query Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.QueryResponseImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getQueryResponse()
	 * @generated
	 */
	int QUERY_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESPONSE__REQUEST_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESPONSE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Detailed Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESPONSE__DETAILED_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Query Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.DetailedQueryStatusImpl <em>Detailed Query Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.DetailedQueryStatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getDetailedQueryStatus()
	 * @generated
	 */
	int DETAILED_QUERY_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Single Connector Query Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS = 0;

	/**
	 * The number of structural features of the '<em>Detailed Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_QUERY_STATUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Detailed Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_QUERY_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl <em>Single Connector Query Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.SingleConnectorQueryStatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getSingleConnectorQueryStatus()
	 * @generated
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Status Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT = 2;

	/**
	 * The number of structural features of the '<em>Single Connector Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Single Connector Query Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONNECTOR_QUERY_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.StatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 8;

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
	 * The meta object id for the '{@link de.avatar.status.impl.StatusResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.StatusResultImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getStatusResult()
	 * @generated
	 */
	int STATUS_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__ID = STATUS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__NAME = STATUS__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__USERNAME = STATUS__USERNAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__CREATED = STATUS__CREATED;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__CHANGED = STATUS__CHANGED;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__RESPONSE = STATUS__RESPONSE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT__STATUS = STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT_FEATURE_COUNT = STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_RESULT_OPERATION_COUNT = STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.PendingStatusResultImpl <em>Pending Status Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.PendingStatusResultImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getPendingStatusResult()
	 * @generated
	 */
	int PENDING_STATUS_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__ID = STATUS_RESULT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__NAME = STATUS_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__USERNAME = STATUS_RESULT__USERNAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__CREATED = STATUS_RESULT__CREATED;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__CHANGED = STATUS_RESULT__CHANGED;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__RESPONSE = STATUS_RESULT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__STATUS = STATUS_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Est Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT__EST_RUNTIME = STATUS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pending Status Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT_FEATURE_COUNT = STATUS_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pending Status Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_STATUS_RESULT_OPERATION_COUNT = STATUS_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.ErrorStatusResultImpl <em>Error Status Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.ErrorStatusResultImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getErrorStatusResult()
	 * @generated
	 */
	int ERROR_STATUS_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__ID = STATUS_RESULT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__NAME = STATUS_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__USERNAME = STATUS_RESULT__USERNAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__CREATED = STATUS_RESULT__CREATED;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__CHANGED = STATUS_RESULT__CHANGED;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__RESPONSE = STATUS_RESULT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__STATUS = STATUS_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT__ERROR_MESSAGE = STATUS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Status Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT_FEATURE_COUNT = STATUS_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Status Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATUS_RESULT_OPERATION_COUNT = STATUS_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.status.impl.QueryStatusImpl <em>Query Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.impl.QueryStatusImpl
	 * @see de.avatar.status.impl.StatusPackageImpl#getQueryStatus()
	 * @generated
	 */
	int QUERY_STATUS = 7;

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
	int RESULT_FORMAT_TYPE = 9;

	/**
	 * The meta object id for the '{@link de.avatar.status.QueryStatusType <em>Query Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.status.QueryStatusType
	 * @see de.avatar.status.impl.StatusPackageImpl#getQueryStatusType()
	 * @generated
	 */
	int QUERY_STATUS_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link de.avatar.status.QueryRequest <em>Query Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Request</em>'.
	 * @see de.avatar.status.QueryRequest
	 * @generated
	 */
	EClass getQueryRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryRequest#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.avatar.status.QueryRequest#getRequestId()
	 * @see #getQueryRequest()
	 * @generated
	 */
	EAttribute getQueryRequest_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryRequest#getConsumerId <em>Consumer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Id</em>'.
	 * @see de.avatar.status.QueryRequest#getConsumerId()
	 * @see #getQueryRequest()
	 * @generated
	 */
	EAttribute getQueryRequest_ConsumerId();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.status.QueryRequest#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see de.avatar.status.QueryRequest#getQuery()
	 * @see #getQueryRequest()
	 * @generated
	 */
	EReference getQueryRequest_Query();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryRequest#getSrcUri <em>Src Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Uri</em>'.
	 * @see de.avatar.status.QueryRequest#getSrcUri()
	 * @see #getQueryRequest()
	 * @generated
	 */
	EAttribute getQueryRequest_SrcUri();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryRequest#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see de.avatar.status.QueryRequest#getContentType()
	 * @see #getQueryRequest()
	 * @generated
	 */
	EAttribute getQueryRequest_ContentType();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.QueryResponse <em>Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Response</em>'.
	 * @see de.avatar.status.QueryResponse
	 * @generated
	 */
	EClass getQueryResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryResponse#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.avatar.status.QueryResponse#getRequestId()
	 * @see #getQueryResponse()
	 * @generated
	 */
	EAttribute getQueryResponse_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.QueryResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.avatar.status.QueryResponse#getStatus()
	 * @see #getQueryResponse()
	 * @generated
	 */
	EAttribute getQueryResponse_Status();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.status.QueryResponse#getDetailedStatus <em>Detailed Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detailed Status</em>'.
	 * @see de.avatar.status.QueryResponse#getDetailedStatus()
	 * @see #getQueryResponse()
	 * @generated
	 */
	EReference getQueryResponse_DetailedStatus();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.DetailedQueryStatus <em>Detailed Query Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Query Status</em>'.
	 * @see de.avatar.status.DetailedQueryStatus
	 * @generated
	 */
	EClass getDetailedQueryStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.status.DetailedQueryStatus#getSingleConnectorQueryStatus <em>Single Connector Query Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Connector Query Status</em>'.
	 * @see de.avatar.status.DetailedQueryStatus#getSingleConnectorQueryStatus()
	 * @see #getDetailedQueryStatus()
	 * @generated
	 */
	EReference getDetailedQueryStatus_SingleConnectorQueryStatus();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.SingleConnectorQueryStatus <em>Single Connector Query Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Connector Query Status</em>'.
	 * @see de.avatar.status.SingleConnectorQueryStatus
	 * @generated
	 */
	EClass getSingleConnectorQueryStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.avatar.status.SingleConnectorQueryStatus#getConnectorId()
	 * @see #getSingleConnectorQueryStatus()
	 * @generated
	 */
	EAttribute getSingleConnectorQueryStatus_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorName <em>Connector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Name</em>'.
	 * @see de.avatar.status.SingleConnectorQueryStatus#getConnectorName()
	 * @see #getSingleConnectorQueryStatus()
	 * @generated
	 */
	EAttribute getSingleConnectorQueryStatus_ConnectorName();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.status.SingleConnectorQueryStatus#getStatusResult <em>Status Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Result</em>'.
	 * @see de.avatar.status.SingleConnectorQueryStatus#getStatusResult()
	 * @see #getSingleConnectorQueryStatus()
	 * @generated
	 */
	EReference getSingleConnectorQueryStatus_StatusResult();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.StatusResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see de.avatar.status.StatusResult
	 * @generated
	 */
	EClass getStatusResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.StatusResult#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.avatar.status.StatusResult#getStatus()
	 * @see #getStatusResult()
	 * @generated
	 */
	EAttribute getStatusResult_Status();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.PendingStatusResult <em>Pending Status Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pending Status Result</em>'.
	 * @see de.avatar.status.PendingStatusResult
	 * @generated
	 */
	EClass getPendingStatusResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.PendingStatusResult#getEstRuntime <em>Est Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Runtime</em>'.
	 * @see de.avatar.status.PendingStatusResult#getEstRuntime()
	 * @see #getPendingStatusResult()
	 * @generated
	 */
	EAttribute getPendingStatusResult_EstRuntime();

	/**
	 * Returns the meta object for class '{@link de.avatar.status.ErrorStatusResult <em>Error Status Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Status Result</em>'.
	 * @see de.avatar.status.ErrorStatusResult
	 * @generated
	 */
	EClass getErrorStatusResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.status.ErrorStatusResult#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see de.avatar.status.ErrorStatusResult#getErrorMessage()
	 * @see #getErrorStatusResult()
	 * @generated
	 */
	EAttribute getErrorStatusResult_ErrorMessage();

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
	 * Returns the meta object for enum '{@link de.avatar.status.QueryStatusType <em>Query Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Status Type</em>'.
	 * @see de.avatar.status.QueryStatusType
	 * @generated
	 */
	EEnum getQueryStatusType();

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
		 * The meta object literal for the '{@link de.avatar.status.impl.QueryRequestImpl <em>Query Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.QueryRequestImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getQueryRequest()
		 * @generated
		 */
		EClass QUERY_REQUEST = eINSTANCE.getQueryRequest();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REQUEST__REQUEST_ID = eINSTANCE.getQueryRequest_RequestId();

		/**
		 * The meta object literal for the '<em><b>Consumer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REQUEST__CONSUMER_ID = eINSTANCE.getQueryRequest_ConsumerId();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_REQUEST__QUERY = eINSTANCE.getQueryRequest_Query();

		/**
		 * The meta object literal for the '<em><b>Src Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REQUEST__SRC_URI = eINSTANCE.getQueryRequest_SrcUri();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_REQUEST__CONTENT_TYPE = eINSTANCE.getQueryRequest_ContentType();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.QueryResponseImpl <em>Query Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.QueryResponseImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getQueryResponse()
		 * @generated
		 */
		EClass QUERY_RESPONSE = eINSTANCE.getQueryResponse();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESPONSE__REQUEST_ID = eINSTANCE.getQueryResponse_RequestId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESPONSE__STATUS = eINSTANCE.getQueryResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Detailed Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_RESPONSE__DETAILED_STATUS = eINSTANCE.getQueryResponse_DetailedStatus();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.DetailedQueryStatusImpl <em>Detailed Query Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.DetailedQueryStatusImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getDetailedQueryStatus()
		 * @generated
		 */
		EClass DETAILED_QUERY_STATUS = eINSTANCE.getDetailedQueryStatus();

		/**
		 * The meta object literal for the '<em><b>Single Connector Query Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS = eINSTANCE.getDetailedQueryStatus_SingleConnectorQueryStatus();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl <em>Single Connector Query Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.SingleConnectorQueryStatusImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getSingleConnectorQueryStatus()
		 * @generated
		 */
		EClass SINGLE_CONNECTOR_QUERY_STATUS = eINSTANCE.getSingleConnectorQueryStatus();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID = eINSTANCE.getSingleConnectorQueryStatus_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Connector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME = eINSTANCE.getSingleConnectorQueryStatus_ConnectorName();

		/**
		 * The meta object literal for the '<em><b>Status Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT = eINSTANCE.getSingleConnectorQueryStatus_StatusResult();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.StatusResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.StatusResultImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getStatusResult()
		 * @generated
		 */
		EClass STATUS_RESULT = eINSTANCE.getStatusResult();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_RESULT__STATUS = eINSTANCE.getStatusResult_Status();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.PendingStatusResultImpl <em>Pending Status Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.PendingStatusResultImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getPendingStatusResult()
		 * @generated
		 */
		EClass PENDING_STATUS_RESULT = eINSTANCE.getPendingStatusResult();

		/**
		 * The meta object literal for the '<em><b>Est Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING_STATUS_RESULT__EST_RUNTIME = eINSTANCE.getPendingStatusResult_EstRuntime();

		/**
		 * The meta object literal for the '{@link de.avatar.status.impl.ErrorStatusResultImpl <em>Error Status Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.impl.ErrorStatusResultImpl
		 * @see de.avatar.status.impl.StatusPackageImpl#getErrorStatusResult()
		 * @generated
		 */
		EClass ERROR_STATUS_RESULT = eINSTANCE.getErrorStatusResult();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_STATUS_RESULT__ERROR_MESSAGE = eINSTANCE.getErrorStatusResult_ErrorMessage();

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

		/**
		 * The meta object literal for the '{@link de.avatar.status.QueryStatusType <em>Query Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.status.QueryStatusType
		 * @see de.avatar.status.impl.StatusPackageImpl#getQueryStatusType()
		 * @generated
		 */
		EEnum QUERY_STATUS_TYPE = eINSTANCE.getQueryStatusType();

	}

} //StatusPackage
