package task04.io;

import task04.base.Check;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by Vaas on 16.11.2015.
 */
public class Reader {
    private List<Check> checks;
    private String path;

    public Reader(List<Check> checks, String path) {
        this.checks = checks;
        this.path = path;
    }

    public List<Check> getChecks() {
        return checks;
    }

    public void setChecks(List<Check> checks) {
        this.checks = checks;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Check> readFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new
                ObjectInputStream((new FileInputStream(path)))) {
            for (Check check : checks) {
                check = (Check) objectInputStream.readObject();
            }
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
                "checks=" + checks +
                ", path='" + path + '\'' +
                '}';
    }
}
