package com.java.multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Running From 1: " + Thread.currentThread().getName());
    }
}
