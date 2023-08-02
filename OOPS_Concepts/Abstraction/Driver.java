package Abstraction;

public class Driver {
    public static void main(String[] args) {
        Shape s = new Hexagon(6);
        System.out.println(s.calArea());
    }


}
