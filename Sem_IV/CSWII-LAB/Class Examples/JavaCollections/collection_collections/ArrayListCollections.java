package com.csw2.collection_collections;
import java.util.*;

class MyComparatorArrayList implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
}

public class ArrayListCollections {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(2);
		a.add(4);
		a.add(17);
		a.add(20);
		a.add(1);
		System.out.println("Natural order " + a);
		Collections.reverse(a);
		System.out.println("Reversed: " + a);
		Collections.sort(a,new MyComparatorArrayList());
		System.out.println("Using Comparator sort " + a);
		System.out.println(Collections.binarySearch(a,2,new MyComparatorArrayList()));
		Collections.sort(a);
		System.out.println("Using Default sort " + a);
		System.out.println(Collections.binarySearch(a,2));
	}
}

