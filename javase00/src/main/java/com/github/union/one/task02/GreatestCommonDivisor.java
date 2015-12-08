package com.github.union.one.task02;

/*
 * GreatestCommonDivisor is for checking of opportunity pour the water.
 * Static method return GCD.
 */

public class GreatestCommonDivisor {

    public GreatestCommonDivisor() {
        System.out.println("Checking block.\n");
    }

    public static int gcd(int firstSpace, int secondSpace) {

        if (secondSpace == 0) {
            return firstSpace;
        }

        int var = firstSpace % secondSpace;
        return gcd(secondSpace, var);
    }
}