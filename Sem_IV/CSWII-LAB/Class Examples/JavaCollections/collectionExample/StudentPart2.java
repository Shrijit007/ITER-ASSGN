package com.csw2.collectionExample;
import java.util.ArrayList;

public class StudentPart2 {
	private String name;
	private int roll;
	private String branch;
	public StudentPart2(String name, int roll, String branch) {
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
		s.addStudent(new StudentPart2("A", 1, "CSE"));
		StudentPart2 s2 = new StudentPart2("B", 12, "ECE");
		s.addStudent(s2);
		s.showStudent();
		System.out.println(s.searchStudent(1));
		s.removeStudent(s2);
		s.showStudent();
	}
}

class StudentLibrary{
	private ArrayList<StudentPart2>students = new ArrayList<StudentPart2>();
	public void addStudent(StudentPart2 s) {
		this.students.add(s);
	}
	public void showStudent() {
		if(students.isEmpty()) System.out.println("List empty.");
		else {
			for(StudentPart2 s : students) {
				System.out.println("-> " + s);
			}
		}
	}
	public StudentPart2 searchStudent(int roll) {
		return students.get(roll);
	}
	public void removeStudent(StudentPart2 s) {
		students.remove(s);
		System.out.println("Student removed."); 
	}
}
