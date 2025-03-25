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

import de.avatar.metadata.DataQualityFilter;
import de.avatar.metadata.DataQualityMetadata;
import de.avatar.metadata.MetadataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Quality Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.DataQualityMetadataImpl#getDataQualityFilter <em>Data Quality Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQualityMetadataImpl extends MetadataImpl implements DataQualityMetadata {
	/**
	 * The cached value of the '{@link #getDataQualityFilter() <em>Data Quality Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataQualityFilter> dataQualityFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQualityMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.DATA_QUALITY_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataQualityFilter> getDataQualityFilter() {
		if (dataQualityFilter == null) {
			dataQualityFilter = new EObjectContainmentEList<DataQualityFilter>(DataQualityFilter.class, this, MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER);
		}
		return dataQualityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER:
				return ((InternalEList<?>)getDataQualityFilter()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER:
				return getDataQualityFilter();
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
			case MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER:
				getDataQualityFilter().clear();
				getDataQualityFilter().addAll((Collection<? extends DataQualityFilter>)newValue);
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
			case MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER:
				getDataQualityFilter().clear();
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
			case MetadataPackage.DATA_QUALITY_METADATA__DATA_QUALITY_FILTER:
				return dataQualityFilter != null && !dataQualityFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataQualityMetadataImpl
