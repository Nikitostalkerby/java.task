package sort;

import core.Person;

import java.util.List;

/**
 * Created by Vaas on 12.11.2015.
 */

public class Sorter {
    private List<Person> persons;
    private NumberComparator comparator;

    public Sorter(List<Person> persons) {
        this.persons = persons;
        this.comparator = new NumberComparator();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public NumberComparator getComparator() {
        return comparator;
    }

    public void setComparator(NumberComparator comparator) {
        this.comparator = comparator;
    }

    public void sort() {
        persons.sort(this.comparator);
    }
}
