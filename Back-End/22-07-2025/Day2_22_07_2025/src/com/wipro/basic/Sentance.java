package com.wipro.basic;

public class Sentance {

	public static void main(String[] args) {
		String str = "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase";

        String[] words = str.split(" ");
        String shortest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }

        System.out.println("Shortest word: " + shortest);

	}

}
