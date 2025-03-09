package com.csw2.collectionGenerics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTutorial {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"ABC");
		map.put(2,"MNO");
		map.put(3,"XYZ");
		map.put(4,"EFG");
		System.out.println(map);
		Set<Integer> s = map.keySet();
		System.out.println(s);
		Collection<String> c = map.values();
		System.out.println(c);
		Set<Map.Entry<Integer, String>> m = map.entrySet();
		System.out.println(m);
		System.out.println(map.get(1));
		Iterator<Map.Entry<Integer, String>> itr = m.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			if(entry.getKey() == 2) {
				itr.remove();
				break;
			}
		}
		System.out.println(map);
	}
}
