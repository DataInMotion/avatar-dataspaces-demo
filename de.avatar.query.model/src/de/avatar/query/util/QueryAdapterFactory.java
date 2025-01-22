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
package de.avatar.query.util;

import de.avatar.query.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySwitch<Adapter> modelSwitch =
		new QuerySwitch<Adapter>() {
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseQObject(QObject object) {
				return createQObjectAdapter();
			}
			@Override
			public Adapter caseQSubject(QSubject object) {
				return createQSubjectAdapter();
			}
			@Override
			public Adapter caseQWhere(QWhere object) {
				return createQWhereAdapter();
			}
			@Override
			public Adapter caseChaining(Chaining object) {
				return createChainingAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseStringOperation(StringOperation object) {
				return createStringOperationAdapter();
			}
			@Override
			public Adapter caseToLowerCase(ToLowerCase object) {
				return createToLowerCaseAdapter();
			}
			@Override
			public Adapter caseToUpperCase(ToUpperCase object) {
				return createToUpperCaseAdapter();
			}
			@Override
			public Adapter caseNumberOperation(NumberOperation object) {
				return createNumberOperationAdapter();
			}
			@Override
			public Adapter caseAverage(Average object) {
				return createAverageAdapter();
			}
			@Override
			public Adapter caseComparator(Comparator object) {
				return createComparatorAdapter();
			}
			@Override
			public Adapter caseStringComparator(StringComparator object) {
				return createStringComparatorAdapter();
			}
			@Override
			public Adapter caseEndsWith(EndsWith object) {
				return createEndsWithAdapter();
			}
			@Override
			public Adapter caseStartWith(StartWith object) {
				return createStartWithAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseLike(Like object) {
				return createLikeAdapter();
			}
			@Override
			public Adapter caseDateComparator(DateComparator object) {
				return createDateComparatorAdapter();
			}
			@Override
			public Adapter caseIsBefore(IsBefore object) {
				return createIsBeforeAdapter();
			}
			@Override
			public Adapter caseIsAfter(IsAfter object) {
				return createIsAfterAdapter();
			}
			@Override
			public Adapter caseIsBeforeOrEqual(IsBeforeOrEqual object) {
				return createIsBeforeOrEqualAdapter();
			}
			@Override
			public Adapter caseIsAfterOrEqual(IsAfterOrEqual object) {
				return createIsAfterOrEqualAdapter();
			}
			@Override
			public Adapter caseIsInRange(IsInRange object) {
				return createIsInRangeAdapter();
			}
			@Override
			public Adapter caseNumberComparator(NumberComparator object) {
				return createNumberComparatorAdapter();
			}
			@Override
			public Adapter caseLt(Lt object) {
				return createLtAdapter();
			}
			@Override
			public Adapter caseLte(Lte object) {
				return createLteAdapter();
			}
			@Override
			public Adapter caseGte(Gte object) {
				return createGteAdapter();
			}
			@Override
			public Adapter caseGt(Gt object) {
				return createGtAdapter();
			}
			@Override
			public Adapter caseEq(Eq object) {
				return createEqAdapter();
			}
			@Override
			public Adapter caseBoolComparator(BoolComparator object) {
				return createBoolComparatorAdapter();
			}
			@Override
			public Adapter caseIsBool(IsBool object) {
				return createIsBoolAdapter();
			}
			@Override
			public Adapter caseSortEntity(SortEntity object) {
				return createSortEntityAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseEnumComparator(EnumComparator object) {
				return createEnumComparatorAdapter();
			}
			@Override
			public Adapter caseIsLiteral(IsLiteral object) {
				return createIsLiteralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.QObject <em>QObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.QObject
	 * @generated
	 */
	public Adapter createQObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.QSubject <em>QSubject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.QSubject
	 * @generated
	 */
	public Adapter createQSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.QWhere <em>QWhere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.QWhere
	 * @generated
	 */
	public Adapter createQWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Chaining <em>Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Chaining
	 * @generated
	 */
	public Adapter createChainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.StringOperation <em>String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.StringOperation
	 * @generated
	 */
	public Adapter createStringOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.ToLowerCase <em>To Lower Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.ToLowerCase
	 * @generated
	 */
	public Adapter createToLowerCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.ToUpperCase <em>To Upper Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.ToUpperCase
	 * @generated
	 */
	public Adapter createToUpperCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.NumberOperation <em>Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.NumberOperation
	 * @generated
	 */
	public Adapter createNumberOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Average
	 * @generated
	 */
	public Adapter createAverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Comparator
	 * @generated
	 */
	public Adapter createComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.StringComparator <em>String Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.StringComparator
	 * @generated
	 */
	public Adapter createStringComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.EndsWith
	 * @generated
	 */
	public Adapter createEndsWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.StartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.StartWith
	 * @generated
	 */
	public Adapter createStartWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Like
	 * @generated
	 */
	public Adapter createLikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.DateComparator <em>Date Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.DateComparator
	 * @generated
	 */
	public Adapter createDateComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsBefore <em>Is Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsBefore
	 * @generated
	 */
	public Adapter createIsBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsAfter <em>Is After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsAfter
	 * @generated
	 */
	public Adapter createIsAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsBeforeOrEqual <em>Is Before Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsBeforeOrEqual
	 * @generated
	 */
	public Adapter createIsBeforeOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsAfterOrEqual <em>Is After Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsAfterOrEqual
	 * @generated
	 */
	public Adapter createIsAfterOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsInRange <em>Is In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsInRange
	 * @generated
	 */
	public Adapter createIsInRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.NumberComparator <em>Number Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.NumberComparator
	 * @generated
	 */
	public Adapter createNumberComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Lt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Lt
	 * @generated
	 */
	public Adapter createLtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Lte <em>Lte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Lte
	 * @generated
	 */
	public Adapter createLteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Gte <em>Gte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Gte
	 * @generated
	 */
	public Adapter createGteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Gt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Gt
	 * @generated
	 */
	public Adapter createGtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Eq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Eq
	 * @generated
	 */
	public Adapter createEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.BoolComparator <em>Bool Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.BoolComparator
	 * @generated
	 */
	public Adapter createBoolComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsBool <em>Is Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsBool
	 * @generated
	 */
	public Adapter createIsBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.SortEntity <em>Sort Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.SortEntity
	 * @generated
	 */
	public Adapter createSortEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.EnumComparator <em>Enum Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.EnumComparator
	 * @generated
	 */
	public Adapter createEnumComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.query.IsLiteral <em>Is Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.query.IsLiteral
	 * @generated
	 */
	public Adapter createIsLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueryAdapterFactory
