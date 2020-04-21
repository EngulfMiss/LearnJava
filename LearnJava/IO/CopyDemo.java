package LearnJava.IO;

/*
    文件复制
    明确：
        数据源
        数据的目的地

    文件复制的步骤：
        1.创建一个字节输入流对象，构造方法绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流对象的方法write写入问价
        5.释放资源
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\photo\\1.png");
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\1.png");

        /*//一次读取一个字节，写入一个字节
        int len = 0;
        while((len = fis.read())!=-1){
            fos.write(len);
        }*/


        //使用字节缓冲，读取多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //先关闭写的流，后关闭读的流
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
    }
}
