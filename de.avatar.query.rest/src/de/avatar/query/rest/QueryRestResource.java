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

import org.eclipse.osgitech.rest.annotations.RequireJerseyServlet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.rest.annotations.EMFResourceOptions;
import org.gecko.emf.rest.annotations.ResourceOption;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.avatar.query.Query;
import de.avatar.query.backend.api.QueryBackendService;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * This REST resource is responsible for getting the request from the Query UI and forward them to the Whiteboard
 * @author ilenia
 * @since Jan 13, 2025
 */
@JakartarsResource
@JakartarsName("query")
@RequireJerseyServlet
@Path("/")
@Component(name = "QueryRestResource", service = QueryRestResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
public class QueryRestResource {

	@Reference
	QueryBackendService queryBEService;
	
//	@Reference
//	StatusService statusService;
//	
//	@Reference
//	AvatarGenerator avatarGenerator;
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello ConnectorRestResource!";
	}
	
	@GET
	@Path("/hello-with-auth")
	public Response helloWithAuth(@HeaderParam("Authorization") String authorization) {
		System.out.println(extractBearerToken(authorization));		
		return Response.ok(extractBearerToken(authorization)).build();
	}
	
	@POST
	@Path("/dryrun")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response dryRun(QueryRequest request) {	
		try {
			QueryResponse response = queryBEService.executeDryRun(request);
			return Response.ok(response).build();
		} catch(Exception e) {
			System.out.println("I got the Exception");
			return Response.status(400, e.getMessage()).build();
		}		
	}
	
	
	@POST
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response query(QueryRequest request) {
		try {
			QueryResponse response = queryBEService.executeQuery(request);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@POST
	@Path("/query-with-auth")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response queryWithAuth(@HeaderParam("Authorization") String authorization, QueryRequest request) {
		try {
			String token = extractBearerToken(authorization);
			if(token == null) {
				return Response.status(Status.UNAUTHORIZED).build();
			}
			QueryResponse response = queryBEService.executeQuery(request);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/status/{requestId}")
	@Produces(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response status(@PathParam("requestId") String requestId) {
		try {
			QueryResponse response = queryBEService.executeStatusRequest(requestId);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {			
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/cancel/{requestId}")
	@Produces(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response cancel(@PathParam("requestId") String requestId) {
		try {
			QueryResponse response = queryBEService.cancelRequest(requestId);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {			
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/interrupt/{requestId}")
	@Produces(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response interrupt(@PathParam("requestId") String requestId) {
		try {
			QueryResponse response = queryBEService.interruptRequest(requestId);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {			
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@GET
	@Path("public/link/{requestId}/{generate}")
	@Produces(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response publicLink(@PathParam("requestId") String requestId, @PathParam("generare") boolean generate) {
		try {
			QueryResponse response = queryBEService.publicLinkRequest(requestId, generate);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {			
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@POST
	@Path("/save-query")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response saveQuery(Query query) {
		try {
			Query response = queryBEService.saveQuery(query);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/get-query/{queryName}")
	@Produces(MediaType.APPLICATION_JSON)
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response getQuery(@PathParam("queryName") String queryName) {
		try {
			Query response = queryBEService.getQueryByName(queryName);
			return Response.ok(response).build();
		} catch(IllegalArgumentException e) {
			return Response.status(Status.BAD_REQUEST.getStatusCode(), e.getMessage()).build();
		}
	}
	
	private String extractBearerToken(String authorizationHeader) {
		if(authorizationHeader == null) return null;
		if(!authorizationHeader.startsWith("Bearer")) return null;
		return authorizationHeader.replaceFirst("Bearer ", "");
	}

}
