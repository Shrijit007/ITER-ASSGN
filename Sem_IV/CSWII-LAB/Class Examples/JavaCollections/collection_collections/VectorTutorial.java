package com.csw2.collection_collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorTutorial {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(10,10);
	
		//vector(int initialCapacity, int capacityIncerement)
		//vector(int initialCapacity)
		//vector()
		//vector(Collection<extends E> C)
		
		vec.add("ABC");
		vec.addElement("DEF");
		System.out.println(vec);
		//cursor ~ Enumerator
		Enumeration<String> e = vec.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
	}

}
