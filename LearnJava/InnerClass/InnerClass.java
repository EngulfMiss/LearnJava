package LearnJava.InnerClass;

/*
内部类的分类:
1.成员内部类
2.局部内部类(包含匿名内部类)

成员内部类的定义格式:
修饰符 class 类名称{
    修饰符 class 内部类名称{

    }
}

注意:内用外，随意访问;但是外用内，一定要用内部的对象
 */

public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
