package com.learning.core.day1session1;
import java.util.Scanner;
public class D01P3_6 {
	

	
	    public static void main(String[] args) {
	        // Create Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter two numbers in the range from 1 to 40
	        System.out.print("Enter two numbers in the range from 1 to 40 separated by space: ");
	        int number1 = scanner.nextInt();
	        int number2 = scanner.nextInt();

	        // Define the dimension array of five integer elements ranging in value from 1 to 40
	        int[] array = {7, 25, 5, 19, 30};

	        // Check if both the inputted values are found in the array elements
	        boolean bingo = false;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == number1 && array[i] == number2) {
	                bingo = true;
	            }
	        }

	        // Print the result
	        if (bingo) {
	            System.out.println("Bingo");
	        } else {
	            System.out.println("Not found");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}



