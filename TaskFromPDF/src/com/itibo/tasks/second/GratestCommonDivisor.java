package com.itibo.tasks.second;

public class GratestCommonDivisor {

	public GratestCommonDivisor() {
		System.out.println("Use static method plz.\n");
	}

	public static int gcd(int firstSpace, int secondSpace) {

		if (secondSpace == 0) {
			return firstSpace;
		}

		int var = firstSpace % secondSpace;
		return gcd(secondSpace, var);
	}
}
