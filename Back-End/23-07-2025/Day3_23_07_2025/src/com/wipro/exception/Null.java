package com.wipro.exception;

public class Null {
	public static void main(String[] args) {
		String fName = null;

        try {
            System.out.println(fName.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: fName is null!");
        }

        System.out.println("Program continues...");
	}

}
