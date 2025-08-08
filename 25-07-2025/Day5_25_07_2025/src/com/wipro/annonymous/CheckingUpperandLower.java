package com.wipro.annonymous;

import java.util.function.Predicate;

public class CheckingUpperandLower {

	public static void main(String[] args) {
		Predicate<String> isUpper = s -> s.equals(s.toUpperCase());
        Predicate<String> isLower = s -> s.equals(s.toLowerCase());
        
        System.out.println(isUpper.test("PREM"));
        System.out.println(isUpper.test("prem"));
        System.out.println(isLower.test("prem"));
        System.out.println(isLower.test("Prem"));
        

	}

}
