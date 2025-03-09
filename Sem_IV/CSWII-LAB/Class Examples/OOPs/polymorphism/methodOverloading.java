package com.csw2.polymorphism;

public class methodOverloading {
	public static void func() {System.out.println("No args");}
	public static void func(int n) {System.out.println("Int args");}
	public static void func(int n, float f) {System.out.println("Int-float args");}
	
	public static void main(String[] args) {
		func();
		func(1);
		func(1,50);
	}
}
