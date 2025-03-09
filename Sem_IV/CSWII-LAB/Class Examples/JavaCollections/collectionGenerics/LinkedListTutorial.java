package com.csw2.collectionGenerics;
import java.util.*;

public class LinkedListTutorial {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.addFirst("a");
		l.removeLast();
		System.out.println(l);
		//cursor ~ ListIterator
		
		ListIterator<String> itr = l.listIterator();
		System.out.println(itr.hasPrevious());
		while(itr.hasNext()) {
			String s = itr.next();
			if(s=="A") itr.set("b");
		}
		itr.add("c");
		
		System.out.println(l);
	}
}
