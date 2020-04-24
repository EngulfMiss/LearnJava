package LearnJava.FunctionInterface.Consumer;

/*
    java.util.function.Consumer<T> 接口则正好与Supplier接口相反
    它不生产一个数据，而是消费一个数据，其数据类型由泛型决定
    Consumer接口中包含抽象方法void accept(T t),意为消费一个指定泛型的数据

    Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
    至于具体怎么消费(使用)，需要自定义
 */

import java.util.function.Consumer;

public class ConsumerDemo {
    /*
        定义一个方法，方法的参数传递一个字符串
        第二个参数传递Consumer接口，泛型使用String
        可以使用Consumer接口消费参数字符串
     */
    public static void method(String str, Consumer<String> con){
        con.accept(str);
    }

    public static void main(String[] args) {
        method("Gnar",(String str)->{
            //消费方式
            //System.out.println(str);
            //消费方式：字符串反转
            //String s = new StringBuffer(str).reverse().toString();
            System.out.println(new StringBuffer(str).reverse());
        });
    }
}
