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
package de.avatar.model.connector.util;

import de.avatar.model.connector.*;

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
 * @see de.avatar.model.connector.AConnectorPackage
 * @generated
 */
public class AConnectorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AConnectorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnectorSwitch() {
		if (modelPackage == null) {
			modelPackage = AConnectorPackage.eINSTANCE;
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
			case AConnectorPackage.CONNECTOR_INFO: {
				ConnectorInfo connectorInfo = (ConnectorInfo)theEObject;
				T result = caseConnectorInfo(connectorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.CONNECTOR_METRIC: {
				ConnectorMetric connectorMetric = (ConnectorMetric)theEObject;
				T result = caseConnectorMetric(connectorMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.CONNECTOR_ENDPOINT: {
				ConnectorEndpoint connectorEndpoint = (ConnectorEndpoint)theEObject;
				T result = caseConnectorEndpoint(connectorEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.ENDPOINT_REQUEST: {
				EndpointRequest endpointRequest = (EndpointRequest)theEObject;
				T result = caseEndpointRequest(endpointRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.ENDPOINT_RESPONSE: {
				EndpointResponse endpointResponse = (EndpointResponse)theEObject;
				T result = caseEndpointResponse(endpointResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.JAVA_PARAMETER: {
				JavaParameter javaParameter = (JavaParameter)theEObject;
				T result = caseJavaParameter(javaParameter);
				if (result == null) result = caseParameter(javaParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.ECORE_PARAMETER: {
				EcoreParameter ecoreParameter = (EcoreParameter)theEObject;
				T result = caseEcoreParameter(ecoreParameter);
				if (result == null) result = caseParameter(ecoreParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.RESPONSE_RESULT: {
				ResponseResult responseResult = (ResponseResult)theEObject;
				T result = caseResponseResult(responseResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.RESPONSE_META_DATA: {
				ResponseMetaData responseMetaData = (ResponseMetaData)theEObject;
				T result = caseResponseMetaData(responseMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.DRY_RUN_RESULT: {
				DryRunResult dryRunResult = (DryRunResult)theEObject;
				T result = caseDryRunResult(dryRunResult);
				if (result == null) result = caseResponseResult(dryRunResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.ERROR_RESULT: {
				ErrorResult errorResult = (ErrorResult)theEObject;
				T result = caseErrorResult(errorResult);
				if (result == null) result = caseResponseResult(errorResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.ECORE_RESULT: {
				EcoreResult ecoreResult = (EcoreResult)theEObject;
				T result = caseEcoreResult(ecoreResult);
				if (result == null) result = caseResponseResult(ecoreResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.JAVA_RESULT: {
				JavaResult javaResult = (JavaResult)theEObject;
				T result = caseJavaResult(javaResult);
				if (result == null) result = caseResponseResult(javaResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AConnectorPackage.SIMPLE_RESULT: {
				SimpleResult simpleResult = (SimpleResult)theEObject;
				T result = caseSimpleResult(simpleResult);
				if (result == null) result = caseResponseResult(simpleResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorInfo(ConnectorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorMetric(ConnectorMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpoint(ConnectorEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointRequest(EndpointRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointResponse(EndpointResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaParameter(JavaParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreParameter(EcoreParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseResult(ResponseResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMetaData(ResponseMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dry Run Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dry Run Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDryRunResult(DryRunResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorResult(ErrorResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreResult(EcoreResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaResult(JavaResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleResult(SimpleResult object) {
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

} //AConnectorSwitch
