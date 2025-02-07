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

import de.avatar.status.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StatusFactoryImpl extends EFactoryImpl implements StatusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusFactory init() {
		try {
			StatusFactory theStatusFactory = (StatusFactory)EPackage.Registry.INSTANCE.getEFactory(StatusPackage.eNS_URI);
			if (theStatusFactory != null) {
				return theStatusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusFactoryImpl() {
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
			case StatusPackage.QUERY_REQUEST: return createQueryRequest();
			case StatusPackage.QUERY_RESPONSE: return createQueryResponse();
			case StatusPackage.QUERY_STATUS_RESPONSE: return createQueryStatusResponse();
			case StatusPackage.DETAILED_QUERY_STATUS: return createDetailedQueryStatus();
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS: return createSingleConnectorQueryStatus();
			case StatusPackage.STATUS_RESULT: return createStatusResult();
			case StatusPackage.SUCCESS_STATUS_RESULT: return createSuccessStatusResult();
			case StatusPackage.PENDING_STATUS_RESULT: return createPendingStatusResult();
			case StatusPackage.ERROR_STATUS_RESULT: return createErrorStatusResult();
			case StatusPackage.QUERY_STATUS: return createQueryStatus();
			case StatusPackage.STATUS: return createStatus();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StatusPackage.RESULT_FORMAT_TYPE:
				return createResultFormatTypeFromString(eDataType, initialValue);
			case StatusPackage.QUERY_STATUS_TYPE:
				return createQueryStatusTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StatusPackage.RESULT_FORMAT_TYPE:
				return convertResultFormatTypeToString(eDataType, instanceValue);
			case StatusPackage.QUERY_STATUS_TYPE:
				return convertQueryStatusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryRequest createQueryRequest() {
		QueryRequestImpl queryRequest = new QueryRequestImpl();
		return queryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryResponse createQueryResponse() {
		QueryResponseImpl queryResponse = new QueryResponseImpl();
		return queryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryStatusResponse createQueryStatusResponse() {
		QueryStatusResponseImpl queryStatusResponse = new QueryStatusResponseImpl();
		return queryStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailedQueryStatus createDetailedQueryStatus() {
		DetailedQueryStatusImpl detailedQueryStatus = new DetailedQueryStatusImpl();
		return detailedQueryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleConnectorQueryStatus createSingleConnectorQueryStatus() {
		SingleConnectorQueryStatusImpl singleConnectorQueryStatus = new SingleConnectorQueryStatusImpl();
		return singleConnectorQueryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusResult createStatusResult() {
		StatusResultImpl statusResult = new StatusResultImpl();
		return statusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessStatusResult createSuccessStatusResult() {
		SuccessStatusResultImpl successStatusResult = new SuccessStatusResultImpl();
		return successStatusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PendingStatusResult createPendingStatusResult() {
		PendingStatusResultImpl pendingStatusResult = new PendingStatusResultImpl();
		return pendingStatusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorStatusResult createErrorStatusResult() {
		ErrorStatusResultImpl errorStatusResult = new ErrorStatusResultImpl();
		return errorStatusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryStatus createQueryStatus() {
		QueryStatusImpl queryStatus = new QueryStatusImpl();
		return queryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultFormatType createResultFormatTypeFromString(EDataType eDataType, String initialValue) {
		ResultFormatType result = ResultFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryStatusType createQueryStatusTypeFromString(EDataType eDataType, String initialValue) {
		QueryStatusType result = QueryStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusPackage getStatusPackage() {
		return (StatusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatusPackage getPackage() {
		return StatusPackage.eINSTANCE;
	}

} //StatusFactoryImpl
