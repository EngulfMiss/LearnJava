package LearnJava.IO;

/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码
 */

import java.io.FileReader;
import java.io.IOException;

public class CodeDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\test\\testdemo\\GBK编码.txt");
        int len = 0;
        while((len = fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();
    }
}
