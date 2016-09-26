package com.bvkprasad.messenger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bvkprasad.messenger.bean.User;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "it works";
	}
	@GET
	@Path("/user")
	public User getUser(){
		return new Service().getUser();
	}
	
}
