package LearnJava.IO;

/*
    使用字节流读取中文文件
    1个中文
        GBK:占用两个字节
        UTF-8：占用3个字节

    java.io.Reader 字符输入流，是字符输入流的最顶层父类，定义了一些共性的成员方法，是一个抽象类

    共性的成员方法：
        1.int read() 读取单个字符并返回
        2.int read(char[] cbuf)一次读取多个字符，将字符读入数组
        3.void close() 释放资源

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader 文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读入到内存

    构造方法：
        FileReader(String name)
        FileReader(File file)
        参数：
            String name  文件路径
            File file  文件
            读取的数据源

        作用：
            1.创建一个FileReader对象
            2.把FileReader对象指向要读取的文件
 */

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象
        FileReader fr = new FileReader("E:\\test\\testdemo\\c.txt");

        //2.使用read方法
        /*int len = 0;
        while((len = fr.read())!=-1){
            System.out.println((char)len);
        }*/


        char[] ch = new char[1024];
        int len = 0;
        while((len = fr.read(ch))!=-1){
            /*
                String类的构造方法，把字符数组转化为字符串
                String(char[] ch) 字符数组转化为字符串
                String(char[] ch,int offset,int count) 将字符数组的一部分转化为字符串，offset
                开始索引，count转化的个数
             */
            System.out.println(new String(ch));
        }
        fr.close();
    }
}
