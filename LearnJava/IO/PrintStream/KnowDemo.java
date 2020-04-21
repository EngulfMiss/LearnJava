package LearnJava.IO.PrintStream;

/*
    java.io.PrintStream ： 打印流
        PrintStream 为其他输出流添加了功能，时它们能够方便地打印各种数据值表示形式
    PrintStream特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream永远不会抛出 IOException
        3.特有的方法：
            void print(任意类型的值)
            void println(任意类型的值加换行)

    构造方法：
        PrintStream(File file) 输出的目的地是一个文件
        PrintStream(OutputStream out) 输出的目的地是一个字节输出流
        PrintStream(String fileName) 输出的目的地是一个文件路径

    PrintStream extends OutputStream
    继承父类的共性成员方法：
        - public void close() : 关闭此输出流并释放与此输出流相关联的任何系统资源
        - public void flush() : 刷新此输出流并强制任何缓冲的输出字节被写出
        - public void write(byte[] b) : 将b.length字节从指定的字节数组写入此输出流
        - public void write(byte[] b,int off,int len) : 从指定的字节数组写入len字节，
        从偏移量off开始输出此输出流
        - public abstract void write(int b) : 将指定的字节写入此输出流

    注意：
        如果使用继承父类的write方法写数据，那么查看数据的时候会查询编码表
        如果使用它自己特有的方法print/println方法写数据，写的数据原样输出
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class KnowDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //创建一个PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("E:\\test\\testdemo\\print.txt");
        ps.write(120);
        ps.println(120);
        ps.println('C');
        ps.println("Gnar");
        ps.println(3.1415);
        ps.println(false);
        ps.close();
    }
}
