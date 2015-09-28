package com.itibo.tasks.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * ����� ������� ��� �� ���� �������. ����� �������� ���������. �� ���.
 */

public class Program {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the line: ");

		// enter the line
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		// get lowercase char array from string
		char[] line = str.toLowerCase().toCharArray();

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		
		// dictionary for saving key/value pair
		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();

		System.out.println("Vowels: ");

		// knowing all vowel chars
		for (int i = 0; i < line.length; i++) {
			for (int k = 0; k < vowels.length; k++) {
				if (line[i] == vowels[k]) {
					if (dictionary.containsKey(line[i])) {
						// and saving to map
						Integer value = (Integer) dictionary.get(line[i]);
						dictionary.put(line[i], value + 1);
					} else {
						dictionary.put(line[i], 1);
					}
				}
			}
		}
		
		for (char key : dictionary.keySet()) {
			System.out.println(key + ": " + dictionary.get(key));
		}
		
		
		System.out.println("");
		
		// using class to saving similar chars
		int index = dictionary.size();
		CharInt[] ci = new CharInt[index];
		index = 0;
		
		for(Map.Entry<Character, Integer>entry:dictionary.entrySet()) {
			ci[index++] = new CharInt(entry.getKey(), entry.getValue());
		}
		
		// lazy revers sorting
		Arrays.sort(ci, Collections.reverseOrder());
		System.out.println("Sorted map");
		for (CharInt cin:ci) {
			System.out.println(cin.c + ": " + cin.i);
		}
	}
}