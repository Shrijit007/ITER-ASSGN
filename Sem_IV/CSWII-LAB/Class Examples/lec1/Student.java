package com.csw2.lec1;

public class Student {
	
	private String name;
	private int roll;
	private String branch;
	private int age;
	
	public Student() { super(); }
	
	public Student(String name, int roll, String branch) {
		this();
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setAge(int age) {
		if(age < 18) 
			System.out.println("Ineligible to cast a Vote.");
		else 
			this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	public String getBranch() {
		return this.branch;
	}
		public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.name + " " + this.roll + " " + this.branch ;
	}

	public static void main(String[] args) {
		Student s0 = new Student("B",0,"ECE");
		Student s1 = new Student();
		
		s1.setName("A");
		s1.setBranch("CSE");
		s1.setRoll(1);
		s1.setAge(20);
		System.out.println(s0);
		System.out.println(s1.getName()+" "+s1.getRoll()+" "+s1.getBranch()+" "+s1.getAge());
	}
}
