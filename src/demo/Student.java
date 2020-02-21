package demo;

/**
 * @Author: Mr.Zhou
 * @Date 2020/2/21
 * @Explain:
 */
public class Student extends Person implements Info {
    private String school;
    static {

    }

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
