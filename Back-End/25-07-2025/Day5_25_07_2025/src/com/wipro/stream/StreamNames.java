package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Janaki", "John", "Prem", "Afroj", "jagan");


        names = names.stream()
                      .filter(n -> n.toLowerCase().contains("ja"))
                      .collect(Collectors.toList());
        System.out.println(names);

	}

}
