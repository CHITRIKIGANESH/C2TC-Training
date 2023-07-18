package Encapsulation;

public class Person {
    private String name;
    private String country;
    private int phone_number;
    private String mail_id;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", phone_number=" + phone_number +
                ", mail_id='" + mail_id + '\'' +
                ", age=" + age +
                '}';
    }
}