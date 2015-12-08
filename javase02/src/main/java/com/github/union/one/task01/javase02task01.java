package com.github.union.one.task01;

public class javase02task01 {

    public static void main(String[] args) {

        final int MAX_INT = 300;
        final int MIN_INT = 0;

        for (int i = MAX_INT; i >= MIN_INT; i--) {
            final int EQUAL_VALUE = 237;
            if (i > EQUAL_VALUE) {
                if (i % 2 != MIN_INT) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 == MIN_INT) {
                    System.out.println(i);
                }
            }
        }
    }
}