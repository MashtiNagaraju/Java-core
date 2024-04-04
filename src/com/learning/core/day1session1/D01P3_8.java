package com.learning.core.day1session1;

import java.util.HashSet;

public class D01P3_8 {

//	public class FirstRepeatingElement {
	    public static int findFirstRepeatingElement(int[] arr) {
	        HashSet<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            if (!set.add(num)) {
	                return num;
	            }
	        }

	        return -1; // If no repeating elements found
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 3, 4, 5, 3, 10};
	        int firstRepeatingElement = findFirstRepeatingElement(arr);
	        if (firstRepeatingElement != -1) {
	            System.out.println("The first repeating element is: " + firstRepeatingElement);
	        } else {
	            System.out.println("No repeating elements found.");
	        }
	    }
	}

	
