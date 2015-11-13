package task02.input;

import task02.core.Timer;
import task02.util.Deducter;

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

        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }
    }
}
