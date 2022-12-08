
package SchoolManagementSystem;

public class Classes {
    private String className;
    private Teacher teacher;
    private Courses courses;

    private Student Student;

    public Classes ( String className, Teacher teacher, Courses courses) {
        this.className = className;
        this.teacher = teacher;
        this.courses = courses;

    }

    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Courses getCourses() {
        return courses;
    }
}
