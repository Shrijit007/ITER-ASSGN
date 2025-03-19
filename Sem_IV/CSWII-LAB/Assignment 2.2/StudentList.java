//Q4
import java.util.*;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMark() { return mark; }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }

    public String toString() {
        return "Name: " + name + ", Age:" + age + ", Marks: " + mark;
    }
}

public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 78.0));
        students.add(new Student("Charlie", 21, 92.3));
        
        // (a) Display the list of students
        System.out.println("Student List:");
        students.forEach(System.out::println);

        // (b) Search for a Student object
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter name, age, and mark to search:");
        Student searchStudent = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        System.out.println("Exists: " + students.contains(searchStudent));

        // (c) Remove a Student
        System.out.println("\nEnter name, age, and mark to remove:");
        Student removeStudent = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        students.remove(removeStudent);
        System.out.println("Updated List:");
        students.forEach(System.out::println);
        
        // (d) Count the number of students
        System.out.println("\nTotal Students: " + students.size());
        sc.close();
    }
}
