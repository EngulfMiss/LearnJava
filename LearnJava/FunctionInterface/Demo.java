package LearnJava.FunctionInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值使用
 */

public class Demo {
    public static void main(String[] args) {
        //调用show方法，参数为接口的实现类
        show(new MyFunctionInterfaceImpl());
        //调用show方法，参数为接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，使用Lambda表达式
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));
    }
    //定义一个方法，参数使用函数式接口 MyFunctionInterface
    public static void show(MyFunctionInterface myfuncInter){
        myfuncInter.method();
    }
}
