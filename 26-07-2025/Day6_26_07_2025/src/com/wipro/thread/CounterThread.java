package com.wipro.thread;

public class CounterThread extends Thread {
    Counter counter;
    
    public CounterThread(Counter counter) {
		super();
		this.counter = counter;
	}

	public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
