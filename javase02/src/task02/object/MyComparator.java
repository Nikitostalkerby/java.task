package task02.object;

import java.util.Comparator;

public class MyComparator implements Comparator<WithoutComparable> {

	@Override
	public int compare(WithoutComparable o1, WithoutComparable o2) {
		return (o1.getI() < o2.getI()) ? -1 : ((o1.getI() == o2.getI()) ? 0 : 1);
	}
}