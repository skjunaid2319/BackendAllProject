package com.tw.flowcontrol;

public class DecisionMakingTest {

	public static void main(String[] args) {
		
		DecisionMakingTest obj1=new DecisionMakingTest();
		
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		 

		
		
		
		

	}

}
