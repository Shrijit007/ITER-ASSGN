package com.csw2.collection_collections;

import java.util.Comparator;

public class ComparatorTutorial implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
//		if(o1>o2) return -1;
//		else if(o1<o2) return 1;
//		else return 0;
		return o2.compareTo(o1);
	}
	
}
