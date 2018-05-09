package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	
	// define class private array and variable
	private static int [] arr = new int[5]; // five index integer array
	private int currentIndex = 0; // variable representing the current index
	
	// method that get number and put the array. if the array were full, print out the error sentence. 
	public void receive(int n) throws ArrayIndexOutOfBoundsException {
		
		// set the current index of array to n
		arr[currentIndex] = n;
		// add 1 to currentIndex
		currentIndex++;
		
		// print out the current array and array value
		System.out.printf("arr[%d] <- %d", currentIndex, n);
	}

}
