package com.java.multithreading;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();     //Correct
        t2.run();       // runs like normal method (not a new thread)

    }
}
