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
package de.avatar.connector.whiteboard.api;

import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;

/**
 * 
 * @author mark
 * @since 13.11.2024
 */
public interface ConnectorRequestWhiteboard extends ConnectorWhiteboard{
	
	QueryResponse executeDryRun(QueryRequest request);
	
	QueryResponse executeRequest(QueryRequest request);

}
