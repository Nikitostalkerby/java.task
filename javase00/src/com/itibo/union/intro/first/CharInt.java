package com.itibo.union.intro.first;

/*
 * Данный клас пришел на замену всовывания HashMap в TreeMap,
 * что можно посмотреть в предыдущих коммитах(реализация была действительно другая)
 * Дело в том, что HashMap не поддерживает хранения одинаковых по значению элементов.
 */

public class CharInt implements Comparable<Object> {

	public Character c;
	public Integer i;

	CharInt(Character c, Integer i) {
		this.c = c;
		this.i = i;
	}

	public int compareTo(Object o) {
		if (o instanceof CharInt) {
			final int diff = i.intValue() - ((CharInt) o).i.intValue();
			return diff < 0 ? -1 : (diff > 0 ? 1 : 0);
		} else {
			return 0;
		}
	}
}
