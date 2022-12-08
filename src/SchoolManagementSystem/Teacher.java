package SchoolManagementSystem;

public class Teacher extends Staff{
    private static Classes classes;
    private Courses courses;

    public Teacher ( String name, int id, int age, String qualification, Classes classes) {
        super(name, id, age, qualification);
        this.classes = classes;

    }

    public static Classes getClasses() {
        return classes;
    }

    public Courses getCourses() {
        return courses;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String qualification) {
        super(name, age, qualification);
    }

    public String takeCourse(Courses courses) {

        if (courses.getClasses() == Teacher.getClasses()) {
            return "TEACHER CAN TAKE COURSE";
        } else {
            return "TEACHER CANNOT TAKE COURSE";
        }
    }
}
