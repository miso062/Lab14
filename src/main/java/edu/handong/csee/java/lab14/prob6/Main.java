package edu.handong.csee.java.lab14.prob6;

// Insert Random and Scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// define main variable
		String name, race; // String variable for name and race
		int age = 0; // integer variable for age
		boolean repeat = true; // boolean variable for check the repeat
		
		// Instantiate an object of Scanner and class CustomID
		Scanner keyboard = new Scanner(System.in);
		CustomID customId = new CustomID();
		
		// if repeat false, escape the roof statement.
		while(repeat){
			
			// check the code and if it does go wrong, throw catch
			try {
				// if the customID's state were 0, execute under code. 
				if(customId.getState() == 0) {
					// get the name from user
					System.out.print("Enter your name: ");
					// Insert the entered string in name
					name = keyboard.nextLine();
					// use customID's method set_name to put the entered name!
					customId.set_name(name);
				}
				// if the customID's state were 1, execute under code.
				else if(customId.getState() == 1) {
					// get the age from user
					System.out.print("Enter your age: ");
					// Insert the entered number in age
					age = keyboard.nextInt(); keyboard.nextLine();
					// use customID's method set_age to put the entered age!
					customId.set_age(age);
				}
				// if the customID's state were 2, execute under code.
				else if(customId.getState() == 2) {
					// get the race from user
					System.out.print("Enter your race: ");
					// Insert the entered string in race
					race = keyboard.nextLine();
					// use customID's method set_race to put the entered race!
					customId.set_race(race);
				}
			}catch (Exception e) { // When exception thrown, implement.
				// print out the error message
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
