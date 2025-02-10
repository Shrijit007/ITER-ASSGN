package com.csw2.aggregation;

public class Department {
	private String Deptname;
	private Professor[] professors;
	private int Profcount;
	
	public Department(String deptname,int size) {
		super();
		Deptname = deptname;
		this.professors = new Professor[size];
		this.Profcount = 0;
	}
	
	public void addProfessor(Professor p) {
		if(this.Profcount < this.professors.length) {
			this.professors[this.Profcount++] = p;
		} else {
			System.out.println("No positions left.");
		}
	}
	
	public void showAllProfessors() {
		System.out.print(Deptname+" has following professors: ");
		for (int i = 0; i < Profcount; i++) {
			System.out.print(professors[i] + " , ");
		} System.out.println();
	}
}
