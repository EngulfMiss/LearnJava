package LearnJava.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceDefaultA IA = new InterfaceDefaultA();
        InterfaceDefaultB IB = new InterfaceDefaultB();
        IA.methodAbs();
        IA.method();
        IB.methodAbs();
        IB.method();
        InterfaceDefault.methodstatic();
    }
}
