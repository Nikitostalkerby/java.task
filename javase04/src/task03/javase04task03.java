package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Vaas on 08.11.2015.
 */
public class javase04task03 {
    public static void main(String[] args) {

        int dividend = 0;
        int divider = 0;
        int quotient = 0;
        int remainder = 0;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the dividend: ");
            dividend = scanner.nextInt();

            System.out.print("\nEnter the divider: ");
            divider = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        if(divider <= dividend) {
            do {
                remainder = dividend - divider;
                dividend = remainder;
                quotient++;
            } while(dividend >= divider);

            System.out.print("\nQuotient: " + quotient);
            System.out.print("\n\nRemainder: " + remainder);

        } else {
            System.out.println("Davai po novoi Miwa.");
        }
    }
}
