package task01;

/**
 * Created by Union.one on 05.11.2015.
 */
public class javase03task01 {

    public static void main(String[] args) {
        // initialize
        Generator generator = new Generator();
        Array matrix = new Array();
        Array neo = new Array();

        // generate
        matrix.setValue(generator);
        neo.setValue(generator);

        // write to console
        matrix.writeArray();
        neo.writeArray();
    }
}
