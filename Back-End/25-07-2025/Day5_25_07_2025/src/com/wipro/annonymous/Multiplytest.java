package com.wipro.annonymous;

public class Multiplytest {

	public static void main(String[] args) {
		Multiply m = (a, b) -> a * b;
		
        int ans = m.multiply(10, 20);
        System.out.println("Result: " + ans);

	}

}
