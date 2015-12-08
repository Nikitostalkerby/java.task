package com.github.union.one.javase10.task01;

/*
 * ������ ���� ������ �� ������ ���������� HashMap � TreeMap,
 * ��� ����� ���������� � ���������� ��������(���������� ���� ������������� ������)
 * ���� � ���, ��� HashMap �� ������������ �������� ���������� �� �������� ���������.
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
