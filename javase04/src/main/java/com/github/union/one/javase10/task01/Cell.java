package com.github.union.one.javase10.task01;

/**
 * Created by Union.one on 09.11.2015.
 */
public class Cell {
    private int x;
    private int y;

    public Cell() {
        this(1, 1);
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
