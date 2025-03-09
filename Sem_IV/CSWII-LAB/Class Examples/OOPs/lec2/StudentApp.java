package com.csw2.lec2;

public class StudentApp {
	
	public static void main(String[] args) {

		StudentLibrary l1 = new StudentLibrary(3);
		l1.displayStudentDetails();
		l1.addStudent(new Student("A","CSE",1));
		l1.addStudent(new Student("B","CSE",2));
		l1.addStudent(new Student("C","CSE",3));
		l1.addStudent(new Student("D","CSE",4));
		l1.displayStudentDetails();
		l1.searchRoll(2);
	}

}
