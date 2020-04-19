package LearnJava.Thread.Lambda;

/*
    Lambda表达式的标志格式：
        由三部分组成：
        1.一些参数
        2.一个箭头
        3.一段代码
    格式：
        (参数列表) -> (一些重写方法的代码)
    解释说明格式：
        ()：接口中抽象方法的参数列表，没有参数就为空，有参数就写出参数，多参数逗号分隔
        ->:传递，把参数传递给方法体
        {}: 重写接口的抽象方法的方法体


   优化省略Lambda：
        方法只有一个参数，可以省略类型和括号
        方法只有一行代码，可以省略大括号，return，;
        三个要么一起省略，要么全部保留
 */

public class LambdaDemo {
    public static void main(String[] args) {


    //使用匿名内部类的方式，实现多线程
    new Thread(new Runnable(){
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
            }
         }).start();

        //使用Lambda表达式，实现多线程
        //()里是run方法的参数,->表示把前面的参数传给后面的代码
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }
        ).start();
    }
}



