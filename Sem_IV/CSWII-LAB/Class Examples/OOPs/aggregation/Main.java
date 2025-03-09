package com.csw2.aggregation;

public class Main {

	public static void main(String[] args) {
		Professor p1 = new Professor("Mr. ABC", "MATHS");
		Professor p2 = new Professor("Mr. EFG", "PHYSICS");
		
		Department d1 = new Department("CSE", 2);
		d1.addProfessor(p1);
		d1.addProfessor(p2);
		d1.showAllProfessors();
		
		d1 = null;
		System.out.println(p1);
		System.out.println(p2);
	}

}
