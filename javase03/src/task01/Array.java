package task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class Array {

    private int width;
    private int height;
    private int[][] array;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Array() {
        this(5, 5);
    }

    public Array(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        array = new int[this.width][this.height];
    }

    public void writeArray() {
        System.out.println();

        for(int i = 0; i < this.width; i++) {
            for(int j = 0; j < this.height; j++) {
                if(j % this.width == 0 && j <= this.width) {
                    System.out.println();
                }
                System.out.printf("%5d", array[i][j]);
            }
        }
    }

    public void setValue(Generator generator) {
        for(int i = 0; i < this.width; i++) {
            for(int j = 0; j < this.height; j++) {
                array[i][j] = generator.generate();
            }
        }
    }
}
