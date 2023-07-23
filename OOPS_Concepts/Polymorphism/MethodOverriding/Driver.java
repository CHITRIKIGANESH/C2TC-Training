package Polymorphism.MethodOverriding;

public class Driver {
    public static void main(String[] args) {
        RBI r = new RBI();
        System.out.println(r.rateOfInterest());
        r = new ICICI();
        System.out.println(r.rateOfInterest());
        r = new SBI();
        System.out.println(r.rateOfInterest());
    }

}
