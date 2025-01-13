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

import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Query Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.DetailedQueryStatusImpl#getSingleConnectorQueryStatus <em>Single Connector Query Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailedQueryStatusImpl extends MinimalEObjectImpl.Container implements DetailedQueryStatus {
	/**
	 * The cached value of the '{@link #getSingleConnectorQueryStatus() <em>Single Connector Query Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleConnectorQueryStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleConnectorQueryStatus> singleConnectorQueryStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailedQueryStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.DETAILED_QUERY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleConnectorQueryStatus> getSingleConnectorQueryStatus() {
		if (singleConnectorQueryStatus == null) {
			singleConnectorQueryStatus = new EObjectContainmentEList<SingleConnectorQueryStatus>(SingleConnectorQueryStatus.class, this, StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS);
		}
		return singleConnectorQueryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS:
				return ((InternalEList<?>)getSingleConnectorQueryStatus()).basicRemove(otherEnd, msgs);
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
			case StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS:
				return getSingleConnectorQueryStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS:
				getSingleConnectorQueryStatus().clear();
				getSingleConnectorQueryStatus().addAll((Collection<? extends SingleConnectorQueryStatus>)newValue);
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
			case StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS:
				getSingleConnectorQueryStatus().clear();
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
			case StatusPackage.DETAILED_QUERY_STATUS__SINGLE_CONNECTOR_QUERY_STATUS:
				return singleConnectorQueryStatus != null && !singleConnectorQueryStatus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DetailedQueryStatusImpl
