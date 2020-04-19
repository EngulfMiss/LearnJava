package LearnJava.File;

/*
    java.io.File 类
    文件和目录路径名的抽象表示形式
    java把电脑中的文件和文件夹(目录)封装为了一个File类，我们可以使用File类对文件和文件夹
    进行操作
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小

    File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法

    重点：记住3个单词
        file：文件
        directory：文件夹/目录
        path：路径



    static String pathSeparator  与系统有关的路径分隔符，为了方便，它被表示为一个字符串
    static char pathSeparatorChar  与系统有关的路径分隔符

    static String separator  与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
    static char separatorChar  与系统有关的默认名称分隔符
 */

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  //路径分隔符

        String separator = File.separator;
        System.out.println(separator);   //文件分隔符
    }
}
