package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P3_5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a number
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        
	        // Calculate factorial
	        long factorial = calculateFactorial(number);
	        
	        // Print the factorial
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        
	        scanner.close();
	    }

	    // Method to calculate factorial
	    public static long calculateFactorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
	        }
	        
	        long factorial = 1;
	        
	        // Multiply the factorial by each number from 1 to n
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        
	        return factorial;
	    }
	}
