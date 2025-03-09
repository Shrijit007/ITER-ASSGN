package com.csw2.collectionExample;

public class Student implements Comparable<Student>{
	private String  name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	private int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public int compareTo(Student o) {
		if(this.getRoll()>o.getRoll()) return -1;
		if(this.getRoll()<o.getRoll()) return 1;
		else return 0;
	}
	
}
