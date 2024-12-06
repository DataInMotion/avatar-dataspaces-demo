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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.avatar.query.QueryPackage
 * @generated
 */
public class QuerySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySwitch() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QueryPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SUBJECT: {
				Subject subject = (Subject)theEObject;
				T result = caseSubject(subject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.WITHE_LISTED_NOUN: {
				WitheListedNoun witheListedNoun = (WitheListedNoun)theEObject;
				T result = caseWitheListedNoun(witheListedNoun);
				if (result == null) result = caseSubject(witheListedNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BLACK_LISTED_NOUN: {
				BlackListedNoun blackListedNoun = (BlackListedNoun)theEObject;
				T result = caseBlackListedNoun(blackListedNoun);
				if (result == null) result = caseSubject(blackListedNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CHAINING: {
				Chaining chaining = (Chaining)theEObject;
				T result = caseChaining(chaining);
				if (result == null) result = caseOperator(chaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseChaining(or);
				if (result == null) result = caseOperator(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseChaining(not);
				if (result == null) result = caseOperator(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseChaining(and);
				if (result == null) result = caseOperator(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.STRING_OPERATION: {
				StringOperation stringOperation = (StringOperation)theEObject;
				T result = caseStringOperation(stringOperation);
				if (result == null) result = caseOperation(stringOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.TO_LOWER_CASE: {
				ToLowerCase toLowerCase = (ToLowerCase)theEObject;
				T result = caseToLowerCase(toLowerCase);
				if (result == null) result = caseStringOperation(toLowerCase);
				if (result == null) result = caseOperation(toLowerCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.TO_UPPER_CASE: {
				ToUpperCase toUpperCase = (ToUpperCase)theEObject;
				T result = caseToUpperCase(toUpperCase);
				if (result == null) result = caseStringOperation(toUpperCase);
				if (result == null) result = caseOperation(toUpperCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.COMPERATOR: {
				Comperator comperator = (Comperator)theEObject;
				T result = caseComperator(comperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.STRING_COMPERATOR: {
				StringComperator stringComperator = (StringComperator)theEObject;
				T result = caseStringComperator(stringComperator);
				if (result == null) result = caseComperator(stringComperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ENDS_WITH: {
				EndsWith endsWith = (EndsWith)theEObject;
				T result = caseEndsWith(endsWith);
				if (result == null) result = caseStringComperator(endsWith);
				if (result == null) result = caseComperator(endsWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.START_WITH: {
				StartWith startWith = (StartWith)theEObject;
				T result = caseStartWith(startWith);
				if (result == null) result = caseStringComperator(startWith);
				if (result == null) result = caseComperator(startWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseStringComperator(contains);
				if (result == null) result = caseComperator(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.LIKE: {
				Like like = (Like)theEObject;
				T result = caseLike(like);
				if (result == null) result = caseStringComperator(like);
				if (result == null) result = caseComperator(like);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.DATE_COMPERATOR: {
				DateComperator dateComperator = (DateComperator)theEObject;
				T result = caseDateComperator(dateComperator);
				if (result == null) result = caseComperator(dateComperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.IS_BEFORE: {
				IsBefore isBefore = (IsBefore)theEObject;
				T result = caseIsBefore(isBefore);
				if (result == null) result = caseDateComperator(isBefore);
				if (result == null) result = caseComperator(isBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.IS_AFTER: {
				IsAfter isAfter = (IsAfter)theEObject;
				T result = caseIsAfter(isAfter);
				if (result == null) result = caseDateComperator(isAfter);
				if (result == null) result = caseComperator(isAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.IS_IN_RANGE: {
				IsInRange isInRange = (IsInRange)theEObject;
				T result = caseIsInRange(isInRange);
				if (result == null) result = caseDateComperator(isInRange);
				if (result == null) result = caseComperator(isInRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.NUMBER_COMPERATOR: {
				NumberComperator numberComperator = (NumberComperator)theEObject;
				T result = caseNumberComperator(numberComperator);
				if (result == null) result = caseComperator(numberComperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.LT: {
				Lt lt = (Lt)theEObject;
				T result = caseLt(lt);
				if (result == null) result = caseNumberComperator(lt);
				if (result == null) result = caseComperator(lt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.LTE: {
				Lte lte = (Lte)theEObject;
				T result = caseLte(lte);
				if (result == null) result = caseNumberComperator(lte);
				if (result == null) result = caseComperator(lte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.GTE: {
				Gte gte = (Gte)theEObject;
				T result = caseGte(gte);
				if (result == null) result = caseNumberComperator(gte);
				if (result == null) result = caseComperator(gte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.GT: {
				Gt gt = (Gt)theEObject;
				T result = caseGt(gt);
				if (result == null) result = caseNumberComperator(gt);
				if (result == null) result = caseComperator(gt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EQ: {
				Eq eq = (Eq)theEObject;
				T result = caseEq(eq);
				if (result == null) result = caseNumberComperator(eq);
				if (result == null) result = caseComperator(eq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BOOL_COMPERATOR: {
				BoolComperator boolComperator = (BoolComperator)theEObject;
				T result = caseBoolComperator(boolComperator);
				if (result == null) result = caseComperator(boolComperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.IS_BOOL: {
				IsBool isBool = (IsBool)theEObject;
				T result = caseIsBool(isBool);
				if (result == null) result = caseBoolComperator(isBool);
				if (result == null) result = caseComperator(isBool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SORT_ENTITY: {
				SortEntity sortEntity = (SortEntity)theEObject;
				T result = caseSortEntity(sortEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ENUM_COMPERATOR: {
				EnumComperator enumComperator = (EnumComperator)theEObject;
				T result = caseEnumComperator(enumComperator);
				if (result == null) result = caseComperator(enumComperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.IS_LITERAL: {
				IsLiteral isLiteral = (IsLiteral)theEObject;
				T result = caseIsLiteral(isLiteral);
				if (result == null) result = caseEnumComperator(isLiteral);
				if (result == null) result = caseComperator(isLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Withe Listed Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Withe Listed Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWitheListedNoun(WitheListedNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Black Listed Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Black Listed Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackListedNoun(BlackListedNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chaining</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chaining</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChaining(Chaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOperation(StringOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Lower Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Lower Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToLowerCase(ToLowerCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Upper Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Upper Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUpperCase(ToUpperCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComperator(Comperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringComperator(StringComperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndsWith(EndsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartWith(StartWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLike(Like object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateComperator(DateComperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsBefore(IsBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAfter(IsAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is In Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is In Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsInRange(IsInRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberComperator(NumberComperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLt(Lt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLte(Lte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGte(Gte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGt(Gt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEq(Eq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolComperator(BoolComperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsBool(IsBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortEntity(SortEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Comperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Comperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumComperator(EnumComperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsLiteral(IsLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuerySwitch
