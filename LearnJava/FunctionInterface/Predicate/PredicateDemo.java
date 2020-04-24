package LearnJava.FunctionInterface.Predicate;

/*
    java.util.function.Predicate<T> 接口
    作用：对某种数据类型的数据进行判断，结果返回一个boolean值

    Predicate 接口中包含一个抽象方法：
        boolean test(T t) : 用来对指定数据类型进行判断的方法
        结果：
            符合条件 true
            不符合条件 false
 */

import java.util.function.Predicate;

public class PredicateDemo {
    /*
        定义一个方法
        参数传递一个String类型的字符串
        再传递一个Predicate<> 接口
        使用Predicate<> 接口中的方法test对字符串进行判断，并把判断的结果返回
     */
    public static boolean checkString(String s, Predicate<String> pd){
        return pd.test(s);
    }

    public static void main(String[] args) {
        String str = "Gnardada";
        boolean b = checkString(str,s->s.length()>5);
        System.out.println(b);
    }
}
