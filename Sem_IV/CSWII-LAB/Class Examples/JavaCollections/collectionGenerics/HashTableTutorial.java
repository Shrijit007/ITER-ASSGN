package com.csw2.collectionGenerics;

import java.util.Hashtable;

class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return "Temp: " + i;
	}
	
}

public class HashTableTutorial {
	public static void main(String[] args) {
		Hashtable<Temp, String> tm = new Hashtable<Temp, String>();
		tm.put(new Temp(5), "A");
		tm.put(new Temp(1), "AC");
		tm.put(new Temp(7), "AX");
		tm.put(new Temp(8), "AB");
		tm.put(new Temp(9), "A");
		tm.put(new Temp(4), "A");
		tm.put(new Temp(3), "AC");
		tm.put(new Temp(6), "AX");
		tm.put(new Temp(2), "AB");
		tm.put(new Temp(0), "A");
		tm.put(new Temp(10), "XX");
		System.out.println(tm);
	}
}

