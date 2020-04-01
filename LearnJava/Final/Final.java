package LearnJava.Final;

/*
final关键字代表最终，不可改变的

常用四种用法:
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量
4.可以修饰一个成员变量
 */

public class Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final修饰的局部变量，那么这个变量不能进行更改
        final int num2 = 200;
        System.out.println(num2);
        //num2 = 50;

        //正确写发，只要有一次赋值就行
        final int num3;
        num3 = 40;

        //对于基本类型来说,不可变说的是变量当中的数据不可变
        //对于引用数据类型来说，不可变的是变量当中的地址值
    }
}
