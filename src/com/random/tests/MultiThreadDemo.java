package com.random.tests;

public class MultiThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running...");
        System.out.println("The number of active threads is: " + Thread.activeCount());
        System.out.println(Thread.MAX_PRIORITY);
    }
}
