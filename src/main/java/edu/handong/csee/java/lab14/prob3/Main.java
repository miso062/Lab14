package edu.handong.csee.java.lab14.prob3;

// Insert Random and Scanner
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// define two variable
		int n,p;
		
		// Instantiate an object of class Powercalc
		Powercalc my_calculator = new Powercalc();
		// Instantiate an object of Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// If there is a value that is entered, execute the roof sentence.
		while(keyboard.hasNextInt()) {
			
			// set the first entered value to n
			n = keyboard.nextInt();
			// set the second entered value to p
			p = keyboard.nextInt();
		
			// check the code and if it does go wrong, throw catch
			try {
				// execute method power and print out the result!
				System.out.println(my_calculator.power(n,p));
			} catch(Exception e) { // When exception thrown, implement.
				// print out the error sentence.
				System.out.println(e);
			}
		}
	}
}
