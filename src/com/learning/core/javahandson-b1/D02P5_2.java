package com.learning.core.day1session1;

import java.util.Scanner;

public class D02P5_2 {

//	public class LastNVowelsCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		// Input n
		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		// Count the last n vowels
		int vowelCount = countLastNVowels(inputString, n);

		// Check if vowel count is less than n
		if (vowelCount < n) {
			System.out.println("Mismatch in vowel count");
		} else {
			System.out.println("Number of last " + n + " vowels: " + vowelCount);
		}

		scanner.close();
	}

	// Method to count the last n vowels in a string
	public static int countLastNVowels(String str, int n) {
		int count = 0;
		for (int i = str.length() - 1; i >= 0 && n > 0; i--) {
			char ch = Character.toLowerCase(str.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				n--;
			}
		}
		return count;
	}
}
