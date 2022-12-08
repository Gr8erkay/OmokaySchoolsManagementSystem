package SchoolManagementSystem;

import java.util.List;

public class NonAcademicStaff extends Staff {

    private String jobFunction;
    private String department;

    public NonAcademicStaff(String name, int age, String qualification) {
        super(name, age, qualification);
    }
    public NonAcademicStaff(String name, int age, String qualification, String jobFunction, String department, int id) {
        super(name, age, qualification, jobFunction, department, id);
    }

    public NonAcademicStaff(List<Teacher> teachers, List<NonAcademicStaff> nonAcademicStaffs, Principal principal, String jobFunction, String department) {
        super(teachers, nonAcademicStaffs, principal);
        this.jobFunction = jobFunction;
        this.department = department;
    }

    public String getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
