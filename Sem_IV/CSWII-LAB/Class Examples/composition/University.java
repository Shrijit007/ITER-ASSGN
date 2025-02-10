package com.csw2.composition;
import java.util.Arrays;

public class University {
	private String uniName;
	private Department[] departments;
	private int deptCount;
	
	public University(String name, int size) {
		this.uniName = name;
		this.departments = new Department[size];
		this.deptCount = 0;
	}
	
	public void addDepartment(String s) {
		if(this.deptCount < departments.length) {
			this.departments[this.deptCount++] = new Department(s);
		} else {
			System.out.println("Can't add department :(");
		}
	}
	
	public void showDepartment(){
		System.out.print(uniName+": ");
		System.out.println(Arrays.toString(this.departments));
	}
	
}
