package com.github.union.one.javase10.task01;

import java.util.Random;

/**
 * Created by Union.one on 05.11.2015.
 */
public class Generator {

    private int bound;
    private Random random;

    public int getBound() {
        return bound;
    }

    {
        System.out.println("marka_avto");
    }

    public void setBound(byte bound) {
        this.bound = bound;
    }

    public Generator() {
        this(100);
    }

    public Generator(int bound) {
        this.bound = bound;
        this.random = new Random();
    }

    public int generate() {
        return random.nextInt(bound);
    }
}
