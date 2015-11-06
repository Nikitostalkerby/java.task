package task02.core.lib;

import java.util.Comparator;

public interface Sortable {

    public <T> void sort(T[] elements, Comparator<? super T> comparator);

    public <T extends Comparable<? super T>> void sort(T[] variables);

    default <T> void swap(T[] elements, int a, int b) {
        T t = elements[a];
        elements[a] = elements[b];
        elements[b] = t;
    }
}