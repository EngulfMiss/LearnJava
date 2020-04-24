package LearnJava.FunctionInterface.Consumer;

/*
    Consumer接口的默认方法andThen
    作用：需要两个Consumer接口，可以把两个Consumer接口组合再一起，再消费

    例如：
        Consumer<String> con1
        Consumer<String> con2
        String s = "hello";
        con1.accept(s);
        con2.accept(s);

        con1.andThen(con2).accept(s);
 */

import java.util.function.Consumer;

public class ConsumerDemo2 {
    //定义一个方法，方法的参数传递一个字符串和两个Consumer接口，Consumer接口的泛型使用字符串
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        /*con1.accept(s);
        con2.accept(s);*/
        con2.andThen(con1).accept(s);
    }

    public static void main(String[] args) {
        method("Gnar",(s)->{
            System.out.println(s.toUpperCase());
        },(s)->{
            System.out.println(s.toLowerCase());
        });
    }
}
