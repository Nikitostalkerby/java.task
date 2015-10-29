package javase02.task02.client;

import java.util.Arrays;
import java.util.List;

import javase02.task02.array.Generator;
import javase02.task02.writer.Writer;
import javase02.task02.core.lib.GnomeSort;
import javase02.task02.core.lib.InsertionSort;
import javase02.task02.core.lib.ShakeSort;
import javase02.task02.core.timer.SorterTimer;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Writer w = new Writer();

		Integer[] array = Generator.generate(10);
		Integer[] array1 = array.clone();
		Integer[] array2 = array.clone();
		Integer[] array3 = array.clone();

		System.out.println("Array: ");
		w.writeArray(array);

		List<Integer> list = Arrays.asList(array);
		long time = System.nanoTime();
		list.sort(null);
		long sortTime = System.nanoTime() - time;
		System.out.println("Sort Array: ");
		w.writeArray(list);
		w.writeTime(sortTime);

		System.out.println("Insertion Sort: ");
		long insertionTime = SorterTimer.getTimer(array1, new InsertionSort());
		w.writeArray(array1);
		w.writeTime(insertionTime);

		System.out.println("Shake Sort: ");
		long ShakeTime = SorterTimer.getTimer(array2, new ShakeSort());
		w.writeArray(array2);
		w.writeTime(ShakeTime);

		System.out.println("Gnome Sort: ");
		long GnomeTime = SorterTimer.getTimer(array3, new GnomeSort());
		w.writeArray(array3);
		w.writeTime(GnomeTime);
	}
}