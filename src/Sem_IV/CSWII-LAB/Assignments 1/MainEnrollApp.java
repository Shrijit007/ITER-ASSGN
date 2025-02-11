import java.util.ArrayList;

// Student class (high cohesion: only manages student properties)
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class (high cohesion: only manages course properties)
class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Interface to ensure loose coupling
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollments();
}

// Enrollment class (manages enrollments while adhering to the EnrollmentSystem interface)
class Enrollment implements EnrollmentSystem {
    private ArrayList<String> enrollments = new ArrayList<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        String record = student.getName() + " (" + student.getStudentId() + ") enrolled in " + course.getCourseName() + " (" + course.getCourseCode() + ")";
        enrollments.add(record);
        System.out.println("Enrollment Successful: " + record);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        String record = student.getName() + " (" + student.getStudentId() + ") enrolled in " + course.getCourseName() + " (" + course.getCourseCode() + ")";
        if (enrollments.remove(record)) {
            System.out.println("Dropped Successfully: " + record);
        } else {
            System.out.println("Error: Student not found in course.");
        }
    }

    @Override
    public void displayEnrollments() {
        System.out.println("\nCurrent Enrollments:");
        if (enrollments.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (String record : enrollments) {
                System.out.println(record);
            }
        }
    }
}

// Main class to demonstrate the system
public class MainEnrollApp {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S101", "Alice Johnson");
        Student student2 = new Student("S102", "Bob Smith");

        // Create courses
        Course course1 = new Course("CSE101", "Introduction to Computer Science");
        Course course2 = new Course("MTH202", "Advanced Mathematics");

        // Use EnrollmentSystem interface for loose coupling
        EnrollmentSystem enrollmentSystem = new Enrollment();

        // Enroll students
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.enrollStudent(student1, course2);

        // Display enrollments
        enrollmentSystem.displayEnrollments();

        // Drop a student
        enrollmentSystem.dropStudent(student1, course2);

        // Display enrollments again
        enrollmentSystem.displayEnrollments();
    }
}
