package LearnJava.IO;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter 是字符通向字节的桥梁，可使用指定的charset将要写入流中的字符编码成字节
    (编码：把能看懂的变成看不懂的)

    继承父类的共性方法：
        - void write(int c) 写入单个字符
        - void write(char[] cbuf) 写入字符数组
        - abstract void write(char[] cbuf,int off,int len) 写入字符数组的某一部分，off为数组的
        开始索引，len为写的字符个数
        - void write(String str) 写入字符串
        - void write(String str,int off,int len) 写入字符串的某一部分，off为开始索引，len为字符个数
        - void flush() 刷新该流的缓冲
        - void close() 关闭该流，但要先刷新它

    构造方法：
        OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter
        OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的
        OutputStreamWriter
    参数：
        OutputStream out ： 字节输出流，可以用来写转换之后的字节到文件中
        String charsetName : 指定的编码表名称，不区分大小写

    使用步骤：
        1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到内存缓冲区中
        3.使用OutputStreamWriter对象中的flush，把内存缓冲区的字节刷新到文件中
        4.释放资源
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException{
        //write_by_UTF8();
        write_by_GBK();
    }

    private static void write_by_GBK() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\testdemo\\c.txt"),"GBK");
        osw.write("纳尔是什么");
        osw.flush();
        osw.close();
    }

    /**
     * 使用转换流OutputStreamWriter写utf-8格式文件
     */
    private static void write_by_UTF8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\testdemo\\c.txt"),"UTF-8");
        osw.write("纳尔是什么");
        osw.flush();
        osw.close();
    }
}
