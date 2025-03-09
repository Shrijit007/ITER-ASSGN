package com.csw2.collectionGenerics;
import java.util.ArrayList;

public class Student {
	private String name;
	private int roll;
	private String branch;
	public Student(String name, int roll, String branch) {
		super();
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}
	public String toString() {
		return  name + " " + roll + " " + branch;
	}
	
	public static void main(String[] args) {
		StudentLibrary s = new StudentLibrary();
		s.addStudent(new Student("A", 1, "CSE"));
		Student s2 = new Student("B", 12, "ECE");
		s.addStudent(s2);
		s.showStudent();
		System.out.println(s.searchStudent(1));
		s.removeStudent(s2);
		s.showStudent();
	}
}

class StudentLibrary{
	private ArrayList<Student>students = new ArrayList<Student>();
	public void addStudent(Student s) {
		this.students.add(s);
	}
	public void showStudent() {
		if(students.isEmpty()) System.out.println("List empty.");
		else {
			for(Student s : students) {
				System.out.println("-> " + s);
			}
		}
	}
	public Student searchStudent(int roll) {
		return students.get(roll);
	}
	public void removeStudent(Student s) {
		students.remove(s);
		System.out.println("Student removed."); 
	}
}
