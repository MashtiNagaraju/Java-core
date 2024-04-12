package com.learning.core.day1session1;

import java.util.*;

public class D02P5_8 {

//	public class SplitIntoFourDistinctStrings {

	    static boolean canSplitIntoFourDistinctStrings(String s) {
	        int n = s.length();

	        // Iterate through all possible splitting points
	        for (int i = 1; i < n - 2; i++) {
	            for (int j = i + 1; j < n - 1; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    // Get substrings
	                    String first = s.substring(0, i);
	                    String second = s.substring(i, j);
	                    String third = s.substring(j, k);
	                    String fourth = s.substring(k);

	                    // Check if all substrings are distinct
	                    if (areDistinct(first, second, third, fourth)) {
	                        return true;
	                    }
	                }
	            }
	        }

	        return false;
	    }

	    static boolean areDistinct(String... strings) {
	        Set<String> set = new HashSet<>();
	        for (String str : strings) {
	            if (!set.add(str)) {
	                return false; // If any string is not distinct, return false
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the string: ");
	        String input = scanner.nextLine();

	        boolean canSplit = canSplitIntoFourDistinctStrings(input);

	        if (canSplit) {
	            System.out.println("The given string can be split into four distinct strings.");
	        } else {
	            System.out.println("The given string cannot be split into four distinct strings.");
	        }

	        scanner.close();
	    }
	}
