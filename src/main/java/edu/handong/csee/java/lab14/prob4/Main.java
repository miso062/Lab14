package edu.handong.csee.java.lab14.prob4;

// Insert Scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate an object of Scanner and class Boundary
		Scanner keyboard = new Scanner(System.in);
		Boundary boundary = new Boundary();
		
		// define main variable
		int number;
		boolean repeat = true;
		
		// if repeat false, escape the roof statement.
		while(repeat) {
			
			// check the code and if it does go wrong, throw catch
			try {
				// get one integer from user.
				System.out.print("Enter an integer: ");
				// Insert the entered number in number
				number = keyboard.nextInt();
				// execute method receive, put the number to array!
				boundary.receive(number);
			}catch (ArrayIndexOutOfBoundsException e) {
				// print out the error sentence representing full all array index
				System.out.println("Invalid array indext access!");
				// change repeat true to false
				repeat = false;
			}
		}

	}

}
