package com.wipro.oops;

public class Bird extends Animal {
	Bird(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says Tweet!");
    }

}
