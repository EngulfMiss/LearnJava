package LearnJava.Interface;

/*
接口当中允许定义私有方法，有
1.普通私有方法
private 返回值类型 方法名称(参数列表){
    方法体
}

2.静态私有方法
private static 返回值类型 方法名称(参数列表){
    方法体
}
 */

public interface InterfacePrivate {
    public default void methodDef(){
        System.out.println("默认方法1");
        say();
    }
    public default void methodDef2(){
        System.out.println("默认方法2");
        say();
    }

    private void say(){
        System.out.println("Gnar");
        System.out.println("Neeko");
        System.out.println("真天");
    }

    public static void methodStatic(){
        System.out.println("静态方法1");
        sameMethod();
    }

    public static void methodStatic2(){
        System.out.println("静态方法2");
        sameMethod();
    }

    private static void sameMethod(){
        System.out.println("Gnar");
        System.out.println("Neeko");
        System.out.println("真天");
    }
}
