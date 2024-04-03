package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P3_4 {
	public static void main(String args[]) {
		int marksPercentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage from 0% to 100%");
		marksPercentage = sc.nextInt();
		sc.close();
		if (marksPercentage < 35) {
			System.out.println("Fail");
		} else if (marksPercentage >= 35 && marksPercentage < 45) {
			System.out.println("C Grade");
		} else if (marksPercentage >= 45 && marksPercentage < 60) {
			System.out.println("B Grade");
		} else if (marksPercentage >= 60 && marksPercentage < 100) {
			System.out.println("A Grade");
		} else
			System.out.println("Invalid user input please enter valid input");
		{

		}

	}

}
