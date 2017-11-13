package com.student.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.student.response.ErrorResponse;

public abstract class BaseWebApplicationException extends WebApplicationException{

	private final int status;
	private final String errorMessage;
	private final String developerMessage;
	public BaseWebApplicationException(int status, String errorMessage, String developerMessage) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
	}
	
	@Override
	public Response getResponse() {
		return Response.status(status).type(MediaType.APPLICATION_JSON_TYPE).entity(getErrorResponse()).build();
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return errorMessage;
	}
	
	public ErrorResponse getErrorResponse() {
		ErrorResponse response = new ErrorResponse();
		response.setApplicationMessage(developerMessage);
		response.setConsumerMessage(errorMessage);
		return response;
	}
}
