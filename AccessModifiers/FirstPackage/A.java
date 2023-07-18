package FirstPackage;

public class A {
    public String name = "Ganesh";
    private int phone = 1894561230;
    protected int roll_no = 20;
    //Default
    String email_id = "ganiganesh210@gmail.com";

    public static void main(String[] args){
        A a = new A();
        System.out.println(a.name);
        System.out.println(a.phone);
        System.out.println(a.roll_no);
        System.out.println(a.email_id);
    }
}
