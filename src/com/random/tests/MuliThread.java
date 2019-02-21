package com.random.tests;

public class MuliThread {
    public static void main(String[] args) throws InterruptedException {
        int n = 12;
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultiThreadDemo());
            object.start();
            object.sleep(2000);

        }
    }
}
