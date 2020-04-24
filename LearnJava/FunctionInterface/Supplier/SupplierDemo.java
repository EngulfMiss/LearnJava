package LearnJava.FunctionInterface.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T> 接口仅包含一个无参的方法:T get() 用来获取一个泛型
    参数指定类型的对象数据

    Supplier<T> 接口被称为生产型接口，指定接口的泛型是什么，那么接口中的get方法就会生产什么类型
    的数据
 */

import java.util.function.Supplier;

public class SupplierDemo {
    //定义一个方法，方法的参数传递Supplier接口，泛型执行String，get方法就会返回一个字符串
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法，参数为Supplier接口，是一个函数式接口，所以可以传递Lambda表达式
        String str = getString(()->"Gnardada~");  //产生一个字符串并返回
        System.out.println(str);
    }
}
