//Q5

public class StudentQ5 implements Comparable<StudentQ5> {
    private String name;
    private int rollNumber;
    private double totalMarks;

    public StudentQ5(String name, int rollNumber, double totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int compareTo(StudentQ5 student) {
        return Integer.compare(this.rollNumber, student.rollNumber);
    }

    public String toString() {
        return "Name: " + name + ", Roll: " + rollNumber + ", Total Makrs: " + totalMarks;
    }
}

class StudentQ5Main {
    public static void main(String[] args) {
        StudentQ5[] students = {
            new StudentQ5("Alice", 3, 85.5),
            new StudentQ5("Bob", 1, 90.0),
            new StudentQ5("Charlie", 2, 78.0)
        };
        bubbleSort(students);
        for (StudentQ5 student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(StudentQ5[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    StudentQ5 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}