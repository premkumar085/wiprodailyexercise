package com.wipro.thread;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	synchronized void deposit(double amount)
	{
		balance = balance+amount;
		
	}
	synchronized void withdraw(double amount)
	{
		balance = balance+amount;
		
	}
	
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
