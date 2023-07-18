package Inheritance.MultilevelInheritance;

public class Driver {
    public static void main(String[] args) {
        Son s = new Son("Baby Simbaa", 2);
        s.ParentName = "Parent Simbaa";
        s.ParentAge = 7;
        s.GrandParentName = "GrandParent Simbaa";
        s.GrandParentAge = 14;
        System.out.println(s);
    }
}
