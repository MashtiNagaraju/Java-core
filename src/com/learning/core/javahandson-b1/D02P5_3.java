package com.learning.core.day1session1;

public class D02P5_3 {
//	public class SubsequencePrinter {
	public static void printSubsequences(String str) {
		printSubsequencesHelper(str, "");
	}

	private static void printSubsequencesHelper(String remaining, String current) {
		if (remaining.length() == 0) {
			System.out.println(current);
			return;
		}

		// Exclude the first character of remaining and recur for the rest
		printSubsequencesHelper(remaining.substring(1), current);

		// Include the first character of remaining and recur for the rest
		printSubsequencesHelper(remaining.substring(1), current + remaining.charAt(0));
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("Subsequences of '" + str + "':");
		printSubsequences(str);
	}
}
