package task01.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javase01task01ex3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text: ");
        System.out.println("Enter 'quit' to quit.");

        do {
            str = br.readLine();

            System.out.println(str);

            if (str.equals("quit")) {
                System.out.println("The End.");
            }
        } while (!str.equals("quit"));
    }
}