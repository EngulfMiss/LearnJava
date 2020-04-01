package LearnJava.UpAndDown;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void run(){
        System.out.println("奔跑");
    }
}
