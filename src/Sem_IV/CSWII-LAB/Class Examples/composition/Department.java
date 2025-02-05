package com.csw2.composition;

public class Department {
	private String deptName;

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return deptName ;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
