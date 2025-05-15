/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.connector.camunda.api;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
public enum StatusUpdateType {
	
	SINGLE_CONNECTOR_QUERY_RESPONSE, 
	ALL_CONNECTORS_QUERY_RESPONSE,
	ANONYMIZED_DATA_READY,
	INTERRUPTED_REQUEST

}
