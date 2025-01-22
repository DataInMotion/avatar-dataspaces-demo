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
package de.avatar.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gecko.emf.utilities.FeaturePath;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.Query#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.avatar.query.Query#getFrom <em>From</em>}</li>
 *   <li>{@link de.avatar.query.Query#getWhere <em>Where</em>}</li>
 *   <li>{@link de.avatar.query.Query#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link de.avatar.query.Query#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link de.avatar.query.Query#isCount <em>Count</em>}</li>
 *   <li>{@link de.avatar.query.Query#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link de.avatar.query.Query#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.avatar.query.Query#getSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getQuery()
 * @model
 * @generated
 */
@ProviderType
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.query.QSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subject defines the SELECT subjects, e.g. SELECT address, name, age ... where adress, name, age are Subjects
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see de.avatar.query.QueryPackage#getQuery_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<QSubject> getSubject();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link de.avatar.query.QObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If we have an include Query, which is default, the FROM values can be calculated out of the set of all FeaturePath's from the subjects. If no Subject is given, the FROM must be set, because we have a SELECT * query, theat needs a FROM. The same applies to excluded queries. In this case we also need a FROM to be able to apply the exclusion from the subjects feature paths's
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see de.avatar.query.QueryPackage#getQuery_From()
	 * @model
	 * @generated
	 */
	EList<QObject> getFrom();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.query.QWhere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference list.
	 * @see de.avatar.query.QueryPackage#getQuery_Where()
	 * @model containment="true"
	 * @generated
	 */
	EList<QWhere> getWhere();

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' containment reference list.
	 * The list contents are of type {@link org.gecko.emf.utilities.FeaturePath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' containment reference list.
	 * @see de.avatar.query.QueryPackage#getQuery_GroupBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeaturePath> getGroupBy();

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.query.SortEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference list.
	 * @see de.avatar.query.QueryPackage#getQuery_SortBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortEntity> getSortBy();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(boolean)
	 * @see de.avatar.query.QueryPackage#getQuery_Count()
	 * @model required="true"
	 * @generated
	 */
	boolean isCount();

	/**
	 * Sets the value of the '{@link de.avatar.query.Query#isCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isCount()
	 * @generated
	 */
	void setCount(boolean value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see de.avatar.query.QueryPackage#getQuery_Distinct()
	 * @model required="true"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link de.avatar.query.Query#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see de.avatar.query.QueryPackage#getQuery_Limit()
	 * @model
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link de.avatar.query.Query#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip</em>' attribute.
	 * @see #setSkip(int)
	 * @see de.avatar.query.QueryPackage#getQuery_Skip()
	 * @model
	 * @generated
	 */
	int getSkip();

	/**
	 * Sets the value of the '{@link de.avatar.query.Query#getSkip <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip</em>' attribute.
	 * @see #getSkip()
	 * @generated
	 */
	void setSkip(int value);

} // Query
