package task01.client;

import task01.brute.WordGenerator;

import java.util.Scanner;

/**
 * Created by Vaas on 19.11.2015.
 */
public class javase07task01 {
    public static void main(String[] args) {
        char[] alphabet = WordGenerator.initAllowedCharacters('a', 'b');
        int wordlength = 4;

        String input = "";
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the pass: ");
            input = scanner.nextLine();
        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }

        WordGenerator gen = new WordGenerator(alphabet, wordlength);
        while(gen.hasNext()) {
            if(input.equals(gen.generateNext())) {
                System.out.println("\nAccess: " + input);
                break;
            } else {
                System.out.println(gen.generateNext());
            }
        }
    }
}
