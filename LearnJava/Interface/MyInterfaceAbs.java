package LearnJava.Interface;

/*
接口都能定义抽象方法
public abstract 返回值类型 方法名称;

注意:
1.接口当中的抽象方法，修饰符必须是两个固定的关键字，public , abstract
2.这两个关键字可以省略，但都是抽象方法

使用步骤:
1.接口不能直接使用，必须有一个"实现类"来实现接口.
public class 实现类名称 implements 接口名称{
}

2.接口的实现类必须覆盖重写接口中的所有抽象方法
去掉abstract关键字，加上大括号.

3.创建实现类的对象，进行使用
 */

public interface MyInterfaceAbs {
    public abstract void method1();
    public void method2();
    void method3();
}
