package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.util.regex.Pattern;

/**
 * Created by union.one on 31.10.2015.
 */
public class javase02task03 {

    public static void main(String[] args) {

        String date = null;
        final String COMMA_PATTERN = ":|;|;;|/|//|::|\\.|-";
        final String DATE_PATTERN = "[0-9]\\S";
        final String MM = "mm";
        final String DD = "dd";
        final String YYYY = "yyyy";
        final String DDMM = "ddmm";


        System.out.println("Enter the date: ");

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            date = bufferedReader.readLine();
        } catch(IOException e) {
            System.out.println("IOException: " + e.toString());
        }

        try{
            date = date.replaceAll(" ", "");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.toString());
        }


        Pattern commaPattern = Pattern.compile(COMMA_PATTERN);
        Pattern datePattern = Pattern.compile(DATE_PATTERN);

        List<String> dateList = Arrays.asList(commaPattern.split(date));
        Map<Integer, String> map = new HashMap<>();

        for(String i : dateList) {
            if(i.length() == 2) {
                if(Integer.parseInt(i) >= 0 && Integer.parseInt(i) <= 12) {
                    if (map.containsKey(Integer.parseInt(i))) {
                        // костыль от отца. потом не забыть поделить на 10
                        map.put(Integer.parseInt(i+0), MM);
                    } else {
                        map.put(Integer.parseInt(i), DD);
                    }
                    //map.put(Integer.parseInt(i), DDMM);
                }else if (Integer.parseInt(i) >= 0 && Integer.parseInt(i) <= 31)  {
                    map.put(Integer.parseInt(i), DD);
                }
                else if(Integer.parseInt(i) < 0 && Integer.parseInt(i) > 31) {
                    System.out.println("Incorrect format. Break this.");
                    break;
                }
            } else if (i.length() == 4) {
                if(Integer.parseInt(i) >= 0) {
                    map.put(Integer.parseInt(i), YYYY);
                }
            }
        }

        List<String> commaList = Arrays.asList(datePattern.split(date));


        System.out.println("\nYour date is: ");
        Arrays.asList(dateList).forEach(str -> System.out.println(str));
        Arrays.asList(commaList).forEach(str -> System.out.println(str));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "<->" + entry.getValue());
        }
    }
}
