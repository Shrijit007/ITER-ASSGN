package in.soa.beans;

public class Student {
	private int rollno;
	private String name;
	private Address addr;
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void display() {
		System.out.println("Roll No: "+getRollno());
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAddr());
	}
}
