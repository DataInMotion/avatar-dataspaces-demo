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
package de.avatar.status.impl;

import de.avatar.metadata.MetadataPackage;

import de.avatar.model.connector.AConnectorPackage;

import de.avatar.query.QueryPackage;

import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.ErrorStatusResult;
import de.avatar.status.PendingStatusResult;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusPackage;
import de.avatar.status.StatusResult;
import de.avatar.status.SuccessStatusResult;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gecko.emf.utilities.UtilitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatusPackageImpl extends EPackageImpl implements StatusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryStatusResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedQueryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleConnectorQueryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successStatusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pendingStatusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStatusResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryStatusTypeEEnum = null;

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
	 * @see de.avatar.status.StatusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatusPackageImpl() {
		super(eNS_URI, StatusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatusPackage init() {
		if (isInited) return (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatusPackageImpl theStatusPackage = registeredStatusPackage instanceof StatusPackageImpl ? (StatusPackageImpl)registeredStatusPackage : new StatusPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AConnectorPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		QueryPackage.eINSTANCE.eClass();
		UtilitiesPackage.eINSTANCE.eClass();
		MetadataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStatusPackage.createPackageContents();

		// Initialize created meta-data
		theStatusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatusPackage.eNS_URI, theStatusPackage);
		return theStatusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryRequest() {
		return queryRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryRequest_RequestId() {
		return (EAttribute)queryRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryRequest_ConsumerId() {
		return (EAttribute)queryRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryRequest_Query() {
		return (EReference)queryRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryRequest_SrcUri() {
		return (EAttribute)queryRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryRequest_ContentType() {
		return (EAttribute)queryRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryResponse() {
		return queryResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryResponse_RequestId() {
		return (EAttribute)queryResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryResponse_Status() {
		return (EAttribute)queryResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryResponse_Timestamp() {
		return (EAttribute)queryResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryResponse_Message() {
		return (EAttribute)queryResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryStatusResponse() {
		return queryStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryStatusResponse_DetailedStatus() {
		return (EReference)queryStatusResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailedQueryStatus() {
		return detailedQueryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailedQueryStatus_SingleConnectorQueryStatus() {
		return (EReference)detailedQueryStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleConnectorQueryStatus() {
		return singleConnectorQueryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleConnectorQueryStatus_ConnectorId() {
		return (EAttribute)singleConnectorQueryStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleConnectorQueryStatus_ConnectorName() {
		return (EAttribute)singleConnectorQueryStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleConnectorQueryStatus_StatusResult() {
		return (EReference)singleConnectorQueryStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleConnectorQueryStatus_Metadata() {
		return (EReference)singleConnectorQueryStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusResult() {
		return statusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusResult_Id() {
		return (EAttribute)statusResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusResult_Status() {
		return (EAttribute)statusResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusResult_Response() {
		return (EReference)statusResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessStatusResult() {
		return successStatusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessStatusResult_Message() {
		return (EAttribute)successStatusResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPendingStatusResult() {
		return pendingStatusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPendingStatusResult_EstRuntime() {
		return (EAttribute)pendingStatusResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorStatusResult() {
		return errorStatusResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorStatusResult_ErrorMessage() {
		return (EAttribute)errorStatusResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQueryStatusType() {
		return queryStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusFactory getStatusFactory() {
		return (StatusFactory)getEFactoryInstance();
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
		queryRequestEClass = createEClass(QUERY_REQUEST);
		createEAttribute(queryRequestEClass, QUERY_REQUEST__REQUEST_ID);
		createEAttribute(queryRequestEClass, QUERY_REQUEST__CONSUMER_ID);
		createEReference(queryRequestEClass, QUERY_REQUEST__QUERY);
		createEAttribute(queryRequestEClass, QUERY_REQUEST__SRC_URI);
		createEAttribute(queryRequestEClass, QUERY_REQUEST__CONTENT_TYPE);

		queryResponseEClass = createEClass(QUERY_RESPONSE);
		createEAttribute(queryResponseEClass, QUERY_RESPONSE__REQUEST_ID);
		createEAttribute(queryResponseEClass, QUERY_RESPONSE__STATUS);
		createEAttribute(queryResponseEClass, QUERY_RESPONSE__TIMESTAMP);
		createEAttribute(queryResponseEClass, QUERY_RESPONSE__MESSAGE);

		queryStatusResponseEClass = createEClass(QUERY_STATUS_RESPONSE);
		createEReference(queryStatusResponseEClass, QUERY_STATUS_RESPONSE__DETAILED_STATUS);

		detailedQueryStatusEClass = createEClass(DETAILED_QUERY_STATUS);
		createEReference(detailedQueryStatusEClass, DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS);

		singleConnectorQueryStatusEClass = createEClass(SINGLE_CONNECTOR_QUERY_STATUS);
		createEAttribute(singleConnectorQueryStatusEClass, SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID);
		createEAttribute(singleConnectorQueryStatusEClass, SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME);
		createEReference(singleConnectorQueryStatusEClass, SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT);
		createEReference(singleConnectorQueryStatusEClass, SINGLE_CONNECTOR_QUERY_STATUS__METADATA);

		statusResultEClass = createEClass(STATUS_RESULT);
		createEAttribute(statusResultEClass, STATUS_RESULT__ID);
		createEAttribute(statusResultEClass, STATUS_RESULT__STATUS);
		createEReference(statusResultEClass, STATUS_RESULT__RESPONSE);

		successStatusResultEClass = createEClass(SUCCESS_STATUS_RESULT);
		createEAttribute(successStatusResultEClass, SUCCESS_STATUS_RESULT__MESSAGE);

		pendingStatusResultEClass = createEClass(PENDING_STATUS_RESULT);
		createEAttribute(pendingStatusResultEClass, PENDING_STATUS_RESULT__EST_RUNTIME);

		errorStatusResultEClass = createEClass(ERROR_STATUS_RESULT);
		createEAttribute(errorStatusResultEClass, ERROR_STATUS_RESULT__ERROR_MESSAGE);

		// Create enums
		queryStatusTypeEEnum = createEEnum(QUERY_STATUS_TYPE);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		AConnectorPackage theAConnectorPackage = (AConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(AConnectorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		queryStatusResponseEClass.getESuperTypes().add(this.getQueryResponse());
		successStatusResultEClass.getESuperTypes().add(this.getStatusResult());
		pendingStatusResultEClass.getESuperTypes().add(this.getStatusResult());
		errorStatusResultEClass.getESuperTypes().add(this.getStatusResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(queryRequestEClass, QueryRequest.class, "QueryRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryRequest_RequestId(), theEcorePackage.getEString(), "requestId", null, 1, 1, QueryRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryRequest_ConsumerId(), theEcorePackage.getEString(), "consumerId", null, 1, 1, QueryRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryRequest_Query(), theQueryPackage.getQuery(), null, "query", null, 1, 1, QueryRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryRequest_SrcUri(), theEcorePackage.getEString(), "srcUri", null, 0, 1, QueryRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryRequest_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, QueryRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryResponseEClass, QueryResponse.class, "QueryResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResponse_RequestId(), theEcorePackage.getEString(), "requestId", null, 1, 1, QueryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryResponse_Status(), this.getQueryStatusType(), "status", null, 0, 1, QueryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryResponse_Timestamp(), theEcorePackage.getELong(), "timestamp", null, 0, 1, QueryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryResponse_Message(), ecorePackage.getEString(), "message", null, 0, 1, QueryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryStatusResponseEClass, QueryStatusResponse.class, "QueryStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryStatusResponse_DetailedStatus(), this.getDetailedQueryStatus(), null, "detailedStatus", null, 0, 1, QueryStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailedQueryStatusEClass, DetailedQueryStatus.class, "DetailedQueryStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailedQueryStatus_SingleConnectorQueryStatus(), this.getSingleConnectorQueryStatus(), null, "singleConnectorQueryStatus", null, 0, -1, DetailedQueryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleConnectorQueryStatusEClass, SingleConnectorQueryStatus.class, "SingleConnectorQueryStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleConnectorQueryStatus_ConnectorId(), theEcorePackage.getEString(), "connectorId", null, 0, 1, SingleConnectorQueryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleConnectorQueryStatus_ConnectorName(), theEcorePackage.getEString(), "connectorName", null, 0, 1, SingleConnectorQueryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleConnectorQueryStatus_StatusResult(), this.getStatusResult(), null, "statusResult", null, 0, 1, SingleConnectorQueryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleConnectorQueryStatus_Metadata(), theMetadataPackage.getMetadata(), null, "metadata", null, 0, -1, SingleConnectorQueryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusResultEClass, StatusResult.class, "StatusResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusResult_Id(), theEcorePackage.getEString(), "id", null, 1, 1, StatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusResult_Status(), this.getQueryStatusType(), "status", null, 0, 1, StatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatusResult_Response(), theAConnectorPackage.getEndpointResponse(), null, "response", null, 0, 1, StatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successStatusResultEClass, SuccessStatusResult.class, "SuccessStatusResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuccessStatusResult_Message(), theEcorePackage.getEString(), "message", null, 0, 1, SuccessStatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pendingStatusResultEClass, PendingStatusResult.class, "PendingStatusResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPendingStatusResult_EstRuntime(), theEcorePackage.getELong(), "estRuntime", null, 0, 1, PendingStatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorStatusResultEClass, ErrorStatusResult.class, "ErrorStatusResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorStatusResult_ErrorMessage(), theEcorePackage.getEString(), "errorMessage", null, 0, 1, ErrorStatusResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queryStatusTypeEEnum, QueryStatusType.class, "QueryStatusType");
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_FORWARDING_STARTED);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_COMPLETED);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_ERROR);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_NO_CONTENT);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.TIMEOUT);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_PENDING);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_DRYRUN_COMPLETED);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.PROCESS_CANCEL_REQUEST);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.PROCESS_CANCELED);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_INTERRUPT_REQUEST);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.QUERY_INTERRUPTED);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.ANONYMIZED_DATA_READY);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.PUBLIC_LINK_REQUEST);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.PUBLIC_LINK_AVAILABLE);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.OPERATION_ERROR);
		addEEnumLiteral(queryStatusTypeEEnum, QueryStatusType.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

} //StatusPackageImpl
