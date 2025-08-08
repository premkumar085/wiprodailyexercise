package com.wipro.oops.test;

import com.wipro.oops.BankOps;
import com.wipro.oops.Citi;
import com.wipro.oops.HDFC;

public class BankTest {

	public static void main(String[] args) {
		BankOps hdfc = new HDFC();
        BankOps citi = new Citi();

        hdfc.deposit(500, "HDFC123");
        hdfc.withdraw(300, "HDFC123");

        citi.deposit(1000, "CITI456");
        citi.withdraw(1500, "CITI456");

	}

}
