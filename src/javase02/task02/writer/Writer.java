package javase02.task02.writer;

import java.io.PrintWriter;
import java.util.List;

public class Writer {

	public static <T> void writeArray(T[] array) {
		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("<------------->");

		for (T a : array) {
			pw.println(a);
		}

		pw.println("<------------->");
	}

	public static void writeTime(long time) {
		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("Time: " + time);
		pw.println("<------------->");
	}

	public void writeArray(List<Integer> list) {

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("<------------->");

		for (Integer element  : list) {
			pw.println(element);
		}

		pw.println("<------------->");
		
	}
}