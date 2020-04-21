package LearnJava.IO;

/*
    java.io.OutputStream
    字节输出流
    此抽象类是表示输出字节流的所有类的超类

    定义了一些子类共性的成员方法：
    - public void close() : 关闭此输出流并释放与此输出流相关联的任何系统资源
    - public void flush() : 刷新此输出流并强制任何缓冲的输出字节被写出
    - public void write(byte[] b) : 将b.length字节从指定的字节数组写入此输出流
    - public void write(byte[] b,int off,int len) : 从指定的字节数组写入len字节，
    从偏移量off开始输出此输出流
    - public abstract void write(int b) : 将指定的字节写入此输出流

    字节流的写入是直接写入硬盘中

    java.io.FileOutputStream extends OutputStream
    文件字节输出流
    作用:
        把内存中的数据写入到硬盘文件中

    构造方法：
        FileOutputStream(String name)
        FileOutputStream(File file)
    参数：
        写入数据的目的地
    构造方法的作用：
        1.创建一个FileOutputStream对象
        2.会根据构造方法中传递的文件路径，创建一个空的文件
        3.会把FileOutputStream对象指向创建好的文件


    使用步骤：
        1.创建一个FileOutputStream对象，构造方法中传递写入数据的路径
        2.调用FileOutputStream对象的方法write，把数据写入到文件中
        3.释放资源(流使用会占用一定的内存)
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("E:\\test\\testdemo\\b.txt"));
        /*
            public void write(byte[] b)
            一次写多个字节:
                如果写的第一个是正数(0-127)，那么显示的是ASCII对应的字符
                如果写的是负数，那么第一个字节会和第二个字节组成汉字
         */
        byte[] bytes = {65,-66,67,-68,69};
        fos.write(bytes);


        /*
            public void write(byte[] b,int off,int len)
            把字节数组的一部分写入到文件中
            从指定的字节数组写入len字节，从偏移量off开始输出此输出流
            int off:数组的开始索引
            int len:写多少字节
         */
        fos.write(bytes,1,2);



        /*
            写入字符串的方法：使用String类中的方法，把字符串转化为字节数组
            byte[] getBytes() 把字符串转换为字节数组
   */
        byte[] byte2 = "Gnar".getBytes();
        System.out.println(Arrays.toString(byte2));
        fos.write(byte2);
        fos.close();
    }
}




/*
    //一次写一个字节
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\test.txt");
        fos.write(65);
        fos.close();
    }
    */
