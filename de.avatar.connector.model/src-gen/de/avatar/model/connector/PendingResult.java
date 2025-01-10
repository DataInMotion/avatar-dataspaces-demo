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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pending Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.PendingResult#getEstRuntime <em>Est Runtime</em>}</li>
 *   <li>{@link de.avatar.model.connector.PendingResult#getConnectorPendingResult <em>Connector Pending Result</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getPendingResult()
 * @model
 * @generated
 */
@ProviderType
public interface PendingResult extends ResponseResult {
	/**
	 * Returns the value of the '<em><b>Est Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimating remaining time to complete the request
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Est Runtime</em>' attribute.
	 * @see #setEstRuntime(long)
	 * @see de.avatar.model.connector.AConnectorPackage#getPendingResult_EstRuntime()
	 * @model
	 * @generated
	 */
	long getEstRuntime();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.PendingResult#getEstRuntime <em>Est Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Runtime</em>' attribute.
	 * @see #getEstRuntime()
	 * @generated
	 */
	void setEstRuntime(long value);

	/**
	 * Returns the value of the '<em><b>Connector Pending Result</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.model.connector.ConnectorPendingResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of each connector for this request (e.g. one of the connectors already completed the request, another one is still pending, another gave an error, and so on)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Pending Result</em>' containment reference list.
	 * @see de.avatar.model.connector.AConnectorPackage#getPendingResult_ConnectorPendingResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorPendingResult> getConnectorPendingResult();

} // PendingResult
