package com.itibo.tasks.first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Можно разбить еще на пару классов. Можно написать интерфейс. Но нет.
 */

public class Program {

	public static void main(String[] args) throws IOException {

		final String FILE = "./alphabet.utf8";
		final String WIN1251 = "windows-1251";
		final String UTF8 = "UTF-8";
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(
									new InputStreamReader(
											new FileInputStream(FILE), WIN1251));
		String qwerty = br.readLine();
		System.out.println(qwerty);
		
		String restored = new String(qwerty.getBytes(WIN1251), UTF8);
		System.out.println(restored);
		
		int a;
		FileInputStream fin;
		System.setProperty("console.encoding", "utf-8");
		
		final String FILENAME = ".//text.txt";

		try {
			fin = new FileInputStream(FILENAME);
		} catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		
		

		String str = new String();

		try {
			do {
				a = fin.read();
				if (a != -1) {
					System.out.print((char) a);
					str += (char) a;
				}
			} while (a != -1);
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		} finally {
			try {
				fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing file.");
			}
		}

		char[] line = str.toLowerCase().toCharArray();

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е' };

		// dictionary for saving key/value pair
		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();

		System.out.println("\nVowels: ");

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

		for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
			ci[index++] = new CharInt(entry.getKey(), entry.getValue());
		}

		// lazy revers sorting
		Arrays.sort(ci, Collections.reverseOrder());
		System.out.println("Sorted map");
		for (CharInt cin : ci) {
			System.out.println(cin.c + ": " + cin.i);
		}
	}
}