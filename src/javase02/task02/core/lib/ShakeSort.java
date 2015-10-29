package javase02.task02.core.lib;

import java.util.Comparator;

public class ShakeSort implements Sortable {

	@Override
	public <T extends Comparable<? super T>> void sort(T[] variables) {

		int leftMark = 1;
		int rightMark = variables.length - 1;

		while (leftMark <= rightMark) {
			for (int i = rightMark; i >= leftMark; i--) {
				if (variables[i - 1].compareTo(variables[i]) > 0) {
					swap(variables, i, i - 1);
				}
			}
			leftMark++;

			for (int i = leftMark; i <= rightMark; i++) {
				if (variables[i - 1].compareTo(variables[i]) > 0) {
					swap(variables, i, i - 1);
				}
			}
			rightMark--;
		}
	}

	@Override
	public <T> void sort(T[] variables, Comparator<? super T> comparator) {
		
		int leftMark = 1;
		int rightMark = variables.length - 1;
		
		while (leftMark <= rightMark) {
			for (int i = rightMark; i >= leftMark; i--) {
				if (comparator.compare(variables[i - 1], variables[i]) > 0) {
					swap(variables, i, i - 1);
				}
			}
			leftMark++;

			for (int i = leftMark; i <= rightMark; i++) {
				if (comparator.compare(variables[i - 1], variables[i]) > 0) {
					swap(variables, i, i - 1);
				}
			}
			rightMark--;
		}
	}
}