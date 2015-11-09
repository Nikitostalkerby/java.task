package task03.util;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Union.one on 09.11.2015.
 */
public class Operation {

    {
        System.out.println("Miwa!");
    }

    private int dividend;
    private int divider;

    public Operation() {
        this.dividend = 0;
        this.divider = 0;
        init();
    }

    private void init() {
        input();
        if(isLess()) {
            findNumbers();
        } else {
            System.out.println("Davai po novoi Miwa.");
        }

    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the dividend: ");
            dividend = scanner.nextInt();

            System.out.print("\nEnter the divider: ");
            divider = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    private boolean isLess() {
        return divider <= dividend;
    }

    private void findNumbers() {
        int quotient = 0;
        int remainder = 0;

        do {
            remainder = dividend - divider;
            dividend = remainder;
            quotient++;
        } while (dividend >= divider);

        System.out.print("\nQuotient: " + quotient);
        System.out.print("\n\nRemainder: " + remainder);
    }
}
