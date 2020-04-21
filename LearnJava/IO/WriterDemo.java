package LearnJava.IO;

/*
    java.io.Writer : 字节输出流，是所有字符输出流的顶层父类，是一个抽象类

    共性的成员方法：
        - void write(int c) 写入单个字符
        - void write(char[] cbuf) 写入字符数组
        - abstract void write(char[] cbuf,int off,int len) 写入字符数组的某一部分，off为数组的
        开始索引，len为写的字符个数
        - void write(String str) 写入字符串
        - void write(String str,int off,int len) 写入字符串的某一部分，off为开始索引，len为字符个数
        - void flush() 刷新该流的缓冲
        - void close() 关闭该流，但要先刷新它


    字符输入流是先写入内存缓冲区中，再flush才进入硬盘


    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter 文件字符输出流
    作用：把内存中字符数据写到文件中

    构造方法：
        FileWriter(String name)
        FileWriter(File file)
        参数：写入数据的目的地
            String name 文件地址
            File file 文件

    作用：
        1.创建FileWriter对象
        2.会根据路径创建文件
        3.会把FileWriter对象，指向创建的文件

    使用步骤：
        1.创建一个FileWriter对象，绑定路径
        2.使用FileWriter中的方法write，把数据写入到内存缓冲区中(字符转化为字节的过程)
        3.使用FileWriter中的方法flush，把内存缓冲区的数据，刷新到文件中
        4.释放资源(先把内存缓冲区的数据刷新到文件中)


    - flush 刷新缓冲区，流对象可以继续使用
    - close 先刷新缓冲区，然后通知系统释放资源，流对象不再可以使用
 */

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\test\\testdemo\\c.txt",true);


        //void write(String str,int off,int len) 写入字符串的某一部分，off为开始索引，len为字符个数
        String str = "账号Gnardada3";
        fw.write(str + "\r\n");
        fw.flush();
        fw.write("qwerdf");
        fw.close();


        /*//void write(String str) 写入字符串
        fw.write("账号Gnardada3");
        fw.flush();
        fw.close();*/



        /*//void write(String str,int off,int len) 写入字符串的某一部分，off为开始索引，len为字符个数
        char[] ch = {'G','n','a','r'};
        fw.write(ch,1,2);
        fw.flush();
        fw.close();*/



        /*// void write(char[] cbuf) 写入字符数组
        char[] ch = {'G','n','a','r'};
        fw.write(ch);
        fw.flush();
        fw.close();*/



        /*
        //写单个字符
        fw.write(97);
        fw.flush();
        fw.close();*/
    }
}
