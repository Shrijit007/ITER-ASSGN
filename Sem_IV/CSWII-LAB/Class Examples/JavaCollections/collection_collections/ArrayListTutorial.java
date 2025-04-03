package com.csw2.collection_collections;
import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListTutorial {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();
		a.add("iter");
		a.add("soa");
		a.add("");
		a.add("csw");
		a.add(1, "uni");
		System.out.println(a);
		//cursor ~ Iterator
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s=="") itr.remove();
		}
		
		System.out.println(a);
	}

}
