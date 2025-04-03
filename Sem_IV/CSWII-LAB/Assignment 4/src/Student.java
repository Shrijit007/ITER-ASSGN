public class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Enrolled in Course: " + course);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Student object for " + name + " has been garbage collected.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Initial Memory Usage:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        Student s1 = new Student("Alice", "Computer Science");
        Student s2 = new Student("Bob", "Mechanical Engineering");

        s1.displayDetails();
        s2.displayDetails();

        System.out.println("Memory After Creating Students:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        s1 = null;
        s2 = null;

        System.gc();

        System.out.println("Memory After Garbage Collection:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
    }
}
