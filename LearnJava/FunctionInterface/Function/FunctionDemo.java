package LearnJava.FunctionInterface.Function;

/*
    java,util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据
    前者为前置条件，后者为后置条件
    Function接口中最主要的抽象方法为：R apply(T t),根据类型T的参数获取类型R的结果
    使用的场景例如：将String类型转换为Integer类型
 */

import java.util.function.Function;

public class FunctionDemo {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的另一个参数传递一个Function接口，泛型使用String和Integer
        使用Function接口中的方法apply，吧字符串类型的整数，转换为Integer类型的整数
     */

    public static void change(String str, Function<String,Integer> func){
        Integer num = func.apply(str);
        System.out.println(num);
    }

    public static void main(String[] args) {
        String str = "1214";
        change(str,s->Integer.parseInt(s));
    }
}
