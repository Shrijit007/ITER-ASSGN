package com.csw2.inheritance;

class StudentDetail {
    private String name;
    private int roll;

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

    @Override
    public String toString() {
        return "StudentDetail [name=" + name + ", roll=" + roll + "]";
    }

    public StudentDetail(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display() {
        System.out.println("Parent display");
    }
}

class Examination extends StudentDetail {

    public Examination(String name, int roll) {
        super(name, roll);
    }

    public void show() {
        System.out.println("Child display");
    }
}

class MidTerm extends StudentDetail {
    private int[] midMarks;

    public MidTerm(String n, int r) {
        super(n, r);
    }

    public void setMidMarks(int[] midMarks) {
        this.midMarks = midMarks;
    }

    public int[] getMidMarks() {
        return midMarks;
    }
}

class EndTerm extends MidTerm {
    private int[] endMarks;
    private int result;
    private MidTerm midExam;

    public EndTerm(String n, int r, MidTerm m) {
        super(n, r);
        midExam = m;
    }

    public int[] getEndMarks() {
        return endMarks;
    }

    public void setEndMarks(int[] endMarks) {
        this.endMarks = endMarks;
    }

    public int getTotal() {
        result = 0; 
        int mid[] = this.midExam.getMidMarks();
        if (mid != null) {
            for (int n : mid) {
                this.result += n;
            }
        }
        int end[] = this.getEndMarks();
        if (end != null) {
            for (int n : end) {
                this.result += n;
            }
        }
        return this.result;
    }

    public double getAverage() {
        int totalMarks = this.getTotal();
        double totalSubjects = this.getEndMarks().length;
        return totalMarks/totalSubjects;
    }
}

public class Student {
    public static void main(String[] args) {
//        Examination s = new Examination("John Doe", 1);
//        s.display();
//        s.show();

        MidTerm m1 = new MidTerm("Raj", 4);
        int[] midMarks = {10, 10, 20};
        m1.setMidMarks(midMarks);

        EndTerm m2 = new EndTerm("Raj", 4, m1);
        int[] endMarks = {10, 10, 20};
        m2.setEndMarks(endMarks);

        int result = m2.getTotal();
        System.out.println("Total: " + result);
        double avg = m2.getAverage();
        System.out.println("Average: " + avg);
    }
}
