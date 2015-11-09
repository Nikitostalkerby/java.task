package task01;

/**
 * Created by Union.one on 09.11.2015.
 */
public class Check {
    public static boolean isGo(Cell firstCell, Cell secondCell) {
        if ((firstCell.getX() + firstCell.getY()) == (secondCell.getX() + secondCell.getY()) ||
                (secondCell.getX() - firstCell.getX()) == (secondCell.getY() - firstCell.getY())) {
            return true;
        }
        return false;
    }
}
