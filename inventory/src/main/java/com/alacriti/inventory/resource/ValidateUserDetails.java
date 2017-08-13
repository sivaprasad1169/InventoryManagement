package com.alacriti.inventory.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alacriti.inventory.delegate.ValidateUserDetailsDelegate;
import com.alacriti.inventory.models.LoginDetailsModel;
import com.alacriti.inventory.models.ValidationModel;


@Path("/")
public class ValidateUserDetails {
	
	ValidateUserDetailsDelegate userDetailsDelegate=new ValidateUserDetailsDelegate();
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("Validate")
	public ValidationModel validateUser(LoginDetailsModel p)
	{
		return userDetailsDelegate.ValidateUserDetails(p);
	}
	
	
	
	
	
	
	
	 
	
	
	
		
}


