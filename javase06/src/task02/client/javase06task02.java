package task02.client;

import task02.Gender;
import task02.PetShop;
import task02.io.Reader;
import task02.io.Writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 16.11.2015.
 */
public class javase06task02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "PetShop.txt";

        List<PetShop> petShops = new ArrayList<>();
        petShops.add(new PetShop("cat", Gender.Male, "Ivan", 10, 1));
        petShops.add(new PetShop("pesik", Gender.Female, "Vanko", 120, 10));


        Reader reader = new Reader(petShops, path);
        Writer writer = new Writer(path);

        reader.readFromConsole(petShops);
        writeToFileReadFromFileWriteToConsole(petShops, writer, reader);

        // ��� ������ ��� ���������
        //reader.readFromConsole(petShops);
        writeToFileReadFromFileWriteToConsole(petShops, writer, reader);

        PetShop petShop1 = new PetShop("dog", Gender.Female, "Petro", 122, 11);
        //PetShop petShop2 = new PetShop().newInstance(petShop1);
        PetShop petShop2 = new PetShop(petShop1);
        System.out.print("\n=====copy constructor=====" + petShop2.toString());
    }

    public static void writeToFileReadFromFileWriteToConsole(List<PetShop> petShops, Writer writer, Reader reader) throws IOException, ClassNotFoundException {
        writer.writeToFile(petShops);
        reader.readFromFile();
        writer.writeToConsole(petShops);
    }
}
