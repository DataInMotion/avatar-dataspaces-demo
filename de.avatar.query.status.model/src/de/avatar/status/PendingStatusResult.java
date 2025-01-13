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
 * A representation of the model object '<em><b>Pending Status Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.PendingStatusResult#getEstRuntime <em>Est Runtime</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getPendingStatusResult()
 * @model
 * @generated
 */
@ProviderType
public interface PendingStatusResult extends StatusResult {
	/**
	 * Returns the value of the '<em><b>Est Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Runtime</em>' attribute.
	 * @see #setEstRuntime(long)
	 * @see de.avatar.status.StatusPackage#getPendingStatusResult_EstRuntime()
	 * @model
	 * @generated
	 */
	long getEstRuntime();

	/**
	 * Sets the value of the '{@link de.avatar.status.PendingStatusResult#getEstRuntime <em>Est Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Runtime</em>' attribute.
	 * @see #getEstRuntime()
	 * @generated
	 */
	void setEstRuntime(long value);

} // PendingStatusResult
