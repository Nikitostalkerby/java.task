package javase01.task01;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		byte[] data = new byte[25];
		
		System.out.println("Enter some chars: ");
		
		try {
			System.in.read(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("You entered: ");
		for(int i = 0; i < data.length; i++) {
			System.out.print((char) data[i]);
		}
	}
}