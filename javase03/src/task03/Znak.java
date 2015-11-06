package task03;

/**
 * Created by Vaas on 06.11.2015.
 */
public class Znak {
    public String name;
    public String zodiak;
    public BDay bDay;

    public Znak(String name, String zodiak, BDay bDay) {
        super();
        this.name = name;
        this.zodiak = zodiak;
        this.bDay = bDay;
    }

    public Znak() {
        this("Vladimir Lenin", "Telets", new BDay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZodiak() {
        return zodiak;
    }

    public void setZodiak(String zodiak) {
        this.zodiak = zodiak;
    }

    public BDay getbDay() {
        return bDay;
    }

    public void setbDay(BDay bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return new String("Name: " + this.name + "\nZodiak: " + this.zodiak + this.bDay.toString());
    }
}
