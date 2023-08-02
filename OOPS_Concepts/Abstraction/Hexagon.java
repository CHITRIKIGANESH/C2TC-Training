package Abstraction;

public class Hexagon extends Shape{
    double side;
    Hexagon(double side){
        this.side = side;
    }
    @Override
    double calArea() {
        return (((3*Math.sqrt(3))/2)*(side*side));
    }
}
