package task01.init;

import task01.core.Person;

import java.util.Arrays;

/**
 * Created by Vaas on 12.11.2015.
 */
public class DefaultInitializer {
    private Person[] persons;

    public DefaultInitializer(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void initialize() {
        this.persons[0] = new Person(112233, "Vladimir Lenin", "Red Square 1 coffin");
        this.persons[1] = new Person(113322, "Joseph Stalin", "Red Square 2 coffin");
        this.persons[2] = new Person(112323, "Georgy Malenkov", "Red Square 3 coffin");
        this.persons[3] = new Person(222233, "Leonid Brezhnev", "Red Square 4 coffin");
        this.persons[4] = new Person(111111, "Mikhail Gorbachev", "USA 32\\2 kv 1");
    }

    @Override
    public String toString() {
        return "DefaultInitializer{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultInitializer that = (DefaultInitializer) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(persons, that.persons);

    }

    @Override
    public int hashCode() {
        return persons != null ? Arrays.hashCode(persons) : 0;
    }
}
