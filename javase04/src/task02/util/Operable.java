package task02.util;

import java.util.List;

/**
 * Created by Vaas on 08.11.2015.
 */
public interface Operable {

    String inputString();

    void writeStringArray(String[] array);

    void addToListFromStringArray(List<Integer> list, String[] array);

    void writeIntegerList(List<Integer> list);

    int addition(List<Integer> elements);
}
