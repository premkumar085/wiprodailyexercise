package com.wipro.annonymous;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest
{

	public static void main(String[] args) {
		
		Function<String,Integer> fn = s -> {return s.length();};
		
		System.out.println(fn.apply("Prem"));
		
		Function<String,String> fn1 = s -> {return s.toUpperCase();};
		System.out.println(fn1.apply("Prem"));
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		Function<List<Integer>,Integer> doSum = list ->{
			int sum = 0;
			for(int n:list) {
				sum = sum+n;
				
			}
			return sum;
		};
		
		int sumVal = doSum.apply(numList);
		System.out.println(sumVal);

	}

}
