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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.model.connector.AConnectorPackage
 * @generated
 */
@ProviderType
public interface AConnectorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AConnectorFactory eINSTANCE = de.avatar.model.connector.impl.AConnectorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connector Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Info</em>'.
	 * @generated
	 */
	ConnectorInfo createConnectorInfo();

	/**
	 * Returns a new object of class '<em>Connector Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Metric</em>'.
	 * @generated
	 */
	ConnectorMetric createConnectorMetric();

	/**
	 * Returns a new object of class '<em>Connector Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Endpoint</em>'.
	 * @generated
	 */
	ConnectorEndpoint createConnectorEndpoint();

	/**
	 * Returns a new object of class '<em>Endpoint Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Request</em>'.
	 * @generated
	 */
	EndpointRequest createEndpointRequest();

	/**
	 * Returns a new object of class '<em>Endpoint Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Response</em>'.
	 * @generated
	 */
	EndpointResponse createEndpointResponse();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Java Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Parameter</em>'.
	 * @generated
	 */
	JavaParameter createJavaParameter();

	/**
	 * Returns a new object of class '<em>Ecore Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Parameter</em>'.
	 * @generated
	 */
	EcoreParameter createEcoreParameter();

	/**
	 * Returns a new object of class '<em>Response Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Meta Data</em>'.
	 * @generated
	 */
	ResponseMetaData createResponseMetaData();

	/**
	 * Returns a new object of class '<em>Dry Run Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dry Run Result</em>'.
	 * @generated
	 */
	DryRunResult createDryRunResult();

	/**
	 * Returns a new object of class '<em>Error Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Result</em>'.
	 * @generated
	 */
	ErrorResult createErrorResult();

	/**
	 * Returns a new object of class '<em>Pending Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pending Result</em>'.
	 * @generated
	 */
	PendingResult createPendingResult();

	/**
	 * Returns a new object of class '<em>Ecore Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Result</em>'.
	 * @generated
	 */
	EcoreResult createEcoreResult();

	/**
	 * Returns a new object of class '<em>Java Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Result</em>'.
	 * @generated
	 */
	JavaResult createJavaResult();

	/**
	 * Returns a new object of class '<em>Simple Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Result</em>'.
	 * @generated
	 */
	SimpleResult createSimpleResult();

	/**
	 * Returns a new object of class '<em>Connector Pending Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Pending Result</em>'.
	 * @generated
	 */
	ConnectorPendingResult createConnectorPendingResult();

	/**
	 * Returns a new object of class '<em>Consent Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Info</em>'.
	 * @generated
	 */
	ConsentInfo createConsentInfo();

	/**
	 * Returns a new object of class '<em>Model Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Info</em>'.
	 * @generated
	 */
	ModelInfo createModelInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AConnectorPackage getAConnectorPackage();

} //AConnectorFactory
