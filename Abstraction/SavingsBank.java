package com.src.Abstraction;

public class SavingsBank extends Bank{
	
	    private double balance;

	    public SavingsBank(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + " to Savings Bank. New balance: " + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew " + amount + " from Savings Bank. New balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds in Savings Bank.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	

}
