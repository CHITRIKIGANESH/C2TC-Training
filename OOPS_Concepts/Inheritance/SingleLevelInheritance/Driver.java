package Inheritance.SingleLevelInheritance;

public class Driver {
    public static void main(String[] args) {
        Science s = new Science();
        s.name = "Chitriki Ganesh";
        s.id = 100;
        s.setSalary(50000);
        s.setBonus(10000);
        System.out.println("Salary = " + s.getSalary());
        System.out.println("Bonus = " + s.getBonus());
        System.out.println(s);
    }
}
