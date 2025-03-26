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
package de.avatar.metadata;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.ConnectorMetadata#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.metadata.ConnectorMetadata#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link de.avatar.metadata.ConnectorMetadata#getConnectorRelativeNumber <em>Connector Relative Number</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getConnectorMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface ConnectorMetadata extends Metadata {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #setConnectorId(String)
	 * @see de.avatar.metadata.MetadataPackage#getConnectorMetadata_ConnectorId()
	 * @model required="true"
	 * @generated
	 */
	String getConnectorId();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConnectorMetadata#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(String value);

	/**
	 * Returns the value of the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Name</em>' attribute.
	 * @see #setConnectorName(String)
	 * @see de.avatar.metadata.MetadataPackage#getConnectorMetadata_ConnectorName()
	 * @model
	 * @generated
	 */
	String getConnectorName();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConnectorMetadata#getConnectorName <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Name</em>' attribute.
	 * @see #getConnectorName()
	 * @generated
	 */
	void setConnectorName(String value);

	/**
	 * Returns the value of the '<em><b>Connector Relative Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the number relative to the totConnectorsPerRequest. So, if there are a total of 4 connectors, for instance, the first connector to get the query would be 1, the second 2, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Relative Number</em>' attribute.
	 * @see #setConnectorRelativeNumber(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getConnectorMetadata_ConnectorRelativeNumber()
	 * @model
	 * @generated
	 */
	Integer getConnectorRelativeNumber();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConnectorMetadata#getConnectorRelativeNumber <em>Connector Relative Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Relative Number</em>' attribute.
	 * @see #getConnectorRelativeNumber()
	 * @generated
	 */
	void setConnectorRelativeNumber(Integer value);

} // ConnectorMetadata
