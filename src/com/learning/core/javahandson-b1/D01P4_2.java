package com.learning.core.day1session1;

public class D01P4_2 {
	    public static void main(String[] args) {
	        // Create the integer array with 18 elements
	        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

	        // Compute the sum of elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;
	        

	        // Compute the average of all numbers and store it at element 16
	        double average = (double) sum / 18;
	        A[16] = (int) Math.round(average);

	        // Identify the smallest value from the array and store it at element 17
	        int smallest = A[0];
	        for (int i = 1; i < A.length; i++) {
	            if (A[i] < smallest) {
	                smallest = A[i];
	            }
	        }
	        A[17] = smallest;

	        // Print the updated array
	        System.out.println("Array after computations:");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	    }
	}



