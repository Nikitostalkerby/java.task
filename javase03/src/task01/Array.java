package task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class Array {

    private  final byte WIDTH = 5;
    private final byte HEIGHT = 5;

    private byte width;
    private byte height;
    private int[][] array;

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        this.width = width;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(byte height) {
        this.height = height;
    }

    public Array() {
        this.width = WIDTH;
        this.height = HEIGHT;
        array = new int [this.width][this.height];
    }

    public Array(byte width, byte height) {
        this.width = width;
        this.height = height;
        array = new int[this.width][this.height];
    }

    public void writeArray() {
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
