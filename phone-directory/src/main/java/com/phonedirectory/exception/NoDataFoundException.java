package com.phonedirectory.exception;

public class NoDataFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3184568514436349302L;
	private String message;

	public NoDataFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
