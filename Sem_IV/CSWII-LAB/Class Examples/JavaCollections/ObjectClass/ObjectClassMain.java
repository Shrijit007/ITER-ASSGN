package com.csw2.ObjectClass;

class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return "Temp:"+this.hashCode();
	}
}

public class ObjectClassMain {
	public static void main(String[] args) {
		Temp t = new Temp(10);
		System.out.println(t);
		
		StringBuffer S1 = new StringBuffer("H");
		StringBuffer S2 = new StringBuffer("H");
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		System.out.println(S1.compareTo(S2));
		System.out.println(S1.hashCode());
	}
}
