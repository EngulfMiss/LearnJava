package LearnJava.File;

/*
    File类获取功能的方法：
    - public String getAbsolutePath():返回此File的绝对路径名称字符串
    - public String getPath() : 将此File转换为路径名字符串
    - public String getName() ：返回由此File表示的文件或目录的名称
    - public long length() ： 返回由此File表示的文件长度
 */

import java.io.File;

public class GetDemo {
    public static void main(String[] args) {
        show1();
        //show2();
        //show3();
        //show4();
    }


/*
    public long length() ： 返回由此File表示的文件长度
    获取的是构造方法指定的文件的大小，以字节为单位
    注意：
        文件夹是没有大小概念的，不能获取文件夹的大小
        如果构造方法中给出的路径不存在，返回0
    */
    private static void show4() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\Pointer.java");
        System.out.println(f1.length());

        File f2 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\a.txt");
        System.out.println(f2.length());

        File f3 = new File("D:\\VScode\\Files");
        System.out.println(f3.length());
    }





    //public String getName() ：返回由此File表示的文件或目录的名称
    //获取的是路径的结尾部分
    private static void show3() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\a.txt");
        System.out.println(f1.getName());

        File f2 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava");
        System.out.println(f2.getName());
    }


    //public String getPath() : 将此File转换为路径名字符串
    private static void show2() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\a.txt");
        System.out.println(f1.getPath());

        File f2 = new File("a.txt");
        System.out.println(f2.getPath());
    }

    //public String getAbsolutePath():返回此File的绝对路径名称字符串
    private static void show1() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\a.txt");
        System.out.println(f1.getAbsoluteFile());

        //查询根目录
        File f2 = new File("");
        System.out.println(f2.getAbsoluteFile());
    }
}
