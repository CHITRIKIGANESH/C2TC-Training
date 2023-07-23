package Polymorphism.MethodOverloading;

public class Sum {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(float a,float b){
        System.out.println(a+b);
    }
    public float add(float a,int b){
        return (a+b);
    }
}
