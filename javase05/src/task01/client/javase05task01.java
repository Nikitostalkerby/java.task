package task01.client;

import task01.core.Person;
import task01.init.DefaultInitializer;
import task01.reader.Reader;
import task01.sort.Sorter;
import task01.writer.Writer;

import java.io.IOException;

/**
 * Created by Vaas on 11.11.2015.
 */
public class javase05task01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "info.txt";

        Person[] persons = new Person[5];

        // default initilize
        DefaultInitializer defaultInitializer = new DefaultInitializer(persons);
        defaultInitializer.initialize();

        // write to file
        Writer writer = new Writer(persons, path);
        writer.writeToFile();

        // read from the file
        Reader reader = new Reader(path).readFromFile();
        reader.readFromFile();

        // output to console
        writer.writeToConsole();

        // sorting, writing to file, reading from file and outputing to console
        Sorter sorter = new Sorter(persons);
        sorter.sort();
        writer.writeToConsole();
        reader.readFromFile();
        writer.writeToConsole();
    }
}
