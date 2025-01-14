/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.query.rest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This REST resource is responsible for getting the request from the Query UI and forward them to the Whiteboard
 * @author ilenia
 * @since Jan 13, 2025
 */
@JakartarsResource
@JakartarsName("query")
@Path("/")
@Component(name = "QueryRestResource", service = QueryRestResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
public class QueryRestResource {

	@Reference
	ConnectorWhiteboard connectorWhiteboard;
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello ConnectorRestResource!";
	}
	
	@POST
	@Path("/dryrun")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response dryRun(QueryRequest request) {		
		QueryResponse response = connectorWhiteboard.executeDryRun(request);
		return Response.ok(response).build();
	}
	
	
	@POST
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response query(QueryRequest request) {
		try {
			QueryResponse response = connectorWhiteboard.executeRequest(request);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(500, e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/status/{requestId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response status(@PathParam("requestId") String requestId) {
		try {
			QueryResponse response = connectorWhiteboard.executeStatusRequest(requestId);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(500, e.getMessage()).build();
		}
		
	}
}
