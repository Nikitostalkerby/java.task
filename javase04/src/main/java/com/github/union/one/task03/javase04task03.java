package com.github.union.one.task03;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Vaas on 08.11.2015.
 */
public class javase04task03 {
    public static void main(String[] args) {

        int dividend = 0;
        int divider = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the dividend: ");
            dividend = scanner.nextInt();

            System.out.print("\nEnter the divider: ");
            divider = scanner.nextInt();

            //divider = -divider;

            int quotient = 0;
            while (dividend >= divider) {
                dividend -= divider;
                quotient++;
            }

            System.out.print("\nQuotient: " + quotient);
            System.out.print("\n\nRemainder: " + dividend);

        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}
