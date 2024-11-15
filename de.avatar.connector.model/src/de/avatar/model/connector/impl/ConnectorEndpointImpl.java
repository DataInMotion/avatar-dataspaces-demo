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
import de.avatar.model.connector.ProtocolType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorEndpointImpl#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndpointImpl extends MinimalEObjectImpl.Container implements ConnectorEndpoint {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolType PROTOCOL_EDEFAULT = ProtocolType.OTHER;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected ConnectorInfo connector;

	/**
	 * The cached value of the '{@link #getModelPackage() <em>Model Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage modelPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.CONNECTOR_ENDPOINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(ProtocolType newProtocol) {
		ProtocolType oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorInfo getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (ConnectorInfo)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInfo basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnector(ConnectorInfo newConnector) {
		ConnectorInfo oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getModelPackage() {
		if (modelPackage != null && modelPackage.eIsProxy()) {
			InternalEObject oldModelPackage = (InternalEObject)modelPackage;
			modelPackage = (EPackage)eResolveProxy(oldModelPackage);
			if (modelPackage != oldModelPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE, oldModelPackage, modelPackage));
			}
		}
		return modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetModelPackage() {
		return modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelPackage(EPackage newModelPackage) {
		EPackage oldModelPackage = modelPackage;
		modelPackage = newModelPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE, oldModelPackage, modelPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AConnectorPackage.CONNECTOR_ENDPOINT__ID:
				return getId();
			case AConnectorPackage.CONNECTOR_ENDPOINT__NAME:
				return getName();
			case AConnectorPackage.CONNECTOR_ENDPOINT__URI:
				return getUri();
			case AConnectorPackage.CONNECTOR_ENDPOINT__METHOD:
				return getMethod();
			case AConnectorPackage.CONNECTOR_ENDPOINT__PROTOCOL:
				return getProtocol();
			case AConnectorPackage.CONNECTOR_ENDPOINT__MEDIA_TYPE:
				return getMediaType();
			case AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE:
				if (resolve) return getModelPackage();
				return basicGetModelPackage();
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
			case AConnectorPackage.CONNECTOR_ENDPOINT__ID:
				setId((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__NAME:
				setName((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__URI:
				setUri((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__METHOD:
				setMethod((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__PROTOCOL:
				setProtocol((ProtocolType)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR:
				setConnector((ConnectorInfo)newValue);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE:
				setModelPackage((EPackage)newValue);
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
			case AConnectorPackage.CONNECTOR_ENDPOINT__ID:
				setId(ID_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__URI:
				setUri(URI_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR:
				setConnector((ConnectorInfo)null);
				return;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE:
				setModelPackage((EPackage)null);
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
			case AConnectorPackage.CONNECTOR_ENDPOINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AConnectorPackage.CONNECTOR_ENDPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AConnectorPackage.CONNECTOR_ENDPOINT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case AConnectorPackage.CONNECTOR_ENDPOINT__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case AConnectorPackage.CONNECTOR_ENDPOINT__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case AConnectorPackage.CONNECTOR_ENDPOINT__CONNECTOR:
				return connector != null;
			case AConnectorPackage.CONNECTOR_ENDPOINT__MODEL_PACKAGE:
				return modelPackage != null;
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
		result.append(", uri: ");
		result.append(uri);
		result.append(", method: ");
		result.append(method);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(')');
		return result.toString();
	}

} //ConnectorEndpointImpl
