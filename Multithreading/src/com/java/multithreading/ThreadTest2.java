package com.java.multithreading;

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start(); //right way
        t2.run(); //use main thread only
    }
}
