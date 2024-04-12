package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P3_2 {

	public static void main(String[] args) {
		// Create Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number representing the day of the week
		System.out.print("Enter a number (1-7): ");

		// Read the input
		int dayNumber = sc.nextInt();

		// Close the scanner
		 sc.close();

		if (dayNumber == 1) {
			System.out.println("Monday");
		} else if (dayNumber == 2) {
			System.out.println("Tuesday");
		} else if (dayNumber == 3) {
			System.out.println("Wednesday");
		} else if (dayNumber == 4) {
			System.out.println("Thursday");
		} else if (dayNumber == 5) {
			System.out.println("Friday");
		} else if (dayNumber == 6) {
			System.out.println("Saturday");
		} else if (dayNumber == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 7.");
		}
	}
}
