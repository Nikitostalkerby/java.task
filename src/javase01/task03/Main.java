package javase01.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException, IOException {

		DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		System.out.println("Enter dare in the format dd.MM.yyyy");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Date date = sdf.parse(br.readLine());

		if (date.getMonth() + 10 > 12) {
			date.setYear(date.getYear() + 9);
		} else {
			date.setYear(date.getYear() + 10);
		}

		date.setMonth(date.getMonth() + 10);

		date.setDate(date.getDay() - 1);

		System.out.println(date);
	}
}