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

import java.util.Map;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;

import de.avatar.status.QueryResponse;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
public interface OrchestratorTaskCacheService {

	void cacheTask(ExternalTask externalTask, ExternalTaskService externalTaskService);
	
	QueryResponse completeTask(String taskId);

	QueryResponse completeTask(String taskId, Map<String, Object> variables);

	QueryResponse completeTask(String taskId, String token);

	QueryResponse completeTask(String taskId, Map<String, Object> variables, String token);
	
	void removeTask(String taskId, String token);

}
