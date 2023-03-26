package com.jwt.db.exception;

public class UserFoundException extends Exception{
	

	private static final long serialVersionUID = 1L;

	public UserFoundException() {
		super("User is already there in the DB !!");
	}
	
	public UserFoundException(String msg) {
		super(msg);
	}

}
