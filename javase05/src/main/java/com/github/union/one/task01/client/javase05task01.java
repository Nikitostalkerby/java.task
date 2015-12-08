package com.github.union.one.task01.client;

import com.github.union.one.task01.core.Person;
import com.github.union.one.task01.io.Reader;
import com.github.union.one.task01.sort.Sorter;
import com.github.union.one.task01.io.Writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 11.11.2015.
 */
public class javase05task01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "javase05task01.txt";

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("112233", "Vladimir Lenin", "Red Square 1 coffin"));
        persons.add(new Person("113322", "Joseph Stalin", "Red Square 2 coffin"));
        persons.add(new Person("112323", "Georgy Malenkov", "Red Square 3 coffin"));
        persons.add(new Person("222233", "Leonid Brezhnev", "Red Square 4 coffin"));
        persons.add(new Person("111111", "Mikhail Gorbachev", "USA 32\\2 kv 1"));

        Writer writer = new Writer(path);
        Reader reader = new Reader(persons, path);
        Sorter sorter = new Sorter(persons);

        writeToFileReadFromFileWriteToConsole(persons, writer, reader);

        sorter.sort();

        writeToFileReadFromFileWriteToConsole(persons, writer, reader);
    }

    public static void writeToFileReadFromFileWriteToConsole(List<Person> persons, Writer writer, Reader reader) throws IOException, ClassNotFoundException {
        writer.writeToFile(persons);
        reader.readFromFile();
        writer.writeToConsole(persons);
    }
}
