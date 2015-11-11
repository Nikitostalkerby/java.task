package task01.client;

import task01.core.Person;
import task01.reader.Reader;
import task01.writer.Writer;

import java.io.IOException;

/**
 * Created by Vaas on 11.11.2015.
 */
public class javase05task01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "D:\\workspace\\Java\\java.task\\javase05\\src\\task01\\info.txt";
        Person[] persons = new Person[5];

        persons[0] = new Person(112233, "Vladimir Lenin", "Red Square 1 coffin");
        persons[1] = new Person(113322, "Joseph Stalin", "Red Square 2 coffin");
        persons[2] = new Person(112323, "Georgy Malenkov", "Red Square 3 coffin");
        persons[3] = new Person(222233, "Leonid Brezhnev", "Red Square 4 coffin");
        persons[4] = new Person(111111, "Mikhail Gorbachev", "USA 32\\2 kv 1");

        Writer writer = new Writer(persons, path);
        writer.writeToFile();

        Reader reader = new Reader(persons, path);
        reader.readFromFile();

        writer.writeToConsole();
    }
}
