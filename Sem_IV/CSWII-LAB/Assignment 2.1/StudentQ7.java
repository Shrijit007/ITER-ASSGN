import java.util.Arrays;
import java.util.Comparator;

public class StudentQ7 {
    private String name;
    private int rollNo;
    private int age;

    public StudentQ7(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Roll: " + rollNo + ", Age: " + age;
    }

    public static void main(String[] args) {
        StudentQ7[] students = {
            new StudentQ7("Alice", 3, 20),
            new StudentQ7("Bob", 1, 22),
            new StudentQ7("Charlie", 2, 21)
        };

        Arrays.sort(students, new Comparator<StudentQ7>() {
            public int compare(StudentQ7 s1, StudentQ7 s2) {
                return Integer.compare(s1.rollNo, s2.rollNo);
            }
        });

        System.out.println("Sorted by rollNo:");
        for (StudentQ7 student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new Comparator<StudentQ7>() {
            public int compare(StudentQ7 s1, StudentQ7 s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });

        System.out.println("\nSorted by age:");
        for (StudentQ7 student : students) {
            System.out.println(student);
        }
    }
}