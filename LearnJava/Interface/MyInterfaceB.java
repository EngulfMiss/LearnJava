package LearnJava.Interface;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract  void methodCom();
    public default void say(){
        System.out.println("BBB");
    }
}
