//Q6
class College{
    private String CollegeName;
    private String CollegeLoc;

    public String getCollegeName(){
        return CollegeName;
    }
    public String getCollegeLoc(){
        return CollegeLoc;
    }

    College(String CollegeName, String CollegeLoc){
        this.CollegeName = CollegeName;
        this.CollegeLoc = CollegeLoc;
    }
}

class Student{
    private String StudentName;
    private int StudentID;
    private College college;

    public Student(String StudentName, int StudentID, College college){
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.college = college;
    }

    public void displayStudentInfo(){
        System.out.println("Student Name: " + StudentName);
        System.out.println("Student ID: " + StudentID);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc()+"\n");
    }
}

public class MainApp {
        public static void main(String[] args) {
        College ITER = new College("ITER", "Bhubaneswar");
        College SUM = new College("SUM", "Bhubaneswar");
        Student s1 = new Student("Shrijit", 101, ITER);
        Student s2 = new Student("Saurav", 102, SUM);
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}