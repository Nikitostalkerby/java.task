package client;

import core.Person;
import core.PersonManager;
import sort.NumberComparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 18.11.2015.
 */
public class Main {

    public static <T> void printList(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) throws IOException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("094011", "Vanko", "Lenin square"));
        persons.add(new Person("911944", "Petro", "Stalin square"));

        final String dbPath = "persons.json";
        PersonManager manager = new PersonManager(dbPath);

        if (!manager.readBase()) {
            manager.setPersons(persons);
            manager.setDbPath(dbPath);
        }

        System.out.println("\n\nOriginal persons:");
        printList(manager.getPersons());

        manager.getPersons().get(0).setName("Volodimir");
        manager.getPersons().get(1).setName("Dmitro");

        System.out.println("\n\nEdited persons:");
        printList(manager.getPersons());
        manager.updateOrCreateBase();

        System.out.println("\n\nSorted persons:");
        persons.sort(new NumberComparator());
        printList(manager.getPersons());
        manager.updateOrCreateBase();
    }
}
