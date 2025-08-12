package com.wipro.stream;

import java.util.Optional;

public class OptionalInt {

	public static void main(String[] args) {
		 Optional<Integer> num = Optional.of(50);
		 if(num.isPresent()) {
				System.out.println("it's Present");
			}else {
				
			}
		 
	     Optional<String> str = Optional.ofNullable(null);
	     System.out.println(str.orElse("Default Value"));

	}

}
