package com.wipro.thread;

public class ThreadNA {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        numberThread.start();   
        alphabetThread.start(); 
    }
}

