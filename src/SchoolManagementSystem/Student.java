package SchoolManagementSystem;

import java.util.List;

public class Student {

    private int studentId;
    private String name;
    private double cgpa;
    private int age;
    private List<Courses> courses;
    private Classes classes;

    public Student(int studentId, String name, double cgpa, Classes classes, Courses courses) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
        this.age = age;
        this.classes = classes;
        this.courses = (List<Courses>) courses;


    }

    public Student(String name, int age) {
    }

    public void setCgpa( int cgpa) {
        this.cgpa = cgpa;
    }
    public void setClasses (Classes classes) {
        this.classes = classes;
    }
    public void setCourses (Courses courses) {
        this.courses = (List<Courses>) courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getAge() {
        return age;
    }

    public Courses getCourses() {
        return (Courses) courses;
    }

    public Classes getClasses() {
        return classes;
    }
}
