package com.github.union.one.task02.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.union.one.task02.core.Timerable;

/**
 * Created by Vaas on 08.12.2015.
 */
public class Timer implements Runnable, Timerable {
    private long sleep;
    private SimpleDateFormat simpleDateFormat;


    public Timer(long sleep, String format) {
        this.sleep = sleep;
        this.simpleDateFormat = new SimpleDateFormat(format);
    }

    public long getSleep() {
        return sleep;
    }

    public void setSleep(long sleep) {
        this.sleep = sleep;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(timer());
            try {
                Thread.sleep(this.sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String timer() {
        return simpleDateFormat.format(new Date(System.currentTimeMillis())) + " <---> " +
                Thread.currentThread().getName();
    }

    @Override
    public String toString() {
        return "Timerable{" +
                "sleep=" + sleep +
                ", simpleDateFormat=" + simpleDateFormat +
                '}';
    }
}