package task04.io;

import task04.base.Check;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 16.11.2015.
 */
public class Reader {

    private String path;

    public Reader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Check> readFromFile() {
        List<Check> checks = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new
                ObjectInputStream((new FileInputStream(path)))) {
                checks.add((Check) objectInputStream.readObject());
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException: " + e.toString());
        }
        return checks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "path='" + path + '\'' +
                '}';
    }
}
