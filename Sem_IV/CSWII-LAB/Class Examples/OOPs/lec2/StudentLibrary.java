package com.csw2.lec2;

public class StudentLibrary {
	
	private Student[] studentList;
	private int count;
	
	public StudentLibrary() {
		super();
	}
	
	public StudentLibrary(int size) {
		super();
		this.studentList = new Student[size];
		this.count = 0;
	}
	
	public void addStudent(Student s) {
		if(this.count >= this.studentList.length) {
			System.out.println("Student list full.");
			return;
		} else {
			this.studentList[this.count++] = s;
			System.out.println("Student added.");
		}
	}
	
	public void displayStudentDetails() {
		if(count>0) {
			for(int i = 0; i < this.count; i++) {
				System.out.println(this.studentList[i]);
			}
		} else {
			System.out.println("Student list is empty.");
		}
	}
	
	public void searchRoll(int n) {
		boolean found = false;
		if(this.count == 0) {
			System.out.println("Student list is empty.");
		} else {
			for(int i = 0 ; i < this.count; i++) {
				if(studentList[i].getRoll() == n) {
					System.out.println("Student present-> "+ studentList[i]);
					found = true;
				}
			}
		} 
		if(!found) System.out.println("Student not present.");
	}
	
}
