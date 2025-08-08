package com.wipro.thread;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class NameProcessor {
    public static void main(String[] args) throws InterruptedException {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta", "Esha", "Kunal", "Omkar", "Neha"));

        Runnable capitalizeVowels = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char firstChar = Character.toLowerCase(name.charAt(0));
                if ("aeiou".indexOf(firstChar) != -1) {
                    names.set(i, name.toUpperCase());
                }
            }
        };

        Runnable lowercaseConsonants = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char firstChar = Character.toLowerCase(name.charAt(0));
                if ("aeiou".indexOf(firstChar) == -1) {
                    names.set(i, name.toLowerCase());
                }
            }
        };

        Thread thread1 = new Thread(capitalizeVowels);
        Thread thread2 = new Thread(lowercaseConsonants);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final List:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

