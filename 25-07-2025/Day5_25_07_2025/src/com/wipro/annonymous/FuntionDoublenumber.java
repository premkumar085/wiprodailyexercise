package com.wipro.annonymous;

import java.util.function.Function;

public class FuntionDoublenumber {

	public static void main(String[] args) {
		Function<Double, String> frac = n -> String.format("%.2f", n % 1);
        System.out.println(frac.apply(99.67));

	}

}
