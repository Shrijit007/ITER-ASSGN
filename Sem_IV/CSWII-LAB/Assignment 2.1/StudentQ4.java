//Q4

public class StudentQ4 implements Comparable<StudentQ4> {
    private String name;
    private int rollNumber;
    private double totalMarks;

    public StudentQ4(String name, int rollNumber, double totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int compareTo(StudentQ4 student) {
        if(this.name.equals(student.name) && this.rollNumber == student.rollNumber && this.totalMarks == student.totalMarks) {
            return 1;
        }
        return -1;
    } 

    public String toString() {
        return "Name: " + name + ", Roll: " + rollNumber + ", Total Makrs: " + totalMarks;
    }
}
class StudentQ4Main {
    public static void main(String[] args) {
        StudentQ4[] students = new StudentQ4[3];
        students[0] = new StudentQ4("Alice", 123, 90.0);
        students[1] = new StudentQ4("Bob", 456, 80.0);
        students[2] = new StudentQ4("Charlie", 789, 90.0);
        StudentQ4 toSearch = new StudentQ4("Alice", 123, 90.0);
        Boolean found = false;
        for(int i = 0; i < students.length; i++) {
            if(students[i].compareTo(toSearch) == 1) {
                System.out.println("Student found:" + '\n' + students[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Student not found");
        }
    }
}
