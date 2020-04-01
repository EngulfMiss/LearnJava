package LearnJava.Extends;

public class Zi extends Fu{
    public Zi() {
        super(20);
        System.out.println("子类构造方法");
    }

    int numZi = 20;
    int num = 200;

    //检测覆盖重写是否有效

    @Override
    public void methodZi(){
        int num = 50;
        System.out.println("局部变量为:" + num);
        System.out.println("本类的成员变量为:" + this.num);
        System.out.println("父类的成员变量为:" + super.num);
    }

    public void method(){
        //super();  错误写法，只有子类构造方法，才能调用父类构造方法
    }
}
