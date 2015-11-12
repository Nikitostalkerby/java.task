package task01.sort;

import task01.comparator.NumberComparator;
import task01.core.Person;

import java.util.Arrays;

/**
 * Created by Vaas on 12.11.2015.
 */
public class Sorter {
    private Person[] persons;
    private NumberComparator comparator;

    public Sorter(Person[] persons) {
        this.persons = persons;
        this.comparator = new NumberComparator();
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public NumberComparator getComparator() {
        return comparator;
    }

    public void setComparator(NumberComparator comparator) {
        this.comparator = comparator;
    }

    public void sort() {
        Arrays.sort(persons, this.comparator);
    }

    @Override
    public String toString() {
        return "Sorter{" +
                "persons=" + Arrays.toString(persons) +
                ", comparator=" + comparator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sorter sorter = (Sorter) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(persons, sorter.persons)) return false;
        return !(comparator != null ? !comparator.equals(sorter.comparator) : sorter.comparator != null);

    }

    @Override
    public int hashCode() {
        int result = persons != null ? Arrays.hashCode(persons) : 0;
        result = 31 * result + (comparator != null ? comparator.hashCode() : 0);
        return result;
    }
}
