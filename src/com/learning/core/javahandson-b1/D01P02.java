package com.learning.core.day1session1;

public interface D01P02 {
	void displayLabel();

	class Tablet implements D01P02 {
		@Override
		public void displayLabel() {
			System.out.println("Store in a cool dry place");
		}
	}
	class Syrup implements D01P02 {

		@Override
		public void displayLabel() {
			System.out.println("For consumable only on prescription");
		}
	}
	class Ointment implements D01P02 {
		@Override
		public void displayLabel() {
			System.out.println("For external use only");
		}
	}
	public class TestClass {
	public static void main(String argd[]) {
		D01P02 tablet = new Tablet();
		D01P02 syrup = new Syrup();
		D01P02 ointment = new Ointment();
		
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
		
	}
}
	
}
