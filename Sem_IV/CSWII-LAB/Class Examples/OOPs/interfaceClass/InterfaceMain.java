package com.csw2.interfaceClass;

interface Interface1{
	int i = 0;
	void show1();
	void show2();
	static int add(int a,int b) {
		return a+b;
	}
}

interface Interface2 extends Interface1{
	void show3();
}

class MultiInheritance implements Interface1,Interface2{
	public void show1() {
		System.out.println("show1 for multiInheritance");
	}
	public void show2() {
		System.out.println("show2 for multiInheritance");
	}
	public void show3() {
		System.out.println("show3 for multiInheritance" );
	}
}

class SubSubSeriveProvider implements Interface2{
	public void show1() {
		System.out.println("show1 implements Interface");
	}
	public void show2() {
		System.out.println("show2 implements Interface");
	}
	public void show3() {
		System.out.println("show3 implements Interface");
	}
}

abstract class ServiceProvider implements Interface1{
	public void show1() {
		System.out.println("show1");
	}
}

class SubServiceProvider extends ServiceProvider{
	public void show2() {
		System.out.println("show2");
	}
}

public class InterfaceMain {
	public static void main(String[] args) {
		SubServiceProvider s = new SubServiceProvider();
		s.show1();
		s.show2();
		SubSubSeriveProvider ss = new SubSubSeriveProvider();
		ss.show1();
		ss.show2();
		ss.show3();
		MultiInheritance m = new MultiInheritance();
		m.show1();
		m.show2();
		m.show3();
		System.out.println(Interface1.add(2,4));
	}
}
