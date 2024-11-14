package com.src.Abstraction;

public abstract class Bank {
	
	public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void info() {
        System.out.println("All banks offer common services like deposit, withdrawal, and checking balance.");
    }

}
