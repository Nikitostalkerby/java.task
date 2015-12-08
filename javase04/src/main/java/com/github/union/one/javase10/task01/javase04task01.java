package com.github.union.one.javase10.task01;

import java.util.Scanner;

/**
 * Created by Vaas on 08.11.2015.
 */
public class javase04task01 {
    public static void main(String[] args) {
        //Cell firstCell = new Cell(1, 1);
        //Cell secondCell = new Cell(3, 3);

        Cell firstCell = new Cell();
        Cell secondCell = new Cell();

        input(firstCell, secondCell);

        if (Validator.check(firstCell, secondCell)) {
            System.out.println("\nYES");
        } else {
            System.out.println("\nNO");
        }
    }

    // reader
    public static void input(Cell firstCell, Cell secondCell) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEnter first cell: ");

            System.out.print("\nX: ");
            firstCell.setX(scanner.nextInt());

            System.out.print("\nY: ");
            firstCell.setY(scanner.nextInt());

            System.out.println("\nEnter second cell: ");

            System.out.print("\nX: ");
            secondCell.setX(scanner.nextInt());

            System.out.print("\nY: ");
            secondCell.setY(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}
