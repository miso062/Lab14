package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	
	//  method that get two variable, return long variable and throws two exceptions.  
	public long power(int n, int p) throws Exception{
	
		// define long variable for result.
		long result;
		
		// set the result to n^p
		result = (long)Math.pow(n, p);
		
		if(n < 0 || p < 0) // if n or p is negative
			// throw exception
			throw new Exception("n or p shold not be negative.");
		if(n == 0 && p == 0) // if n and p zero
			// throw exception
			throw new Exception("n and p should not be zero.");
		
		// return the long cariable result
		return result;
	}
	
	

}
