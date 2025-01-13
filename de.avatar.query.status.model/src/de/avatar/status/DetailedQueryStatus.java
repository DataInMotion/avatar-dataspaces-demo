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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detailed Query Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.DetailedQueryStatus#getSingleConnectorQueryStatus <em>Single Connector Query Status</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getDetailedQueryStatus()
 * @model
 * @generated
 */
@ProviderType
public interface DetailedQueryStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Single Connector Query Status</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.status.SingleConnectorQueryStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Connector Query Status</em>' containment reference list.
	 * @see de.avatar.status.StatusPackage#getDetailedQueryStatus_SingleConnectorQueryStatus()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleConnectorQueryStatus> getSingleConnectorQueryStatus();

} // DetailedQueryStatus
