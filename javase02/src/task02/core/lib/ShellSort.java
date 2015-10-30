package task02.core.lib;

import java.util.Comparator;

public class ShellSort implements Sortable {

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {
		int j;
		for (int gap = elements.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < elements.length; i++) {
				T tmp = elements[i];
				for (j = i; j >= gap && tmp.compareTo(elements[j - gap]) < 0; j -= gap) {
					elements[j] = elements[j - gap];
				}
				elements[j] = tmp;
			}
		}
	}

	@Override
	public <T> void sort(T[] elements, Comparator<? super T> comparator) {
		int j;
		for (int gap = elements.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < elements.length; i++) {
				T tmp = elements[i];
				for (j = i; j >= gap && comparator.compare(tmp, elements[j - gap]) < 0; j -= gap) {
					elements[j] = elements[j - gap];
				}
				elements[j] = tmp;
			}
		}
	}
}