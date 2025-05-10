import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	private String name;
	private int roll;
	private double marks;

	public Student(String name, int roll, double marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name:" + name + ", roll:" + roll + ", marks:" + marks;
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("abc", 2, 94));
		list.add(new Student("ef", 3, 40));
		list.add(new Student("ijk", 9, 10));
		list.add(new Student("xyz", 1, 55));
		Predicate<Student> p1 = n-> n.getMarks()>=60;
		Predicate<Student> p2 = n-> n.getMarks()>=50 && n.getMarks()<60;
		Predicate<Student> p3 = n-> n.getMarks()>=40 && n.getMarks()<50;
		Function<Student,String> func = stud -> {
			String ans = stud.name+" you failed" ;
			if(p1.test(stud)) ans = stud.name+" secured first division.";
			if(p2.test(stud)) ans = stud.name+" secured second division.";
			if(p3.test(stud)) ans = stud.name+" secured third division.";
			return ans;
		};
		Consumer<Student> c = stud -> System.out.println(stud.toString()+"\n"+"----------------------------------------------------");
		for(Student s : list) {
			System.out.println(func.apply(s));
			c.accept(s);
		}
		BiFunction<Integer, String, Student> makeStudObj = (i,j)->new Student(j, i, 0.0);
		Student s = makeStudObj.apply(8, "hehe");
		System.out.println(s.toString());
	}
}