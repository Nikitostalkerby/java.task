package task01.core;

import java.io.Serializable;

/**
 * Created by Vaas on 11.11.2015.
 */
public class Person implements Serializable {
    private int number;
    private String name;
    private String address;

    public Person(int number, String name, String address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this(112233, "Vladimir Lenin", "Red Square 1 coffin");
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (number != person.number) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return !(address != null ? !address.equals(person.address) : person.address != null);

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
