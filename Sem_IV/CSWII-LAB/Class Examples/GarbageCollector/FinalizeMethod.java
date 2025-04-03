
class Student {
	private String name;
	private int roll;
	private String branch;

	public Student(String name, int roll, String branch) {
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}

	public String toString() {
		return "Name: " + name + ", Roll: " + roll + ", Branch: " + branch;
	}

	public void finalize() throws Throwable {
		System.out.println("Student Finalize mathod called");
	}
}

public class FinalizeMethod {
	public static void main(String[] args) {
		Student s = new Student("hhh", 65, "CSE");
		System.out.println(s);
		s = null;
//		System.gc();
		Runtime r = Runtime.getRuntime();
		r.gc();
		System.out.println("END IN MAIN");
	}
}