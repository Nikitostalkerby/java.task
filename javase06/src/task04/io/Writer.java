package task04.io;

import task04.base.Check;

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

    public void writeToFile(List<Check> checks) throws IOException {
        try (ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream(this.path))) {
            for (Check check : checks) {
                objectOutputStream.writeObject(check);
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        }

    }

    public void writeToConsole(List<Check> checks) {
        System.out.println(checks.toString());
    }

    @Override
    public String toString() {
        return "Writer{" +
                "path='" + path + '\'' +
                '}';
    }
}
