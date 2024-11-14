package com.src.Abstraction;

public class CurrentBank extends Bank {
	
	private double balance;

    public CurrentBank(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Bank. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Bank. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Bank.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}


