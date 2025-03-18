//Q1

public class Student {
    private String name;
    private String rollNumber; 
    private int age;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = Integer.toString(rollNumber);
    }
    
    public String toString() {
        return "Name: " + name + ", RollNumber: " + rollNumber + " Age: " + age;
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", " ", 20);
        Student student2 = new Student("Bob", " ", 22);
        student1.setRollNumber(23);
        student2.setRollNumber("24");
        System.out.println(student1);
        System.out.println(student2);
    }
}