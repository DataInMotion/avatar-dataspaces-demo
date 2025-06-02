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
	
	QUERY_FORWARDING_STARTED,
	SINGLE_CONNECTOR_QUERY_RESPONSE, 
	ALL_CONNECTORS_QUERY_RESPONSE,
	ANONYMIZED_DATA_READY,
	QUERY_INTERRUPTED, 
	QUERY_INTERRUPT_REQUEST,
	CANCELED,
	CANCEL_REQUEST,
	PUBLIC_LINK_REQUEST,
	PUBLIC_LINK_AVAILABLE,
	PUBLIC_LINK_EXPIRED,
	STATUS_UPDATE,
	OTHER

}
