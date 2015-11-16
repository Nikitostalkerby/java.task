package task03.client;

import task03.map.MyMap;

/**
 * Created by Vaas on 16.11.2015.
 */
public class javase06task03 {
    public static void main(String[] args) {
        final String text = "Can you can the can with can?";
        MyMap map = new MyMap();

        System.out.println(text + "\n" + map.returnWord(text));
    }
}
