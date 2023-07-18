package Inheritance.Hierarchical_Inheritance;

public class Employee extends Person{

    private int emp_id;
    private String company_name;
    private String designation;
    private float salary;

    //constructor
    public Employee(String name, String country, int age, int emp_id, String company_name, String designation, float salary) {
        super(name, country, age);
        this.emp_id = emp_id;
        this.company_name = company_name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id + ", name = " + getName() + ", country = " + getCountry() + ", age = " + getAge() +
                ", company_name='" + company_name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
