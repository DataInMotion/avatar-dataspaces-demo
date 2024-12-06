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
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FROM = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.avatar.query.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.SubjectImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__FEATURE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.WitheListedNounImpl <em>Withe Listed Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.WitheListedNounImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getWitheListedNoun()
	 * @generated
	 */
	int WITHE_LISTED_NOUN = 2;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHE_LISTED_NOUN__FEATURE_PATH = SUBJECT__FEATURE_PATH;

	/**
	 * The number of structural features of the '<em>Withe Listed Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHE_LISTED_NOUN_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Withe Listed Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHE_LISTED_NOUN_OPERATION_COUNT = SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.BlackListedNounImpl <em>Black Listed Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.BlackListedNounImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getBlackListedNoun()
	 * @generated
	 */
	int BLACK_LISTED_NOUN = 3;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED_NOUN__FEATURE_PATH = SUBJECT__FEATURE_PATH;

	/**
	 * The number of structural features of the '<em>Black Listed Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED_NOUN_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Black Listed Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED_NOUN_OPERATION_COUNT = SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.OperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COMPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ChainingImpl <em>Chaining</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ChainingImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getChaining()
	 * @generated
	 */
	int CHAINING = 5;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING__COMPERATOR = OPERATOR__COMPERATOR;

	/**
	 * The number of structural features of the '<em>Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING___EXECUTE = OPERATOR___EXECUTE;

	/**
	 * The number of operations of the '<em>Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINING_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.OrImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getOr()
	 * @generated
	 */
	int OR = 6;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__COMPERATOR = CHAINING__COMPERATOR;

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
	int NOT = 7;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__COMPERATOR = CHAINING__COMPERATOR;

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
	int AND = 8;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__COMPERATOR = CHAINING__COMPERATOR;

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
	int OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUITABLE_FOR_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

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
	int STRING_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION__FEATURE_PATH = OPERATION__FEATURE_PATH;

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
	int TO_LOWER_CASE = 10;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE__FEATURE_PATH = STRING_OPERATION__FEATURE_PATH;

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
	int TO_UPPER_CASE = 11;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE__FEATURE_PATH = STRING_OPERATION__FEATURE_PATH;

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
	 * The meta object id for the '{@link de.avatar.query.impl.ComperatorImpl <em>Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getComperator()
	 * @generated
	 */
	int COMPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPERATOR__SUITABLE_FOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPERATOR__FEATURE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPERATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPERATOR___COMPARE = 0;

	/**
	 * The number of operations of the '<em>Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.StringComperatorImpl <em>String Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.StringComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getStringComperator()
	 * @generated
	 */
	int STRING_COMPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR__SUITABLE_FOR_TYPE = COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR__FEATURE_PATH = COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR__VALUE = COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR_FEATURE_COUNT = COMPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR___COMPARE = COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>String Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPERATOR_OPERATION_COUNT = COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EndsWithImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 14;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SUITABLE_FOR_TYPE = STRING_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FEATURE_PATH = STRING_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__VALUE = STRING_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = STRING_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH___COMPARE = STRING_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = STRING_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.StartWithImpl <em>Start With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.StartWithImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getStartWith()
	 * @generated
	 */
	int START_WITH = 15;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__SUITABLE_FOR_TYPE = STRING_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__FEATURE_PATH = STRING_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH__VALUE = STRING_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Start With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH_FEATURE_COUNT = STRING_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH___COMPARE = STRING_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Start With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_WITH_OPERATION_COUNT = STRING_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.ContainsImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 16;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SUITABLE_FOR_TYPE = STRING_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FEATURE_PATH = STRING_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__VALUE = STRING_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = STRING_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___COMPARE = STRING_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = STRING_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LikeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 17;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__SUITABLE_FOR_TYPE = STRING_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__FEATURE_PATH = STRING_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__VALUE = STRING_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = STRING_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE___COMPARE = STRING_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = STRING_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.DateComperatorImpl <em>Date Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.DateComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getDateComperator()
	 * @generated
	 */
	int DATE_COMPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR__SUITABLE_FOR_TYPE = COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR__FEATURE_PATH = COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR__VALUE = COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR_FEATURE_COUNT = COMPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR___COMPARE = COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Date Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMPERATOR_OPERATION_COUNT = COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsBeforeImpl <em>Is Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsBeforeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsBefore()
	 * @generated
	 */
	int IS_BEFORE = 19;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__SUITABLE_FOR_TYPE = DATE_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__FEATURE_PATH = DATE_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE__VALUE = DATE_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_FEATURE_COUNT = DATE_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE___COMPARE = DATE_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BEFORE_OPERATION_COUNT = DATE_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsAfterImpl <em>Is After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsAfterImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsAfter()
	 * @generated
	 */
	int IS_AFTER = 20;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__SUITABLE_FOR_TYPE = DATE_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__FEATURE_PATH = DATE_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER__VALUE = DATE_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_FEATURE_COUNT = DATE_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER___COMPARE = DATE_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_AFTER_OPERATION_COUNT = DATE_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsInRangeImpl <em>Is In Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsInRangeImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsInRange()
	 * @generated
	 */
	int IS_IN_RANGE = 21;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__SUITABLE_FOR_TYPE = DATE_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__FEATURE_PATH = DATE_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE__VALUE = DATE_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE_FEATURE_COUNT = DATE_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE___COMPARE = DATE_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IN_RANGE_OPERATION_COUNT = DATE_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.NumberComperatorImpl <em>Number Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.NumberComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getNumberComperator()
	 * @generated
	 */
	int NUMBER_COMPERATOR = 22;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR__SUITABLE_FOR_TYPE = COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR__FEATURE_PATH = COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR__VALUE = COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR_FEATURE_COUNT = COMPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR___COMPARE = COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Number Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_COMPERATOR_OPERATION_COUNT = COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LtImpl <em>Lt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LtImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLt()
	 * @generated
	 */
	int LT = 23;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__SUITABLE_FOR_TYPE = NUMBER_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__FEATURE_PATH = NUMBER_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__VALUE = NUMBER_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = NUMBER_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT___COMPARE = NUMBER_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Lt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_OPERATION_COUNT = NUMBER_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.LteImpl <em>Lte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.LteImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getLte()
	 * @generated
	 */
	int LTE = 24;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__SUITABLE_FOR_TYPE = NUMBER_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__FEATURE_PATH = NUMBER_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__VALUE = NUMBER_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Lte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_FEATURE_COUNT = NUMBER_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE___COMPARE = NUMBER_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Lte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_OPERATION_COUNT = NUMBER_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.GteImpl <em>Gte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.GteImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getGte()
	 * @generated
	 */
	int GTE = 25;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__SUITABLE_FOR_TYPE = NUMBER_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__FEATURE_PATH = NUMBER_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__VALUE = NUMBER_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Gte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_FEATURE_COUNT = NUMBER_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE___COMPARE = NUMBER_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Gte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_OPERATION_COUNT = NUMBER_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.GtImpl <em>Gt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.GtImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getGt()
	 * @generated
	 */
	int GT = 26;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__SUITABLE_FOR_TYPE = NUMBER_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__FEATURE_PATH = NUMBER_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__VALUE = NUMBER_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = NUMBER_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT___COMPARE = NUMBER_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Gt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_OPERATION_COUNT = NUMBER_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EqImpl <em>Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EqImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEq()
	 * @generated
	 */
	int EQ = 27;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__SUITABLE_FOR_TYPE = NUMBER_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__FEATURE_PATH = NUMBER_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__VALUE = NUMBER_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_FEATURE_COUNT = NUMBER_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ___COMPARE = NUMBER_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OPERATION_COUNT = NUMBER_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.BoolComperatorImpl <em>Bool Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.BoolComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getBoolComperator()
	 * @generated
	 */
	int BOOL_COMPERATOR = 28;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR__SUITABLE_FOR_TYPE = COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR__FEATURE_PATH = COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR__VALUE = COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR_FEATURE_COUNT = COMPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR___COMPARE = COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Bool Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_COMPERATOR_OPERATION_COUNT = COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsBoolImpl <em>Is Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsBoolImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsBool()
	 * @generated
	 */
	int IS_BOOL = 29;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__SUITABLE_FOR_TYPE = BOOL_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__FEATURE_PATH = BOOL_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL__VALUE = BOOL_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL_FEATURE_COUNT = BOOL_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL___COMPARE = BOOL_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BOOL_OPERATION_COUNT = BOOL_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.SortEntityImpl <em>Sort Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.SortEntityImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getSortEntity()
	 * @generated
	 */
	int SORT_ENTITY = 30;

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
	 * The meta object id for the '{@link de.avatar.query.impl.FeaturePathImpl <em>Feature Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.FeaturePathImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getFeaturePath()
	 * @generated
	 */
	int FEATURE_PATH = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH___GET_VALUE__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH___IS_VALID__EOBJECT = 1;

	/**
	 * The number of operations of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.EnumComperatorImpl <em>Enum Comperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.EnumComperatorImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getEnumComperator()
	 * @generated
	 */
	int ENUM_COMPERATOR = 33;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR__SUITABLE_FOR_TYPE = COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR__FEATURE_PATH = COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR__VALUE = COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR_FEATURE_COUNT = COMPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR___COMPARE = COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Enum Comperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COMPERATOR_OPERATION_COUNT = COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.impl.IsLiteralImpl <em>Is Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.impl.IsLiteralImpl
	 * @see de.avatar.query.impl.QueryPackageImpl#getIsLiteral()
	 * @generated
	 */
	int IS_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__SUITABLE_FOR_TYPE = ENUM_COMPERATOR__SUITABLE_FOR_TYPE;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__FEATURE_PATH = ENUM_COMPERATOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL__VALUE = ENUM_COMPERATOR__VALUE;

	/**
	 * The number of structural features of the '<em>Is Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL_FEATURE_COUNT = ENUM_COMPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL___COMPARE = ENUM_COMPERATOR___COMPARE;

	/**
	 * The number of operations of the '<em>Is Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LITERAL_OPERATION_COUNT = ENUM_COMPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.query.SortOrder <em>Sort Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.query.SortOrder
	 * @see de.avatar.query.impl.QueryPackageImpl#getSortOrder()
	 * @generated
	 */
	int SORT_ORDER = 35;


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
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Query#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see de.avatar.query.Query#getObject()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Object();

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
	 * Returns the meta object for the containment reference '{@link de.avatar.query.Query#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group By</em>'.
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
	 * Returns the meta object for class '{@link de.avatar.query.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see de.avatar.query.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.query.Subject#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Path</em>'.
	 * @see de.avatar.query.Subject#getFeaturePath()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_FeaturePath();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.WitheListedNoun <em>Withe Listed Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withe Listed Noun</em>'.
	 * @see de.avatar.query.WitheListedNoun
	 * @generated
	 */
	EClass getWitheListedNoun();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.BlackListedNoun <em>Black Listed Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Listed Noun</em>'.
	 * @see de.avatar.query.BlackListedNoun
	 * @generated
	 */
	EClass getBlackListedNoun();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see de.avatar.query.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.Operator#getComperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comperator</em>'.
	 * @see de.avatar.query.Operator#getComperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Comperator();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.Operator#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see de.avatar.query.Operator#execute()
	 * @generated
	 */
	EOperation getOperator__Execute();

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
	 * Returns the meta object for class '{@link de.avatar.query.Comperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comperator</em>'.
	 * @see de.avatar.query.Comperator
	 * @generated
	 */
	EClass getComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.Comperator#getSuitableForType <em>Suitable For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suitable For Type</em>'.
	 * @see de.avatar.query.Comperator#getSuitableForType()
	 * @see #getComperator()
	 * @generated
	 */
	EAttribute getComperator_SuitableForType();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.query.Comperator#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Path</em>'.
	 * @see de.avatar.query.Comperator#getFeaturePath()
	 * @see #getComperator()
	 * @generated
	 */
	EReference getComperator_FeaturePath();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.Comperator#compare() <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see de.avatar.query.Comperator#compare()
	 * @generated
	 */
	EOperation getComperator__Compare();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.StringComperator <em>String Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Comperator</em>'.
	 * @see de.avatar.query.StringComperator
	 * @generated
	 */
	EClass getStringComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.StringComperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.StringComperator#getValue()
	 * @see #getStringComperator()
	 * @generated
	 */
	EAttribute getStringComperator_Value();

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
	 * Returns the meta object for class '{@link de.avatar.query.DateComperator <em>Date Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Comperator</em>'.
	 * @see de.avatar.query.DateComperator
	 * @generated
	 */
	EClass getDateComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.DateComperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.DateComperator#getValue()
	 * @see #getDateComperator()
	 * @generated
	 */
	EAttribute getDateComperator_Value();

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
	 * Returns the meta object for class '{@link de.avatar.query.IsInRange <em>Is In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is In Range</em>'.
	 * @see de.avatar.query.IsInRange
	 * @generated
	 */
	EClass getIsInRange();

	/**
	 * Returns the meta object for class '{@link de.avatar.query.NumberComperator <em>Number Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Comperator</em>'.
	 * @see de.avatar.query.NumberComperator
	 * @generated
	 */
	EClass getNumberComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.NumberComperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.NumberComperator#getValue()
	 * @see #getNumberComperator()
	 * @generated
	 */
	EAttribute getNumberComperator_Value();

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
	 * Returns the meta object for class '{@link de.avatar.query.BoolComperator <em>Bool Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Comperator</em>'.
	 * @see de.avatar.query.BoolComperator
	 * @generated
	 */
	EClass getBoolComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.BoolComperator#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.BoolComperator#isValue()
	 * @see #getBoolComperator()
	 * @generated
	 */
	EAttribute getBoolComperator_Value();

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
	 * Returns the meta object for class '{@link de.avatar.query.FeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path</em>'.
	 * @see de.avatar.query.FeaturePath
	 * @generated
	 */
	EClass getFeaturePath();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.FeaturePath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.query.FeaturePath#getName()
	 * @see #getFeaturePath()
	 * @generated
	 */
	EAttribute getFeaturePath_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.avatar.query.FeaturePath#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see de.avatar.query.FeaturePath#getFeature()
	 * @see #getFeaturePath()
	 * @generated
	 */
	EReference getFeaturePath_Feature();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.FeaturePath#getValue(org.eclipse.emf.ecore.EObject) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see de.avatar.query.FeaturePath#getValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFeaturePath__GetValue__EObject();

	/**
	 * Returns the meta object for the '{@link de.avatar.query.FeaturePath#isValid(org.eclipse.emf.ecore.EObject) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see de.avatar.query.FeaturePath#isValid(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFeaturePath__IsValid__EObject();

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
	 * Returns the meta object for the reference '{@link de.avatar.query.Operation#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Path</em>'.
	 * @see de.avatar.query.Operation#getFeaturePath()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_FeaturePath();

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
	 * Returns the meta object for class '{@link de.avatar.query.EnumComperator <em>Enum Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Comperator</em>'.
	 * @see de.avatar.query.EnumComperator
	 * @generated
	 */
	EClass getEnumComperator();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.query.EnumComperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.avatar.query.EnumComperator#getValue()
	 * @see #getEnumComperator()
	 * @generated
	 */
	EAttribute getEnumComperator_Value();

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
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FROM = eINSTANCE.getQuery_From();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__OBJECT = eINSTANCE.getQuery_Object();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SUBJECT = eINSTANCE.getQuery_Subject();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link de.avatar.query.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.SubjectImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__FEATURE_PATH = eINSTANCE.getSubject_FeaturePath();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.WitheListedNounImpl <em>Withe Listed Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.WitheListedNounImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getWitheListedNoun()
		 * @generated
		 */
		EClass WITHE_LISTED_NOUN = eINSTANCE.getWitheListedNoun();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.BlackListedNounImpl <em>Black Listed Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.BlackListedNounImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getBlackListedNoun()
		 * @generated
		 */
		EClass BLACK_LISTED_NOUN = eINSTANCE.getBlackListedNoun();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.OperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__COMPERATOR = eINSTANCE.getOperator_Comperator();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___EXECUTE = eINSTANCE.getOperator__Execute();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.ComperatorImpl <em>Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.ComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getComperator()
		 * @generated
		 */
		EClass COMPERATOR = eINSTANCE.getComperator();

		/**
		 * The meta object literal for the '<em><b>Suitable For Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPERATOR__SUITABLE_FOR_TYPE = eINSTANCE.getComperator_SuitableForType();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPERATOR__FEATURE_PATH = eINSTANCE.getComperator_FeaturePath();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPERATOR___COMPARE = eINSTANCE.getComperator__Compare();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.StringComperatorImpl <em>String Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.StringComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getStringComperator()
		 * @generated
		 */
		EClass STRING_COMPERATOR = eINSTANCE.getStringComperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_COMPERATOR__VALUE = eINSTANCE.getStringComperator_Value();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.DateComperatorImpl <em>Date Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.DateComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getDateComperator()
		 * @generated
		 */
		EClass DATE_COMPERATOR = eINSTANCE.getDateComperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_COMPERATOR__VALUE = eINSTANCE.getDateComperator_Value();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.IsInRangeImpl <em>Is In Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.IsInRangeImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getIsInRange()
		 * @generated
		 */
		EClass IS_IN_RANGE = eINSTANCE.getIsInRange();

		/**
		 * The meta object literal for the '{@link de.avatar.query.impl.NumberComperatorImpl <em>Number Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.NumberComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getNumberComperator()
		 * @generated
		 */
		EClass NUMBER_COMPERATOR = eINSTANCE.getNumberComperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_COMPERATOR__VALUE = eINSTANCE.getNumberComperator_Value();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.BoolComperatorImpl <em>Bool Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.BoolComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getBoolComperator()
		 * @generated
		 */
		EClass BOOL_COMPERATOR = eINSTANCE.getBoolComperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_COMPERATOR__VALUE = eINSTANCE.getBoolComperator_Value();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.FeaturePathImpl <em>Feature Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.FeaturePathImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getFeaturePath()
		 * @generated
		 */
		EClass FEATURE_PATH = eINSTANCE.getFeaturePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH__NAME = eINSTANCE.getFeaturePath_Name();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH__FEATURE = eINSTANCE.getFeaturePath_Feature();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_PATH___GET_VALUE__EOBJECT = eINSTANCE.getFeaturePath__GetValue__EObject();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_PATH___IS_VALID__EOBJECT = eINSTANCE.getFeaturePath__IsValid__EObject();

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
		 * The meta object literal for the '<em><b>Feature Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FEATURE_PATH = eINSTANCE.getOperation_FeaturePath();

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
		 * The meta object literal for the '{@link de.avatar.query.impl.EnumComperatorImpl <em>Enum Comperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.query.impl.EnumComperatorImpl
		 * @see de.avatar.query.impl.QueryPackageImpl#getEnumComperator()
		 * @generated
		 */
		EClass ENUM_COMPERATOR = eINSTANCE.getEnumComperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_COMPERATOR__VALUE = eINSTANCE.getEnumComperator_Value();

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

	}

} //QueryPackage
