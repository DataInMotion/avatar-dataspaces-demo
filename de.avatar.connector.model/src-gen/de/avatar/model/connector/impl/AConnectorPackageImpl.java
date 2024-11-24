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

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.JavaParameter;
import de.avatar.model.connector.JavaResult;
import de.avatar.model.connector.Parameter;
import de.avatar.model.connector.ProtocolType;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.ResponseMetaData;
import de.avatar.model.connector.ResponseResult;
import de.avatar.model.connector.SimpleResult;
import de.avatar.model.connector.StatusType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AConnectorPackageImpl extends EPackageImpl implements AConnectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dryRunResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaThrowableEDataType = null;

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
	 * @see de.avatar.model.connector.AConnectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AConnectorPackageImpl() {
		super(eNS_URI, AConnectorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AConnectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AConnectorPackage init() {
		if (isInited) return (AConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(AConnectorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAConnectorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AConnectorPackageImpl theAConnectorPackage = registeredAConnectorPackage instanceof AConnectorPackageImpl ? (AConnectorPackageImpl)registeredAConnectorPackage : new AConnectorPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAConnectorPackage.createPackageContents();

		// Initialize created meta-data
		theAConnectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAConnectorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AConnectorPackage.eNS_URI, theAConnectorPackage);
		return theAConnectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorInfo() {
		return connectorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorInfo_Id() {
		return (EAttribute)connectorInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorInfo_Name() {
		return (EAttribute)connectorInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorInfo_Provider() {
		return (EAttribute)connectorInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorInfo_Version() {
		return (EAttribute)connectorInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorInfo_Endpoint() {
		return (EReference)connectorInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorInfo_Metric() {
		return (EReference)connectorInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorInfo_ConnectorModel() {
		return (EReference)connectorInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorMetric() {
		return connectorMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetric_Id() {
		return (EAttribute)connectorMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetric_Timestamp() {
		return (EAttribute)connectorMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetric_Status() {
		return (EAttribute)connectorMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorMetric_Uptime() {
		return (EAttribute)connectorMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorMetric_Connector() {
		return (EReference)connectorMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorEndpoint() {
		return connectorEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_Id() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_Name() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_Uri() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_Method() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_Protocol() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorEndpoint_MediaType() {
		return (EAttribute)connectorEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorEndpoint_Connector() {
		return (EReference)connectorEndpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorEndpoint_ModelPackage() {
		return (EReference)connectorEndpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndpointRequest() {
		return endpointRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointRequest_Id() {
		return (EAttribute)endpointRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointRequest_Timestamp() {
		return (EAttribute)endpointRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndpointRequest_Endpoint() {
		return (EReference)endpointRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndpointRequest_Parameter() {
		return (EReference)endpointRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointRequest_SourceId() {
		return (EAttribute)endpointRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndpointResponse() {
		return endpointResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointResponse_Id() {
		return (EAttribute)endpointResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndpointResponse_Request() {
		return (EReference)endpointResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointResponse_Timestamp() {
		return (EAttribute)endpointResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointResponse_Code() {
		return (EAttribute)endpointResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndpointResponse_Result() {
		return (EReference)endpointResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointResponse_SourceId() {
		return (EAttribute)endpointResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Number() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaParameter() {
		return javaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaParameter_TypeString() {
		return (EAttribute)javaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaParameter_Value() {
		return (EAttribute)javaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEcoreParameter() {
		return ecoreParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcoreParameter_Value() {
		return (EReference)ecoreParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseResult() {
		return responseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseResult_MetaData() {
		return (EReference)responseResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseMetaData() {
		return responseMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseMetaData_Hash() {
		return (EAttribute)responseMetaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDryRunResult() {
		return dryRunResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDryRunResult_ResultCount() {
		return (EAttribute)dryRunResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDryRunResult_EstRuntime() {
		return (EAttribute)dryRunResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorResult() {
		return errorResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorResult_Error() {
		return (EAttribute)errorResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorResult_ErrorText() {
		return (EAttribute)errorResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorResult_Throwable() {
		return (EAttribute)errorResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEcoreResult() {
		return ecoreResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcoreResult_Value() {
		return (EReference)ecoreResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaResult() {
		return javaResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaResult_TypeString() {
		return (EAttribute)javaResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaResult_Value() {
		return (EAttribute)javaResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleResult() {
		return simpleResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleResult_Value() {
		return (EAttribute)simpleResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtocolType() {
		return protocolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResponseCode() {
		return responseCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaThrowable() {
		return javaThrowableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AConnectorFactory getAConnectorFactory() {
		return (AConnectorFactory)getEFactoryInstance();
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
		connectorInfoEClass = createEClass(CONNECTOR_INFO);
		createEAttribute(connectorInfoEClass, CONNECTOR_INFO__ID);
		createEAttribute(connectorInfoEClass, CONNECTOR_INFO__NAME);
		createEAttribute(connectorInfoEClass, CONNECTOR_INFO__PROVIDER);
		createEAttribute(connectorInfoEClass, CONNECTOR_INFO__VERSION);
		createEReference(connectorInfoEClass, CONNECTOR_INFO__ENDPOINT);
		createEReference(connectorInfoEClass, CONNECTOR_INFO__METRIC);
		createEReference(connectorInfoEClass, CONNECTOR_INFO__CONNECTOR_MODEL);

		connectorMetricEClass = createEClass(CONNECTOR_METRIC);
		createEAttribute(connectorMetricEClass, CONNECTOR_METRIC__ID);
		createEAttribute(connectorMetricEClass, CONNECTOR_METRIC__TIMESTAMP);
		createEAttribute(connectorMetricEClass, CONNECTOR_METRIC__STATUS);
		createEAttribute(connectorMetricEClass, CONNECTOR_METRIC__UPTIME);
		createEReference(connectorMetricEClass, CONNECTOR_METRIC__CONNECTOR);

		connectorEndpointEClass = createEClass(CONNECTOR_ENDPOINT);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__ID);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__NAME);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__URI);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__METHOD);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__PROTOCOL);
		createEAttribute(connectorEndpointEClass, CONNECTOR_ENDPOINT__MEDIA_TYPE);
		createEReference(connectorEndpointEClass, CONNECTOR_ENDPOINT__CONNECTOR);
		createEReference(connectorEndpointEClass, CONNECTOR_ENDPOINT__MODEL_PACKAGE);

		endpointRequestEClass = createEClass(ENDPOINT_REQUEST);
		createEAttribute(endpointRequestEClass, ENDPOINT_REQUEST__ID);
		createEAttribute(endpointRequestEClass, ENDPOINT_REQUEST__TIMESTAMP);
		createEReference(endpointRequestEClass, ENDPOINT_REQUEST__ENDPOINT);
		createEReference(endpointRequestEClass, ENDPOINT_REQUEST__PARAMETER);
		createEAttribute(endpointRequestEClass, ENDPOINT_REQUEST__SOURCE_ID);

		endpointResponseEClass = createEClass(ENDPOINT_RESPONSE);
		createEAttribute(endpointResponseEClass, ENDPOINT_RESPONSE__ID);
		createEReference(endpointResponseEClass, ENDPOINT_RESPONSE__REQUEST);
		createEAttribute(endpointResponseEClass, ENDPOINT_RESPONSE__TIMESTAMP);
		createEAttribute(endpointResponseEClass, ENDPOINT_RESPONSE__CODE);
		createEReference(endpointResponseEClass, ENDPOINT_RESPONSE__RESULT);
		createEAttribute(endpointResponseEClass, ENDPOINT_RESPONSE__SOURCE_ID);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__NUMBER);

		javaParameterEClass = createEClass(JAVA_PARAMETER);
		createEAttribute(javaParameterEClass, JAVA_PARAMETER__TYPE_STRING);
		createEAttribute(javaParameterEClass, JAVA_PARAMETER__VALUE);

		ecoreParameterEClass = createEClass(ECORE_PARAMETER);
		createEReference(ecoreParameterEClass, ECORE_PARAMETER__VALUE);

		responseResultEClass = createEClass(RESPONSE_RESULT);
		createEReference(responseResultEClass, RESPONSE_RESULT__META_DATA);

		responseMetaDataEClass = createEClass(RESPONSE_META_DATA);
		createEAttribute(responseMetaDataEClass, RESPONSE_META_DATA__HASH);

		dryRunResultEClass = createEClass(DRY_RUN_RESULT);
		createEAttribute(dryRunResultEClass, DRY_RUN_RESULT__RESULT_COUNT);
		createEAttribute(dryRunResultEClass, DRY_RUN_RESULT__EST_RUNTIME);

		errorResultEClass = createEClass(ERROR_RESULT);
		createEAttribute(errorResultEClass, ERROR_RESULT__ERROR);
		createEAttribute(errorResultEClass, ERROR_RESULT__ERROR_TEXT);
		createEAttribute(errorResultEClass, ERROR_RESULT__THROWABLE);

		ecoreResultEClass = createEClass(ECORE_RESULT);
		createEReference(ecoreResultEClass, ECORE_RESULT__VALUE);

		javaResultEClass = createEClass(JAVA_RESULT);
		createEAttribute(javaResultEClass, JAVA_RESULT__TYPE_STRING);
		createEAttribute(javaResultEClass, JAVA_RESULT__VALUE);

		simpleResultEClass = createEClass(SIMPLE_RESULT);
		createEAttribute(simpleResultEClass, SIMPLE_RESULT__VALUE);

		// Create enums
		protocolTypeEEnum = createEEnum(PROTOCOL_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);
		responseCodeEEnum = createEEnum(RESPONSE_CODE);

		// Create data types
		javaThrowableEDataType = createEDataType(JAVA_THROWABLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaParameterEClass.getESuperTypes().add(this.getParameter());
		ecoreParameterEClass.getESuperTypes().add(this.getParameter());
		dryRunResultEClass.getESuperTypes().add(this.getResponseResult());
		errorResultEClass.getESuperTypes().add(this.getResponseResult());
		ecoreResultEClass.getESuperTypes().add(this.getResponseResult());
		javaResultEClass.getESuperTypes().add(this.getResponseResult());
		simpleResultEClass.getESuperTypes().add(this.getResponseResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(connectorInfoEClass, ConnectorInfo.class, "ConnectorInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorInfo_Id(), ecorePackage.getEString(), "id", null, 1, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorInfo_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorInfo_Version(), ecorePackage.getEShort(), "version", "1", 1, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInfo_Endpoint(), this.getConnectorEndpoint(), null, "endpoint", null, 0, -1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInfo_Metric(), this.getConnectorMetric(), this.getConnectorMetric_Connector(), "metric", null, 0, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnectorInfo_Metric().getEKeys().add(this.getConnectorMetric_Id());
		initEReference(getConnectorInfo_ConnectorModel(), theEcorePackage.getEPackage(), null, "connectorModel", null, 0, 1, ConnectorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorMetricEClass, ConnectorMetric.class, "ConnectorMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorMetric_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConnectorMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorMetric_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, ConnectorMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorMetric_Status(), this.getStatusType(), "status", null, 0, 1, ConnectorMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorMetric_Uptime(), ecorePackage.getELong(), "uptime", null, 0, 1, ConnectorMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorMetric_Connector(), this.getConnectorInfo(), this.getConnectorInfo_Metric(), "connector", null, 0, 1, ConnectorMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEndpointEClass, ConnectorEndpoint.class, "ConnectorEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorEndpoint_Id(), ecorePackage.getEString(), "id", null, 1, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorEndpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorEndpoint_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorEndpoint_Method(), ecorePackage.getEString(), "method", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorEndpoint_Protocol(), this.getProtocolType(), "protocol", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorEndpoint_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorEndpoint_Connector(), this.getConnectorInfo(), null, "connector", null, 1, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorEndpoint_ModelPackage(), theEcorePackage.getEPackage(), null, "modelPackage", null, 0, 1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointRequestEClass, EndpointRequest.class, "EndpointRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointRequest_Id(), ecorePackage.getEString(), "id", null, 1, 1, EndpointRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointRequest_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, EndpointRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointRequest_Endpoint(), this.getConnectorEndpoint(), null, "endpoint", null, 1, 1, EndpointRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEndpointRequest_Endpoint().getEKeys().add(this.getConnectorEndpoint_Id());
		initEReference(getEndpointRequest_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, EndpointRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointRequest_SourceId(), ecorePackage.getEString(), "sourceId", null, 1, 1, EndpointRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointResponseEClass, EndpointResponse.class, "EndpointResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointResponse_Request(), this.getEndpointRequest(), null, "request", null, 1, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEndpointResponse_Request().getEKeys().add(this.getEndpointRequest_Id());
		initEAttribute(getEndpointResponse_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointResponse_Code(), this.getResponseCode(), "code", null, 1, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointResponse_Result(), this.getResponseResult(), null, "result", null, 0, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointResponse_SourceId(), ecorePackage.getEString(), "sourceId", null, 1, 1, EndpointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Number(), ecorePackage.getEShort(), "number", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaParameterEClass, JavaParameter.class, "JavaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaParameter_TypeString(), ecorePackage.getEString(), "typeString", null, 0, 1, JavaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaParameter_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, JavaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoreParameterEClass, EcoreParameter.class, "EcoreParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcoreParameter_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, EcoreParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseResultEClass, ResponseResult.class, "ResponseResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseResult_MetaData(), this.getResponseMetaData(), null, "metaData", null, 1, 1, ResponseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseMetaDataEClass, ResponseMetaData.class, "ResponseMetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseMetaData_Hash(), ecorePackage.getEString(), "hash", null, 0, 1, ResponseMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dryRunResultEClass, DryRunResult.class, "DryRunResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDryRunResult_ResultCount(), ecorePackage.getEInt(), "resultCount", null, 0, 1, DryRunResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDryRunResult_EstRuntime(), ecorePackage.getELong(), "estRuntime", null, 0, 1, DryRunResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorResultEClass, ErrorResult.class, "ErrorResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorResult_Error(), ecorePackage.getEString(), "error", null, 1, 1, ErrorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorResult_ErrorText(), ecorePackage.getEString(), "errorText", null, 0, 1, ErrorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorResult_Throwable(), this.getJavaThrowable(), "throwable", null, 0, 1, ErrorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoreResultEClass, EcoreResult.class, "EcoreResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcoreResult_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, EcoreResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaResultEClass, JavaResult.class, "JavaResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaResult_TypeString(), ecorePackage.getEString(), "typeString", null, 0, 1, JavaResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResult_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, JavaResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleResultEClass, SimpleResult.class, "SimpleResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleResult_Value(), theEcorePackage.getEString(), "value", null, 0, 1, SimpleResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(protocolTypeEEnum, ProtocolType.class, "ProtocolType");
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.OTHER);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.HTTP);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.HTTP_REST);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.HTTP_SOAP);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.HTTP_WS);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.MQTT);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.AMQP);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.UNKNOWN);
		addEEnumLiteral(statusTypeEEnum, StatusType.RUNNING);
		addEEnumLiteral(statusTypeEEnum, StatusType.ERROR);
		addEEnumLiteral(statusTypeEEnum, StatusType.INACTIVE);

		initEEnum(responseCodeEEnum, ResponseCode.class, "ResponseCode");
		addEEnumLiteral(responseCodeEEnum, ResponseCode.OK);
		addEEnumLiteral(responseCodeEEnum, ResponseCode.ERROR);
		addEEnumLiteral(responseCodeEEnum, ResponseCode.NO_CONTENT);
		addEEnumLiteral(responseCodeEEnum, ResponseCode.TIMEOUT);
		addEEnumLiteral(responseCodeEEnum, ResponseCode.OTHER);

		// Initialize data types
		initEDataType(javaThrowableEDataType, Throwable.class, "JavaThrowable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "oSGiCompatible", "true",
			   "basePackage", "de.avatar.model",
			   "resource", "XMI",
			   "contentTypeIdentifier", "connector#1.0",
			   "copyrightText", "Copyright (c) 2012 - 2024 Data In Motion and others.\nAll rights reserved. \n\nThis program and the accompanying materials are made\navailable under the terms of the Eclipse Public License 2.0\nwhich is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n    Data In Motion - initial API and implementation"
		   });
	}

} //AConnectorPackageImpl
