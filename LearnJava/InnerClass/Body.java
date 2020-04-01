package LearnJava.InnerClass;

/*
如何使用成员内部类:
1.间接方式:在外部类的方法当中,使用内部类，然后main只是调用外部类的方法
2.直接方式:公式:
类名称 对象名 = new 类名称();  ------ 普通类
外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */

//外部类
public class Body {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员内部类
    public class Heart{
        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫:" + name);
        }
    }

    // 外部类的方法

    public void methodBody(){
        Heart heart = new Heart();
        heart.beat();
        System.out.println("外部类的方法");
    }
}
