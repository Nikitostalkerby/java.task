package first.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args)
		throws IOException {
		
		System.out.println("Enter the line: ");
		
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
		String line = br.readLine();
		
		System.out.println("Your text is: \n" + line);
		
		List<String> letters = new ArrayList<String> (
				Arrays.asList("a", "e", "i", "o", "u", "y") );
		
		List<String> found = new ArrayList<String> ();
		
		
		

	}

}
