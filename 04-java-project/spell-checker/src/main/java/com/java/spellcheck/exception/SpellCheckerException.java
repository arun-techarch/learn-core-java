package com.java.spellcheck.exception;

public class SpellCheckerException extends Exception {
	public String message = null;
	public Exception exception = null;
	private static final long serialVersionUID = 1L;
	
	public SpellCheckerException(String message, Exception ex) {
		this.message = message;
		this.exception = ex;
	}
	
	public String getErrorMessage() {
		if(exception.getCause() != null && exception.getCause().getMessage() != null) {
			return exception.getCause().getMessage();
		} else if(exception.getMessage() != null) {
			return exception.getMessage();
		} else if(message != null) {
			return message;
		} else {
			return "Exception in code";
		}
	}

}
