package LearnJava.FunctionInterface.Function;

/*
    Function接口中的默认方法andThen：用来进行组合操作

    需求：
        把String类型的"123"，转换为Integer类型，把转换之后的结果加10
        把增加之后的Integer类型的数据，转换为String类型

    分析：
        转换两次
        第一次String转换为Integer类型，第二次Integer转换为String类型
 */

import java.util.function.Function;

public class FunctionDemo2 {
    public static void change(String str, Function<String,Integer> func1,Function<Integer,String> func2){
        String s = func1.andThen(func2).apply(str);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "123";
        change(str,s->Integer.parseInt(s) + 10,num->num.toString());
    }
}


/*
    public static Integer change1(String str, Function<String,Integer> func){
        return func.apply(str);
    }

    public static String change2(Integer num,Function<Integer,String> func){
        return func.apply(num);
    }

    public static void main(String[] args) {
        String str = "123";
        Integer i = change1(str,s->Integer.parseInt(s));
        i += 10;
        String s = change2(i,(num)->{
            return num.toString();
        });
        System.out.println(s);
    }*/
