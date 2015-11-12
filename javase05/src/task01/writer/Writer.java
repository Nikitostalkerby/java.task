package task01.writer;

import task01.core.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Vaas on 11.11.2015.
 */
public class Writer {
    private Person[] persons;
    private String path;

    public Writer(Person[] persons, String path) {
        this.persons = persons;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void writeToFile() throws IOException {
        try (ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream(this.path))) {
            for (Person person : persons) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        }

    }

    public void writeToConsole() {
        System.out.println("===== write =====");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    }


}
