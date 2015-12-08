package com.github.union.one.javase10.task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class Array {

    private int width;
    private int height;
    private int[][] array;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Array() {
        this(5, 5);
    }

    public Array(int width, int height) {
        this.width = width;
        this.height = height;
        array = new int[this.width][this.height];
    }

    public void writeArray() {
        System.out.println();

        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    public void buildMatrix(Generator generator) {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                array[i][j] = generator.generate();
            }
        }
    }

    public int returnValue(int i, int j) {
        return this.array[i][j];
    }
}
