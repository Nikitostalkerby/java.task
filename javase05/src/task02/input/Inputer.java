package task02.input;

import task02.core.Timer;
import task02.util.Deducter;
import task02.util.Transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Reader
/**
 * Created by Vaas on 13.11.2015.
 */
public class Inputer {
    private Timer timer;
    private Map<String, Integer> map;
    private Scanner scanner;

    public Inputer(Timer timer) {
        this.timer = timer;
        this.map = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void read(String key, int minValue, int maxValue) {
        int value;
        do {
            System.out.print("\n>>" + key + ": ");
            value = scanner.nextInt();
            timer.setHour(scanner.nextInt());
        } while (value < minValue || value > maxValue);
        map.put(key, value);
    }

    public void input() {
        try {
            int seconds;

            // buildTimer method
            System.out.println("Enter the values of time: ");
            read("hour", 0, 24);
            read("minutes", 0, 60);
            read("seconds", 0, 60);
            Timer timer1 = new Timer(map.get("hour"), map.get("minutes"), map.get("seconds"));
            map.clear();



            System.out.println(timer.toString());

            System.out.print("\nEnter the seconds: ");
            seconds = scanner.nextInt();

            Deducter deducter = new Deducter(timer, seconds);
            deducter.deduct();

            System.out.println("\nEnter the first moment of time: ");
            System.out.println("Enter the values of time: ");
            do {
                System.out.print("\n>>hours: ");
                timer.setHour(scanner.nextInt());
            } while (timer.getHour() < 0 || timer.getHour() > 24);

            do {
                System.out.print("\n>>minutes: ");
                timer.setMinute(scanner.nextInt());
            } while (timer.getMinute() < 0 || timer.getMinute() > 60);

            do {
                System.out.print("\n>>seconds: ");
                timer.setSecond(scanner.nextInt());
            } while (timer.getSecond() < 0 || timer.getSecond() > 60);

            Transformer transformer = new Transformer();
            int time1 = transformer.transformTimeToSeconds(timer);

            System.out.println("\nEnter the first moment of time: ");
            System.out.println("Enter the values of time: ");
            do {
                System.out.print("\n>>hours: ");
                timer.setHour(scanner.nextInt());
            } while (timer.getHour() < 0 || timer.getHour() > 24);

            do {
                System.out.print("\n>>minutes: ");
                timer.setMinute(scanner.nextInt());
            } while (timer.getMinute() < 0 || timer.getMinute() > 60);

            do {
                System.out.print("\n>>seconds: ");
                timer.setSecond(scanner.nextInt());
            } while (timer.getSecond() < 0 || timer.getSecond() > 60);
            int time2 = transformer.transformTimeToSeconds(timer);

            // как поменять
            if (time1 > time2) {
                int var = time2;
                time2 = time1;
                time1 = var;
            }

            transformer.transformSecondsToTime(timer, time2 - time1);
            System.out.println(timer.toString());
            System.out.println(transformer.transformTimeToSeconds(timer));

        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }
    }
}
