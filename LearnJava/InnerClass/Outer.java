package LearnJava.InnerClass;

public class Outer {
    int num = 10;
    public class Inner{
        int num = 20;
        public void method(){
            int num = 30;
            //局部变量
            System.out.println(num);
            //内部类成员变量
            System.out.println(this.num);
            //外部类成员变量
            System.out.println(Outer.this.num);
        }
    }
}
