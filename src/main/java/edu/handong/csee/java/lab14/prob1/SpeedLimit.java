package edu.handong.csee.java.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class SpeedLimit {

	private int speedLimit;
	private int currentSpeed;
	
	public void warnSpeedLimit() {
	
		try {
			if(this.currentSpeed > this.speedLimit)
				throw new Exception ("Speed Limit " + this.speedLimit + "km exceeded!");
				System.out.println("You are a low abiding citizen!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined.");
			
		}System.out.println("Your current speed: " + this.currentSpeed);
		
	}
	
	public void runSpeedLimit() {
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Set the speed limit, officer: ");
		speedLimit = keyboard.nextInt();
		currentSpeed = random.nextInt(100);
		
		warnSpeedLimit();
		
	}


}
