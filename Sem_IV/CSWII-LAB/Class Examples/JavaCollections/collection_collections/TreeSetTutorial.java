package com.csw2.collection_collections;
import java.util.*;

public class TreeSetTutorial {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new ComparatorTutorial());
		ts.add(10);
		ts.add(1);
		ts.add(25);
		ts.add(0);
		ts.add(2);
		ts.add(1);
		System.out.println(ts);
	}
}    
