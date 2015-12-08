package com.github.union.one.javase10.task01;

/**
 * Created by Vaas on 06.12.2015.
 */
public class Storage {
    private int body;
    private int chassis;
    private int engine;

    public Storage() {
        this(10, 10, 10);
    }

    public Storage(int body, int chassis, int engine) {
        this.body = body;
        this.chassis = chassis;
        this.engine = engine;
    }

    public synchronized boolean isEmpty() {
        return (this.body == 1 || this.chassis == 1 || this.engine == 1);
    }

    private synchronized void incrementElements() {
        this.body--;
        this.chassis--;
        this.engine--;
    }

    public synchronized void getElements() {
        if(!isEmpty()) {
            incrementElements();
        }
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getChassis() {
        return chassis;
    }

    public void setChassis(int chassis) {
        this.chassis = chassis;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "body=" + body +
                ", chassis=" + chassis +
                ", engine=" + engine +
                '}';
    }
}
