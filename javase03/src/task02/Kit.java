package task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vaas on 06.11.2015.
 */
public class Kit {

    private String[] kit;
    private int count;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String[] getKit() {

        return kit;
    }

    private void setKit(String[] kit) {
        this.kit = kit;
    }

    public Kit(int count, int length) {
        this.count = count;
        this.length = length;
        this.kit = new String[count];

        for (int i = 0; i < this.count; i++) {
            this.kit[i] += " ";
        }

        for (int i = 0; i < this.count; i++) {
            this.kit[i] = this.kit[i].substring(0, this.length);
        }
    }

    public Kit() {
        this(5, 5);
    }

    public void setValue(int index) {
        System.out.println();
        System.out.print("Enter the line: ");

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
            kit[index] = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("IOException for setValue: " + e.toString());
        } finally {
        }
    }

    public void print(int index) {
        System.out.println();
        System.out.print("Your kit is: ");

        System.out.print(kit[index] + " ");
    }

    public void print() {
        System.out.println();
        System.out.println("Your kits is: ");

        for (String i : kit) {
            System.out.println(i + " ");
        }
    }

    public void add(int index1, int index2) {
        //System.out.println();
        System.out.println(kit[index1] + kit[index2]);
    }

    public String union(int index1, int index2) {
        return new String(kit[index1] + kit[index2]);
    }

    public int find(String str) {
        for (int i = 0; i < kit.length; i++) {
            if (str.equals(kit[i])) {
                return i;
            }
        }
        return -1;
    }
}
