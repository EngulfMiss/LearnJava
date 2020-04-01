package LearnJava.AboutStatic;

public class Myclass {
    //成员变量

    int num = 0;
    //静态变量

    static int num2 = 0;

    //成员方法

    public void method()
    {
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(num2);
    }
    public static void methodStatic()
    {
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(num2);
        //静态方法不能直接访问非静态变量
        //System.out.println(num);
    }
}
