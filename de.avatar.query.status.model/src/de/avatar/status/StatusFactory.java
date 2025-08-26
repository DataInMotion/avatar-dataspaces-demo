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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.status.StatusPackage
 * @generated
 */
@ProviderType
public interface StatusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusFactory eINSTANCE = de.avatar.status.impl.StatusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Query Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Request</em>'.
	 * @generated
	 */
	QueryRequest createQueryRequest();

	/**
	 * Returns a new object of class '<em>Query Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Response</em>'.
	 * @generated
	 */
	QueryResponse createQueryResponse();

	/**
	 * Returns a new object of class '<em>Query Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Status Response</em>'.
	 * @generated
	 */
	QueryStatusResponse createQueryStatusResponse();

	/**
	 * Returns a new object of class '<em>Detailed Query Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detailed Query Status</em>'.
	 * @generated
	 */
	DetailedQueryStatus createDetailedQueryStatus();

	/**
	 * Returns a new object of class '<em>Single Connector Query Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Connector Query Status</em>'.
	 * @generated
	 */
	SingleConnectorQueryStatus createSingleConnectorQueryStatus();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	StatusResult createStatusResult();

	/**
	 * Returns a new object of class '<em>Success Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Status Result</em>'.
	 * @generated
	 */
	SuccessStatusResult createSuccessStatusResult();

	/**
	 * Returns a new object of class '<em>Pending Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pending Status Result</em>'.
	 * @generated
	 */
	PendingStatusResult createPendingStatusResult();

	/**
	 * Returns a new object of class '<em>Error Status Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Status Result</em>'.
	 * @generated
	 */
	ErrorStatusResult createErrorStatusResult();

	/**
	 * Returns a new object of class '<em>Query Link Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Link Response</em>'.
	 * @generated
	 */
	QueryLinkResponse createQueryLinkResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatusPackage getStatusPackage();

} //StatusFactory
