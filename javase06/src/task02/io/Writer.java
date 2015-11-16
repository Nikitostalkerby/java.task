package task02.io;

import task02.core.PetShop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Created by Vaas on 16.11.2015.
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

    public void writeToFile(List<PetShop> petShops) throws IOException {
        System.out.println("=====writeToFile=====");
        try (ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream(this.path))) {
            for (PetShop petShop : petShops) {
                objectOutputStream.writeObject(petShop);
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        }

    }

    public void writeToConsole(List<PetShop> petShops) {
        System.out.println("=====writeToConsole=====");
        System.out.println(petShops.toString());
    }

    @Override
    public String toString() {
        return "Writer{" +
                "path='" + path + '\'' +
                '}';
    }
}
