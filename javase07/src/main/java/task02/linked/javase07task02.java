package task02.linked;

import java.util.LinkedList;

/**
 * Created by Vaas on 19.11.2015.
 */
public class javase07task02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.removeFirst();
        list.addLast(3);

        System.out.print(list.toString());
    }
}
