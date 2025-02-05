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
package de.avatar.status.util;

import de.avatar.status.*;

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
 * @see de.avatar.status.StatusPackage
 * @generated
 */
public class StatusSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatusPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusSwitch() {
		if (modelPackage == null) {
			modelPackage = StatusPackage.eINSTANCE;
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
			case StatusPackage.QUERY_REQUEST: {
				QueryRequest queryRequest = (QueryRequest)theEObject;
				T result = caseQueryRequest(queryRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.QUERY_RESPONSE: {
				QueryResponse queryResponse = (QueryResponse)theEObject;
				T result = caseQueryResponse(queryResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.QUERY_STATUS_RESPONSE: {
				QueryStatusResponse queryStatusResponse = (QueryStatusResponse)theEObject;
				T result = caseQueryStatusResponse(queryStatusResponse);
				if (result == null) result = caseQueryResponse(queryStatusResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.DETAILED_QUERY_STATUS: {
				DetailedQueryStatus detailedQueryStatus = (DetailedQueryStatus)theEObject;
				T result = caseDetailedQueryStatus(detailedQueryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS: {
				SingleConnectorQueryStatus singleConnectorQueryStatus = (SingleConnectorQueryStatus)theEObject;
				T result = caseSingleConnectorQueryStatus(singleConnectorQueryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.STATUS_RESULT: {
				StatusResult statusResult = (StatusResult)theEObject;
				T result = caseStatusResult(statusResult);
				if (result == null) result = caseStatus(statusResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.PENDING_STATUS_RESULT: {
				PendingStatusResult pendingStatusResult = (PendingStatusResult)theEObject;
				T result = casePendingStatusResult(pendingStatusResult);
				if (result == null) result = caseStatusResult(pendingStatusResult);
				if (result == null) result = caseStatus(pendingStatusResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.ERROR_STATUS_RESULT: {
				ErrorStatusResult errorStatusResult = (ErrorStatusResult)theEObject;
				T result = caseErrorStatusResult(errorStatusResult);
				if (result == null) result = caseStatusResult(errorStatusResult);
				if (result == null) result = caseStatus(errorStatusResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.QUERY_STATUS: {
				QueryStatus queryStatus = (QueryStatus)theEObject;
				T result = caseQueryStatus(queryStatus);
				if (result == null) result = caseStatus(queryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatusPackage.STATUS: {
				Status status = (Status)theEObject;
				T result = caseStatus(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryRequest(QueryRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryResponse(QueryResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Status Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryStatusResponse(QueryStatusResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detailed Query Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detailed Query Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailedQueryStatus(DetailedQueryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Connector Query Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Connector Query Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleConnectorQueryStatus(SingleConnectorQueryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusResult(StatusResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pending Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pending Status Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePendingStatusResult(PendingStatusResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Status Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorStatusResult(ErrorStatusResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryStatus(QueryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
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

} //StatusSwitch
