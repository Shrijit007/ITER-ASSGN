package com.csw2.ObjectClass;

import java.util.Comparator;

public class Student {
	private String name;
	private int roll;
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	public boolean equals(Student s) {
		if(this.name == s.name && this.roll == s.roll) return true;
		else return false;
	}
}

