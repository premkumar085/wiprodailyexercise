package com.wipro.thread;

public class BankThreadDemo {

	public static void main(String[] args) {
		BankAccount bnk = new BankAccount("Acc01",1000);
		Thread t1 = new BankThread(bnk,true,1000);
		Thread t2 = new BankThread(bnk,false,500);
		Thread t3 = new BankThread(bnk,true,500);
		t1.start();
		
		
		System.out.println(bnk.getBalance());

		

	}

}
