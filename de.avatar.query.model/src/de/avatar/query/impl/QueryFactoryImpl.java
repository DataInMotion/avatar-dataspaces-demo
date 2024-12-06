/**
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
package de.avatar.query.impl;

import de.avatar.query.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryPackage.QUERY: return createQuery();
			case QueryPackage.WITHE_LISTED_NOUN: return createWitheListedNoun();
			case QueryPackage.BLACK_LISTED_NOUN: return createBlackListedNoun();
			case QueryPackage.OR: return createOr();
			case QueryPackage.NOT: return createNot();
			case QueryPackage.AND: return createAnd();
			case QueryPackage.TO_LOWER_CASE: return createToLowerCase();
			case QueryPackage.TO_UPPER_CASE: return createToUpperCase();
			case QueryPackage.ENDS_WITH: return createEndsWith();
			case QueryPackage.START_WITH: return createStartWith();
			case QueryPackage.CONTAINS: return createContains();
			case QueryPackage.LIKE: return createLike();
			case QueryPackage.IS_BEFORE: return createIsBefore();
			case QueryPackage.IS_AFTER: return createIsAfter();
			case QueryPackage.IS_IN_RANGE: return createIsInRange();
			case QueryPackage.LT: return createLt();
			case QueryPackage.LTE: return createLte();
			case QueryPackage.GTE: return createGte();
			case QueryPackage.GT: return createGt();
			case QueryPackage.EQ: return createEq();
			case QueryPackage.BOOL_COMPERATOR: return createBoolComperator();
			case QueryPackage.IS_BOOL: return createIsBool();
			case QueryPackage.SORT_ENTITY: return createSortEntity();
			case QueryPackage.FEATURE_PATH: return createFeaturePath();
			case QueryPackage.IS_LITERAL: return createIsLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.SORT_ORDER:
				return createSortOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.SORT_ORDER:
				return convertSortOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WitheListedNoun createWitheListedNoun() {
		WitheListedNounImpl witheListedNoun = new WitheListedNounImpl();
		return witheListedNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackListedNoun createBlackListedNoun() {
		BlackListedNounImpl blackListedNoun = new BlackListedNounImpl();
		return blackListedNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToLowerCase createToLowerCase() {
		ToLowerCaseImpl toLowerCase = new ToLowerCaseImpl();
		return toLowerCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToUpperCase createToUpperCase() {
		ToUpperCaseImpl toUpperCase = new ToUpperCaseImpl();
		return toUpperCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndsWith createEndsWith() {
		EndsWithImpl endsWith = new EndsWithImpl();
		return endsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartWith createStartWith() {
		StartWithImpl startWith = new StartWithImpl();
		return startWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Like createLike() {
		LikeImpl like = new LikeImpl();
		return like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsBefore createIsBefore() {
		IsBeforeImpl isBefore = new IsBeforeImpl();
		return isBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsAfter createIsAfter() {
		IsAfterImpl isAfter = new IsAfterImpl();
		return isAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsInRange createIsInRange() {
		IsInRangeImpl isInRange = new IsInRangeImpl();
		return isInRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lt createLt() {
		LtImpl lt = new LtImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lte createLte() {
		LteImpl lte = new LteImpl();
		return lte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gte createGte() {
		GteImpl gte = new GteImpl();
		return gte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gt createGt() {
		GtImpl gt = new GtImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eq createEq() {
		EqImpl eq = new EqImpl();
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolComperator createBoolComperator() {
		BoolComperatorImpl boolComperator = new BoolComperatorImpl();
		return boolComperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsBool createIsBool() {
		IsBoolImpl isBool = new IsBoolImpl();
		return isBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortEntity createSortEntity() {
		SortEntityImpl sortEntity = new SortEntityImpl();
		return sortEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath createFeaturePath() {
		FeaturePathImpl featurePath = new FeaturePathImpl();
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsLiteral createIsLiteral() {
		IsLiteralImpl isLiteral = new IsLiteralImpl();
		return isLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrder createSortOrderFromString(EDataType eDataType, String initialValue) {
		SortOrder result = SortOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
