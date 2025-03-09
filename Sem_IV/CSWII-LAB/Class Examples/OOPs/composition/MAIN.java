package com.csw2.composition;

public class MAIN {
	public static void main(String[] args) {
		University uni = new University("SOA", 2);
		uni.addDepartment("ITER");
		uni.addDepartment("SUM");
		uni.showDepartment();
		uni.addDepartment("SNIL");
		uni.showDepartment();
	}
}
