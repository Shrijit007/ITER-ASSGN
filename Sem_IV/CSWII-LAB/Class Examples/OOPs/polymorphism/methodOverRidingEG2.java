package com.csw2.polymorphism;

class C{
	public Object display(Object ob) {
		System.out.println("Object args");
		return null;
	}
}

class D extends C{
	public String /* <--COVARIANT */ display(String s) {
		System.out.println("String args");
		return null;
	}
}

public class methodOverRidingEG2 {
	
	public static void main(String[] args) {
		  C c = new C();
		  c.display(c);
		  c.display(null);
		  D d = new D();
		  d.display(new Object());
		  d.display(null);
	}
}
