package com.kenneth;

import java.util.Scanner;

/**
 * @author Kenneth Hudson
 * 02/09/2024
 * A program that will calculate the number of cupcakes left over in a class of 28
 */

public class CupcakeParty {
	
	/**
	 * Main Method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		int classStudents = 28;
		int reg = 0;
		int sml = 0;
		
		Scanner input = new Scanner(System.in);
		
		// Takes user input of the total of regular boxes
		System.out.println("Enter the amount of regular boxes");
		System.out.println("> ");
		reg = input.nextInt();
		
		// Takes user input of the total of small boxes
		System.out.println("Enter the amount of small boxes");
		System.out.println("> ");
		sml = input.nextInt();
		
		// Calculate total amount of cupcakes and subtract the amount by the number of students 
		int totalCupcakes = reg * 8 + sml * 3;
		int cupcakesRemain = totalCupcakes - classStudents;
		
		
		// Returns the total cupcakes remaining
		String cupcakeMessage = calculateCupcakes(cupcakesRemain);
		System.out.println(cupcakeMessage);	
	}
	
	/**
	 * Generates the message returning the number of cupcakes left
	 * @param cupcakesRemain Calculates the total amount of cupcakes remaining
	 * @return The total amount of remaining cupcakes
	 */
	public static String calculateCupcakes(int cupcakesRemain) {
		return "There will be a total of " + cupcakesRemain + " cupcakes remaining.";
	}

}