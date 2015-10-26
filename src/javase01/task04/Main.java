package javase01.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("a*x^2 + b*x + c = 0");
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		String str;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter a: ");
			str = br.readLine();
			if(str.contains("a"))
			a = Integer.parseInt(str);
			
			
			System.out.print("Enter b: ");
			str = br.readLine();
			b = Integer.parseInt(str);
			
			System.out.print("Enter c: ");
			str = br.readLine();
			c = Integer.parseInt(str);
			
		} catch (IOException e) {
			System.out.println("Something is wrong: " + e.toString());
		}
		
		System.out.println(a);
		System.out.println(b);
		
	}
}