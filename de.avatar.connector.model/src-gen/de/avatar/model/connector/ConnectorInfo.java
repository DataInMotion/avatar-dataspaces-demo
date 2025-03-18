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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getName <em>Name</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getVersion <em>Version</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getConnectorModel <em>Connector Model</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getModelInfo <em>Model Info</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorInfo#getConsentInfo <em>Consent Info</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo()
 * @model
 * @generated
 */
@ProviderType
public interface ConnectorInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(short)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Version()
	 * @model default="1" required="true"
	 * @generated
	 */
	short getVersion();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(short value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.model.connector.ConnectorEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorEndpoint> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.avatar.model.connector.ConnectorMetric#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference.
	 * @see #setMetric(ConnectorMetric)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_Metric()
	 * @see de.avatar.model.connector.ConnectorMetric#getConnector
	 * @model opposite="connector" containment="true" keys="id"
	 * @generated
	 */
	ConnectorMetric getMetric();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getMetric <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' containment reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ConnectorMetric value);

	/**
	 * Returns the value of the '<em><b>Connector Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Model</em>' reference.
	 * @see #setConnectorModel(EPackage)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_ConnectorModel()
	 * @model keys="nsURI"
	 * @generated
	 */
	EPackage getConnectorModel();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorInfo#getConnectorModel <em>Connector Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Model</em>' reference.
	 * @see #getConnectorModel()
	 * @generated
	 */
	void setConnectorModel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Model Info</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.model.connector.ModelInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Info</em>' containment reference list.
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_ModelInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelInfo> getModelInfo();

	/**
	 * Returns the value of the '<em><b>Consent Info</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.model.connector.ConsentInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Info</em>' containment reference list.
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorInfo_ConsentInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsentInfo> getConsentInfo();

} // ConnectorInfo
