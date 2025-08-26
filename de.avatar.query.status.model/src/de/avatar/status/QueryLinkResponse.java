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
 * A representation of the model object '<em><b>Query Link Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.QueryLinkResponse#getDownloadLink <em>Download Link</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getQueryLinkResponse()
 * @model
 * @generated
 */
@ProviderType
public interface QueryLinkResponse extends QueryResponse {
	/**
	 * Returns the value of the '<em><b>Download Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Link</em>' attribute.
	 * @see #setDownloadLink(String)
	 * @see de.avatar.status.StatusPackage#getQueryLinkResponse_DownloadLink()
	 * @model
	 * @generated
	 */
	String getDownloadLink();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryLinkResponse#getDownloadLink <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Link</em>' attribute.
	 * @see #getDownloadLink()
	 * @generated
	 */
	void setDownloadLink(String value);

} // QueryLinkResponse
