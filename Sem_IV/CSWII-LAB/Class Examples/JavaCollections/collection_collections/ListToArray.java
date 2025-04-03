package com.csw2.collection_collections;
import java.util.*;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(2);
		a.add(4);
		a.add(17);
		a.add(20);
		a.add(1);
		System.out.println(a);
		Object[] arr = a.toArray();
		System.out.println(Arrays.toString(arr));
		
	}
}
