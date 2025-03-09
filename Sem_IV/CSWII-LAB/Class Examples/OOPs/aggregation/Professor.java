package com.csw2.aggregation;

public class Professor {
	private String profName;
	private String specialization;
	
	public Professor(String profName, String specialization) {
		super();
		this.profName = profName;
		this.specialization = specialization;
	}
	
	public String toString() {
		return profName + "[" + specialization + "]";
	}
	
	
	
}
