package com.wipro.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		set.add(21);
		set.add(1);
		set.add(99);
		set.add(20);
		set.add(0);
		//set.add(null);
		
		
		
		
		System.out.println(set);
		
		
	}

}
