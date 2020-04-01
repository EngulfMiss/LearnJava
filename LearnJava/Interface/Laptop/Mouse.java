package LearnJava.Interface.Laptop;

public class Mouse implements USB{
    @Override
    public void On() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Off() {
        System.out.println("关闭鼠标");
    }

    public void Click(){
        System.out.println("鼠标点击");
    }
}
