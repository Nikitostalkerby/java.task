package task02.input;

import task02.core.Timer;
import task02.util.Deducter;
import task02.util.Transformer;

import java.util.Scanner;

/**
 * Created by Vaas on 13.11.2015.
 */
public class Inputer {
    private Timer timer;

    public Inputer(Timer timer) {
        this.timer = timer;
    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            int seconds;
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
