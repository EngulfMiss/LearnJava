package LearnJava.Generic;

public class GenericTest3 {
    public static void main(String[] args) {
        GenericInterfaceImpl gi = new GenericInterfaceImpl();
        Sout<String> s1 = new Sout<>();
        gi.myInterface("Tian");
        s1.myInterface("Tian");
    }
}
