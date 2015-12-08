package com.github.union.one.task02.client;

import com.github.union.one.task02.util.Operation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 08.11.2015.
 */
public class javase04task02 {
    public static void main(String[] args) {

        // map
        Operation operation = new Operation();

        // input string and trim
        String inputString;
        inputString = operation.inputString();
        inputString = inputString != null ? inputString.trim() : null;

        // split inputString and add to array
        String[] digits = inputString != null ? inputString.split(",") : new String[0];
        operation.writeStringArray(digits);

        // parse String array and add elements to list
        List<Integer> digitList = new ArrayList<>();
        operation.addToListFromStringArray(digitList, digits);
        operation.writeIntegerList(digitList);

        // addition and output
        System.out.print(operation.addition(digitList));
    }
}
