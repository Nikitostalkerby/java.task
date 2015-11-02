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

        /*try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            date = bufferedReader.readLine();
        } catch(IOException e) {
            System.out.println("IOException: " + e.toString());
        }

        try{
            date = date.replaceAll(" ", "");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.toString());
        }*/
        date = input();


        Pattern commaPattern = Pattern.compile(COMMA_PATTERN);
        Pattern datePattern = Pattern.compile(DATE_PATTERN);

        List<String> dateList = Arrays.asList(commaPattern.split(date));
        Map<Integer, String> map = new HashMap<>();

        /*for(String i : dateList) {
            map.put(Integer.parseInt(i), "");
        }*/

        record(dateList, map);

        /*for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getKey().toString().length() >= 1 && entry.getKey().toString().length() <= 2) {
                if(entry.getKey() > 0 && entry.getKey() <= 12) {
                    if (map.containsKey(entry.getKey())) {
                        entry.setValue(MM);
                    } else {
                        entry.setValue(DD);
                    }
                    entry.setValue(DDMM);
                }else if (entry.getKey() > 0 && entry.getKey() <= 31)  {
                    entry.setValue(DD);
                }
                else if(entry.getKey() < 0 && entry.getKey() > 31) {
                    System.out.println("Incorrect format. Break this.");
                    break;
                }
            } else if (entry.getKey().toString().length() == 4) {
                if(entry.getKey() > 0) {
                    entry.setValue(YYYY);
                }
            }
        }*/

        setValue(map);

        String[] commaList = datePattern.split(date);
        String comma = commaList[1].trim();

        System.out.println("\nYour date is: ");
        Arrays.asList(dateList).forEach(str -> System.out.println(str));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "<->" + entry.getValue());
        }

        System.out.println("\nYour Comma is: " + comma);

        String answer = null;

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            answer += entry.getValue() + comma;
        }

        answer = answer.substring(4, answer.length() - 1);

        System.out.println("\nYour Answer is: " + answer);
    }

    public static String input() {
        String date = null;

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            date = bufferedReader.readLine();
        } catch(IOException e) {
            System.out.println("IOException: " + e.toString());
        }
        return date.replaceAll(" ", "");
    }

    public static void record(List<String> dateList, Map<Integer, String> map) {
        for(String i : dateList) {
            map.put(Integer.parseInt(i), "");
        }
    }

    public static void setValue(Map<Integer, String> map) {
        final String MM = "mm";
        final String DD = "dd";
        final String YYYY = "yyyy";
        final String DDMM = "ddmm";

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getKey().toString().length() >= 1 && entry.getKey().toString().length() <= 2) {
                if(entry.getKey() > 0 && entry.getKey() <= 12) {
                    if (map.containsKey(entry.getKey())) {
                        entry.setValue(MM);
                    } else {
                        entry.setValue(DD);
                    }
                    entry.setValue(DDMM);
                }else if (entry.getKey() > 0 && entry.getKey() <= 31)  {
                    entry.setValue(DD);
                }
                else if(entry.getKey() < 0 && entry.getKey() > 31) {
                    System.out.println("Incorrect format. Break this.");
                    break;
                }
            } else if (entry.getKey().toString().length() == 4) {
                if(entry.getKey() > 0) {
                    entry.setValue(YYYY);
                }
            }
        }
    }
}
