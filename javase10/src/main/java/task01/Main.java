package task01;

/**
 * Created by Vaas on 06.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Runnable assemblyLine = new AssemblyLine(storage);

        Thread firstRobot = new Thread(assemblyLine, "1");
        Thread secondRobot = new Thread(assemblyLine, "2");

        firstRobot.start();
        secondRobot.start();
    }
}
