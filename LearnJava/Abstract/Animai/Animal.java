package LearnJava.Abstract.Animai;

/*
抽象方法，就是加上abstract，然后去掉大括号，直接分号结尾
抽象方法所在的类必须是抽象类，在class之前加abstract

1.不能直接创建一个抽象类对象
2.必须用一个子类来继承抽象父类
3.子类必须覆盖重写抽象父类的所有抽象方法(完成部分抽象方法的子类还是抽象类)
 */

public abstract class Animal {
    public Animal(){
        System.out.println("抽象父类执行");
    }
    public abstract void eat();

    public void method(){

    }
}
