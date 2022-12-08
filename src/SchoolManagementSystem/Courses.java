package SchoolManagementSystem;

public class Courses {
    private String courseName;
    private Classes classes;
    private Teacher teacher;

    public Courses(String courseName, Classes classes, Teacher teacher){
        this.courseName = courseName;
        this.classes = classes;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
