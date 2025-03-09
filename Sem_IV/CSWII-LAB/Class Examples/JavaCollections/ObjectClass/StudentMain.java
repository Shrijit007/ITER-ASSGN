package com.csw2.ObjectClass;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("AAA", 1);
		Student s2 = new Student("AAA", 1);
		System.out.println(s1.equals(s2) ? "Equal" : "Not Equal");
	}
}
