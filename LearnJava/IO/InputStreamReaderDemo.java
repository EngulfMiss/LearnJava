package LearnJava.IO;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是字节通向字符流的桥梁，它可以使用指定的charset读取字节并解码为字符
    (解码：把看不懂的变成看的懂的)

    继承父类的共性方法：
        1.int read() 读取单个字符并返回
        2.int read(char[] cbuf)一次读取多个字符，将字符读入数组
        3.void close() 释放资源

    构造方法：
        InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader
        InputStreamReader(InputStream in, String charsetName)
        创建一个使用指定字符集的InputStreamReader
    参数：
        InputStream in : 字节输入流，用来读取文件中保存的字节
        String charsetName : 指定的编码表名称，不区分大小写

    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2.使用InputStreamReader对象的read方法，读取文件
        3.释放资源

    注意事项：
        构造方法中指定的编码表名称要和文件的编码相同，否则会产生乱码
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{
        read_by_utf8();
        read_by_GBK();
    }

    private static void read_by_GBK() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\test\\testdemo\\b.txt"),"GBK");
        int len = 0;
        char[] ch = new char[1024];
        while((len = isr.read(ch))!=-1){
            System.out.println(ch);
        }
        isr.close();
    }

    /**
     * 使用InputStreamReader读取utf-8文件
     */
    private static void read_by_utf8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\test\\testdemo\\c.txt"),"utf-8");
        int len = 0;
        char[] ch = new char[1024];
        while((len = isr.read(ch))!=-1){
            System.out.println(ch);
        }
        isr.close();
    }
}
