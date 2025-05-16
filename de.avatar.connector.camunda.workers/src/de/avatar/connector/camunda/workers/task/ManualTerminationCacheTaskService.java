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
package de.avatar.connector.camunda.workers.task;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.osgi.service.component.annotations.Component;

import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.query.backend.api.QueryStatusHelper;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
@Component(name = "ManualTerminationCacheTaskService")
public class ManualTerminationCacheTaskService implements OrchestratorTaskCacheService {

	private static final Logger LOGGER = Logger.getLogger(ManualTerminationCacheTaskService.class.getName());
	private Map<String, Map<ExternalTask, ExternalTaskService>> cachedTasksMap = new HashMap<>();
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#cacheTask(org.camunda.bpm.client.task.ExternalTask, org.camunda.bpm.client.task.ExternalTaskService)
	 */
	@Override
	public void cacheTask(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		String reqId = externalTask.getVariable("reqId");
		if(reqId == null) {
			LOGGER.severe(String.format("Cannot cache task with a null reqId"));
			return;
		}
		cachedTasksMap.put(reqId, Map.of(externalTask, externalTaskService));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#completeTask(java.lang.String)
	 */
	@Override
	public QueryResponse completeTask(String reqId) {
		if(!cachedTasksMap.containsKey(reqId)) {
			LOGGER.severe(String.format("No ManualTermination task cached for request id %s", reqId));
			return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.OPERATION_ERROR, String.format("No ManualTermination task cached for request id %s", reqId));
		}
		Map<ExternalTask, ExternalTaskService> externalTaskPair = cachedTasksMap.get(reqId);
		externalTaskPair.entrySet().forEach(e -> e.getValue().complete(e.getKey()));
		removeTask(reqId);
		return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.QUERY_INTERRUPTED, String.format("Request %s has been interrupted. Workflow will go on with data collected up to this moment.", reqId));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#removeTask(java.lang.String)
	 */
	@Override
	public void removeTask(String taskId) {
		cachedTasksMap.remove(taskId);	
	}

	
}
