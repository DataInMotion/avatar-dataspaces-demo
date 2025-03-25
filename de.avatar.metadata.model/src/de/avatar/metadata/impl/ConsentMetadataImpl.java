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
import de.avatar.metadata.ConsentMetadata;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.ConsentMetadataImpl#getConsentInfo <em>Consent Info</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConsentMetadataImpl#getResultsBeforeConsentFilter <em>Results Before Consent Filter</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConsentMetadataImpl#getResultsAfterConsentFilter <em>Results After Consent Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentMetadataImpl extends MetadataImpl implements ConsentMetadata {
	/**
	 * The cached value of the '{@link #getConsentInfo() <em>Consent Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentInfo()
	 * @generated
	 * @ordered
	 */
	protected ConsentInfo consentInfo;

	/**
	 * The default value of the '{@link #getResultsBeforeConsentFilter() <em>Results Before Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsBeforeConsentFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESULTS_BEFORE_CONSENT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultsBeforeConsentFilter() <em>Results Before Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsBeforeConsentFilter()
	 * @generated
	 * @ordered
	 */
	protected Integer resultsBeforeConsentFilter = RESULTS_BEFORE_CONSENT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultsAfterConsentFilter() <em>Results After Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsAfterConsentFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESULTS_AFTER_CONSENT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultsAfterConsentFilter() <em>Results After Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsAfterConsentFilter()
	 * @generated
	 * @ordered
	 */
	protected Integer resultsAfterConsentFilter = RESULTS_AFTER_CONSENT_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.CONSENT_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentInfo getConsentInfo() {
		return consentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentInfo(ConsentInfo newConsentInfo, NotificationChain msgs) {
		ConsentInfo oldConsentInfo = consentInfo;
		consentInfo = newConsentInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_METADATA__CONSENT_INFO, oldConsentInfo, newConsentInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentInfo(ConsentInfo newConsentInfo) {
		if (newConsentInfo != consentInfo) {
			NotificationChain msgs = null;
			if (consentInfo != null)
				msgs = ((InternalEObject)consentInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.CONSENT_METADATA__CONSENT_INFO, null, msgs);
			if (newConsentInfo != null)
				msgs = ((InternalEObject)newConsentInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.CONSENT_METADATA__CONSENT_INFO, null, msgs);
			msgs = basicSetConsentInfo(newConsentInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_METADATA__CONSENT_INFO, newConsentInfo, newConsentInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResultsBeforeConsentFilter() {
		return resultsBeforeConsentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsBeforeConsentFilter(Integer newResultsBeforeConsentFilter) {
		Integer oldResultsBeforeConsentFilter = resultsBeforeConsentFilter;
		resultsBeforeConsentFilter = newResultsBeforeConsentFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER, oldResultsBeforeConsentFilter, resultsBeforeConsentFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResultsAfterConsentFilter() {
		return resultsAfterConsentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsAfterConsentFilter(Integer newResultsAfterConsentFilter) {
		Integer oldResultsAfterConsentFilter = resultsAfterConsentFilter;
		resultsAfterConsentFilter = newResultsAfterConsentFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER, oldResultsAfterConsentFilter, resultsAfterConsentFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.CONSENT_METADATA__CONSENT_INFO:
				return basicSetConsentInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.CONSENT_METADATA__CONSENT_INFO:
				return getConsentInfo();
			case MetadataPackage.CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER:
				return getResultsBeforeConsentFilter();
			case MetadataPackage.CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER:
				return getResultsAfterConsentFilter();
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
			case MetadataPackage.CONSENT_METADATA__CONSENT_INFO:
				setConsentInfo((ConsentInfo)newValue);
				return;
			case MetadataPackage.CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER:
				setResultsBeforeConsentFilter((Integer)newValue);
				return;
			case MetadataPackage.CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER:
				setResultsAfterConsentFilter((Integer)newValue);
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
			case MetadataPackage.CONSENT_METADATA__CONSENT_INFO:
				setConsentInfo((ConsentInfo)null);
				return;
			case MetadataPackage.CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER:
				setResultsBeforeConsentFilter(RESULTS_BEFORE_CONSENT_FILTER_EDEFAULT);
				return;
			case MetadataPackage.CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER:
				setResultsAfterConsentFilter(RESULTS_AFTER_CONSENT_FILTER_EDEFAULT);
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
			case MetadataPackage.CONSENT_METADATA__CONSENT_INFO:
				return consentInfo != null;
			case MetadataPackage.CONSENT_METADATA__RESULTS_BEFORE_CONSENT_FILTER:
				return RESULTS_BEFORE_CONSENT_FILTER_EDEFAULT == null ? resultsBeforeConsentFilter != null : !RESULTS_BEFORE_CONSENT_FILTER_EDEFAULT.equals(resultsBeforeConsentFilter);
			case MetadataPackage.CONSENT_METADATA__RESULTS_AFTER_CONSENT_FILTER:
				return RESULTS_AFTER_CONSENT_FILTER_EDEFAULT == null ? resultsAfterConsentFilter != null : !RESULTS_AFTER_CONSENT_FILTER_EDEFAULT.equals(resultsAfterConsentFilter);
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
		result.append(" (resultsBeforeConsentFilter: ");
		result.append(resultsBeforeConsentFilter);
		result.append(", resultsAfterConsentFilter: ");
		result.append(resultsAfterConsentFilter);
		result.append(')');
		return result.toString();
	}

} //ConsentMetadataImpl
