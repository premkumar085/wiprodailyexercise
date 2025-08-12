package com.wipro.thread;

public class BankThread extends Thread{
	
	BankAccount account;
	boolean withDrawFlag = false;
	double amount;
	public BankThread(BankAccount account, boolean withDrawFlag, double amount) {
		super();
		this.account = account;
		this.withDrawFlag = withDrawFlag;
		this.amount = amount;
	}
	
	public void run() {
		if(withDrawFlag==true) {
			account.withdraw(amount);
		}
	}
	

}
