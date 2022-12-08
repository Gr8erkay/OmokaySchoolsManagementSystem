package SchoolManagementSystem;

import java.util.List;

public class Staff {
    private String name;
    private int id;
    private int age;
    private String qualification;
    private List<Teacher> teachers;
    private List<NonAcademicStaff> nonAcademicStaffs;
    private Principal principal;


    public Staff(String name, int id, int age, String qualification) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.qualification = qualification;
    }

    public Staff(String name, int age) {
    }

    public Staff(String name, int age, String qualification) {
    }

    public Staff(String name, int age, String qualification, String jobFunction, String department, int id) {
    }

    public Staff(List<Teacher> teachers, List<NonAcademicStaff> nonAcademicStaffs, Principal principal) {
        this.teachers = teachers;
        this.nonAcademicStaffs = nonAcademicStaffs;
        this.principal = principal;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getQualification() {
        return qualification;
    }
}
