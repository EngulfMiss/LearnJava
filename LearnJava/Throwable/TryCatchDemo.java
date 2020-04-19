package LearnJava.Throwable;

/*
    try...catch:异常处理的第二种方式
    格式：
        try{
            可能产生异常的代码
        }catch(异常类名 变量名){
            异常的处理逻辑，异常对象产生后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }

        注意：
            1.try中可能抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
            2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，继续执行try...catch之后
            的代码，如果try中没有产生异常，就不会执行catch
 */

import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args){
        try {
            readFile("c:\\a.txtt");
        }catch(IOException e){
            System.out.println("后缀有问题");
        }
        System.out.println("后续代码执行");
    }
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException();
        }
        System.out.println("后续代码执行");
    }
}
