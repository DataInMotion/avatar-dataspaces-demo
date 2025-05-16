/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.avatar.connector.camunda.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ilenia
 * @since Feb 25, 2025
 */
public interface OrchestratorProcessLauncher {
	
	void launchProcessToEngine(Map<String, HashMap<String, HashMap<String, Object>>> processVariables) throws IOException;
	
	void launchProcessToProcessUserInterface(Map<String, HashMap<String, Object>> processVariables) throws IOException;
	
	boolean isLocal();

}
