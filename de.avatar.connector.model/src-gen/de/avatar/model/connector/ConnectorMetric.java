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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ConnectorMetric#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorMetric#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorMetric#getStatus <em>Status</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorMetric#getUptime <em>Uptime</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorMetric#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric()
 * @model
 * @generated
 */
@ProviderType
public interface ConnectorMetric extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorMetric#getId <em>Id</em>}' attribute.
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
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorMetric#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.model.connector.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.avatar.model.connector.StatusType
	 * @see #setStatus(StatusType)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric_Status()
	 * @model
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorMetric#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.avatar.model.connector.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Uptime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uptime</em>' attribute.
	 * @see #setUptime(long)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric_Uptime()
	 * @model
	 * @generated
	 */
	long getUptime();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorMetric#getUptime <em>Uptime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uptime</em>' attribute.
	 * @see #getUptime()
	 * @generated
	 */
	void setUptime(long value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.avatar.model.connector.ConnectorInfo#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(ConnectorInfo)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorMetric_Connector()
	 * @see de.avatar.model.connector.ConnectorInfo#getMetric
	 * @model opposite="metric" transient="false"
	 * @generated
	 */
	ConnectorInfo getConnector();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorMetric#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorInfo value);

} // ConnectorMetric
