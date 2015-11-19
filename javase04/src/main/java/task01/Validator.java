package task01;

/**
 * Created by Union.one on 09.11.2015.
 */
public class Validator {
    public static boolean check(Cell firstCell, Cell secondCell) {
        return ((firstCell.getX() + firstCell.getY()) == (secondCell.getX() + secondCell.getY()) ||
                (secondCell.getX() - firstCell.getX()) == (secondCell.getY() - firstCell.getY()));
    }
}
