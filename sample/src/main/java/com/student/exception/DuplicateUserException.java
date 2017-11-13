package com.student.exception;

public class DuplicateUserException extends BaseWebApplicationException{

	public DuplicateUserException() {
		super(409, "User already exists", "An attempt was made to create a user that already exist");
		// TODO Auto-generated constructor stub
	}
	

}
