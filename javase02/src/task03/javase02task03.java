package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by union.one on 31.10.2015.
 */
public class javase02task03 {

    public static void main(String[] args) {

        String date = null;

        System.out.println("Enter the date: ");

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            date = bufferedReader.readLine();
        } catch(IOException e) {
            System.out.println("Something is wrong: " + e.toString());
        }

        Pattern pattern = Pattern.compile(":|;|;;|/|//|::|\\.");
        String [] list = pattern.split(date);

        System.out.println("Your date is: ");
        Arrays.asList(list).forEach(str -> System.out.println(str + " "));

        //System.out.println("Your date is: " + date);
    }
}
