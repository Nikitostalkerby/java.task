package com.itibo.tasks.first;

import java.util.Comparator;
import java.util.Map;

/*
 * Описание зачем оно надо
 */

public class ValueComparator implements Comparator<Object> {

	Map<Character, Integer> base;
	
	public ValueComparator(Map<Character, Integer> base) {
		this.base = base;
	}
	
	@Override
	public int compare(Object a, Object b) {
		
		if((Integer)base.get(a) < (Integer)base.get(b)) {
			return 1;
		}
		else if ((Integer)base.get(a) == (Integer)base.get(b)) {
			return 0;
		}
		else {
			return -1;
		}
	}

	
}
