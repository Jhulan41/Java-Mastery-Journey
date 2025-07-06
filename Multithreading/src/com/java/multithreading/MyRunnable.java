package com.java.multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread :" + Thread.currentThread().getName());
    }

}
