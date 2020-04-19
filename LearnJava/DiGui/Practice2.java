package LearnJava.DiGui;

/*
    练习：
         递归打印多级目录
 */

import java.io.File;

public class Practice2 {
    public static void main(String[] args) {
        File file = new File("D:\\bootstrap\\bootstrap-3.3.7-dist");
        getAllFiles(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFiles(File file){
        System.out.println("被遍历的目录名称:" + file);
        System.out.println("=======================");
        File[] files = file.listFiles();
        for(File f : files){
            //得到File对象，判断是不是文件夹，是就继续查看子文件夹
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
