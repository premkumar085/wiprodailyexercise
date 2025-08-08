package com.wipro.thread;

import java.util.concurrent.*;
import java.util.*;

public class CallableTask {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> futureList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Callable<String> task = () -> {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Task " + taskId + " - Number: " + j);
                    Thread.sleep(1000);
                }
                return "Task " + taskId + " Completed";
            };
            Future<String> future = executor.submit(task);
            futureList.add(future);
        }

        for (Future<String> future : futureList) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
