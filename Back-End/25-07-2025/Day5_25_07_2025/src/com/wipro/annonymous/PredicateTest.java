package com.wipro.annonymous;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> p = n-> n%2==0?true:false;
		System.out.println(p.test(15));
		
		Predicate<Integer> adultCheck =n -> n>=18 ?true:false;
		System.out.println(adultCheck.test(16));

	};
	

}
