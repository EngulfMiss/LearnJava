package LearnJava.Interface;

/*
接口中允许定义默认方法
格式:
public default 返回值类型 方法名称(参数列表){
    方法体
}

1.接口的默认方法，可以通过接口实现类对象，直接调用
2.接口的默认方法，也可以被接口实现类进行重写


Java 8 开始，接口当中允许定义静态方法
public static 返回值类型 方法名称(参数列表){
    方法体
}
不能通过接口实现类对象来调用接口中的静态方法
正确用法:
通过接口名称直接调用静态方法

接口不能有静态代码块,接口不饿有构造方法

实现类实现多个接口，如果有多个同名的默认方法，必须重写默认方法

一个类如果直接父类当中的方法，与接口中的默认方法产生了冲突，优先使用父类当中的方法

 */

//接口当中的默认方法，可以解决接口升级的问题

public interface InterfaceDefault {
    public abstract void methodAbs();

    //public abstract void methodAbs2();

    //新添加的方法改成默认方法

    public default void method(){
        System.out.println("默认方法被调用");
    }

    public static void methodstatic(){
        System.out.println("接口中的静态方法被调用");
    }
}
