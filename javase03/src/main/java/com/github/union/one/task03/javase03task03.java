package com.github.union.one.task03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vaas on 06.11.2015.
 */
public class javase03task03 {
    public static void main(String[] args) {
        final int SIZE = 8;

        //Sign sign = new Sign();
        //System.out.println(sign.toString());

        BDay[] bDay = new BDay[SIZE];
        bDay[0] = new BDay(20, 4, 1870);
        bDay[1] = new BDay(18, 12, 1878);
        bDay[2] = new BDay(8, 1, 1902);
        bDay[3] = new BDay(15, 4, 1894);
        bDay[4] = new BDay(19, 12, 1906);
        bDay[5] = new BDay(15, 6, 1914);
        bDay[6] = new BDay(24, 8, 1911);
        bDay[7] = new BDay(2, 3, 1931);

        Sign[] signs = new Sign[SIZE];
        signs[0] = new Sign("Vladimir Lenin", Zodiac.Taurus, bDay[0]);
        signs[1] = new Sign("Joseph Stalin", Zodiac.Capricorn, bDay[1]);
        signs[2] = new Sign("Georgy Malenkov", Zodiac.Capricorn, bDay[2]);
        signs[3] = new Sign("Nikita Khrushchev", Zodiac.Aries, bDay[3]);
        signs[4] = new Sign("Leonid Brezhnev", Zodiac.Sagittarius, bDay[4]);
        signs[5] = new Sign("Yuri Andropov", Zodiac.Gemini, bDay[5]);
        signs[6] = new Sign("Konstantin Chernenko", Zodiac.Libra, bDay[6]);
        signs[7] = new Sign("Mikhail Gorbachev", Zodiac.Pisces, bDay[7]);

        /*for(int i = 0; i < SIZE; i++) {
            signs[i] = new Sign();
        }*/

        Scanner scanner;

        /*for (int i = 0; i < SIZE; i++) {
            String name = null;
            String zodiacName = null;
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

            if(Sign.isValidZodiac(zodiacName)) {
                BDay bDay = new BDay(day, month, year);
                signs[i] = new Sign(name, Sign.getZodiac(zodiacName), bDay);
            } else {
                System.out.println("Invalid Zodiac name: " + zodiacName);
            }
        }*/

        for (Sign sign : signs) {
            System.out.println(sign.toString());
        }

        // write by month
        System.out.print("\nEnter the month: ");
        int inputMonth = 0;
        try {
            scanner = new Scanner(System.in);
            inputMonth = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        System.out.println();
        for (Sign o : signs) {
            o.writeByMonth(inputMonth);
        }

        // sort and output by year
        System.out.println("\n========== sorted by year===========");

        Arrays.sort(signs, new SortedByYear().reversed());

        for (Sign sign : signs) {
            System.out.println(sign.toString());
        }

        // output only needed
        System.out.print("\nEnter the Year: ");
        int inputYear = 0;
        try {
            scanner = new Scanner(System.in);
            inputYear = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        for (Sign sign : signs) {
            if (sign.getbDay().getYear() <= inputYear)
                System.out.println(sign.toString());
        }
    }
}
