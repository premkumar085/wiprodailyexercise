package com.wipro.collection;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("Physics");
		books.push("Maths");
		books.push("Social");
		books.push("Psychology");
		books.pop();
		
		System.out.println(books.peek());

		

	}

}
