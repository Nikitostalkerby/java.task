package javase01.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		System.out.println("a*x^2 + b*x + c = 0");

		String str;
		
		Parameter<?> a = null;
		Parameter<?> b = null;
		Parameter<?> c = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.print("Enter a: ");
			str = br.readLine();
			if (str.contains("a")) {
				a =  new Parameter<String>("a");
			} else {
				a =  new Parameter<Integer>(Integer.parseInt(str));
			}

			System.out.print("Enter b: ");
			str = br.readLine();
			if (str.contains("b")) {
				b =  new Parameter<String>("b");
			} else {
				b =  new Parameter<Integer>(Integer.parseInt(str));
			}

			System.out.print("Enter c: ");
			str = br.readLine();
			if (str.contains("c")) {
				c =  new Parameter<String>("c");
			} else {
				c =  new Parameter<Integer>(Integer.parseInt(str));
			}

		} catch (IOException e) {
			System.out.println("Something is wrong: " + e.toString());
		}
		
		System.out.println("A: " + a.getObject());
		System.out.println("B: " + b.getObject());
		System.out.println("C: " + c.getObject());
		System.out.println("D: " + Discriminant.find(a, b, c).getObject());
	}
}