package task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Union.one on 02.11.2015.
 */
public class javase02task04 {

    public static void main(String[] args) {

        //Scanner sc = new Scanner((System.in));
        //int n = sc.nextInt();

        int n = 5;

        System.out.println("You Entered: " + n);

        Double[][] matrix = new Double[20][n];

        Random random = new Random();

        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = random.nextDouble();
            }
        }

        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < n; j++) {
                if(j % n == 0 && j <= n) {
                    System.out.println();
                }
                System.out.printf("%10f", matrix[i][j]);
            }
        }
    }
}
