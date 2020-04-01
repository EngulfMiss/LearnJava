package LearnJava.UpAndDown;

/*
如何才能知道父类引用的对象是哪个子类
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例
 */

public class Interfaceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.fly();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.run();
        }
        giveAPet(new Dog());
    }

    public static void giveAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.run();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.fly();
        }
    }
}
