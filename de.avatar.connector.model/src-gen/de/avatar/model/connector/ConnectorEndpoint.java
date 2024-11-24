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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getName <em>Name</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getUri <em>Uri</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorEndpoint#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint()
 * @model
 * @generated
 */
@ProviderType
public interface ConnectorEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getId <em>Id</em>}' attribute.
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
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.model.connector.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see de.avatar.model.connector.ProtocolType
	 * @see #setProtocol(ProtocolType)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Protocol()
	 * @model
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see de.avatar.model.connector.ProtocolType
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_MediaType()
	 * @model
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(ConnectorInfo)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_Connector()
	 * @model required="true"
	 * @generated
	 */
	ConnectorInfo getConnector();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorInfo value);

	/**
	 * Returns the value of the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Package</em>' reference.
	 * @see #setModelPackage(EPackage)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorEndpoint_ModelPackage()
	 * @model keys="nsURI"
	 * @generated
	 */
	EPackage getModelPackage();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorEndpoint#getModelPackage <em>Model Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Package</em>' reference.
	 * @see #getModelPackage()
	 * @generated
	 */
	void setModelPackage(EPackage value);

} // ConnectorEndpoint
