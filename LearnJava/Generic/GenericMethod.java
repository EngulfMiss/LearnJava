package LearnJava.Generic;

/*
含有泛型的方法：
泛型定义在方法的修饰符和返回值类型之间

格式:
    修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
        方法体;
    }
 */

public class GenericMethod {
    public <Gnar> void method(Gnar gnar){
        System.out.println(gnar);
    }

    public static <Neeko> void method2(Neeko neeko){
        System.out.println(neeko);
    }
}
