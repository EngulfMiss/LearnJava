package LearnJava.Throwable;

/*
    Objects类中的静态方法
    public static <T> T requireNonNull(T obj)  查看指定引用对象是不是null
    源码:
        public static <T> T requireNonNull(T obj){
            if(obj == null)
                throw new NullPointerException();
            return obj;
        }
 */

import java.util.Objects;

public class ObjectNotNull {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        /*if(obj == null){
            throw new NullPointerException("传递的对象的值为null");
        }*/
        Objects.requireNonNull(obj,"传递的对象的值为null");
    }
}
