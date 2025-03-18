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
package de.avatar.model.connector.impl;

import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.ModelInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getConnectorModel <em>Connector Model</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getModelInfo <em>Model Info</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorInfoImpl#getConsentInfo <em>Consent Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorInfoImpl extends MinimalEObjectImpl.Container implements ConnectorInfo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final short VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected short version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEndpoint> endpoint;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected ConnectorMetric metric;

	/**
	 * The cached value of the '{@link #getConnectorModel() <em>Connector Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorModel()
	 * @generated
	 * @ordered
	 */
	protected EPackage connectorModel;

	/**
	 * The cached value of the '{@link #getModelInfo() <em>Model Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelInfo> modelInfo;

	/**
	 * The cached value of the '{@link #getConsentInfo() <em>Consent Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentInfo> consentInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.CONNECTOR_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(short newVersion) {
		short oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectorEndpoint> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<ConnectorEndpoint>(ConnectorEndpoint.class, this, AConnectorPackage.CONNECTOR_INFO__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(ConnectorMetric newMetric, NotificationChain msgs) {
		ConnectorMetric oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__METRIC, oldMetric, newMetric);
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
	public void setMetric(ConnectorMetric newMetric) {
		if (newMetric != metric) {
			NotificationChain msgs = null;
			if (metric != null)
				msgs = ((InternalEObject)metric).eInverseRemove(this, AConnectorPackage.CONNECTOR_METRIC__CONNECTOR, ConnectorMetric.class, msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, AConnectorPackage.CONNECTOR_METRIC__CONNECTOR, ConnectorMetric.class, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getConnectorModel() {
		if (connectorModel != null && connectorModel.eIsProxy()) {
			InternalEObject oldConnectorModel = (InternalEObject)connectorModel;
			connectorModel = (EPackage)eResolveProxy(oldConnectorModel);
			if (connectorModel != oldConnectorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL, oldConnectorModel, connectorModel));
			}
		}
		return connectorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetConnectorModel() {
		return connectorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorModel(EPackage newConnectorModel) {
		EPackage oldConnectorModel = connectorModel;
		connectorModel = newConnectorModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL, oldConnectorModel, connectorModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelInfo> getModelInfo() {
		if (modelInfo == null) {
			modelInfo = new EObjectContainmentEList<ModelInfo>(ModelInfo.class, this, AConnectorPackage.CONNECTOR_INFO__MODEL_INFO);
		}
		return modelInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentInfo> getConsentInfo() {
		if (consentInfo == null) {
			consentInfo = new EObjectContainmentEList<ConsentInfo>(ConsentInfo.class, this, AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO);
		}
		return consentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				if (metric != null)
					msgs = ((InternalEObject)metric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AConnectorPackage.CONNECTOR_INFO__METRIC, null, msgs);
				return basicSetMetric((ConnectorMetric)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AConnectorPackage.CONNECTOR_INFO__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				return basicSetMetric(null, msgs);
			case AConnectorPackage.CONNECTOR_INFO__MODEL_INFO:
				return ((InternalEList<?>)getModelInfo()).basicRemove(otherEnd, msgs);
			case AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO:
				return ((InternalEList<?>)getConsentInfo()).basicRemove(otherEnd, msgs);
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
			case AConnectorPackage.CONNECTOR_INFO__ID:
				return getId();
			case AConnectorPackage.CONNECTOR_INFO__NAME:
				return getName();
			case AConnectorPackage.CONNECTOR_INFO__PROVIDER:
				return getProvider();
			case AConnectorPackage.CONNECTOR_INFO__VERSION:
				return getVersion();
			case AConnectorPackage.CONNECTOR_INFO__ENDPOINT:
				return getEndpoint();
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				return getMetric();
			case AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL:
				if (resolve) return getConnectorModel();
				return basicGetConnectorModel();
			case AConnectorPackage.CONNECTOR_INFO__MODEL_INFO:
				return getModelInfo();
			case AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO:
				return getConsentInfo();
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
			case AConnectorPackage.CONNECTOR_INFO__ID:
				setId((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__NAME:
				setName((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__PROVIDER:
				setProvider((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__VERSION:
				setVersion((Short)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends ConnectorEndpoint>)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				setMetric((ConnectorMetric)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL:
				setConnectorModel((EPackage)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__MODEL_INFO:
				getModelInfo().clear();
				getModelInfo().addAll((Collection<? extends ModelInfo>)newValue);
				return;
			case AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO:
				getConsentInfo().clear();
				getConsentInfo().addAll((Collection<? extends ConsentInfo>)newValue);
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
			case AConnectorPackage.CONNECTOR_INFO__ID:
				setId(ID_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_INFO__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_INFO__ENDPOINT:
				getEndpoint().clear();
				return;
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				setMetric((ConnectorMetric)null);
				return;
			case AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL:
				setConnectorModel((EPackage)null);
				return;
			case AConnectorPackage.CONNECTOR_INFO__MODEL_INFO:
				getModelInfo().clear();
				return;
			case AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO:
				getConsentInfo().clear();
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
			case AConnectorPackage.CONNECTOR_INFO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AConnectorPackage.CONNECTOR_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AConnectorPackage.CONNECTOR_INFO__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case AConnectorPackage.CONNECTOR_INFO__VERSION:
				return version != VERSION_EDEFAULT;
			case AConnectorPackage.CONNECTOR_INFO__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case AConnectorPackage.CONNECTOR_INFO__METRIC:
				return metric != null;
			case AConnectorPackage.CONNECTOR_INFO__CONNECTOR_MODEL:
				return connectorModel != null;
			case AConnectorPackage.CONNECTOR_INFO__MODEL_INFO:
				return modelInfo != null && !modelInfo.isEmpty();
			case AConnectorPackage.CONNECTOR_INFO__CONSENT_INFO:
				return consentInfo != null && !consentInfo.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", provider: ");
		result.append(provider);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ConnectorInfoImpl
