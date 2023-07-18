package Inheritance.Hierarchical_Inheritance;

public class Student extends Person{
    private int std_id;
    private String college_name;
    private String branch;

    public Student(String name, String country, int age, int std_id, String college_name, String branch) {
        super(name, country, age);
        this.std_id = std_id;
        this.college_name = college_name;
        this.branch = branch;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "std_id=" + std_id + ", name = " + getName() + ", country = " + getCountry() + ", age = " + getAge() +
                ", college_name='" + college_name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
