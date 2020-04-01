package LearnJava.Interface;

/*
接口当中也可以定义"成员变量"，但必须使用public static final三个关键字进行修饰,
从效果上看，这个其实就是接口的【常量】
格式:
1.public static final 数据类型 常量名称 = 数据值  即使省略不写，依然会默认存在
2.接口中的常量必须赋值
3.常量名称完全大写
 */

public interface InterfaceConst {
    public static final int NUM = 10;
}
