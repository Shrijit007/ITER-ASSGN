import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Student {
	private String name;
	private int roll;
	
public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String toString() {
	return "StudentDetails [name=" + name + ", roll=" + roll + "]";
}

public static void main(String[] args) throws IOException {
	File f1 = new File("Student_File.txt");
	System.out.println(f1.createNewFile());
	ArrayList<Student> s= new ArrayList<>();	
	s.add(new Student("Aditya",65) );
	s.add( new Student("Shrijit",46));
	s.add(new Student("Saurav",62));
	s.add(new Student("Ayushman",37));
	s.add(new Student("Kaustabh",17));
	PrintWriter pw = new PrintWriter(f1);
	pw.println(s);
	pw.close();

 	BufferedReader br = new BufferedReader(new FileReader(f1));
	String str = br.readLine();
	while(str!= null) {
		System.out.println(str);
		str = br.readLine();
	}
	br.close();
	}
}
