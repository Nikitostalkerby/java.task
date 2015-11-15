package task02.input;

import task02.core.Timer;
import task02.util.Transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Vaas on 13.11.2015.
 */
public class Reader {
    private Timer timer;
    private Transformer transformer;
    private Map<String, Integer> map;
    private Scanner scanner;

    public Reader() {
        this.timer = new Timer();
        this.transformer = new Transformer();
        this.map = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void input() {
        try {
            // build time
            timer = buildTimer();
            map.clear();
            System.out.println(timer.toString());

            // input second and return substraction
            int seconds;
            System.out.print("\n\nEnter the seconds: ");
            seconds = scanner.nextInt();
            transformer.deduct(timer, seconds);

            // input first time
            System.out.println("\n\nEnter the first moment of time: ");
            timer = buildTimer();
            map.clear();
            int firstTime = transformer.transformTimeToSeconds(timer);

            // input second time
            System.out.println("\n\nEnter the second moment of time: ");
            timer = buildTimer();
            map.clear();
            int secondTime = transformer.transformTimeToSeconds(timer);

            // output result in seconds and in time
            transformer.transformSecondsToTime(timer, Math.abs(secondTime - firstTime));
            System.out.println(timer.toString());
            System.out.println(transformer.transformTimeToSeconds(timer));

        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }
    }

    private void read(String key, int minValue, int maxValue) {
        int value;
        do {
            System.out.print("\n>>" + key + ":");
            value = scanner.nextInt();
        } while (value < minValue || value > maxValue);
        map.put(key, value);
    }

    private Timer buildTimer() {
        System.out.println("\n\nEnter the values of time: ");
        read("hour", 0, 24);
        read("minutes", 0, 60);
        read("seconds", 0, 60);
        return new Timer(map.get("hour"), map.get("minutes"), map.get("seconds"));
    }

    @Override
    public String toString() {
        return "Reader{" +
                "timer=" + timer +
                ", transformer=" + transformer +
                ", map=" + map +
                ", scanner=" + scanner +
                '}';
    }
}
