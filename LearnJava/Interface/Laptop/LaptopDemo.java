package LearnJava.Interface.Laptop;

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop computer = new Laptop();
        computer.powerOn();
        //向上转型
        Mouse mouse = new Mouse();
        USB usb = mouse;
        computer.useDevice(usb);

        Keyboard keyb = new Keyboard();
        //方法参数是USB类型，传递的却是实现类
        computer.useDevice(keyb);
        if(usb instanceof Mouse){
            Mouse mouse1 = (Mouse) usb;
            mouse1.Click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        computer.powerOff();
    }
}
