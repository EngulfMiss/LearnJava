package LearnJava.File.CreateAndDel;

/*
    - public boolean createNewFile() : 当且仅当具有该名称的文件尚不存在时，创建一个新文件
    - public boolean mkdir() : 创建由此File表示的目录
    - public boolean mkdirs() ： 创建由此File表示的目录，包括如何必须但不存在的父目录
    - public boolean delete() : 删除由此File类表示的文件或目录
 */

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        //show1();
        //show2();
        show3();
    }


    /*
        public boolean delete()
        此方法，可以删除构造方法路径给出的文件。文件夹
        返回值：布尔值
            true：文件/文件夹删除成功
            false：文件夹中有内容，不会删除返回false，路径不存在false

        注意：
            delete方法，直接在硬盘删除文件或文件夹，不走回收站
     */
    private static void show3() {
        File f1 = new File(".\\DeleteFile");
        System.out.println(f1.delete());
    }


    /*
        public boolean mkdir() : 创建由此File表示的目录
        只能创建单极文件夹

        public boolean mkdirs()
        可以创建单级文件夹，也可以多级

        返回值：布尔值
        true：文件夹不存在，创建文件返回true
        false：文件夹存在，不会创建，返回false
        注意：
            1.此方法只能创建文件夹，不能创建文件
     */
    private static void show2() {
        File f1 = new File(".\\DeleteFile");
        System.out.println(f1.mkdir());
    }


    /*
        public boolean createNewFile()
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值：布尔值
            true：文件不存在，创建文件返回true
            false：文件存在，不会创建，返回false
        注意：
            1.此方法只能创建文件，不能创建文件夹
            2.创建文件的路径必须存在，否则抛出异常
     */
    private static void show1() throws IOException {
        File f1 = new File("D:\\photo\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:" + b1);


        File f2 = new File("a.txt");
        System.out.println(f2.createNewFile());
    }

}
