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
package de.avatar.rest;

import de.avatar.status.QueryStatus;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avatar Rest Query</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.avatar.rest.RestPackage#getAvatarRestQuery()
 * @model interface="true" abstract="true"
 *        annotation="avatar.rest ContentType='application/json' Version='1.0'"
 * @generated
 */
@ProviderType
public interface AvatarRestQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="avatar.rest Path='/connectors' Method='GET'"
	 * @generated
	 */
	EList<String> getConnetors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="avatar.rest Path='/status' Method='GET'"
	 * @generated
	 */
	QueryStatus getStatus(String id, String name, String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryStatusRequired="true"
	 *        annotation="avatar.rest Path='/dryrun' Method='GET'"
	 * @generated
	 */
	QueryStatus dryrun(QueryStatus queryStatus);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryStatusRequired="true"
	 *        annotation="avatar.rest Path='/run' Method='GET'"
	 * @generated
	 */
	QueryStatus run(QueryStatus queryStatus);

} // AvatarRestQuery
