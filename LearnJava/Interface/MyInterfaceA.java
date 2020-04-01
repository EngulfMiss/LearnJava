package LearnJava.Interface;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract  void methodCom();
    public default void say(){
        System.out.println("AAA");
    }
}
