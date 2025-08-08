package com.wipro.oops;

public class Converter {
	int convert(int a) {
        System.out.println("Converting single int: " + a);
        return a * 2;
    }

    int convert(int a, int b) {
        System.out.println("Converting two ints: " + a + ", " + b);
        return a + b;
    }

    double convert(double a) {
        System.out.println("Converting double: " + a);
        return a / 2;

}}
