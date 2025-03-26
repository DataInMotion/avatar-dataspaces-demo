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
package de.avatar.status;

import de.avatar.metadata.Metadata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Connector Query Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link de.avatar.status.SingleConnectorQueryStatus#getStatusResult <em>Status Result</em>}</li>
 *   <li>{@link de.avatar.status.SingleConnectorQueryStatus#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getSingleConnectorQueryStatus()
 * @model
 * @generated
 */
@ProviderType
public interface SingleConnectorQueryStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #setConnectorId(String)
	 * @see de.avatar.status.StatusPackage#getSingleConnectorQueryStatus_ConnectorId()
	 * @model
	 * @generated
	 */
	String getConnectorId();

	/**
	 * Sets the value of the '{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(String value);

	/**
	 * Returns the value of the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Name</em>' attribute.
	 * @see #setConnectorName(String)
	 * @see de.avatar.status.StatusPackage#getSingleConnectorQueryStatus_ConnectorName()
	 * @model
	 * @generated
	 */
	String getConnectorName();

	/**
	 * Sets the value of the '{@link de.avatar.status.SingleConnectorQueryStatus#getConnectorName <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Name</em>' attribute.
	 * @see #getConnectorName()
	 * @generated
	 */
	void setConnectorName(String value);

	/**
	 * Returns the value of the '<em><b>Status Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Result</em>' containment reference.
	 * @see #setStatusResult(StatusResult)
	 * @see de.avatar.status.StatusPackage#getSingleConnectorQueryStatus_StatusResult()
	 * @model containment="true"
	 * @generated
	 */
	StatusResult getStatusResult();

	/**
	 * Sets the value of the '{@link de.avatar.status.SingleConnectorQueryStatus#getStatusResult <em>Status Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Result</em>' containment reference.
	 * @see #getStatusResult()
	 * @generated
	 */
	void setStatusResult(StatusResult value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.metadata.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see de.avatar.status.StatusPackage#getSingleConnectorQueryStatus_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // SingleConnectorQueryStatus
