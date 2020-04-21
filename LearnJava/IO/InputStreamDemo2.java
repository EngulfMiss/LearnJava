package LearnJava.IO;

/*
    字节输入流，一次读取多个字节的方法：
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数字b中
    明确两件事情：
        1.方法的参数byte[]的作用？
            缓冲作用，存储每次读取到的多个字节
            数组长度一般定义为1024

        2，方法的返回值int是什么？
            每次读取到的有效位数

    String类的构造方法
        String(byte[] bytes) : 把字节数组转换为字符串
        String(byte[] bytes,int offset,int length)  将字符数组的部分转化为字符串
        offset 开始索引 length长度
 */

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\test\\testdemo\\test.txt");


        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));

        }


        /*
            int read(byte[] b)
            返回值 读取的有效位数
         */
        /*byte[] bytes = new byte[3];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        fis.close();*/
    }
}
