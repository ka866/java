package com.src.Abstraction;

public class Main {
	
	    public static void main(String[] args) {
	        Bank savings = new SavingsBank(500.0);
	        Bank current = new CurrentBank(1000.0);

	        savings.info();
	        savings.deposit(200.0);
	        savings.withdraw(150.0);
	        System.out.println("Savings Balance: " + savings.getBalance());

	        current.info();
	        current.deposit(500.0);
	        current.withdraw(300.0);
	        System.out.println("Current Balance: " + current.getBalance());
	    }

}
