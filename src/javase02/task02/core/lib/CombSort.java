package javase02.task02.core.lib;

import java.util.Comparator;

public class CombSort implements Sortable {

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {

		double shrink = 1.247330950103979;
		int gap = elements.length;
		boolean swapped = true;

		while (gap > 1 || swapped) {
			if (gap > 1) {
				gap = (int) (gap / shrink);
			}

			int i = 0;
			swapped = false;

			while (i + gap < elements.length) {
				if (elements[i].compareTo(elements[i + gap]) > 0) {
					swap(elements, i, i + gap);
					swapped = true;
				}
				i++;
			}
		}
	}

	public <T> void sort(T[] elements, Comparator<? super T> comparator) {

		double shrink = 1.247330950103979;
		int gap = elements.length;
		boolean swapped = true;

		while (gap > 1 || swapped) {
			if (gap > 1) {
				gap = (int) (gap / shrink);
			}

			int i = 0;
			swapped = false;

			while (i + gap < elements.length) {
				if (comparator.compare(elements[i], elements[i + gap]) > 0) {
					swap(elements, i, i + gap);
					swapped = true;
				}
				i++;
			}
		}
	}
}