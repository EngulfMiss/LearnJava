package LearnJava.File;

/*
    File类遍历(文件夹)目录功能
    - public String[] list() : 返回一个String数组，表示该File目录中的所有子文件或目录
    - public File[] listFiles : 返回一个File数组，表示该File目录中的所有子文件或目录
    可以找到隐藏文件和文件夹


    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是目录，也会抛出空指针异常
 */

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        //show1();
        show2();
    }


    /*
        public File[] listFiles
        返回的是文件/文件夹被封装的File对象，多个File对象存储到File数组中
     */
    private static void show2() {
        File f1 = new File("D:\\VScode\\Files");
        File[] F = f1.listFiles();
        for(File file : F){
            System.out.println(file);
        }
    }



    /*
        public String[] list()
     */
    private static void show1() {
        File f1 = new File("D:\\VScode\\Files");
        String[] str = f1.list();
        for(String s : str){
            System.out.println(s);
        }
    }
}
