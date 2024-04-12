package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number (1-12): ");

		int monthNumber = scanner.nextInt();

		scanner.close();

		if (monthNumber >= 1 && monthNumber <= 12) {
			String month = getMonthName(monthNumber);
			System.out.println("The month corresponding to " + monthNumber + " is " + month);
		} else {
			System.out.println("Invalid input");
		}
	}

	public static String getMonthName(int monthNumber) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		return months[monthNumber - 1];
	}
}

