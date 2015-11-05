package task01;

import java.util.Random;

/**
 * Created by Union.one on 05.11.2015.
 */
public class javase03task01 {

    public static void main(String[] args) {
        Array array = new Array();
        Generator generator = new Generator();

        array.setValue(generator);
        array.writeArray();
    }
}
