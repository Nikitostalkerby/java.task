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
    private Transformer transformer;
    private Map<String, Integer> map;
    private Scanner scanner;

    public Reader() {
        this.transformer = new Transformer();
        this.map = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void input() {
        try {
            int seconds;
            Timer firstTimer = buildTimer();
            map.clear();

            System.out.println(firstTimer.toString());

            System.out.print("\nEnter the seconds: ");
            seconds = scanner.nextInt();
            transformer.deduct(firstTimer, seconds);

            System.out.println("\n\nEnter the first moment of time: ");
            firstTimer = buildTimer();
            map.clear();
            int firstTime = transformer.transformTimeToSeconds(firstTimer);

            System.out.println("\n\nEnter the second moment of time: ");
            Timer secondTimer = buildTimer();
            map.clear();
            int secondTime = transformer.transformTimeToSeconds(secondTimer);

            transformer.transformSecondsToTime(firstTimer, Math.abs(secondTime - firstTime));
            System.out.println(firstTimer.toString());
            System.out.println(transformer.transformTimeToSeconds(firstTimer));

        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }
    }

    public void read(String key, int minValue, int maxValue) {
        int value;
        do {
            System.out.print("\n>>" + key + ":");
            value = scanner.nextInt();
        } while (value < minValue || value > maxValue);
        map.put(key, value);
    }

    public Timer buildTimer() {
        System.out.println("Enter the values of time: ");
        read("hour", 0, 24);
        read("minutes", 0, 60);
        read("seconds", 0, 60);
        return new Timer(map.get("hour"), map.get("minutes"), map.get("seconds"));
    }

    @Override
    public String toString() {
        return "Reader{" +
                "transformer=" + transformer +
                ", map=" + map +
                ", scanner=" + scanner +
                '}';
    }
}
