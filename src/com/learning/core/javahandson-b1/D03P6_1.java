package com.learning.core.day1session1;

public class D03P6_1 {

	// Custom exception for negative amount
	class NegativeAmountException extends Exception {
	    public NegativeAmountException(String message) {
	        super(message);
	    }
	}

	// Custom exception for low balance
	class LowBalanceException extends Exception {
	    public LowBalanceException(String message) {
	        super(message);
	    }
	}

	public class BankAccount {
	    private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;

	    // Constructor
	    public BankAccount(int accNo, String custName, String accType, float initialAmount) throws LowBalanceException {
	        this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        if (accType.equalsIgnoreCase("savings") && initialAmount < 1000) {
	            throw new LowBalanceException("Minimum balance for savings account is 1000");
	        } else if (accType.equalsIgnoreCase("current") && initialAmount < 5000) {
	            throw new LowBalanceException("Minimum balance for current account is 5000");
	        } else {
	            this.balance = initialAmount;
	        }
	    }

	    // Method to deposit money
	    public void deposit(float amt) throws NegativeAmountException {
	        if (amt < 0) {
	            throw new NegativeAmountException("Amount cannot be negative");
	        }
	        balance += amt;
	    }

	    // Method to get balance
	    public float getBalance() throws LowBalanceException {
	        if (balance < 1000 && accType.equalsIgnoreCase("savings")) {
	            throw new LowBalanceException("Low balance for savings account");
	        } else if (balance < 5000 && accType.equalsIgnoreCase("current")) {
	            throw new LowBalanceException("Low balance for current account");
	        } else {
	            return balance;
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            // Creating a savings account
	            BankAccount savingsAccount = new BankAccount(12345, "John Doe", "savings", 1500);
	            System.out.println("Balance in savings account: " + savingsAccount.getBalance());
	            savingsAccount.deposit(500);
	            System.out.println("New balance after deposit: " + savingsAccount.getBalance());

	            // Creating a current account
	            BankAccount currentAccount = new BankAccount(54321, "Jane Doe", "current", 6000);
	            System.out.println("Balance in current account: " + currentAccount.getBalance());
	            currentAccount.deposit(-100); // Attempting to deposit negative amount
	        } catch (LowBalanceException e) {
	            System.out.println("Low Balance Exception: " + e.getMessage());
	        } catch (NegativeAmountException e) {
	            System.out.println("Negative Amount Exception: " + e.getMessage());
	        }
	    }
	}

}
