package com.wipro.oops;

public class Human extends Animal {
	 Human(String name) {
	        super(name);
	    }

	    void makeSound() {
	        System.out.println(name + " says Hello!");
	    }
}
