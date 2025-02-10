package com.csw2.lec2;

public class Student {

	private String name, branch;
	private int roll;

	Student(){
		super();
	}
	
	public Student(String name, String branch, int roll) {
		super();
		this.name = name;
		this.branch = branch;
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Branch: " + branch + ", Roll: " + roll ;
	}
}
