package LearnJava.Interface.Laptop;

public class Keyboard implements USB{
    @Override
    public void On() {
        System.out.println("打开键盘");
    }

    @Override
    public void Off() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘按键");
    }
}
