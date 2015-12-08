package com.github.union.one.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class javase01task03 {

    public static void main(String[] args) throws ParseException, IOException {

        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Enter dare in the format dd.MM.yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Date d1 = sdf.parse(br.readLine());
        String str = "12.02.1980";
        Date d2 = sdf.parse(str);

        long sum = d1.getTime() + d2.getTime();

        System.out.println("Date: " + new Date(sum));
    }
}