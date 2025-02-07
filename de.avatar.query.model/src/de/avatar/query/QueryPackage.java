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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.avatar.query.QueryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = QueryPackage.eNS_URI, genModel = "/model/query.genmodel", genModelSourceLocations = {"model/query.genmodel","de.avatar.query.model/model/query.genmodel"}, ecore="/model/query.ecore", ecoreSourceLocations="/model/query.ecore")
public interface QueryPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://avatar-project.de/query/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = de.avatar.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.QueryImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FROM = 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__WHERE = 2;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__GROUP_BY = 3;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SORT_BY = 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COUNT = 5;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DISTINCT = 6;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LIMIT = 7;

	/**
	 * The feature id for the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SKIP = 8;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.QObjectImpl <em>QObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.QObjectImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getQObject()
	 * @generated
	 */
	int QOBJECT = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOBJECT__ECLASS = 0;

	/**
	 * The number of structural features of the '<em>QObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>QObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.QSubjectImpl <em>QSubject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.QSubjectImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getQSubject()
	 * @generated
	 */
	int QSUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT__FEATURE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Is Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT__IS_EXCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Alias Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT__ALIAS_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT__OPERATION = 4;

	/**
	 * The number of structural features of the '<em>QSubject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>QSubject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.QWhereImpl <em>QWhere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.QWhereImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getQWhere()
	 * @generated
	 */
	int QWHERE = 3;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE__FEATURE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE__COMPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE__OPERATION = 2;

	/**
	 * The number of structural features of the '<em>QWhere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>QWhere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWHERE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ChainingImpl <em>Chaining</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ChainingImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getChaining()
	 * @generated
	 */
	int CHAINING = 4;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING__FEATURE_PATH = QWHERE__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING__COMPARATOR = QWHERE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING__OPERATION = QWHERE__OPERATION;

	/**
	 * The number of structural features of the '<em>Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING_FEATURE_COUNT = QWHERE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING___EXECUTE = QWHERE___EXECUTE;

	/**
	 * The number of operations of the '<em>Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING_OPERATION_COUNT = QWHERE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.OrImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getOr()
	 * @generated
	 */
	int OR = 5;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__FEATURE_PATH = CHAINING__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__COMPARATOR = CHAINING__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERATION = CHAINING__OPERATION;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = CHAINING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___EXECUTE = CHAINING___EXECUTE;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = CHAINING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.NotImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 6;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__FEATURE_PATH = CHAINING__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__COMPARATOR = CHAINING__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERATION = CHAINING__OPERATION;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = CHAINING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___EXECUTE = CHAINING___EXECUTE;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = CHAINING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.AndImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__FEATURE_PATH = CHAINING__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__COMPARATOR = CHAINING__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERATION = CHAINING__OPERATION;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = CHAINING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___EXECUTE = CHAINING___EXECUTE;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = CHAINING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.OperationImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 35;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUITABLE_FOR_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.StringOperationImpl <em>String Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.StringOperationImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getStringOperation()
	 * @generated
	 */
	int STRING_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION__SUITABLE_FOR_TYPE = OPERATION__SUITABLE_FOR_TYPE;

	/**
	 * The number of structural features of the '<em>String Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>String Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ToLowerCaseImpl <em>To Lower Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ToLowerCaseImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getToLowerCase()
	 * @generated
	 */
	int TO_LOWER_CASE = 9;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE__SUITABLE_FOR_TYPE = STRING_OPERATION__SUITABLE_FOR_TYPE;

	/**
	 * The number of structural features of the '<em>To Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FEATURE_COUNT = STRING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE___EXECUTE = STRING_OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>To Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_OPERATION_COUNT = STRING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ToUpperCaseImpl <em>To Upper Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ToUpperCaseImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getToUpperCase()
	 * @generated
	 */
	int TO_UPPER_CASE = 10;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE__SUITABLE_FOR_TYPE = STRING_OPERATION__SUITABLE_FOR_TYPE;

	/**
	 * The number of structural features of the '<em>To Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FEATURE_COUNT = STRING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE___EXECUTE = STRING_OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>To Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_OPERATION_COUNT = STRING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.NumberOperationImpl <em>Number Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.NumberOperationImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getNumberOperation()
	 * @generated
	 */
	int NUMBER_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION__SUITABLE_FOR_TYPE = OPERATION__SUITABLE_FOR_TYPE;

	/**
	 * The number of structural features of the '<em>Number Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Number Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.AverageImpl <em>Average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.AverageImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getAverage()
	 * @generated
	 */
	int AVERAGE = 12;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE__SUITABLE_FOR_TYPE = NUMBER_OPERATION__SUITABLE_FOR_TYPE;

	/**
	 * The number of structural features of the '<em>Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FEATURE_COUNT = NUMBER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE___EXECUTE = NUMBER_OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_OPERATION_COUNT = NUMBER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ComparatorImpl <em>Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 13;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR__SUITABLE_FOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR__WHERE = 1;

	/**
	 * The number of structural features of the '<em>Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR___COMPARE = 0;

	/**
	 * The number of operations of the '<em>Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.SimpleValueComparatorImpl <em>Simple Value Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.SimpleValueComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getSimpleValueComparator()
	 * @generated
	 */
	int SIMPLE_VALUE_COMPARATOR = 14;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE = COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR__WHERE = COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR__VALUE = COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Value Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT = COMPARATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR___COMPARE = COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Simple Value Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT = COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.StringComparatorImpl <em>String Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.StringComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getStringComparator()
	 * @generated
	 */
	int STRING_COMPARATOR = 15;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR__SUITABLE_FOR_TYPE = SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR__WHERE = SIMPLE_VALUE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR__VALUE = SIMPLE_VALUE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>String Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR_FEATURE_COUNT = SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR___COMPARE = SIMPLE_VALUE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>String Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARATOR_OPERATION_COUNT = SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EndsWithImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 16;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SUITABLE_FOR_TYPE = STRING_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__WHERE = STRING_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__VALUE = STRING_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = STRING_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH___COMPARE = STRING_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = STRING_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.StartWithImpl <em>Start With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.StartWithImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getStartWith()
	 * @generated
	 */
	int START_WITH = 17;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__SUITABLE_FOR_TYPE = STRING_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__WHERE = STRING_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__VALUE = STRING_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Start With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH_FEATURE_COUNT = STRING_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH___COMPARE = STRING_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Start With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH_OPERATION_COUNT = STRING_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ContainsImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 18;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SUITABLE_FOR_TYPE = STRING_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__WHERE = STRING_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__VALUE = STRING_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = STRING_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___COMPARE = STRING_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = STRING_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LikeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 19;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__SUITABLE_FOR_TYPE = STRING_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__WHERE = STRING_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__VALUE = STRING_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = STRING_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE___COMPARE = STRING_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = STRING_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.DateComparatorImpl <em>Date Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.DateComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getDateComparator()
	 * @generated
	 */
	int DATE_COMPARATOR = 20;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR__SUITABLE_FOR_TYPE = SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR__WHERE = SIMPLE_VALUE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR__VALUE = SIMPLE_VALUE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Date Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR_FEATURE_COUNT = SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR___COMPARE = SIMPLE_VALUE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Date Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPARATOR_OPERATION_COUNT = SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsBeforeImpl <em>Is Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsBeforeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsBefore()
	 * @generated
	 */
	int IS_BEFORE = 21;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__SUITABLE_FOR_TYPE = DATE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__WHERE = DATE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__VALUE = DATE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_FEATURE_COUNT = DATE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE___COMPARE = DATE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OPERATION_COUNT = DATE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsAfterImpl <em>Is After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsAfterImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsAfter()
	 * @generated
	 */
	int IS_AFTER = 22;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__SUITABLE_FOR_TYPE = DATE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__WHERE = DATE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__VALUE = DATE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_FEATURE_COUNT = DATE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER___COMPARE = DATE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OPERATION_COUNT = DATE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsBeforeOrEqualImpl <em>Is Before Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsBeforeOrEqualImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsBeforeOrEqual()
	 * @generated
	 */
	int IS_BEFORE_OR_EQUAL = 23;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL__SUITABLE_FOR_TYPE = DATE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL__WHERE = DATE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL__VALUE = DATE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Before Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL_FEATURE_COUNT = DATE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL___COMPARE = DATE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Before Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OR_EQUAL_OPERATION_COUNT = DATE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsAfterOrEqualImpl <em>Is After Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsAfterOrEqualImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsAfterOrEqual()
	 * @generated
	 */
	int IS_AFTER_OR_EQUAL = 24;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL__SUITABLE_FOR_TYPE = DATE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL__WHERE = DATE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL__VALUE = DATE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is After Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL_FEATURE_COUNT = DATE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL___COMPARE = DATE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is After Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OR_EQUAL_OPERATION_COUNT = DATE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsInRangeImpl <em>Is In Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsInRangeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsInRange()
	 * @generated
	 */
	int IS_IN_RANGE = 25;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__SUITABLE_FOR_TYPE = COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__WHERE = COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__START_VALUE = COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__END_VALUE = COMPARATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__START_INCLUDED = COMPARATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__END_INCLUDED = COMPARATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Is In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE_FEATURE_COUNT = COMPARATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE___COMPARE = COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE_OPERATION_COUNT = COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.NumberComparatorImpl <em>Number Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.NumberComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getNumberComparator()
	 * @generated
	 */
	int NUMBER_COMPARATOR = 26;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR__SUITABLE_FOR_TYPE = SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR__WHERE = SIMPLE_VALUE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR__VALUE = SIMPLE_VALUE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Number Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR_FEATURE_COUNT = SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR___COMPARE = SIMPLE_VALUE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Number Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPARATOR_OPERATION_COUNT = SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LtImpl <em>Lt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LtImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLt()
	 * @generated
	 */
	int LT = 27;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__SUITABLE_FOR_TYPE = NUMBER_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__WHERE = NUMBER_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__VALUE = NUMBER_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = NUMBER_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT___COMPARE = NUMBER_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_OPERATION_COUNT = NUMBER_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LteImpl <em>Lte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LteImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLte()
	 * @generated
	 */
	int LTE = 28;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__SUITABLE_FOR_TYPE = NUMBER_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__WHERE = NUMBER_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__VALUE = NUMBER_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Lte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_FEATURE_COUNT = NUMBER_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE___COMPARE = NUMBER_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Lte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_OPERATION_COUNT = NUMBER_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.GteImpl <em>Gte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.GteImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getGte()
	 * @generated
	 */
	int GTE = 29;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__SUITABLE_FOR_TYPE = NUMBER_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__WHERE = NUMBER_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__VALUE = NUMBER_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Gte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_FEATURE_COUNT = NUMBER_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE___COMPARE = NUMBER_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Gte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_OPERATION_COUNT = NUMBER_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.GtImpl <em>Gt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.GtImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getGt()
	 * @generated
	 */
	int GT = 30;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__SUITABLE_FOR_TYPE = NUMBER_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__WHERE = NUMBER_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__VALUE = NUMBER_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = NUMBER_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT___COMPARE = NUMBER_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_OPERATION_COUNT = NUMBER_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EqImpl <em>Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EqImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEq()
	 * @generated
	 */
	int EQ = 31;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__SUITABLE_FOR_TYPE = NUMBER_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__WHERE = NUMBER_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__VALUE = NUMBER_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_FEATURE_COUNT = NUMBER_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ___COMPARE = NUMBER_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OPERATION_COUNT = NUMBER_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.BoolComparatorImpl <em>Bool Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.BoolComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getBoolComparator()
	 * @generated
	 */
	int BOOL_COMPARATOR = 32;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR__SUITABLE_FOR_TYPE = SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR__WHERE = SIMPLE_VALUE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR__VALUE = SIMPLE_VALUE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Bool Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR_FEATURE_COUNT = SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR___COMPARE = SIMPLE_VALUE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Bool Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPARATOR_OPERATION_COUNT = SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsBoolImpl <em>Is Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsBoolImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsBool()
	 * @generated
	 */
	int IS_BOOL = 33;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__SUITABLE_FOR_TYPE = BOOL_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__WHERE = BOOL_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__VALUE = BOOL_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL_FEATURE_COUNT = BOOL_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL___COMPARE = BOOL_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL_OPERATION_COUNT = BOOL_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.SortEntityImpl <em>Sort Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.SortEntityImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getSortEntity()
	 * @generated
	 */
	int SORT_ENTITY = 34;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ENTITY__SORT_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ENTITY__FEATURE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Sort Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sort Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EnumComparatorImpl <em>Enum Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EnumComparatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEnumComparator()
	 * @generated
	 */
	int ENUM_COMPARATOR = 36;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR__SUITABLE_FOR_TYPE = SIMPLE_VALUE_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR__WHERE = SIMPLE_VALUE_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR__VALUE = SIMPLE_VALUE_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Enum Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR_FEATURE_COUNT = SIMPLE_VALUE_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR___COMPARE = SIMPLE_VALUE_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Enum Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPARATOR_OPERATION_COUNT = SIMPLE_VALUE_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsLiteralImpl <em>Is Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsLiteralImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsLiteral()
	 * @generated
	 */
	int IS_LITERAL = 37;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__SUITABLE_FOR_TYPE = ENUM_COMPARATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Where</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__WHERE = ENUM_COMPARATOR__WHERE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__VALUE = ENUM_COMPARATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL_FEATURE_COUNT = ENUM_COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL___COMPARE = ENUM_COMPARATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL_OPERATION_COUNT = ENUM_COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.SortOrder <em>Sort Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.SortOrder
	 * @see de.avatar.query.impl.QueryPackageImpl#getSortOrder()
	 * @generated
	 */
	int SORT_ORDER = 38;

	/**
	 * The meta object id for the '{@link de.avatar.query.SuitableType <em>Suitable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.SuitableType
	 * @see de.avatar.query.impl.QueryPackageImpl#getSuitableType()
	 * @generated
	 */
	int SUITABLE_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link de.avatar.query.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see de.avatar.query.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Query#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see de.avatar.query.Query#getSubject()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Subject();

	/**
	 * Returns the meta object for the reference list '{@link de.avatar.query.Query#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see de.avatar.query.Query#getFrom()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_From();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Query#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Where</em>'.
	 * @see de.avatar.query.Query#getWhere()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Where();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Query#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group By</em>'.
	 * @see de.avatar.query.Query#getGroupBy()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_GroupBy();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Query#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort By</em>'.
	 * @see de.avatar.query.Query#getSortBy()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Query#isCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.avatar.query.Query#isCount()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Count();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Query#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see de.avatar.query.Query#isDistinct()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Query#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see de.avatar.query.Query#getLimit()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Limit();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Query#getSkip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip</em>'.
	 * @see de.avatar.query.Query#getSkip()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Skip();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.QObject <em>QObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QObject</em>'.
	 * @see de.avatar.query.QObject
	 * @generated
	 */
	EClass getQObject();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.query.QObject#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see de.avatar.query.QObject#getEClass()
	 * @see #getQObject()
	 * @generated
	 */
	EReference getQObject_EClass();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.QSubject <em>QSubject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QSubject</em>'.
	 * @see de.avatar.query.QSubject
	 * @generated
	 */
	EClass getQSubject();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.QSubject#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Path</em>'.
	 * @see de.avatar.query.QSubject#getFeaturePath()
	 * @see #getQSubject()
	 * @generated
	 */
	EReference getQSubject_FeaturePath();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.QSubject#isIsExclude <em>Is Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclude</em>'.
	 * @see de.avatar.query.QSubject#isIsExclude()
	 * @see #getQSubject()
	 * @generated
	 */
	EAttribute getQSubject_IsExclude();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.QSubject#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.avatar.query.QSubject#getAlias()
	 * @see #getQSubject()
	 * @generated
	 */
	EAttribute getQSubject_Alias();

	/**
	 * Returns the meta object for the reference '{@link de.avatar.query.QSubject#getAliasFeature <em>Alias Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alias Feature</em>'.
	 * @see de.avatar.query.QSubject#getAliasFeature()
	 * @see #getQSubject()
	 * @generated
	 */
	EReference getQSubject_AliasFeature();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.QSubject#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see de.avatar.query.QSubject#getOperation()
	 * @see #getQSubject()
	 * @generated
	 */
	EReference getQSubject_Operation();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.QWhere <em>QWhere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QWhere</em>'.
	 * @see de.avatar.query.QWhere
	 * @generated
	 */
	EClass getQWhere();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.QWhere#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Path</em>'.
	 * @see de.avatar.query.QWhere#getFeaturePath()
	 * @see #getQWhere()
	 * @generated
	 */
	EReference getQWhere_FeaturePath();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.QWhere#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparator</em>'.
	 * @see de.avatar.query.QWhere#getComparator()
	 * @see #getQWhere()
	 * @generated
	 */
	EReference getQWhere_Comparator();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.QWhere#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see de.avatar.query.QWhere#getOperation()
	 * @see #getQWhere()
	 * @generated
	 */
	EReference getQWhere_Operation();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.QWhere#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see de.avatar.query.QWhere#execute()
	 * @generated
	 */
	EOperation getQWhere__Execute();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Chaining <em>Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chaining</em>'.
	 * @see de.avatar.query.Chaining
	 * @generated
	 */
	EClass getChaining();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.avatar.query.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see de.avatar.query.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.avatar.query.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.StringOperation <em>String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operation</em>'.
	 * @see de.avatar.query.StringOperation
	 * @generated
	 */
	EClass getStringOperation();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.ToLowerCase <em>To Lower Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Lower Case</em>'.
	 * @see de.avatar.query.ToLowerCase
	 * @generated
	 */
	EClass getToLowerCase();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.ToUpperCase <em>To Upper Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Upper Case</em>'.
	 * @see de.avatar.query.ToUpperCase
	 * @generated
	 */
	EClass getToUpperCase();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.NumberOperation <em>Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Operation</em>'.
	 * @see de.avatar.query.NumberOperation
	 * @generated
	 */
	EClass getNumberOperation();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Average</em>'.
	 * @see de.avatar.query.Average
	 * @generated
	 */
	EClass getAverage();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparator</em>'.
	 * @see de.avatar.query.Comparator
	 * @generated
	 */
	EClass getComparator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Comparator#getSuitableForType <em>Suitable For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suitable For Type</em>'.
	 * @see de.avatar.query.Comparator#getSuitableForType()
	 * @see #getComparator()
	 * @generated
	 */
	EAttribute getComparator_SuitableForType();

	/**
	 * Returns the meta object for the container reference '{@link de.avatar.query.Comparator#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Where</em>'.
	 * @see de.avatar.query.Comparator#getWhere()
	 * @see #getComparator()
	 * @generated
	 */
	EReference getComparator_Where();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.Comparator#compare() <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see de.avatar.query.Comparator#compare()
	 * @generated
	 */
	EOperation getComparator__Compare();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.SimpleValueComparator <em>Simple Value Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value Comparator</em>'.
	 * @see de.avatar.query.SimpleValueComparator
	 * @generated
	 */
	EClass getSimpleValueComparator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.SimpleValueComparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.SimpleValueComparator#getValue()
	 * @see #getSimpleValueComparator()
	 * @generated
	 */
	EAttribute getSimpleValueComparator_Value();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.StringComparator <em>String Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Comparator</em>'.
	 * @see de.avatar.query.StringComparator
	 * @generated
	 */
	EClass getStringComparator();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends With</em>'.
	 * @see de.avatar.query.EndsWith
	 * @generated
	 */
	EClass getEndsWith();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.StartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start With</em>'.
	 * @see de.avatar.query.StartWith
	 * @generated
	 */
	EClass getStartWith();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see de.avatar.query.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like</em>'.
	 * @see de.avatar.query.Like
	 * @generated
	 */
	EClass getLike();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.DateComparator <em>Date Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Comparator</em>'.
	 * @see de.avatar.query.DateComparator
	 * @generated
	 */
	EClass getDateComparator();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsBefore <em>Is Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Before</em>'.
	 * @see de.avatar.query.IsBefore
	 * @generated
	 */
	EClass getIsBefore();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsAfter <em>Is After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is After</em>'.
	 * @see de.avatar.query.IsAfter
	 * @generated
	 */
	EClass getIsAfter();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsBeforeOrEqual <em>Is Before Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Before Or Equal</em>'.
	 * @see de.avatar.query.IsBeforeOrEqual
	 * @generated
	 */
	EClass getIsBeforeOrEqual();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsAfterOrEqual <em>Is After Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is After Or Equal</em>'.
	 * @see de.avatar.query.IsAfterOrEqual
	 * @generated
	 */
	EClass getIsAfterOrEqual();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsInRange <em>Is In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is In Range</em>'.
	 * @see de.avatar.query.IsInRange
	 * @generated
	 */
	EClass getIsInRange();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.IsInRange#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see de.avatar.query.IsInRange#getStartValue()
	 * @see #getIsInRange()
	 * @generated
	 */
	EAttribute getIsInRange_StartValue();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.IsInRange#getEndValue <em>End Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Value</em>'.
	 * @see de.avatar.query.IsInRange#getEndValue()
	 * @see #getIsInRange()
	 * @generated
	 */
	EAttribute getIsInRange_EndValue();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.IsInRange#isStartIncluded <em>Start Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Included</em>'.
	 * @see de.avatar.query.IsInRange#isStartIncluded()
	 * @see #getIsInRange()
	 * @generated
	 */
	EAttribute getIsInRange_StartIncluded();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.IsInRange#isEndIncluded <em>End Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Included</em>'.
	 * @see de.avatar.query.IsInRange#isEndIncluded()
	 * @see #getIsInRange()
	 * @generated
	 */
	EAttribute getIsInRange_EndIncluded();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.NumberComparator <em>Number Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Comparator</em>'.
	 * @see de.avatar.query.NumberComparator
	 * @generated
	 */
	EClass getNumberComparator();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt</em>'.
	 * @see de.avatar.query.Lt
	 * @generated
	 */
	EClass getLt();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Lte <em>Lte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lte</em>'.
	 * @see de.avatar.query.Lte
	 * @generated
	 */
	EClass getLte();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Gte <em>Gte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gte</em>'.
	 * @see de.avatar.query.Gte
	 * @generated
	 */
	EClass getGte();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt</em>'.
	 * @see de.avatar.query.Gt
	 * @generated
	 */
	EClass getGt();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Eq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq</em>'.
	 * @see de.avatar.query.Eq
	 * @generated
	 */
	EClass getEq();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.BoolComparator <em>Bool Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Comparator</em>'.
	 * @see de.avatar.query.BoolComparator
	 * @generated
	 */
	EClass getBoolComparator();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsBool <em>Is Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Bool</em>'.
	 * @see de.avatar.query.IsBool
	 * @generated
	 */
	EClass getIsBool();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.SortEntity <em>Sort Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Entity</em>'.
	 * @see de.avatar.query.SortEntity
	 * @generated
	 */
	EClass getSortEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.SortEntity#getSortOrder <em>Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Order</em>'.
	 * @see de.avatar.query.SortEntity#getSortOrder()
	 * @see #getSortEntity()
	 * @generated
	 */
	EAttribute getSortEntity_SortOrder();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.SortEntity#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Path</em>'.
	 * @see de.avatar.query.SortEntity#getFeaturePath()
	 * @see #getSortEntity()
	 * @generated
	 */
	EReference getSortEntity_FeaturePath();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.avatar.query.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Operation#getSuitableForType <em>Suitable For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suitable For Type</em>'.
	 * @see de.avatar.query.Operation#getSuitableForType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_SuitableForType();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.Operation#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see de.avatar.query.Operation#execute()
	 * @generated
	 */
	EOperation getOperation__Execute();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.EnumComparator <em>Enum Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Comparator</em>'.
	 * @see de.avatar.query.EnumComparator
	 * @generated
	 */
	EClass getEnumComparator();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.IsLiteral <em>Is Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Literal</em>'.
	 * @see de.avatar.query.IsLiteral
	 * @generated
	 */
	EClass getIsLiteral();

	/**
	 * Returns the meta object for enum '{@link de.avatar.query.SortOrder <em>Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Order</em>'.
	 * @see de.avatar.query.SortOrder
	 * @generated
	 */
	EEnum getSortOrder();

	/**
	 * Returns the meta object for enum '{@link de.avatar.query.SuitableType <em>Suitable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Suitable Type</em>'.
	 * @see de.avatar.query.SuitableType
	 * @generated
	 */
	EEnum getSuitableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.QueryImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SUBJECT = eINSTANCE.getQuery_Subject();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FROM = eINSTANCE.getQuery_From();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__WHERE = eINSTANCE.getQuery_Where();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__GROUP_BY = eINSTANCE.getQuery_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SORT_BY = eINSTANCE.getQuery_SortBy();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__COUNT = eINSTANCE.getQuery_Count();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__DISTINCT = eINSTANCE.getQuery_Distinct();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__LIMIT = eINSTANCE.getQuery_Limit();

		/**
		 * The meta object literal for the '<em><b>Skip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__SKIP = eINSTANCE.getQuery_Skip();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.QObjectImpl <em>QObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.QObjectImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getQObject()
		 * @generated
		 */
		EClass QOBJECT = eINSTANCE.getQObject();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOBJECT__ECLASS = eINSTANCE.getQObject_EClass();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.QSubjectImpl <em>QSubject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.QSubjectImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getQSubject()
		 * @generated
		 */
		EClass QSUBJECT = eINSTANCE.getQSubject();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSUBJECT__FEATURE_PATH = eINSTANCE.getQSubject_FeaturePath();

		/**
		 * The meta object literal for the '<em><b>Is Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSUBJECT__IS_EXCLUDE = eINSTANCE.getQSubject_IsExclude();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSUBJECT__ALIAS = eINSTANCE.getQSubject_Alias();

		/**
		 * The meta object literal for the '<em><b>Alias Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSUBJECT__ALIAS_FEATURE = eINSTANCE.getQSubject_AliasFeature();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSUBJECT__OPERATION = eINSTANCE.getQSubject_Operation();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.QWhereImpl <em>QWhere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.QWhereImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getQWhere()
		 * @generated
		 */
		EClass QWHERE = eINSTANCE.getQWhere();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QWHERE__FEATURE_PATH = eINSTANCE.getQWhere_FeaturePath();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QWHERE__COMPARATOR = eINSTANCE.getQWhere_Comparator();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QWHERE__OPERATION = eINSTANCE.getQWhere_Operation();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QWHERE___EXECUTE = eINSTANCE.getQWhere__Execute();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.ChainingImpl <em>Chaining</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ChainingImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getChaining()
		 * @generated
		 */
		EClass CHAINING = eINSTANCE.getChaining();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.OrImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.NotImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.AndImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.StringOperationImpl <em>String Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.StringOperationImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getStringOperation()
		 * @generated
		 */
		EClass STRING_OPERATION = eINSTANCE.getStringOperation();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.ToLowerCaseImpl <em>To Lower Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ToLowerCaseImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getToLowerCase()
		 * @generated
		 */
		EClass TO_LOWER_CASE = eINSTANCE.getToLowerCase();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.ToUpperCaseImpl <em>To Upper Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ToUpperCaseImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getToUpperCase()
		 * @generated
		 */
		EClass TO_UPPER_CASE = eINSTANCE.getToUpperCase();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.NumberOperationImpl <em>Number Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.NumberOperationImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getNumberOperation()
		 * @generated
		 */
		EClass NUMBER_OPERATION = eINSTANCE.getNumberOperation();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.AverageImpl <em>Average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.AverageImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getAverage()
		 * @generated
		 */
		EClass AVERAGE = eINSTANCE.getAverage();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.ComparatorImpl <em>Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getComparator()
		 * @generated
		 */
		EClass COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '<em><b>Suitable For Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATOR__SUITABLE_FOR_TYPE = eINSTANCE.getComparator_SuitableForType();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATOR__WHERE = eINSTANCE.getComparator_Where();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARATOR___COMPARE = eINSTANCE.getComparator__Compare();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.SimpleValueComparatorImpl <em>Simple Value Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.SimpleValueComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getSimpleValueComparator()
		 * @generated
		 */
		EClass SIMPLE_VALUE_COMPARATOR = eINSTANCE.getSimpleValueComparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VALUE_COMPARATOR__VALUE = eINSTANCE.getSimpleValueComparator_Value();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.StringComparatorImpl <em>String Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.StringComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getStringComparator()
		 * @generated
		 */
		EClass STRING_COMPARATOR = eINSTANCE.getStringComparator();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.EndsWithImpl <em>Ends With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.EndsWithImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getEndsWith()
		 * @generated
		 */
		EClass ENDS_WITH = eINSTANCE.getEndsWith();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.StartWithImpl <em>Start With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.StartWithImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getStartWith()
		 * @generated
		 */
		EClass START_WITH = eINSTANCE.getStartWith();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ContainsImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.LikeImpl <em>Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.LikeImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getLike()
		 * @generated
		 */
		EClass LIKE = eINSTANCE.getLike();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.DateComparatorImpl <em>Date Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.DateComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getDateComparator()
		 * @generated
		 */
		EClass DATE_COMPARATOR = eINSTANCE.getDateComparator();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsBeforeImpl <em>Is Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsBeforeImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsBefore()
		 * @generated
		 */
		EClass IS_BEFORE = eINSTANCE.getIsBefore();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsAfterImpl <em>Is After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsAfterImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsAfter()
		 * @generated
		 */
		EClass IS_AFTER = eINSTANCE.getIsAfter();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsBeforeOrEqualImpl <em>Is Before Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsBeforeOrEqualImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsBeforeOrEqual()
		 * @generated
		 */
		EClass IS_BEFORE_OR_EQUAL = eINSTANCE.getIsBeforeOrEqual();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsAfterOrEqualImpl <em>Is After Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsAfterOrEqualImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsAfterOrEqual()
		 * @generated
		 */
		EClass IS_AFTER_OR_EQUAL = eINSTANCE.getIsAfterOrEqual();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsInRangeImpl <em>Is In Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsInRangeImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsInRange()
		 * @generated
		 */
		EClass IS_IN_RANGE = eINSTANCE.getIsInRange();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_IN_RANGE__START_VALUE = eINSTANCE.getIsInRange_StartValue();

		/**
		 * The meta object literal for the '<em><b>End Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_IN_RANGE__END_VALUE = eINSTANCE.getIsInRange_EndValue();

		/**
		 * The meta object literal for the '<em><b>Start Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_IN_RANGE__START_INCLUDED = eINSTANCE.getIsInRange_StartIncluded();

		/**
		 * The meta object literal for the '<em><b>End Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_IN_RANGE__END_INCLUDED = eINSTANCE.getIsInRange_EndIncluded();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.NumberComparatorImpl <em>Number Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.NumberComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getNumberComparator()
		 * @generated
		 */
		EClass NUMBER_COMPARATOR = eINSTANCE.getNumberComparator();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.LtImpl <em>Lt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.LtImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getLt()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLt();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.LteImpl <em>Lte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.LteImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getLte()
		 * @generated
		 */
		EClass LTE = eINSTANCE.getLte();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.GteImpl <em>Gte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.GteImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getGte()
		 * @generated
		 */
		EClass GTE = eINSTANCE.getGte();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.GtImpl <em>Gt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.GtImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getGt()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGt();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.EqImpl <em>Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.EqImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getEq()
		 * @generated
		 */
		EClass EQ = eINSTANCE.getEq();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.BoolComparatorImpl <em>Bool Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.BoolComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getBoolComparator()
		 * @generated
		 */
		EClass BOOL_COMPARATOR = eINSTANCE.getBoolComparator();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsBoolImpl <em>Is Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsBoolImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsBool()
		 * @generated
		 */
		EClass IS_BOOL = eINSTANCE.getIsBool();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.SortEntityImpl <em>Sort Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.SortEntityImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getSortEntity()
		 * @generated
		 */
		EClass SORT_ENTITY = eINSTANCE.getSortEntity();

		/**
		 * The meta object literal for the '<em><b>Sort Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_ENTITY__SORT_ORDER = eINSTANCE.getSortEntity_SortOrder();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_ENTITY__FEATURE_PATH = eINSTANCE.getSortEntity_FeaturePath();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.OperationImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Suitable For Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SUITABLE_FOR_TYPE = eINSTANCE.getOperation_SuitableForType();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___EXECUTE = eINSTANCE.getOperation__Execute();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.EnumComparatorImpl <em>Enum Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.EnumComparatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getEnumComparator()
		 * @generated
		 */
		EClass ENUM_COMPARATOR = eINSTANCE.getEnumComparator();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.IsLiteralImpl <em>Is Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsLiteralImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsLiteral()
		 * @generated
		 */
		EClass IS_LITERAL = eINSTANCE.getIsLiteral();

		/**
		 * The meta object literal for the '{@link de.avatar.query.SortOrder <em>Sort Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.SortOrder
		 * @see de.avatar.query.impl.QueryPackageImpl#getSortOrder()
		 * @generated
		 */
		EEnum SORT_ORDER = eINSTANCE.getSortOrder();

		/**
		 * The meta object literal for the '{@link de.avatar.query.SuitableType <em>Suitable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.SuitableType
		 * @see de.avatar.query.impl.QueryPackageImpl#getSuitableType()
		 * @generated
		 */
		EEnum SUITABLE_TYPE = eINSTANCE.getSuitableType();

	}

} //QueryPackage
