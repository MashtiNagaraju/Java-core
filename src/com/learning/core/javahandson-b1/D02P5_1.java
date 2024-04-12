package com.learning.core.day1session1;

import java.util.Scanner;

public class D02P5_1 {

//	public class StringOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		// Display length of the string
		int length = inputString.length();
		System.out.println("Length of the string: " + length);

		// Convert to uppercase
		String uppercaseString = inputString.toUpperCase();
		System.out.println("Uppercase string: " + uppercaseString);

		// Check for palindrome
		boolean isPalindrome = isPalindrome(inputString);
		if (isPalindrome)
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");

		scanner.close();
	}

	// Method to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
