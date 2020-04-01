package LearnJava.Object;

//    属性：
//    姓名  String name
//    年龄  int age
//    行为:
//    吃饭  public void eat() {}
//    睡觉  public void sleep() {}
//    打怪  public void fight() {}

// 成员方法没有static关键字

public class Student {
    String name;
    int age;
    public void eat()
    {
        System.out.println("吃饭");
    }
    public void sleep()
    {
        System.out.println("睡觉");
    }
    public void fight()
    {
        System.out.println("狩猎开始");
    }
}
