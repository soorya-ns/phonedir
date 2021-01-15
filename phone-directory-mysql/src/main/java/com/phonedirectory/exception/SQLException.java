package com.phonedirectory.exception;

public class SQLException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3839048802231795819L;

	private String message;

	public SQLException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
