package com.wipro.oops;

public abstract class Animal {
	String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    abstract void makeSound();

}
