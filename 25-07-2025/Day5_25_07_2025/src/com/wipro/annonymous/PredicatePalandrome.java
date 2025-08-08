package com.wipro.annonymous;

import java.util.function.Predicate;

public class PredicatePalandrome {

	public static void main(String[] args) {
		Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(
				new StringBuilder(s).reverse().toString());

        System.out.println(isPalindrome.test("Dood")); 
        System.out.println(isPalindrome.test("Prem")); 

	}

}
