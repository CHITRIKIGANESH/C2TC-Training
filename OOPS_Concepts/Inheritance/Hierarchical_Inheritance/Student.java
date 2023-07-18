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

    @Override
    public String toString() {
        return "Student{" +
                "std_id=" + std_id + ", name = " + getName() + ", country = " + getCountry() + ", age = " + getAge() +
                ", college_name='" + college_name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
