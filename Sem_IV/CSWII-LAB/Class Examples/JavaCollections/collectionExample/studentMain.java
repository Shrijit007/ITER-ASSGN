package com.csw2.collectionExample;
import java.util.Comparator;
import java.util.TreeSet;

public class studentMain{
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new myComparator());
		ts.add(new Student("A", 1));
		ts.add(new Student("B", 3));
		ts.add(new Student("E", 6));
		ts.add(new Student("C", 4));
		ts.add(new Student("B", 2));
		ts.add(new Student("D", 5));
		System.out.println(ts);
	}
}

class myComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
}
