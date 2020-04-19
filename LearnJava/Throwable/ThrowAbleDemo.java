package LearnJava.Throwable;

/*
Throwable 类中定义了3个异常处理的方法
String getMassage()  返回此 throwable 的简短描述    new 的异常对象里面自己写的话
String toString()  返回此throwable 的详细消息字符串
void printStackTrace()  JVM打印异常对象，打印的最全面

try中出现异常，会发生跳转，try中异常后续的代码不会执行
 */

import java.io.IOException;

public class ThrowAbleDemo {
    public static void main(String[] args){
        try {
            readFile("c:\\a.txtt");
            System.out.println("lalalalala");
        }catch(IOException e){
            //System.out.println(e/*.toString()*/);
            e.printStackTrace();
        }
        System.out.println("后续代码执行");
    }
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件有毒啊");
        }
        System.out.println("后续代码执行");
    }
}
