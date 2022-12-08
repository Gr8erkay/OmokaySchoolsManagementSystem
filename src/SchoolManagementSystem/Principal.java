package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Principal extends Staff {
    private List<Student> admittedStudents = new ArrayList();
    private List<Student> expelledStudents = new ArrayList();
    private List<Teacher> admittedTeacher = new ArrayList<>();

    public Principal(String name, int id, int age, String qualification) {
        super(name, id, age, qualification);

    }

    public String admitStudent(Applicant applicant) {
        if (applicant.getAge() > 17 && applicant.getAge() < 30) {
            Student student = new Student(applicant.getName(), applicant.getAge());
            this.admittedStudents.add(student);
            return "ADMITTED";
        } else {
            return "NOT ADMITTED";
        }
    }

    public String expelStudent(Student student) {
        if (student.getCgpa() < 1.0) {
            this.admittedStudents.remove(student);
            return "EXPELLED";
        } else {
            return "NOT EXPELLED";
        }
    }

    public String admitStaff(Applicant applicant) {
        if (applicant.getAge() > 25 && applicant.getAge() < 60 && applicant.getQualification() == "BSc") {
            Teacher teacher = new Teacher(applicant.getName(), applicant.getAge(), applicant.getQualification());
            this.admittedTeacher.add(teacher);
            return "EMPLOYED AS TEACHER";
        } else if (applicant.getAge() > 18 && applicant.getAge() < 60){
            NonAcademicStaff nonAcademicStaff = new NonAcademicStaff(applicant.getName(), applicant.getAge(), applicant.getQualification());
            return "EMPLOYED AS NON-ACADEMIC STAFF";
        } else {
            return "NOT EMPLOYABLE";
        }
    }
}

