package com.github.union.one.task03;

import com.sun.istack.internal.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by union.one on 31.10.2015.
 */
public class javase02task03 {

    public static void main(String[] args) {

        final String COMMA_PATTERN = ":|;|;;|/|//|::|\\.|-";
        final String DATE_PATTERN = "[0-9]\\S";
        String date = null;

        // input the date
        System.out.println("Enter the date: ");
        date = input();

        // set the patterns for separator and date
        Pattern commaPattern = setPattern(COMMA_PATTERN);
        Pattern datePattern = setPattern(DATE_PATTERN);

        // recording from array to map
        List<String> dateList = Arrays.asList(commaPattern.split(date));
        Map<Integer, String> map = new HashMap<>();
        record(dateList, map);

        // set value in map
        String[] separatorList = datePattern.split(date);
        String separator = setSeparator(separatorList);
        setValue(map, separator);

        System.out.println("\nYour date is: ");
        Arrays.asList(dateList).forEach(str -> System.out.println(str));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "<->" + entry.getValue());
        }

        System.out.println("\nYour Comma is: " + separator);

        String answer = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            answer += entry.getValue() + separator;
        }
        answer = answer.substring(4, answer.length() - 1);

        System.out.println("\nYour Answer is: " + answer);
        System.out.println("\nYour Answer is: " + map.size());
    }

    public static String input() {
        String date = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            date = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
        }
        return date.replaceAll(" ", "");
    }

    public static void record(List<String> dateList, Map<Integer, String> map) {
        for (String i : dateList) {
            map.put(Integer.parseInt(i), "");
        }
    }

    public static void setValue(Map<Integer, String> map, String separator) {
        final String MM = "mm";
        final String DD = "dd";
        final String YYYY = "yyyy";
        final String DD_MM = "dd" + separator + "mm";

        byte count = 0;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().toString().length() >= 1 && entry.getKey().toString().length() <= 2) {
                if (entry.getKey() > 0 && entry.getKey() <= 12 && map.size() == 2) {
                    entry.setValue(DD_MM);
                } else if (entry.getKey() > 0 && entry.getKey() <= 12 && map.size() == 3 && count == 0) {
                    entry.setValue(MM);
                    count++;
                } else if (entry.getKey() > 0 && entry.getKey() <= 12 && map.size() == 3 && count != 0) {
                    entry.setValue(DD);
                } else if (entry.getKey() > 0 && entry.getKey() <= 31) {
                    entry.setValue(DD);
                } else if (entry.getKey() < 0 && entry.getKey() > 31) {
                    System.out.println("Incorrect format. Break this.");
                    break;
                }
            } else if (entry.getKey().toString().length() == 4) {
                if (entry.getKey() > 0) {
                    entry.setValue(YYYY);
                }
            }
        }
    }

    public static Pattern setPattern(String PATTERN) {
        Pattern pattern = Pattern.compile(PATTERN);
        return pattern;
    }

    /**
     * @param separatorList
     * @return
     */
    @NotNull
    private static String setSeparator(String[] separatorList) {
        return separatorList[1].trim();
    }
}
