package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FuntionListOfStrings {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");

	        Function<List<String>, List<Integer>> getLengths = list -> {
	            List<Integer> lengths = new ArrayList<>();
	            for (String s : list) {
	                lengths.add(s.length());
	            }
	            return lengths;
	        };

	        System.out.println(getLengths.apply(names)); 

	}

}
