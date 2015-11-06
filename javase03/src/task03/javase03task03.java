package task03;

import java.util.Scanner;

/**
 * Created by Vaas on 06.11.2015.
 */
public class javase03task03 {
    public static void main(String[] args) {
        final int SIZE = 1;

        //Sign sign = new Sign();
        //System.out.println(sign.toString());

        Sign[] signs = new Sign[SIZE];

        /*for(int i = 0; i < SIZE; i++) {
            signs[i] = new Sign();
        }*/

        Scanner scanner;

        for(int i = 0; i < SIZE; i++) {
            String name = null;
            String zodiacName = null;
            Zodiac zodiac;
            int day = 0;
            int month = 0;
            int year = 0;

            try {
                scanner = new Scanner(System.in);

                System.out.print("\nEnter the name: ");
                name = scanner.nextLine();

                System.out.print("\nEnter the zodiac: ");
                zodiacName = scanner.nextLine();

                System.out.print("\nEnter the day: ");
                day = scanner.nextInt();

                System.out.print("\nEnter the month: ");
                month = scanner.nextInt();

                System.out.print("\nEnter the year: ");
                year = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Exception: " + e.toString());
            }
            zodiac = Sign.validZodiac(zodiacName);
            BDay bDay = new BDay(day, month, year);
            signs[i] = new Sign(name, zodiac, bDay);
        }

        for(Sign o : signs) {
            System.out.println(o.toString());
        }

        // write by month
        System.out.print("\nEnter the month: ");
        int n = 0;
        try {
            scanner = new Scanner(System.in);
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        for(Sign o : signs) {
            o.writeByMonth(n);
        }
    }
}
