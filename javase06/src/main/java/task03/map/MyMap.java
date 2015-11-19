package task03.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vaas on 16.11.2015.
 */
public class MyMap {
    private Map<String, Integer> map;

    public MyMap() {
        map = new HashMap<>();
    }

    // обход регул€ркой
    private void writeToMap(String text) {
        for (String word : text.toLowerCase().split("\\W")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }

    private int findMaxValue() {
        int max = 0;
        for (int value : map.values()) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public String getWord(String text) {
        writeToMap(text);
        int max = findMaxValue();
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() == max) {
                return entry.getKey().toString().toUpperCase();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "map=" + map +
                '}';
    }
}
