package com.csw2.lec1;

public class Employee {

	private String empName;
	private String empDesignation;
	private double empSalary;


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}

	public String toString() {
		return "Employee Name: "+empName + '\n' + "Employee Designation: "+empDesignation+'\n'+"Employee Salary: "+empSalary+'\n';
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("Jack");
		emp1.setEmpDesignation("Manager");
		emp1.setEmpSalary(15000);
		System.out.println(emp1);
		Employee emp2 = new Employee();
		emp2.setEmpName("Oggy");
		emp2.setEmpDesignation("Labour");
		emp2.setEmpSalary(250);
		System.out.println(emp2);
	}
}
