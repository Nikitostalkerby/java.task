package task03;

import java.util.Comparator;

/**
 * Created by Vaas on 07.11.2015.
 */
public class SortedByYear implements Comparator<Sign> {

    @Override
    public int compare(Sign o1, Sign o2) {
        Integer year1 = o1.getbDay().getYear();
        Integer year2 = o2.getbDay().getYear();

        if(year1 > year2) {
            return 1;
        }
        else if(year1 < year2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
