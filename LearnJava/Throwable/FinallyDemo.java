package LearnJava.Throwable;

/*
        try {
            readFile("c:\\a.txtt");
            System.out.println("lalalalala");
        }catch(IOException e){
            //System.out.println(e.toString());
        e.printStackTrace();
        }finally{
            无论是否出现异常都会执行
        }

        注意：
            1.finally不能单独使用，必须和try一起使用
            2.finally一般用于资源释放，无论程序是否出现异常，都要执行
 */

import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args){
        try {
            readFile("c:\\a.txtt");
            System.out.println("lalalalala");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("资源释放");
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
