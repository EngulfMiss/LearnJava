package LearnJava.IO;

/*
    追加写：使用两个参数的构造方法
        FileOutputStream(String name,boolean append)
        FileOutputStream(File file,boolean append)

    参数：
        String name,File file : 写入的目的地
        boolean append : 追加写开关
        true : 创建对象不会覆盖原文件，继续在文件的末尾追加数据
        false : 创建一个新文件覆盖原文件


    写换行：写换行符号
    windows:\r\n
    Linux:/n
    mac:/r
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("Gnar".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
