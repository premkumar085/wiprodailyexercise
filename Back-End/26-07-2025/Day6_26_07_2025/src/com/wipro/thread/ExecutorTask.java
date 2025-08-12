package com.wipro.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorTask {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Callable<String> task = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            return threadName + " finished";
        };

        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            futures.add(executor.submit(task));
        }

        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

