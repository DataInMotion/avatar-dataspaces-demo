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
package de.avatar.model.connector.impl;

import de.avatar.model.connector.*;

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
public class AConnectorFactoryImpl extends EFactoryImpl implements AConnectorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AConnectorFactory init() {
		try {
			AConnectorFactory theAConnectorFactory = (AConnectorFactory)EPackage.Registry.INSTANCE.getEFactory(AConnectorPackage.eNS_URI);
			if (theAConnectorFactory != null) {
				return theAConnectorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AConnectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnectorFactoryImpl() {
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
			case AConnectorPackage.CONNECTOR_INFO: return createConnectorInfo();
			case AConnectorPackage.CONNECTOR_METRIC: return createConnectorMetric();
			case AConnectorPackage.CONNECTOR_ENDPOINT: return createConnectorEndpoint();
			case AConnectorPackage.ENDPOINT_REQUEST: return createEndpointRequest();
			case AConnectorPackage.ENDPOINT_RESPONSE: return createEndpointResponse();
			case AConnectorPackage.PARAMETER: return createParameter();
			case AConnectorPackage.JAVA_PARAMETER: return createJavaParameter();
			case AConnectorPackage.ECORE_PARAMETER: return createEcoreParameter();
			case AConnectorPackage.RESPONSE_META_DATA: return createResponseMetaData();
			case AConnectorPackage.DRY_RUN_RESULT: return createDryRunResult();
			case AConnectorPackage.ERROR_RESULT: return createErrorResult();
			case AConnectorPackage.PENDING_RESULT: return createPendingResult();
			case AConnectorPackage.ECORE_RESULT: return createEcoreResult();
			case AConnectorPackage.JAVA_RESULT: return createJavaResult();
			case AConnectorPackage.SIMPLE_RESULT: return createSimpleResult();
			case AConnectorPackage.CONNECTOR_PENDING_RESULT: return createConnectorPendingResult();
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
			case AConnectorPackage.PROTOCOL_TYPE:
				return createProtocolTypeFromString(eDataType, initialValue);
			case AConnectorPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case AConnectorPackage.RESPONSE_CODE:
				return createResponseCodeFromString(eDataType, initialValue);
			case AConnectorPackage.JAVA_THROWABLE:
				return createJavaThrowableFromString(eDataType, initialValue);
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
			case AConnectorPackage.PROTOCOL_TYPE:
				return convertProtocolTypeToString(eDataType, instanceValue);
			case AConnectorPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case AConnectorPackage.RESPONSE_CODE:
				return convertResponseCodeToString(eDataType, instanceValue);
			case AConnectorPackage.JAVA_THROWABLE:
				return convertJavaThrowableToString(eDataType, instanceValue);
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
	public ConnectorInfo createConnectorInfo() {
		ConnectorInfoImpl connectorInfo = new ConnectorInfoImpl();
		return connectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorMetric createConnectorMetric() {
		ConnectorMetricImpl connectorMetric = new ConnectorMetricImpl();
		return connectorMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorEndpoint createConnectorEndpoint() {
		ConnectorEndpointImpl connectorEndpoint = new ConnectorEndpointImpl();
		return connectorEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointRequest createEndpointRequest() {
		EndpointRequestImpl endpointRequest = new EndpointRequestImpl();
		return endpointRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointResponse createEndpointResponse() {
		EndpointResponseImpl endpointResponse = new EndpointResponseImpl();
		return endpointResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaParameter createJavaParameter() {
		JavaParameterImpl javaParameter = new JavaParameterImpl();
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreParameter createEcoreParameter() {
		EcoreParameterImpl ecoreParameter = new EcoreParameterImpl();
		return ecoreParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseMetaData createResponseMetaData() {
		ResponseMetaDataImpl responseMetaData = new ResponseMetaDataImpl();
		return responseMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DryRunResult createDryRunResult() {
		DryRunResultImpl dryRunResult = new DryRunResultImpl();
		return dryRunResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorResult createErrorResult() {
		ErrorResultImpl errorResult = new ErrorResultImpl();
		return errorResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PendingResult createPendingResult() {
		PendingResultImpl pendingResult = new PendingResultImpl();
		return pendingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreResult createEcoreResult() {
		EcoreResultImpl ecoreResult = new EcoreResultImpl();
		return ecoreResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaResult createJavaResult() {
		JavaResultImpl javaResult = new JavaResultImpl();
		return javaResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleResult createSimpleResult() {
		SimpleResultImpl simpleResult = new SimpleResultImpl();
		return simpleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorPendingResult createConnectorPendingResult() {
		ConnectorPendingResultImpl connectorPendingResult = new ConnectorPendingResultImpl();
		return connectorPendingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType createProtocolTypeFromString(EDataType eDataType, String initialValue) {
		ProtocolType result = ProtocolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseCode createResponseCodeFromString(EDataType eDataType, String initialValue) {
		ResponseCode result = ResponseCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createJavaThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AConnectorPackage getAConnectorPackage() {
		return (AConnectorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AConnectorPackage getPackage() {
		return AConnectorPackage.eINSTANCE;
	}

} //AConnectorFactoryImpl
