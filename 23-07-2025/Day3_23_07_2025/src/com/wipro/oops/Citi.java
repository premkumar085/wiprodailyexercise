package com.wipro.oops;

public class Citi implements BankOps {
	double balance = 2000;

	@Override
	public void deposit(double amount, String accNumber) {
		balance += amount;
        System.out.println("HDFC: Deposited " + amount + ", Balance: " + balance);
		
	}

	@Override
	public double withdraw(double amount, String accNumber) {
		if (amount <= balance) {
            balance -= amount;
            System.out.println("Citi: Withdrawn " + amount + ", Balance: " + balance);
            return amount;
        } else {
            System.out.println("Citi: Insufficient funds!");
            return 0;
	}}

}
