package LearnJava.Extends;

/*
继承关系中，父子类构造方法的访问特点

1.子类构造方法当中有一个默认隐含的"super()"调用，所以一定是先调用父类的构造
后执行的子类构造
2.可以通过super关键字来子类调用父类重载构造.
3.super的父类构造调用，必须是子类构造方法的第一个语句.
4.子类必须调用父类的构造方法，不写默认一个super()，super()只能有一个，而且是第一句
super和this两种构造不能同时使用

Java只能单继承，但是可以多级继承
 */

public class Fu {
    int numFu = 10;
    int num = 100;

    public Fu(){

    }
    public Fu(int num) {
        System.out.println("父类构造方法");
    }

    public void methodFu(){
        System.out.println(num);
    }

    public void methodZi(){

    }
}
