package LearnJava.Final;

/*
当final关键字用来修饰一个类的时候，格式:
public final class 类名称{

}

含义：当前这个类不可以有子类(太监类)
注意:一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写

当final修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写的
格式:
修饰符 final 返回值类型 方法名称(){
}
对于类和方法来说，abstract和final关键字是不能同时使用的，会矛盾
 */


public abstract class MyFinalClass{
    public void method(){
        System.out.println("方法执行");
    }
    public abstract void Absmethod();
}







/*public final class MyFinalClass {
    public void method(){
        System.out.println("方法执行");
    }
}*/
