package com.wipro.collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		
		Queue<Integer> line = new PriorityQueue<>();
		line.add(12);
		line.add(23);
		line.add(42);
		line.add(52);
		line.add(62);
		line.add(1);
		System.out.println(line);
		line.add(75);
		System.out.println(line);
		line.add(10);
		System.out.println(line);
		
		
	}

}
