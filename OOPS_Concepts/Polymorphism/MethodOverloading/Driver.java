package Polymorphism.MethodOverloading;

public class Driver {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.add(20,30);
        System.out.println(s.add(30.2f,25));
        s.add(20.5f,30.2f);

    }
}
