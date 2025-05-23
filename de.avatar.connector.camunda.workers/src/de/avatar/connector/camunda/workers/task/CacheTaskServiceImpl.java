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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.query.backend.api.QueryStatusHelper;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
@Component(name = "CacheTaskService", configurationPid = "OrchestratorTaskCacheService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CacheTaskServiceImpl implements OrchestratorTaskCacheService {

	private static final Logger LOGGER = Logger.getLogger(CacheTaskServiceImpl.class.getName());
	private Map<String, Map<ExternalTask, ExternalTaskService>> cachedTasksMap = new ConcurrentHashMap<>();
	private Map<String,Map<String, Map<ExternalTask, ExternalTaskService>>> cachedTasksMapWithAuth = new ConcurrentHashMap<>();
	private QueryStatusType type;
	private String msg;
	
	@Activate
	public void activate(Map<String, Object> properties) {
		type = QueryStatusType.valueOf((String) properties.getOrDefault("task.status.type", "OTHER"));
		msg = (String) properties.getOrDefault("task.status.msg", "Manual operation triggered by the user");		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#completeTask(java.lang.String, java.util.Map)
	 */
	@Override
	public QueryResponse completeTask(String taskId, Map<String, Object> variables) {
		if(!cachedTasksMap.containsKey(taskId)) {
			LOGGER.severe(String.format("No cached task of type %s for request id %s", type, taskId));
			return QueryStatusHelper.createQueryResponse(taskId, QueryStatusType.OPERATION_ERROR, String.format("No cached task of type %s for request id %s", type, taskId));
		}
		Map<ExternalTask, ExternalTaskService> externalTaskPair = cachedTasksMap.get(taskId);
		externalTaskPair.entrySet().forEach(e -> {
			e.getValue().setVariables(e.getKey(), variables);			
			e.getValue().complete(e.getKey());
		});
		removeTask(taskId, null);
		
		return QueryStatusHelper.createQueryResponse(taskId, type, msg);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#cacheTask(org.camunda.bpm.client.task.ExternalTask, org.camunda.bpm.client.task.ExternalTaskService)
	 */
	@Override
	public void cacheTask(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		String reqId = externalTask.getVariable("reqId");
		String token = externalTask.getVariable("credentials");
		if(reqId == null) {
			LOGGER.severe(String.format("Cannot cache task with a null reqId"));
			return;
		}
		if(token != null) {
			if(!cachedTasksMapWithAuth.containsKey(token)) {
				cachedTasksMapWithAuth.put(token, new HashMap<>());
			}
			cachedTasksMapWithAuth.get(token).put(reqId, Map.of(externalTask, externalTaskService));
		} else {
			LOGGER.info(String.format("Caching task of type %s for request id %s", type, reqId));
			cachedTasksMap.put(reqId, Map.of(externalTask, externalTaskService));
			LOGGER.info(String.format("Total Cached tasks of type %s are %d", type, cachedTasksMap.size()));
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#completeTask(java.lang.String)
	 */
	@Override
	public QueryResponse completeTask(String reqId) {
		return completeTask(reqId, Collections.emptyMap());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#completeTask(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse completeTask(String taskId, String token) {
		return completeTask(taskId, Collections.emptyMap(), token);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#completeTask(java.lang.String, java.util.Map, java.lang.String)
	 */
	@Override
	public QueryResponse completeTask(String taskId, Map<String, Object> variables, String token) {
		if(!cachedTasksMapWithAuth.containsKey(token) || !cachedTasksMapWithAuth.get(token).containsKey(taskId)) {
			LOGGER.severe(String.format("No cached task of type %s for request id %s associated with user", type, taskId));
			return QueryStatusHelper.createQueryResponse(taskId, QueryStatusType.OPERATION_ERROR, String.format("No cached task of type %s for request id %s associated with user", type, taskId));
		}
		Map<ExternalTask, ExternalTaskService> externalTaskPair = cachedTasksMapWithAuth.get(token).get(taskId);
		externalTaskPair.entrySet().forEach(e -> {
			e.getValue().setVariables(e.getKey(), variables);			
			e.getValue().complete(e.getKey());
		});
		removeTask(taskId, token);		
		return QueryStatusHelper.createQueryResponse(taskId, type, msg);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorTaskCacheService#removeTask(java.lang.String, java.lang.String)
	 */
	@Override
	public void removeTask(String taskId, String token) {
		if(token == null) {
			if(cachedTasksMap.containsKey(taskId)) {
				cachedTasksMap.remove(taskId);	
			}			
		}
		else {
			if(cachedTasksMapWithAuth.containsKey(token)) {
				if(cachedTasksMapWithAuth.get(token).containsKey(taskId)) {
					cachedTasksMapWithAuth.get(token).remove(taskId);	
				}
			}				
		}
	}
}
