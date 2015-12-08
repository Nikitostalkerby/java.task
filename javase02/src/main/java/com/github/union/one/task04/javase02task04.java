package com.github.union.one.task04;

import java.util.*;

/**
 * Created by Union.one on 02.11.2015.
 */
public class javase02task04 {

    public static void main(String[] args) {

        final int DIM = 20;

        System.out.print("Enter the count of arrays: ");
        int n = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
        //int n = 5;

        System.out.println("\nYou Entered: " + n);

        Double[][] matrix = new Double[DIM][n];

        Random random = new Random();

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextDouble();
            }
        }

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < n; j++) {
                if (j % n == 0 && j <= n) {
                    System.out.println();
                }
                System.out.printf("%10f", matrix[i][j]);
            }
        }

        System.out.println();
        System.out.println();

        Map<Double, Integer> map = new HashMap<>();

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < n; j++) {
                Double temp = matrix[i][j];

                if (!map.containsKey(temp)) {
                    map.put(temp, 1);
                } else {
                    map.put(temp, map.get(temp) + 1);
                }
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.printf("%.10f", entry.getKey());
                System.out.println(" <---> " + entry.getValue());
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                for (int i = 0; i < DIM; i++) {
                    for (int j = 0; j < n; j++) {
                        if (matrix[j][i] == entry.getKey() && i < DIM) {
                            System.out.printf("%.10f", entry.getKey());
                            System.out.println(" <---> " + entry.getValue());
                        }
                    }
                }
            }
        }
    }
}
