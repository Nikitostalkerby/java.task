package javase02.task02.core.lib;

import java.util.Comparator;

public class InsertionSort implements Sortable{

	@Override
	public <T> void sort(T[] variables, Comparator<? super T> comparator) {
		insertionSort(variables, comparator);
	}

	@Override
	public <T extends Comparable<? super T>> void sort(T[] variables) {
		
		insertionSort(variables, new Comparator<T>() {
			
			@Override
			public int compare(T a, T b) {
				return a.compareTo(b);
			}
		});
	}

	private <T> void insertionSort(T[] variables, Comparator<? super T> comparator) {
		int j;
		T key;
		int i;

		for (j = 1; j < variables.length; j++) {
			key = variables[j];

			for (i = j - 1; (i >= 0) && (comparator.compare(variables[i], key) == 1); i--) {
				variables[i + 1] = variables[i];
			}
			variables[i + 1] = key;
		}
	}
}