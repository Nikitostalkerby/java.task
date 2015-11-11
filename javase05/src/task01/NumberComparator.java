package task01;

import java.util.Comparator;

/**
 * Created by Vaas on 11.11.2015.
 */
public class NumberComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        Integer number1 = person1.getNumber();
        Integer number2 = person2.getNumber();

        return number1.compareTo(number2);
    }
}
