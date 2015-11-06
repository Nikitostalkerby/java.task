package task03;

/**
 * Created by Vaas on 06.11.2015.
 */
public class Znak {
    public String name;
    public BDay bDay;
    public Zodiac zodiac;

    public Znak(String name, Zodiac zodiac, BDay bDay) {
        super();
        this.name = name;
        this.zodiac = zodiac;
        this.bDay = bDay;
    }

    public Znak() {
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
        return new String("Name: " + this.name + "\nZodiak: " +
                this.zodiac.name() + this.bDay.toString());
    }
}
