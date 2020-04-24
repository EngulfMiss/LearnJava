package LearnJava.FunctionInterface.Function;

/*
    练习：
        1.截取字符串中的一段数字数据
        2.将其转换为Int类型并进行一些算数运算
 */

import java.util.function.Function;

public class Practice {
    public static int change(String str, Function<String,String> func1,Function<String,Integer> func2,
                             Function<Integer,Integer> func3){
        return func1.andThen(func2).andThen(func3).apply(str);
    }

    public static void main(String[] args) {
        String str = "Gnar,7";
        int sum = change(str,s->s.split(",")[1],s->Integer.parseInt(s),num->num + 10);
        System.out.println(sum);
    }
}
