package com.github.union.one.javase10.task02.client;

import com.github.union.one.javase10.task02.impl.Timer;

/**
 * Created by Vaas on 08.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Runnable timer1 = new Timer(1000, "HH:mm:ss");
        Runnable timer2 = new Timer(4000, "HH:mm:ss");
        Runnable timer3 = new Timer(6000, "HH:mm:ss");

        Thread thread1 = new Thread(timer1, "1");
        Thread thread2 = new Thread(timer2, "5");
        Thread thread3 = new Thread(timer3, "7");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}