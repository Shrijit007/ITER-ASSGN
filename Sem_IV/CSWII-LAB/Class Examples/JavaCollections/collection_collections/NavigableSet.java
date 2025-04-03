package com.csw2.collection_collections;
import java.util.*;

public class NavigableSet {
	public static void main(String[] trgs) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(2);
		t.add(2);
		t.add(4);
		t.add(17);
		t.add(20);
		System.out.println(t);
		System.out.println(t.floor(18));
		System.out.println(t.lower(18));
		System.out.println(t.higher(20));
		System.out.println(t.ceiling(18));
	}
}
