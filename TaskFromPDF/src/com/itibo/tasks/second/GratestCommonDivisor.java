package com.itibo.tasks.second;

/*
 * GratestCommonDivisor is for checking of opportunity pour the water.
 * Static method return GCD.
 */

public class GratestCommonDivisor {

	public GratestCommonDivisor() {
		System.out.println("Cheking Block.\n");
	}

	public static int gcd(int firstSpace, int secondSpace) {

		if (secondSpace == 0) {
			return firstSpace;
		}

		int var = firstSpace % secondSpace;
		return gcd(secondSpace, var);
	}
}