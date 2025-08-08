package com.wipro.thread;

import java.util.List;

public class ConsonantLowercaser implements Runnable {
    private final List<String> names;

    public ConsonantLowercaser(List<String> names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            char firstChar = Character.toLowerCase(name.charAt(0));
            if ("aeiou".indexOf(firstChar) == -1) {
                names.set(i, name.toLowerCase());
            }
        }
    }
}

