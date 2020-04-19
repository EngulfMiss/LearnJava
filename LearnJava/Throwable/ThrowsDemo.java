package LearnJava.Throwable;

/*
    throws关键字：异常处理的第一种方式：交给别人处理
    作用：
        当方法内部抛出异常对象时，我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象
    使用格式：
        修饰符 返回值类型 方法名(参数列表) throws throw new XXXException,throw new XXXException{
            throw new XXXException("产生原因");
            throw new XXXException("产生原因")
            ...
        }
    注意：
        1.throws关键字必须写在方法的声明处
        2.throws关键字后面声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常，那么throws后面也声明多个异常
        如果抛出的多个异常对象有子父类的关系，那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法，我们就必须的处理声明的异常
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.txtt");
    }


    /**
     * 定义一个文件路径合法判断方法
     * 如果路径不对，就抛出文件找不到异常
     */
    public static void readFile(String fileName) throws IOException{
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件没找到");
        }

        /**
         * 后缀名判断方法
         * 如果后缀不是.txt  抛出个异常
         *
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名错误");
        }


        System.out.println("路径正确，假装读取文件");
    }

}
