package task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Vaas on 06.11.2015.
 */
public class javase03task03 {
    public static void main(String[] args) {
        final int SIZE = 1;

        //Znak znak = new Znak();
        //System.out.println(znak.toString());

        Znak[] list = new Znak[SIZE];

        /*for(int i = 0; i < SIZE; i++) {
            list[i] = new Znak();
        }*/

        for(int i = 0; i < SIZE; i++) {
            list[i] = Znak.input();
        }

        for(Znak o : list) {
            System.out.println(o.toString());
        }

        // write by month
        /*System.out.print("\nEnter the month: ");
        int n = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }*/

        for(Znak o : list) {
            o.writeByMonth(Znak.find());
        }
    }
}
