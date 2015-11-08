package task02.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Vaas on 08.11.2015.
 */
public class Operation implements Operable {

    @Override
    public String inputString() {
        System.out.print("Enter the digits: ");
        try (BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.print("IOException e: " + e.toString());
        }

        return null;
    }

    @Override
    public void writeStringArray(String[] array) {
        System.out.print("\nThe digits: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    @Override
    public void addToListFromStringArray(List<Integer> list, String[] array) {
        for (String element : array) {
            list.add(Integer.parseInt(element));
        }
    }

    @Override
    public void writeIntegerList(List<Integer> list) {
        System.out.print("\nThe digits: ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    @Override
    public int addition(List<Integer> elements) {
        int result = 0;
        System.out.print("\nThe addition: ");
        for (Integer element : elements) {
            result += element;
        }

        return result;
    }
}
