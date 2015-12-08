package com.github.union.one.task02.io;

import com.github.union.one.task02.core.PetShop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vaas on 16.11.2015.
 */
public class Reader {
    private List<PetShop> petShops;
    private String path;

    public Reader(List<PetShop> shopList, String path) {
        this.petShops = shopList;
        this.path = path;
    }

    public List<PetShop> getPetShops() {
        return petShops;
    }

    public void setPetShops(List<PetShop> petShops) {
        this.petShops = petShops;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<PetShop> readFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new
                ObjectInputStream((new FileInputStream(path)))) {
            for (PetShop petShop : petShops) {
                petShop = (PetShop) objectInputStream.readObject();
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException: " + e.toString());
        }
        return petShops;
    }

    public void readFromConsole(List<PetShop> petShops) {
        System.out.println("\n============Enter info about jivotnoe============");

        String pet = "";
        String gender = null;
        String name = "";
        int price = 0;
        int count = 0;

        // ���� �� �����
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the pet:");
            pet = scanner.nextLine();

            System.out.print("\nEnter the gender:");
            gender = scanner.nextLine();

            System.out.print("\nEnter the name:");
            name = scanner.nextLine();

            System.out.print("\nEnter the price:");
            price = scanner.nextInt();

            System.out.print("\nEnter the count:");
            count = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Exception: " + e.toString());
        }

        if (PetShop.isValidGender(gender)) {
            petShops.add(new PetShop(pet, PetShop.returnGender(gender), name, price, count));
        } else {
            System.out.println("Invalid Gender name: " + gender);
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "petShops=" + petShops +
                ", path='" + path + '\'' +
                '}';
    }
}
