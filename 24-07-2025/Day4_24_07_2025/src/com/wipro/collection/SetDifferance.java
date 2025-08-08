package com.wipro.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDifferance {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(null);

       
        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

       
        Set<Integer> difference = new TreeSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
	}

}
