package com.csw2.polymorphism;

class A{
	public Object display(int a) {
		System.out.println("Class A method");
		return null;
	}
}

class B extends A{
	public String /* <--COVARIANT */ display(int b) {
		System.out.println("Class B method");
		return null;
	}
}

public class methodOverRidingEG1 {

	public static void main(String[] args) {
		  A a = new A();
		  B b = new B();
		  a.display(1);
		  b.display(1);
	}

}
