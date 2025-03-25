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
package de.avatar.metadata.impl;

import de.avatar.metadata.ConsentInfo;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.ConsentInfoImpl#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConsentInfoImpl#getPolicyId <em>Policy Id</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConsentInfoImpl#getPolicyVersion <em>Policy Version</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConsentInfoImpl#getConsentIdType <em>Consent Id Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentInfoImpl extends MinimalEObjectImpl.Container implements ConsentInfo {
	/**
	 * The default value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected String domainId = DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyId() <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyId()
	 * @generated
	 * @ordered
	 */
	protected String policyId = POLICY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyVersion() <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyVersion() <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersion()
	 * @generated
	 * @ordered
	 */
	protected String policyVersion = POLICY_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsentIdType() <em>Consent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSENT_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsentIdType() <em>Consent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentIdType()
	 * @generated
	 * @ordered
	 */
	protected String consentIdType = CONSENT_ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.CONSENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainId() {
		return domainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainId(String newDomainId) {
		String oldDomainId = domainId;
		domainId = newDomainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_INFO__DOMAIN_ID, oldDomainId, domainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyId() {
		return policyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyId(String newPolicyId) {
		String oldPolicyId = policyId;
		policyId = newPolicyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_INFO__POLICY_ID, oldPolicyId, policyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyVersion() {
		return policyVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyVersion(String newPolicyVersion) {
		String oldPolicyVersion = policyVersion;
		policyVersion = newPolicyVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_INFO__POLICY_VERSION, oldPolicyVersion, policyVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsentIdType() {
		return consentIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentIdType(String newConsentIdType) {
		String oldConsentIdType = consentIdType;
		consentIdType = newConsentIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_INFO__CONSENT_ID_TYPE, oldConsentIdType, consentIdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.CONSENT_INFO__DOMAIN_ID:
				return getDomainId();
			case MetadataPackage.CONSENT_INFO__POLICY_ID:
				return getPolicyId();
			case MetadataPackage.CONSENT_INFO__POLICY_VERSION:
				return getPolicyVersion();
			case MetadataPackage.CONSENT_INFO__CONSENT_ID_TYPE:
				return getConsentIdType();
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
			case MetadataPackage.CONSENT_INFO__DOMAIN_ID:
				setDomainId((String)newValue);
				return;
			case MetadataPackage.CONSENT_INFO__POLICY_ID:
				setPolicyId((String)newValue);
				return;
			case MetadataPackage.CONSENT_INFO__POLICY_VERSION:
				setPolicyVersion((String)newValue);
				return;
			case MetadataPackage.CONSENT_INFO__CONSENT_ID_TYPE:
				setConsentIdType((String)newValue);
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
			case MetadataPackage.CONSENT_INFO__DOMAIN_ID:
				setDomainId(DOMAIN_ID_EDEFAULT);
				return;
			case MetadataPackage.CONSENT_INFO__POLICY_ID:
				setPolicyId(POLICY_ID_EDEFAULT);
				return;
			case MetadataPackage.CONSENT_INFO__POLICY_VERSION:
				setPolicyVersion(POLICY_VERSION_EDEFAULT);
				return;
			case MetadataPackage.CONSENT_INFO__CONSENT_ID_TYPE:
				setConsentIdType(CONSENT_ID_TYPE_EDEFAULT);
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
			case MetadataPackage.CONSENT_INFO__DOMAIN_ID:
				return DOMAIN_ID_EDEFAULT == null ? domainId != null : !DOMAIN_ID_EDEFAULT.equals(domainId);
			case MetadataPackage.CONSENT_INFO__POLICY_ID:
				return POLICY_ID_EDEFAULT == null ? policyId != null : !POLICY_ID_EDEFAULT.equals(policyId);
			case MetadataPackage.CONSENT_INFO__POLICY_VERSION:
				return POLICY_VERSION_EDEFAULT == null ? policyVersion != null : !POLICY_VERSION_EDEFAULT.equals(policyVersion);
			case MetadataPackage.CONSENT_INFO__CONSENT_ID_TYPE:
				return CONSENT_ID_TYPE_EDEFAULT == null ? consentIdType != null : !CONSENT_ID_TYPE_EDEFAULT.equals(consentIdType);
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
		result.append(" (domainId: ");
		result.append(domainId);
		result.append(", policyId: ");
		result.append(policyId);
		result.append(", policyVersion: ");
		result.append(policyVersion);
		result.append(", consentIdType: ");
		result.append(consentIdType);
		result.append(')');
		return result.toString();
	}

} //ConsentInfoImpl
