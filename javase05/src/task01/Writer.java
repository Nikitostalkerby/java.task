package task01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Created by Vaas on 11.11.2015.
 */
public class Writer {
    private Person[] persons;

    public Writer(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void writeToFile(Person[] persons) throws IOException {
        try (ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream("D:\\workspace\\Java\\java.task\\javase05\\src\\task01\\info.txt"))) {
            for(Person person : persons) {
                objectOutputStream.writeObject(person);
            }
        } catch(IOException e) {
            System.out.print("IOException: " + e.toString());
        }

    }

    @Override
    public String toString() {
        return "Writer{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Writer writer = (Writer) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(persons, writer.persons);

    }

    @Override
    public int hashCode() {
        return persons != null ? Arrays.hashCode(persons) : 0;
    }
}
