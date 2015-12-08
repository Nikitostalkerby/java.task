package com.github.union.one.javase10.task01;

/**
 * Created by Vaas on 06.12.2015.
 */
public class AssemblyLine implements Runnable {
    private Storage storage;

    public AssemblyLine(Storage storage) {
        this.storage = storage;
    }

    public synchronized void buildCar() {
        this.storage.getElements();
    }

    @Override
    public void run() {
        int count = 0;
        while (!storage.isEmpty()) {
            count++;
            System.out.println("Avto " + count + " DONE!!! By robot: " + Thread.currentThread().getName());
            buildCar();
        }
    }
}
