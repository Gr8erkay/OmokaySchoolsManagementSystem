package SchoolManagementSystem;

public class Applicant {
    private String name;
    private int age;
    private String qualification;

    public Applicant (String name, int age, String qualification){
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
