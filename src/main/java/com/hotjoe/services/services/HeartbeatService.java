package com.hotjoe.services.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/heartbeat")
public class HeartbeatService {

	@GET
    @Produces({ MediaType.TEXT_PLAIN })
	public Response getHeartBeat() {
		return Response.ok("OK").build();
	}
}