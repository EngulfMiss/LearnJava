package LearnJava.AboutStatic;

/*
一旦使用static修饰成员方法，那么这个方法就成了静态方法。静态方法不属于对象，而属于类的
如果没有static关键字，那么首先要创建对象，然后才能通过对象使用它
 */

public class StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以通过类名来调用
        obj.method();
        obj.methodStatic();
        Myclass.methodStatic();
    }
}
