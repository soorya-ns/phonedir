package com.phonedirectory.exception;

public class DatabaseSQLException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3839048802231795819L;

	private String message;
	private String description;

	public DatabaseSQLException(String message) {
		this.message = message;
	}
	public DatabaseSQLException(String message, String description) {
		this.message = message;
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
