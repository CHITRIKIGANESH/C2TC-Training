package FirstPackage;

public class A {
    public String name = "Ganesh";
    private int PhoneNumber = 1234567820;
    String email_id = "ganiganesh210@gmail.com";
    protected int roll_no = 55;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.roll_no);
        System.out.println(a.name);
        System.out.println(a.email_id);
        System.out.println(a.PhoneNumber);
    }

}
