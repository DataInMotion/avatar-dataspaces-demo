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
package de.avatar.model.connector;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.avatar.model.connector.AConnectorFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel oSGiCompatible='true' basePackage='de.avatar.model' resource='XMI' contentTypeIdentifier='connector#1.0' copyrightText='Copyright (c) 2012 - 2024 Data In Motion and others.\nAll rights reserved. \n\nThis program and the accompanying materials are made\navailable under the terms of the Eclipse Public License 2.0\nwhich is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n    Data In Motion - initial API and implementation'"
 * @generated
 */
@ProviderType
@EPackage(uri = AConnectorPackage.eNS_URI, genModel = "/model/avatar-connector.genmodel", genModelSourceLocations = {"model/avatar-connector.genmodel","de.avatar.connector.model/model/avatar-connector.genmodel"}, ecore="/model/avatar-connector.ecore", ecoreSourceLocations="/model/avatar-connector.ecore")
public interface AConnectorPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "connector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.avatar-projekt.de/connector/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ac";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "connector#1.0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AConnectorPackage eINSTANCE = de.avatar.model.connector.impl.AConnectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ConnectorInfoImpl <em>Connector Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ConnectorInfoImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorInfo()
	 * @generated
	 */
	int CONNECTOR_INFO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__METRIC = 5;

	/**
	 * The feature id for the '<em><b>Connector Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO__CONNECTOR_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ConnectorMetricImpl <em>Connector Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ConnectorMetricImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorMetric()
	 * @generated
	 */
	int CONNECTOR_METRIC = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Uptime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC__UPTIME = 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC__CONNECTOR = 4;

	/**
	 * The number of structural features of the '<em>Connector Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connector Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ConnectorEndpointImpl <em>Connector Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ConnectorEndpointImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorEndpoint()
	 * @generated
	 */
	int CONNECTOR_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__URI = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__MEDIA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__MODEL_PACKAGE = 7;

	/**
	 * The number of structural features of the '<em>Connector Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connector Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.EndpointRequestImpl <em>Endpoint Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.EndpointRequestImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEndpointRequest()
	 * @generated
	 */
	int ENDPOINT_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST__ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST__PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST__SOURCE_ID = 4;

	/**
	 * The number of structural features of the '<em>Endpoint Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Endpoint Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.EndpointResponseImpl <em>Endpoint Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.EndpointResponseImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEndpointResponse()
	 * @generated
	 */
	int ENDPOINT_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__RESULT = 4;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE__SOURCE_ID = 5;

	/**
	 * The number of structural features of the '<em>Endpoint Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Endpoint Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ParameterImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.JavaParameterImpl <em>Java Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.JavaParameterImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaParameter()
	 * @generated
	 */
	int JAVA_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__NUMBER = PARAMETER__NUMBER;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__TYPE_STRING = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Java Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.EcoreParameterImpl <em>Ecore Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.EcoreParameterImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEcoreParameter()
	 * @generated
	 */
	int ECORE_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_PARAMETER__NUMBER = PARAMETER__NUMBER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecore Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecore Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ResponseResultImpl <em>Response Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ResponseResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseResult()
	 * @generated
	 */
	int RESPONSE_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT__META_DATA = 0;

	/**
	 * The number of structural features of the '<em>Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ResponseMetaDataImpl <em>Response Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ResponseMetaDataImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseMetaData()
	 * @generated
	 */
	int RESPONSE_META_DATA = 9;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_META_DATA__HASH = 0;

	/**
	 * The number of structural features of the '<em>Response Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_META_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.DryRunResultImpl <em>Dry Run Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.DryRunResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getDryRunResult()
	 * @generated
	 */
	int DRY_RUN_RESULT = 10;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRY_RUN_RESULT__META_DATA = RESPONSE_RESULT__META_DATA;

	/**
	 * The feature id for the '<em><b>Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRY_RUN_RESULT__RESULT_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Est Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRY_RUN_RESULT__EST_RUNTIME = RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dry Run Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRY_RUN_RESULT_FEATURE_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dry Run Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRY_RUN_RESULT_OPERATION_COUNT = RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.ErrorResultImpl <em>Error Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.ErrorResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getErrorResult()
	 * @generated
	 */
	int ERROR_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__META_DATA = RESPONSE_RESULT__META_DATA;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__ERROR = RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__ERROR_TEXT = RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Throwable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__THROWABLE = RESPONSE_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT_FEATURE_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Error Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT_OPERATION_COUNT = RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.EcoreResultImpl <em>Ecore Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.EcoreResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEcoreResult()
	 * @generated
	 */
	int ECORE_RESULT = 12;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_RESULT__META_DATA = RESPONSE_RESULT__META_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_RESULT__VALUE = RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecore Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_RESULT_FEATURE_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecore Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_RESULT_OPERATION_COUNT = RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.JavaResultImpl <em>Java Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.JavaResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaResult()
	 * @generated
	 */
	int JAVA_RESULT = 13;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESULT__META_DATA = RESPONSE_RESULT__META_DATA;

	/**
	 * The feature id for the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESULT__TYPE_STRING = RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESULT__VALUE = RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESULT_FEATURE_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Java Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESULT_OPERATION_COUNT = RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.impl.SimpleResultImpl <em>Simple Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.impl.SimpleResultImpl
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getSimpleResult()
	 * @generated
	 */
	int SIMPLE_RESULT = 14;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESULT__META_DATA = RESPONSE_RESULT__META_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESULT__VALUE = RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESULT_FEATURE_COUNT = RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESULT_OPERATION_COUNT = RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.ProtocolType
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.StatusType
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.avatar.model.connector.ResponseCode <em>Response Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.model.connector.ResponseCode
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseCode()
	 * @generated
	 */
	int RESPONSE_CODE = 17;

	/**
	 * The meta object id for the '<em>Java Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaThrowable()
	 * @generated
	 */
	int JAVA_THROWABLE = 18;


	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ConnectorInfo <em>Connector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Info</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo
	 * @generated
	 */
	EClass getConnectorInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getId()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EAttribute getConnectorInfo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getName()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EAttribute getConnectorInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorInfo#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getProvider()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EAttribute getConnectorInfo_Provider();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getVersion()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EAttribute getConnectorInfo_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.model.connector.ConnectorInfo#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getEndpoint()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EReference getConnectorInfo_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.ConnectorInfo#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metric</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getMetric()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EReference getConnectorInfo_Metric();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.model.connector.ConnectorInfo#getConnectorModel <em>Connector Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector Model</em>'.
	 * @see de.avatar.model.connector.ConnectorInfo#getConnectorModel()
	 * @see #getConnectorInfo()
	 * @generated
	 */
	EReference getConnectorInfo_ConnectorModel();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ConnectorMetric <em>Connector Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Metric</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric
	 * @generated
	 */
	EClass getConnectorMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorMetric#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric#getId()
	 * @see #getConnectorMetric()
	 * @generated
	 */
	EAttribute getConnectorMetric_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorMetric#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric#getTimestamp()
	 * @see #getConnectorMetric()
	 * @generated
	 */
	EAttribute getConnectorMetric_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorMetric#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric#getStatus()
	 * @see #getConnectorMetric()
	 * @generated
	 */
	EAttribute getConnectorMetric_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorMetric#getUptime <em>Uptime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uptime</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric#getUptime()
	 * @see #getConnectorMetric()
	 * @generated
	 */
	EAttribute getConnectorMetric_Uptime();

	/**
	 * Returns the meta object for the container reference '{@link de.avatar.model.connector.ConnectorMetric#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see de.avatar.model.connector.ConnectorMetric#getConnector()
	 * @see #getConnectorMetric()
	 * @generated
	 */
	EReference getConnectorMetric_Connector();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ConnectorEndpoint <em>Connector Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Endpoint</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint
	 * @generated
	 */
	EClass getConnectorEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getId()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getName()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getUri()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_Uri();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getMethod()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getProtocol()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ConnectorEndpoint#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getMediaType()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EAttribute getConnectorEndpoint_MediaType();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.model.connector.ConnectorEndpoint#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getConnector()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EReference getConnectorEndpoint_Connector();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.model.connector.ConnectorEndpoint#getModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Package</em>'.
	 * @see de.avatar.model.connector.ConnectorEndpoint#getModelPackage()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EReference getConnectorEndpoint_ModelPackage();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.EndpointRequest <em>Endpoint Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Request</em>'.
	 * @see de.avatar.model.connector.EndpointRequest
	 * @generated
	 */
	EClass getEndpointRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.model.connector.EndpointRequest#getId()
	 * @see #getEndpointRequest()
	 * @generated
	 */
	EAttribute getEndpointRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.avatar.model.connector.EndpointRequest#getTimestamp()
	 * @see #getEndpointRequest()
	 * @generated
	 */
	EAttribute getEndpointRequest_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.EndpointRequest#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see de.avatar.model.connector.EndpointRequest#getEndpoint()
	 * @see #getEndpointRequest()
	 * @generated
	 */
	EReference getEndpointRequest_Endpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.model.connector.EndpointRequest#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.avatar.model.connector.EndpointRequest#getParameter()
	 * @see #getEndpointRequest()
	 * @generated
	 */
	EReference getEndpointRequest_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointRequest#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see de.avatar.model.connector.EndpointRequest#getSourceId()
	 * @see #getEndpointRequest()
	 * @generated
	 */
	EAttribute getEndpointRequest_SourceId();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.EndpointResponse <em>Endpoint Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Response</em>'.
	 * @see de.avatar.model.connector.EndpointResponse
	 * @generated
	 */
	EClass getEndpointResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getId()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EAttribute getEndpointResponse_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.EndpointResponse#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getRequest()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EReference getEndpointResponse_Request();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getTimestamp()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EAttribute getEndpointResponse_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointResponse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getCode()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EAttribute getEndpointResponse_Code();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.model.connector.EndpointResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getResult()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EReference getEndpointResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.EndpointResponse#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see de.avatar.model.connector.EndpointResponse#getSourceId()
	 * @see #getEndpointResponse()
	 * @generated
	 */
	EAttribute getEndpointResponse_SourceId();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.avatar.model.connector.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.model.connector.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.Parameter#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.avatar.model.connector.Parameter#getNumber()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Number();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.JavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Parameter</em>'.
	 * @see de.avatar.model.connector.JavaParameter
	 * @generated
	 */
	EClass getJavaParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.JavaParameter#getTypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type String</em>'.
	 * @see de.avatar.model.connector.JavaParameter#getTypeString()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_TypeString();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.JavaParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.model.connector.JavaParameter#getValue()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_Value();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.EcoreParameter <em>Ecore Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Parameter</em>'.
	 * @see de.avatar.model.connector.EcoreParameter
	 * @generated
	 */
	EClass getEcoreParameter();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.EcoreParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.avatar.model.connector.EcoreParameter#getValue()
	 * @see #getEcoreParameter()
	 * @generated
	 */
	EReference getEcoreParameter_Value();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ResponseResult <em>Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Result</em>'.
	 * @see de.avatar.model.connector.ResponseResult
	 * @generated
	 */
	EClass getResponseResult();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.ResponseResult#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see de.avatar.model.connector.ResponseResult#getMetaData()
	 * @see #getResponseResult()
	 * @generated
	 */
	EReference getResponseResult_MetaData();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ResponseMetaData <em>Response Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Meta Data</em>'.
	 * @see de.avatar.model.connector.ResponseMetaData
	 * @generated
	 */
	EClass getResponseMetaData();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ResponseMetaData#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see de.avatar.model.connector.ResponseMetaData#getHash()
	 * @see #getResponseMetaData()
	 * @generated
	 */
	EAttribute getResponseMetaData_Hash();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.DryRunResult <em>Dry Run Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dry Run Result</em>'.
	 * @see de.avatar.model.connector.DryRunResult
	 * @generated
	 */
	EClass getDryRunResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.DryRunResult#getResultCount <em>Result Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Count</em>'.
	 * @see de.avatar.model.connector.DryRunResult#getResultCount()
	 * @see #getDryRunResult()
	 * @generated
	 */
	EAttribute getDryRunResult_ResultCount();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.DryRunResult#getEstRuntime <em>Est Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Runtime</em>'.
	 * @see de.avatar.model.connector.DryRunResult#getEstRuntime()
	 * @see #getDryRunResult()
	 * @generated
	 */
	EAttribute getDryRunResult_EstRuntime();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.ErrorResult <em>Error Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Result</em>'.
	 * @see de.avatar.model.connector.ErrorResult
	 * @generated
	 */
	EClass getErrorResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ErrorResult#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see de.avatar.model.connector.ErrorResult#getError()
	 * @see #getErrorResult()
	 * @generated
	 */
	EAttribute getErrorResult_Error();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ErrorResult#getErrorText <em>Error Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Text</em>'.
	 * @see de.avatar.model.connector.ErrorResult#getErrorText()
	 * @see #getErrorResult()
	 * @generated
	 */
	EAttribute getErrorResult_ErrorText();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.ErrorResult#getThrowable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throwable</em>'.
	 * @see de.avatar.model.connector.ErrorResult#getThrowable()
	 * @see #getErrorResult()
	 * @generated
	 */
	EAttribute getErrorResult_Throwable();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.EcoreResult <em>Ecore Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Result</em>'.
	 * @see de.avatar.model.connector.EcoreResult
	 * @generated
	 */
	EClass getEcoreResult();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.model.connector.EcoreResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.avatar.model.connector.EcoreResult#getValue()
	 * @see #getEcoreResult()
	 * @generated
	 */
	EReference getEcoreResult_Value();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.JavaResult <em>Java Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Result</em>'.
	 * @see de.avatar.model.connector.JavaResult
	 * @generated
	 */
	EClass getJavaResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.JavaResult#getTypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type String</em>'.
	 * @see de.avatar.model.connector.JavaResult#getTypeString()
	 * @see #getJavaResult()
	 * @generated
	 */
	EAttribute getJavaResult_TypeString();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.JavaResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.model.connector.JavaResult#getValue()
	 * @see #getJavaResult()
	 * @generated
	 */
	EAttribute getJavaResult_Value();

	/**
	 * Returns the meta object for class '{@link de.avatar.model.connector.SimpleResult <em>Simple Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Result</em>'.
	 * @see de.avatar.model.connector.SimpleResult
	 * @generated
	 */
	EClass getSimpleResult();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.model.connector.SimpleResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.model.connector.SimpleResult#getValue()
	 * @see #getSimpleResult()
	 * @generated
	 */
	EAttribute getSimpleResult_Value();

	/**
	 * Returns the meta object for enum '{@link de.avatar.model.connector.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see de.avatar.model.connector.ProtocolType
	 * @generated
	 */
	EEnum getProtocolType();

	/**
	 * Returns the meta object for enum '{@link de.avatar.model.connector.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see de.avatar.model.connector.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link de.avatar.model.connector.ResponseCode <em>Response Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Code</em>'.
	 * @see de.avatar.model.connector.ResponseCode
	 * @generated
	 */
	EEnum getResponseCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Java Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getJavaThrowable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AConnectorFactory getAConnectorFactory();

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
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ConnectorInfoImpl <em>Connector Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ConnectorInfoImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorInfo()
		 * @generated
		 */
		EClass CONNECTOR_INFO = eINSTANCE.getConnectorInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_INFO__ID = eINSTANCE.getConnectorInfo_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_INFO__NAME = eINSTANCE.getConnectorInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_INFO__PROVIDER = eINSTANCE.getConnectorInfo_Provider();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_INFO__VERSION = eINSTANCE.getConnectorInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INFO__ENDPOINT = eINSTANCE.getConnectorInfo_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INFO__METRIC = eINSTANCE.getConnectorInfo_Metric();

		/**
		 * The meta object literal for the '<em><b>Connector Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INFO__CONNECTOR_MODEL = eINSTANCE.getConnectorInfo_ConnectorModel();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ConnectorMetricImpl <em>Connector Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ConnectorMetricImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorMetric()
		 * @generated
		 */
		EClass CONNECTOR_METRIC = eINSTANCE.getConnectorMetric();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METRIC__ID = eINSTANCE.getConnectorMetric_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METRIC__TIMESTAMP = eINSTANCE.getConnectorMetric_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METRIC__STATUS = eINSTANCE.getConnectorMetric_Status();

		/**
		 * The meta object literal for the '<em><b>Uptime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_METRIC__UPTIME = eINSTANCE.getConnectorMetric_Uptime();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_METRIC__CONNECTOR = eINSTANCE.getConnectorMetric_Connector();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ConnectorEndpointImpl <em>Connector Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ConnectorEndpointImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getConnectorEndpoint()
		 * @generated
		 */
		EClass CONNECTOR_ENDPOINT = eINSTANCE.getConnectorEndpoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__ID = eINSTANCE.getConnectorEndpoint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__NAME = eINSTANCE.getConnectorEndpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__URI = eINSTANCE.getConnectorEndpoint_Uri();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__METHOD = eINSTANCE.getConnectorEndpoint_Method();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__PROTOCOL = eINSTANCE.getConnectorEndpoint_Protocol();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_ENDPOINT__MEDIA_TYPE = eINSTANCE.getConnectorEndpoint_MediaType();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_ENDPOINT__CONNECTOR = eINSTANCE.getConnectorEndpoint_Connector();

		/**
		 * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_ENDPOINT__MODEL_PACKAGE = eINSTANCE.getConnectorEndpoint_ModelPackage();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.EndpointRequestImpl <em>Endpoint Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.EndpointRequestImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEndpointRequest()
		 * @generated
		 */
		EClass ENDPOINT_REQUEST = eINSTANCE.getEndpointRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REQUEST__ID = eINSTANCE.getEndpointRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REQUEST__TIMESTAMP = eINSTANCE.getEndpointRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REQUEST__ENDPOINT = eINSTANCE.getEndpointRequest_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REQUEST__PARAMETER = eINSTANCE.getEndpointRequest_Parameter();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REQUEST__SOURCE_ID = eINSTANCE.getEndpointRequest_SourceId();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.EndpointResponseImpl <em>Endpoint Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.EndpointResponseImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEndpointResponse()
		 * @generated
		 */
		EClass ENDPOINT_RESPONSE = eINSTANCE.getEndpointResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_RESPONSE__ID = eINSTANCE.getEndpointResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_RESPONSE__REQUEST = eINSTANCE.getEndpointResponse_Request();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_RESPONSE__TIMESTAMP = eINSTANCE.getEndpointResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_RESPONSE__CODE = eINSTANCE.getEndpointResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_RESPONSE__RESULT = eINSTANCE.getEndpointResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_RESPONSE__SOURCE_ID = eINSTANCE.getEndpointResponse_SourceId();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ParameterImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NUMBER = eINSTANCE.getParameter_Number();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.JavaParameterImpl <em>Java Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.JavaParameterImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaParameter()
		 * @generated
		 */
		EClass JAVA_PARAMETER = eINSTANCE.getJavaParameter();

		/**
		 * The meta object literal for the '<em><b>Type String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__TYPE_STRING = eINSTANCE.getJavaParameter_TypeString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__VALUE = eINSTANCE.getJavaParameter_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.EcoreParameterImpl <em>Ecore Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.EcoreParameterImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEcoreParameter()
		 * @generated
		 */
		EClass ECORE_PARAMETER = eINSTANCE.getEcoreParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_PARAMETER__VALUE = eINSTANCE.getEcoreParameter_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ResponseResultImpl <em>Response Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ResponseResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseResult()
		 * @generated
		 */
		EClass RESPONSE_RESULT = eINSTANCE.getResponseResult();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_RESULT__META_DATA = eINSTANCE.getResponseResult_MetaData();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ResponseMetaDataImpl <em>Response Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ResponseMetaDataImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseMetaData()
		 * @generated
		 */
		EClass RESPONSE_META_DATA = eINSTANCE.getResponseMetaData();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_META_DATA__HASH = eINSTANCE.getResponseMetaData_Hash();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.DryRunResultImpl <em>Dry Run Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.DryRunResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getDryRunResult()
		 * @generated
		 */
		EClass DRY_RUN_RESULT = eINSTANCE.getDryRunResult();

		/**
		 * The meta object literal for the '<em><b>Result Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRY_RUN_RESULT__RESULT_COUNT = eINSTANCE.getDryRunResult_ResultCount();

		/**
		 * The meta object literal for the '<em><b>Est Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRY_RUN_RESULT__EST_RUNTIME = eINSTANCE.getDryRunResult_EstRuntime();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.ErrorResultImpl <em>Error Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.ErrorResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getErrorResult()
		 * @generated
		 */
		EClass ERROR_RESULT = eINSTANCE.getErrorResult();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESULT__ERROR = eINSTANCE.getErrorResult_Error();

		/**
		 * The meta object literal for the '<em><b>Error Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESULT__ERROR_TEXT = eINSTANCE.getErrorResult_ErrorText();

		/**
		 * The meta object literal for the '<em><b>Throwable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESULT__THROWABLE = eINSTANCE.getErrorResult_Throwable();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.EcoreResultImpl <em>Ecore Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.EcoreResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getEcoreResult()
		 * @generated
		 */
		EClass ECORE_RESULT = eINSTANCE.getEcoreResult();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_RESULT__VALUE = eINSTANCE.getEcoreResult_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.JavaResultImpl <em>Java Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.JavaResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaResult()
		 * @generated
		 */
		EClass JAVA_RESULT = eINSTANCE.getJavaResult();

		/**
		 * The meta object literal for the '<em><b>Type String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESULT__TYPE_STRING = eINSTANCE.getJavaResult_TypeString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESULT__VALUE = eINSTANCE.getJavaResult_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.impl.SimpleResultImpl <em>Simple Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.impl.SimpleResultImpl
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getSimpleResult()
		 * @generated
		 */
		EClass SIMPLE_RESULT = eINSTANCE.getSimpleResult();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RESULT__VALUE = eINSTANCE.getSimpleResult_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.ProtocolType
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.StatusType
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '{@link de.avatar.model.connector.ResponseCode <em>Response Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.model.connector.ResponseCode
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getResponseCode()
		 * @generated
		 */
		EEnum RESPONSE_CODE = eINSTANCE.getResponseCode();

		/**
		 * The meta object literal for the '<em>Java Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see de.avatar.model.connector.impl.AConnectorPackageImpl#getJavaThrowable()
		 * @generated
		 */
		EDataType JAVA_THROWABLE = eINSTANCE.getJavaThrowable();

	}

} //AConnectorPackage
