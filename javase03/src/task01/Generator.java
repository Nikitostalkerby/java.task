package task01;

import java.util.Random;

/**
 * Created by Union.one on 05.11.2015.
 */
public class Generator {

    private final byte BOUND = 100;

    private byte bound;
    private Random random;

    public byte getBound() {
        return bound;
    }

    public void setBound(byte bound) {
        this.bound = bound;
    }

    public Generator() {
        this.bound = BOUND;
        this.random = new Random(this.bound);
    }

    public Generator(byte bound) {
        this.bound = bound;
        this.random = new Random(this.bound);
    }

    public int generate() {
        return random.nextInt(this.bound);
    }
}
