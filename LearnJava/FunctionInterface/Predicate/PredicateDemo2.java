package LearnJava.FunctionInterface.Predicate;

/*
    Predicate 中的默认方法 and(与),or(或),negate(非)

    需求：判断一个字符串，有两个判断条件
    1.判断字符串的长度是否大于5
    2.判断字符串中是否包含a
    两个条件必须同时满足，我们就可以使用&&

    Predicate接口中有一个方法and，表示并且关系，也可以用来连接两个判断条件
    default Predicate<T> and Predicate<? super T> other{
        Object.requireNonNull(other);
        return (t)->this.test(t) && other.test(t);
    }
    方法内部的两个判断条件，也是使用&&运算符连接起来的

 */

import java.util.function.Predicate;

public class PredicateDemo2 {
    /*
        定义一个方法，参数传递一个字符串，传递两个Predicate接口
            一个用于判断字符串的长度是否大于5
            一个用于判断字符串中是否包含a
            两个条件同时满足
     */
    public static boolean checkString(String s, Predicate<String> p1,Predicate<String> p2){
        //return p1.test(s) && p2.test(s);
        return p1.and(p2).test(s);
    }

    public static boolean checkString2(String s, Predicate<String> p1,Predicate<String> p2){
        //return p1.test(s) && p2.test(s);
        return p1.or(p2).test(s);
    }

    public static boolean checkString3(String s, Predicate<String> p1){
        return p1.negate().test(s);
    }

    public static void main(String[] args) {
        String str = "Gnardada";
        boolean b = checkString2(str,(s)->{
            return s.length()>5;
        },(s)->{
            return s.contains("s");
        });
        System.out.println(b);
    }
}
