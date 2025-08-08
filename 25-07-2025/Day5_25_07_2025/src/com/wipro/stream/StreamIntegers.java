package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegers {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 30);

	        double avg = 0;

	        var optionalAvg = list.stream()
	                .distinct()
	                .collect(Collectors.averagingInt(i -> i));

	        avg = optionalAvg;

	        System.out.println(avg);
		

	}

}
