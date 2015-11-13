package task02.client;

import task02.core.Timer;
import task02.input.Inputer;

/**
 * Created by Vaas on 11.11.2015.
 */
public class javase05task02 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Inputer inputer = new Inputer(timer);
        inputer.input();
    }
}
