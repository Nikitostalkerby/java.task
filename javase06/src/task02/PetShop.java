package task02;

import java.io.Serializable;

/**
 * Created by Vaas on 16.11.2015.
 */
public class PetShop implements Serializable {
    private String pet;
    private Gender gender;
    private String name;
    private int price;
    private int count;

    public PetShop() {

    }

    public PetShop(String pet, Gender gender, String name, int price, int count) {
        this.pet = pet;
        this.gender = gender;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public PetShop(PetShop petShop) {
        this.pet = petShop.pet;
        this.gender = petShop.gender;
        this.name = petShop.name;
        this.price = petShop.price;
        this.count = petShop.count;
    }

    public static PetShop newInstance(PetShop petShop) {
        return new PetShop(petShop.getPet(), petShop.getGender(), petShop.getName(), petShop.getPrice(), petShop.getCount());
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static Gender returnGender(String str) {
        return Gender.findGender(str);
    }

    public static boolean isValidGender(String str) {
        return Gender.findGender(str) != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetShop petShop = (PetShop) o;

        if (price != petShop.price) return false;
        if (count != petShop.count) return false;
        if (pet != null ? !pet.equals(petShop.pet) : petShop.pet != null) return false;
        if (gender != petShop.gender) return false;
        return !(name != null ? !name.equals(petShop.name) : petShop.name != null);

    }

    @Override
    public int hashCode() {
        int result = pet != null ? pet.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        return "\nPetShop{" +
                "pet='" + pet + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("\nmarka_avto");
    }
}
