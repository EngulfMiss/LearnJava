package LearnJava.UpAndDown;

/*
对象的向上转型，其实就是多态写法
父类名称 对象名 = new 子类名称()   Animal animal = new Cat();
向上转型一定是安全的
对象一但向上转型为父类，那么就无法调用子类原本的特有内容
解决方案，用对象的向下转型
格式：
子类名称 对象名 = (子类名称) 父类对象
含义：
将父类对象，还原为本来的子类对象


 */

public class UpandDown {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Dog dog = (Dog) animal;
        dog.run();

        //错误的向下转型,错误写法，编译不会报错，发生类转换异常
        //Cat cat = (Cat) animal;
    }
}
