package com.wipro.thread;

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

