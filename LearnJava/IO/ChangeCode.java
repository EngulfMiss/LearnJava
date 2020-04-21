package LearnJava.IO;
/*
    练习：
        转换文件编码
        将GBK编码文件，转换为UTF-8编码文件

    分析；
        1.创建InputStreamReader，构造方法传递字节输入流指定的编码表名称
        2.创建OutputSStreamWriter，构造方法中传递字节输出流和指定的编码表名称
        3.使用InputStreamReader对象中的方法read读取文件
        4.使用OutputSStreamWriter对象中的方法write写入文件
        5.释放资源
 */

import java.io.*;

public class ChangeCode {
    public static void main(String[] args) throws IOException {
        String Filepath = "E:\\test\\testdemo\\c.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(Filepath),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\testdemo\\d.txt"),"UTF-8");

        int len = 0;
        char[] ch = new char[1024];
        while((len = isr.read(ch))!=-1){
            osw.write(ch,0,len);
        }
        osw.flush();
        isr.close();
        osw.close();
    }
}
