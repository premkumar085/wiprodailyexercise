package com.wipro.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(12,56,78,99,43);
		
		List <Integer> l= list
		.stream()
		.filter(i->i%2==0)
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(l);
		
		
		
	}

}
