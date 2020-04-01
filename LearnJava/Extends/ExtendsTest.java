package LearnJava.Extends;

/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
直接通过子类对象访问成员变量
        等号左边是谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量
        方法属于谁优先用谁，没有则向上找

子类方法的返回值必须小于等于父类的返回值范围

子类方法的权限必须大于等于父类的权限

public > protected > (default) > private
 */

public class ExtendsTest {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
//        System.out.println(zi.numFu);
//        System.out.println(zi.numZi);

        //优先子类
        System.out.println(zi.num);

        zi.methodZi();

        //父类的方法，属于父类
        zi.methodFu();
    }
}
