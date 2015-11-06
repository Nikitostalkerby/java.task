package task03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vaas on 06.11.2015.
 */
public class Znak {
    private String name;
    private BDay bDay;
    private Zodiac zodiac;

    public Znak(String name, Zodiac zodiac, BDay bDay) {
        super();
        this.name = name;
        this.zodiac = zodiac;
        this.bDay = bDay;
    }

    public Znak() {
        this("Vladimir Lenin", Zodiac.Taurus, new BDay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BDay getbDay() {
        return bDay;
    }

    public void setbDay(BDay bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return new String("\nName: " + this.name + "\nZodiak: " +
                this.zodiac.name() + this.bDay.toString());
    }

    public void writeByMonth(int month) {
        if (this.bDay.getMonth() == month) {
            System.out.println(toString());
        }
    }

    public void sort(Znak[] elements) {

    }

    public static Znak input() {
        String name = null;
        Zodiac zodiac;
        int day = 0;
        int month = 0;
        int year = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the name: ");
            name = scanner.nextLine();

            System.out.print("\nEnter the day: ");
            day = scanner.nextInt();

            System.out.print("\nEnter the month: ");
            month = scanner.nextInt();

            System.out.print("\nEnter the year: ");
            year = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        BDay bDay = new BDay(day, month, year);
        return new Znak(name, Zodiac.Taurus, bDay);
    }

    public static int find() {
        System.out.print("\nEnter the month: ");
        int n = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        return n;
    }
}

