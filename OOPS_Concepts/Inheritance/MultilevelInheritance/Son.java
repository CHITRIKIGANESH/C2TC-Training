package Inheritance.MultilevelInheritance;

public class Son extends Parent{
    String SonName;
    int SonAge;

    public Son(String sonName, int sonAge) {
        SonName = sonName;
        SonAge = sonAge;
    }

    @Override
    public String toString() {
        return "Son{" +
                "SonName='" + SonName + '\'' +
                ", SonAge=" + SonAge +
                ", ParentName='" + ParentName + '\'' +
                ", ParentAge=" + ParentAge +
                ", GrandParentName='" + GrandParentName + '\'' +
                ", GrandParentAge=" + GrandParentAge +
                '}';
    }
}
