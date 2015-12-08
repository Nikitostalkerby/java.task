package com.github.union.one.task01.sort;

import com.github.union.one.task01.core.Person;

import java.util.Comparator;

/**
 * Created by Vaas on 11.11.2015.
 */
public class NumberComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getNumber().compareTo(person2.getNumber());
    }
}
