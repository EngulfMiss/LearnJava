package LearnJava.File;

/*
    File类中的判断方法：
    - public boolean exists():此File表示的文件夹或目录是否实际存在
    - public boolean isDirectory():此File表示的是否为目录
    - public boolean isFile()： 此File表示的是否为文件
 */

import java.io.File;

public class BoolDemo {
    public static void main(String[] args) {
        //show1();
        show2();
    }



    /*
    public boolean isDirectory():此File表示的是否为目录
    用于判断构造方法中的路径是否以文件夹结尾
    是：true
    不是：false

    public boolean isFile()： 此File表示的是否为文件
    用于判断构造方法中的路径是否以文件结尾
    是：true
    不是：false
     */
    private static void show2() {

        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\Pointer.java");
        if(f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
    }

    /*
        public boolean exists():此File表示的文件夹或目录是否实际存在
        用于判断构造方法中的路径是否存在
        存在：true
        不存在：false

        注意：
            电脑的硬盘中只有文件/文件夹，两个方法是互斥的
            这两个方法使用前提，路径是存在的，否则都返回false
     */
    private static void show1() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\Pointer.java");
        System.out.println(f1.exists());

        File f2= new File("D:\\IDEA\\LearnJava\\src\\LearnC\\Pointer.java");
        System.out.println(f2.exists());

        File f3 = new File("LearnJava.iml");
        System.out.println(f3.exists());
    }
}
