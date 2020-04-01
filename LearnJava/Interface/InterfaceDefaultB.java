package LearnJava.Interface;

public class InterfaceDefaultB implements InterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现抽象方法BBB");
    }
    @Override
    public void method(){
        System.out.println("我改了你的默认方法");
    }
}
