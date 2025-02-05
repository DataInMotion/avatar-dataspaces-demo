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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Status Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.QueryStatusResponse#getDetailedStatus <em>Detailed Status</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getQueryStatusResponse()
 * @model
 * @generated
 */
@ProviderType
public interface QueryStatusResponse extends QueryResponse {
	/**
	 * Returns the value of the '<em><b>Detailed Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Status</em>' containment reference.
	 * @see #setDetailedStatus(DetailedQueryStatus)
	 * @see de.avatar.status.StatusPackage#getQueryStatusResponse_DetailedStatus()
	 * @model containment="true"
	 * @generated
	 */
	DetailedQueryStatus getDetailedStatus();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatusResponse#getDetailedStatus <em>Detailed Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Status</em>' containment reference.
	 * @see #getDetailedStatus()
	 * @generated
	 */
	void setDetailedStatus(DetailedQueryStatus value);

} // QueryStatusResponse
