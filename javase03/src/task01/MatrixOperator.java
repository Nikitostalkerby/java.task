package task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class MatrixOperator implements Operations<Array> {

    {
        System.out.println();
    }

    @Override
    public void addition(Array array, Array array2) {
        System.out.println();
        for(int i = 0; i < array.getWidth(); i++) {
            for(int j = 0; j < array.getHeight(); j++) {
                System.out.printf("%5d ", array.returnValue(i, j) + array2.returnValue(i, j));
            }
            System.out.println();
        }
    }

    @Override
    public void multiply(Array array, Array array2) {
        System.out.println();
        int[][] res = new int[array.getWidth()][array2.getHeight()];
        for(int i = 0; i < array.getWidth(); i++) {
            for(int j = 0; j < array2.getHeight(); j++) {
                for(int k = 0; k < array2.getWidth(); k++) {
                    res[i][j] += array.returnValue(i, k) * array.returnValue(k, j);
                }
            }
        }

        for(int i = 0; i < array.getWidth(); i++) {
            for(int j = 0; j < array2.getHeight(); j++) {
                System.out.printf("%6d  ", res[i][j]);
            }
            System.out.println();
        }
    }
}
