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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.EndpointRequest#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointRequest#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointRequest#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointRequest#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointRequest#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest()
 * @model
 * @generated
 */
@ProviderType
public interface EndpointRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(ConnectorEndpoint)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest_Endpoint()
	 * @model containment="true" keys="id" required="true"
	 * @generated
	 */
	ConnectorEndpoint getEndpoint();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointRequest#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(ConnectorEndpoint value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.model.connector.JavaParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointRequest_SourceId()
	 * @model required="true"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointRequest#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

} // EndpointRequest
