package com.itibo.tasks.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Описание зачем оно надо
 */

public class Program {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the line: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] line = str.toLowerCase().toCharArray();

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();

		System.out.println("Vowels: ");

		for (int i = 0; i < line.length; i++) {
			for (int k = 0; k < vowels.length; k++) {
				if (line[i] == vowels[k]) {
					if (dictionary.containsKey(line[i])) {
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
		
		ValueComparator bvc = new ValueComparator(dictionary);
		TreeMap<Character, Integer> sorted_dictionary = new TreeMap<Character, Integer>(bvc);
		
		sorted_dictionary.putAll(dictionary);
		
		System.out.println("results:");
		
		for (Character key : sorted_dictionary.keySet()) {
			System.out.println(key + ":" + sorted_dictionary.get(key));
		}
	}
}