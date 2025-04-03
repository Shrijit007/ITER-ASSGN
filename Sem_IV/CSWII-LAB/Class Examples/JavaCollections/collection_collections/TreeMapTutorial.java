package com.csw2.collection_collections;

import java.util.TreeMap;

public class TreeMapTutorial {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(4, "A");
		tm.put(3, "AC");
		tm.put(6, "AX");
		tm.put(2, "AB");
		tm.put(0, "A");
		System.out.println(tm);
	}

}
