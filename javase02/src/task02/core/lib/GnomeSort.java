package task02.core.lib;

import java.util.Comparator;

public class GnomeSort implements Sortable{

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {

		int i = 1;
		while (i < elements.length) {
		
			if (i == 0 || elements[i - 1].compareTo(elements[i]) < 0) {
				i++;
			} else {
				swap(elements, i, i - 1);
				i--;
			}
		}
	}

	@Override
	public <T> void sort(T[] elements, Comparator<? super T> comparator) {

		int i = 1;
		while (i < elements.length) {
		
			if (i == 0 || comparator.compare(elements[i - 1], elements[i]) < 0) {
				i++;
			} else {
				swap(elements, i, i - 1);
				i--;
			}
		}
	}
}