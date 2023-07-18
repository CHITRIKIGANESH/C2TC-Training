package Inheritance.Hierarchical_Inheritance;

public class Driver {
    public static void main(String[] args) {

        Person p = new Person();//tight coupling

        //dynamic binding//runtime polymorphism//loose coupling
        p = new Employee("Ganesh","India",21,101,"Google","Software Engineer",100000);
        System.out.println(p);

        p = new Student("Alex","Russia",22,101,"pes university","cse");
        System.out.println(p);
    }
}
