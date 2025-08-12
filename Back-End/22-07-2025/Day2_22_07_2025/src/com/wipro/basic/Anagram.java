package com.wipro.basic;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String a = "listen";
        String b = "silent";

        int[] arr1 = a.chars().sorted().toArray();
        int[] arr2 = b.chars().sorted().toArray();

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

	}

}
