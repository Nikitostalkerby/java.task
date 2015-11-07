package task03;

import java.util.Scanner;

/**
 * Created by Vaas on 06.11.2015.
 */
public class Sign {
    private String name;
    private BDay bDay;
    private Zodiac zodiac;

    public Sign(String name, Zodiac zodiac, BDay bDay) {
        super();
        this.name = name;
        this.zodiac = zodiac;
        this.bDay = bDay;
    }

    public Sign() {
        this("Vladimir Lenin", Zodiac.Taurus, new BDay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BDay getbDay() {
        return bDay;
    }

    public void setbDay(BDay bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "name='" + name + '\'' +
                ", bDay=" + bDay +
                ", zodiac=" + zodiac +
                '}';
    }

    public void writeByMonth(int month) {
        if (this.bDay.getMonth() == month) {
            System.out.println(toString());
        }
    }

    //TODO implement sort method
    public void sort(Sign[] elements) {
        // code...
    }

    public static Zodiac getZodiac(String str) {
        return Zodiac.findZodiac(str);
    }

    public static boolean isValidZodiac(String str) {
        return Zodiac.findZodiac(str) != null;
    }
}

