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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.avatar.status.StatusPackage#getQueryStatusType()
 * @model
 * @generated
 */
@ProviderType
public enum QueryStatusType implements Enumerator {
	/**
	 * The '<em><b>QUERY COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_COMPLETED(0, "QUERY_COMPLETED", "QUERY_COMPLETED"),

	/**
	 * The '<em><b>QUERY ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_ERROR(1, "QUERY_ERROR", "QUERY_ERROR"),

	/**
	 * The '<em><b>QUERY NO CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_NO_CONTENT(2, "QUERY_NO_CONTENT", "QUERY_NO_CONTENT"),

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOUT(3, "TIMEOUT", "TIMEOUT"),

	/**
	 * The '<em><b>QUERY PENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_PENDING(4, "QUERY_PENDING", "QUERY_PENDING"),

	/**
	 * The '<em><b>QUERY DRYRUN COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_DRYRUN_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_DRYRUN_COMPLETED(5, "QUERY_DRYRUN_COMPLETED", "QUERY_DRYRUN_COMPLETED"),

	/**
	 * The '<em><b>QUERY CANCELED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_CANCELED_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_CANCELED(6, "QUERY_CANCELED", "QUERY_CANCELED"),

	/**
	 * The '<em><b>QUERY INTERRUPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_INTERRUPTED_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_INTERRUPTED(7, "QUERY_INTERRUPTED", "QUERY_INTERRUPTED"),

	/**
	 * The '<em><b>DATA ANONYMIZED READY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ANONYMIZED_READY_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ANONYMIZED_READY(8, "DATA_ANONYMIZED_READY", "DATA_ANONYMIZED_READY"),

	/**
	 * The '<em><b>PUBLIC LINK REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LINK_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_LINK_REQUEST(9, "PUBLIC_LINK_REQUEST", "PUBLIC_LINK_REQUEST"),

	/**
	 * The '<em><b>PUBLIC LINK AVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LINK_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_LINK_AVAILABLE(10, "PUBLIC_LINK_AVAILABLE", "PUBLIC_LINK_AVAILABLE"),

	/**
	 * The '<em><b>OPERATION ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_ERROR(11, "OPERATION_ERROR", "OPERATION_ERROR"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(100, "OTHER", "OTHER");

	/**
	 * The '<em><b>QUERY COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_COMPLETED_VALUE = 0;

	/**
	 * The '<em><b>QUERY ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_ERROR_VALUE = 1;

	/**
	 * The '<em><b>QUERY NO CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_NO_CONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_NO_CONTENT_VALUE = 2;

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOUT_VALUE = 3;

	/**
	 * The '<em><b>QUERY PENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_PENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_PENDING_VALUE = 4;

	/**
	 * The '<em><b>QUERY DRYRUN COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_DRYRUN_COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_DRYRUN_COMPLETED_VALUE = 5;

	/**
	 * The '<em><b>QUERY CANCELED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_CANCELED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_CANCELED_VALUE = 6;

	/**
	 * The '<em><b>QUERY INTERRUPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_INTERRUPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INTERRUPTED_VALUE = 7;

	/**
	 * The '<em><b>DATA ANONYMIZED READY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ANONYMIZED_READY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ANONYMIZED_READY_VALUE = 8;

	/**
	 * The '<em><b>PUBLIC LINK REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LINK_REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_LINK_REQUEST_VALUE = 9;

	/**
	 * The '<em><b>PUBLIC LINK AVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LINK_AVAILABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_LINK_AVAILABLE_VALUE = 10;

	/**
	 * The '<em><b>OPERATION ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_ERROR_VALUE = 11;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 100;

	/**
	 * An array of all the '<em><b>Query Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueryStatusType[] VALUES_ARRAY =
		new QueryStatusType[] {
			QUERY_COMPLETED,
			QUERY_ERROR,
			QUERY_NO_CONTENT,
			TIMEOUT,
			QUERY_PENDING,
			QUERY_DRYRUN_COMPLETED,
			QUERY_CANCELED,
			QUERY_INTERRUPTED,
			DATA_ANONYMIZED_READY,
			PUBLIC_LINK_REQUEST,
			PUBLIC_LINK_AVAILABLE,
			OPERATION_ERROR,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Query Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueryStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Query Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryStatusType get(int value) {
		switch (value) {
			case QUERY_COMPLETED_VALUE: return QUERY_COMPLETED;
			case QUERY_ERROR_VALUE: return QUERY_ERROR;
			case QUERY_NO_CONTENT_VALUE: return QUERY_NO_CONTENT;
			case TIMEOUT_VALUE: return TIMEOUT;
			case QUERY_PENDING_VALUE: return QUERY_PENDING;
			case QUERY_DRYRUN_COMPLETED_VALUE: return QUERY_DRYRUN_COMPLETED;
			case QUERY_CANCELED_VALUE: return QUERY_CANCELED;
			case QUERY_INTERRUPTED_VALUE: return QUERY_INTERRUPTED;
			case DATA_ANONYMIZED_READY_VALUE: return DATA_ANONYMIZED_READY;
			case PUBLIC_LINK_REQUEST_VALUE: return PUBLIC_LINK_REQUEST;
			case PUBLIC_LINK_AVAILABLE_VALUE: return PUBLIC_LINK_AVAILABLE;
			case OPERATION_ERROR_VALUE: return OPERATION_ERROR;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QueryStatusType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QueryStatusType
