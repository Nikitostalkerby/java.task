package com.github.union.one.task02.client;

import com.github.union.one.task02.array.Generator;
import com.github.union.one.task02.core.lib.*;
import com.github.union.one.task02.core.timer.SorterTimer;
import com.github.union.one.task02.writer.Writer;

import java.util.Arrays;
import java.util.List;

public class javase02task02 {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Writer w = new Writer();

        Integer[] array = Generator.generate(10);
        Integer[] array1 = array.clone();
        Integer[] array2 = array.clone();
        Integer[] array3 = array.clone();
        Integer[] array4 = array.clone();
        Integer[] array5 = array.clone();

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

        System.out.println("Comb Sort: ");
        long GombTime = SorterTimer.getTimer(array4, new CombSort());
        w.writeArray(array4);
        w.writeTime(GombTime);

        System.out.println("Shell Sort: ");
        long ShellTime = SorterTimer.getTimer(array5, new ShellSort());
        w.writeArray(array5);
        w.writeTime(ShellTime);
    }
}