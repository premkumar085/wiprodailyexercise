package com.wipro.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Deque<String> persons = new LinkedList<>();
		persons.offer("Perm");
		persons.offer("John");
		persons.offer("Sai");
		persons.offer("Vijay");
		persons.offerFirst("Nani");
		persons.offer(null);
		persons.removeLast();
		
		
		
		System.out.println(persons);
		persons.remove();
		

		



		

	}

}
