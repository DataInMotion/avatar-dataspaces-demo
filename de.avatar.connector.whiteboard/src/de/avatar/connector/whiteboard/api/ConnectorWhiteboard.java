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
package de.avatar.connector.whiteboard.api;

import java.util.List;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.ModelInfo;

/**
 * 
 * @author ilenia
 * @since Jan 16, 2025
 */
public interface ConnectorWhiteboard {

	List<ConnectorInfo> getAllConnectorsInfo();
	
	List<ConnectorInfo> getExternalConnectorsInfo();
	
	List<AvatarConnector> getAllConnectors();
	
	List<ModelInfo> getModelInfoForAllConnectors();
	
	List<ConsentInfo> getConsentInfoForAllConnectors();
}
