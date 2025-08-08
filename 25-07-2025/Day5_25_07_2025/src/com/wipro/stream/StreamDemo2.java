package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,7,1,6,8);
		Long cnt = list
		.stream()
		.distinct()
		.filter(i->i%2==0)
		.count();
		
		System.out.println(cnt);

	}

}
