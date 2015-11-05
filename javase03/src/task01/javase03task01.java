package task01;

import java.util.Random;

/**
 * Created by Union.one on 05.11.2015.
 */
public class javase03task01 {

    public static void main(String[] args) {

        final byte DIM = 5;
        final byte BOUND = 100;

        int array1[][] = new int[DIM][DIM];
        int array2[][] = new int[DIM][DIM];
        Random random = new Random();

        for(int i = 0; i < DIM; i++) {
            for(int j = 0; j < DIM; j++) {
                array1[i][j] = random.nextInt(BOUND);
                array2[i][j] = random.nextInt(BOUND);
            }
        }

        for(int i = 0; i < DIM; i++){
            for(int j = 0; j < DIM; j++) {
                if(j % DIM == 0 && j <= DIM) {
                    System.out.println();
                }
                System.out.printf("%5d", array1[i][j]);
            }
        }

        System.out.println();

        for(int i = 0; i < DIM; i++){
            for(int j = 0; j < DIM; j++) {
                if(j % DIM == 0 && j <= DIM) {
                    System.out.println();
                }
                System.out.printf("%5d", array2[i][j]);
            }
        }

        Array array = new Array();
        Generator generator = new Generator();
        array.setValue(generator);
        array.writeArray();
    }
}
