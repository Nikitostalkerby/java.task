package com.github.union.one.javase10.task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class javase03task01 {

    public static void main(String[] args) {
        // initialize
        Generator generator = new Generator();
        Array firstMatrix = new Array();
        Array secondMatrix = new Array();
        Operations<Array> operations = new MatrixOperator();

        // generate
        firstMatrix.buildMatrix(generator);
        secondMatrix.buildMatrix(generator);

        // write to console
        firstMatrix.writeArray();
        secondMatrix.writeArray();

        // addition
        if (firstMatrix.getHeight() == secondMatrix.getHeight() &&
                firstMatrix.getWidth() == secondMatrix.getWidth()) {
            operations.addition(firstMatrix, secondMatrix);
        }

        // multiply
        operations.multiply(firstMatrix, secondMatrix);
    }
}
