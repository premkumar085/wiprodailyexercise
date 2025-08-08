package com.wipro.annonymous;

public class SavingandCurrentsAccount implements BankOps {
	public static void main(String[] args) {
		BankOps savings = new BankOps() {
            public void deposit(double amount) {
                System.out.println("Savings Account:" + amount);
            }
        };

        BankOps current = new BankOps() {
            public void deposit(double amount) {
                System.out.println("Current Account:" + amount);
            }
        };

        savings.deposit(1000);
        current.deposit(2000);
       
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

}
