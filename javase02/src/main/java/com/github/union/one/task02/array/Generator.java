package com.github.union.one.task02.array;

import java.util.Random;

public class Generator {

    public static Integer[] generate(int size) {

        Integer[] variables = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < variables.length; i++) {
            variables[i] = random.nextInt();
        }

        return variables;
    }
}