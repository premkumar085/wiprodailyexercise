package com.wipro.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> books = new Vector<>();
		books.add("Physics");
		books.add("Maths");
		books.add("Social");
		books.add("Psychology");
		System.out.println(books.get(0));

	}

}
