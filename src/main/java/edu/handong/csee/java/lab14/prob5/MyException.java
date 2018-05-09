package edu.handong.csee.java.lab14.prob5;

// class that inherits Exception
public class MyException extends Exception {
	
	// define the private string variable and initiate null!
	private String message = null;

	// inherits the method MyExeception!
	public MyException() {
		super();
	}
	
	// method that get message, set the message for the error message!
	// inherits the method MyExeception!
	public MyException(String message) {
		super(message);
		this.message = message;
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}
	
	// method to print the received error message
	public String toString() {
		return message;
	}
}
