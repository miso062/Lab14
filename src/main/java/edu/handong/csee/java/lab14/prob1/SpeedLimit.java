package edu.handong.csee.java.lab14.prob1;

// Insert Random and Scanner
import java.util.Random;
import java.util.Scanner;

public class SpeedLimit {

	// define class private variable
	private int speedLimit; // the speed limit
	private int currentSpeed; // the current speed
	
	// method that compare for the two variable(currentSpeed and seepLimit) and print out the proper outcome. 
	public void warnSpeedLimit() {
	
		// check the code and if it does go wrong, throw catch
		try {
			// Compare values of two variables
			if(this.currentSpeed > this.speedLimit)
				// If currentSpeed is larger, do it(throw to catch and print out the statement).
				throw new Exception ("Speed Limit " + this.speedLimit + "km exceeded!");
			System.out.println("You are a low abiding citizen!");
		}catch(Exception e) { // When exception thrown, implement.
			System.out.println(e.getMessage());
			System.out.println("You are being fined.");
		}
		
		// print out current speed!
		System.out.println("Your current speed: " + this.currentSpeed);
		
	}
	
	// method for running a program
	public void runSpeedLimit() {
		
		// Create an object of the Scanner and Random
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		// Get speed limit number from user
		System.out.print("Set the speed limit, officer: ");
		// Insert the entered number in speedLimit
		speedLimit = keyboard.nextInt();
		// Insert a random number between 0 to 100 in currentSpeed
		currentSpeed = random.nextInt(101);
		
		// execute method warnSpeedLimit!
		warnSpeedLimit();
		
	}


}
