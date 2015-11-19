package task01.io;

import task01.core.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Created by Vaas on 11.11.2015.
 */

public class Writer {
    private String path;

    public Writer(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void writeToFile(List<Person> persons) throws IOException {
        try (ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream(this.path))) {
            for (Person person : persons) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        }

    }

    public void writeToConsole(List<Person> persons) {
        System.out.println(persons.toString());
    }

    @Override
    public String toString() {
        return "Writer{" +
                "path='" + path + '\'' +
                '}';
    }
}
