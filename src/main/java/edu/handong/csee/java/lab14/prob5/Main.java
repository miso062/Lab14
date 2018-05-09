package edu.handong.csee.java.lab14.prob5;

// Insert Scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// check the code and if it does go wrong, throw catch
		try {
			// Instantiate an object of Scanner
			Scanner keyboard = new Scanner(System.in);
			// set the all string in next line to str
			String str = keyboard.nextLine();
			
			// execute the method myTest in Main
			Main.myTest(str);
		}catch (MyException e) { // When exception thrown, implement.
			System.out.println("Inside catch block: " + e);
		}
	}

	// method that check string. if the string were null, print out the error sentence.
	static void myTest(String str) throws MyException {
		
		// if the string is null
		if(str.equals("null"))
			// print out MyException sentence
			throw new MyException("String val is null");
		else // if the string is not null
			// print out the string!
			System.out.println("String val is: " + str);
	}
}
