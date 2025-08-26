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
package de.avatar.status.impl;

import de.avatar.status.QueryLinkResponse;
import de.avatar.status.StatusPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Link Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.QueryLinkResponseImpl#getDownloadLink <em>Download Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryLinkResponseImpl extends QueryResponseImpl implements QueryLinkResponse {
	/**
	 * The default value of the '{@link #getDownloadLink() <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadLink() <em>Download Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected String downloadLink = DOWNLOAD_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryLinkResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.QUERY_LINK_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownloadLink() {
		return downloadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownloadLink(String newDownloadLink) {
		String oldDownloadLink = downloadLink;
		downloadLink = newDownloadLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_LINK_RESPONSE__DOWNLOAD_LINK, oldDownloadLink, downloadLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatusPackage.QUERY_LINK_RESPONSE__DOWNLOAD_LINK:
				return getDownloadLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatusPackage.QUERY_LINK_RESPONSE__DOWNLOAD_LINK:
				setDownloadLink((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatusPackage.QUERY_LINK_RESPONSE__DOWNLOAD_LINK:
				setDownloadLink(DOWNLOAD_LINK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatusPackage.QUERY_LINK_RESPONSE__DOWNLOAD_LINK:
				return DOWNLOAD_LINK_EDEFAULT == null ? downloadLink != null : !DOWNLOAD_LINK_EDEFAULT.equals(downloadLink);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (downloadLink: ");
		result.append(downloadLink);
		result.append(')');
		return result.toString();
	}

} //QueryLinkResponseImpl
