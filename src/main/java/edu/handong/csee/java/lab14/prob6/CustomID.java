package edu.handong.csee.java.lab14.prob6;

public class CustomID {
	
	// define class private variable
	private String[] races = new String[] {"Vucans","Romulan","Klingons"}; // array for the race's kind
	private String name = ""; // string variable for name
	private String race = ""; // string variable for race
	private int age = 0; // integer variable for age
	private int state = 0; // integer variable for state

	// method that set name. if the name were too short, print out the error sentence
	public void set_name(String str) throws Exception{
		
		// if the str length is smaller than 5
		if(str.length() < 5) {
			// maintain the state value
			state = 0;
			// print out the error sentence
			throw new Exception("Your name is short! Try again!");
		}
		else { // if the str length is same or bigger than 5
			// Insert the str in name
			this.name = str;
			// print sentence representing the name is valid and name
			System.out.println("Name is valid");
			System.out.println("Name: " + this.name);
			// add 1 to state
			state++;
		}
	}
	
	public void set_age(int num) throws Exception {
		
		// if the num is smaller than 18
		if (num < 18) {
			// maintain the state value
			state = 1;
			// print out the error sentence
			throw new Exception("You are too young! Try again!");
		}
		else { // if the num is same or bigger than 18
			// Insert the num in age
			this.age = num;
			// print sentence representing the age is valid and age
			System.out.println("Age is valid");
			System.out.println("Age: " + this.age);
			// add 1 to state
			state++;
		}
	}
		
	public void set_race(String race) throws Exception {
		
		// check races array's value
		for(int i = 0; i < races.length; i++)
		{
			// if the races[i] value is same race,
			if(races[i].equals(race)) {
				// Insert the race[i] in race
				this.race = races[i];
				// print sentence representing the race is valid and race
				System.out.println("Race is valid");
				System.out.println("Race: " + races[i]);
				// reset the state
				state = 0;
				
				// return the method
				return;
			}
		}
		
		// set the state to 2
		state = 2;
		// print sentence representing the age is valid and age
		throw new Exception("Human! Try again.");
	}
	
	// method that get the state variable's value!
	public int getState() {
		
		return state;
	}
}
