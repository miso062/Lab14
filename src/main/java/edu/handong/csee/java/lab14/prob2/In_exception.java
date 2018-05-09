package edu.handong.csee.java.lab14.prob2;

//Insert InputMismatchException and Scanner
import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	
	// define class private variable x and y
	private int x, y;
	
	// method that check the division error.
	public void checkError() {
		
		// check the code and if it does go wrong, throw catch
		try {
			// Create an object of the Scanner and Random
			Scanner keyboard = new Scanner(System.in);
			
			// Get x from user.
			System.out.print("x: ");
			// Insert the entered number in x
			x = keyboard.nextInt();
			
			// Get y form user.
			System.out.print("y: ");
			// Insert the entered number in y
			y = keyboard.nextInt();
			
			// print out the result of division
			System.out.println(this.x/this.y);
			
		}catch(InputMismatchException e) { // if InputMismatchExcption exception occurs, execute it.
			System.out.println("java.util.InputMismatchException");			
		}catch(ArithmeticException e) { // if ArithmeticException exception occurs, execute it.
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
		}catch(Exception e) { // if another exception occurs, execute it.
			System.out.println(e.getMessage());
		}
		
	}

}
