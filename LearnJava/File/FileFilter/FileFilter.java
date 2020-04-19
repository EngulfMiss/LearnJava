package LearnJava.File.FileFilter;

/*
    文件过滤器
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器

    Flie[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器
        作用：用来过滤文件(File对象)
        抽象方法：用来过滤文件的方法
        boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中
        参数：
            File pathname ： 使用ListFiles方法遍历得到的每一个File对象


    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter 接口  实现此接口的实例可用于过滤文件名
    作用：
        用于过滤文件名称
        抽象方法：用来过滤文件的方法
        boolean accept(File dir,String name) 测试指定文件是否应该包含在某一文件列表中
        参数：
            File dir ： 构造方法中被遍历的目录
            String name ： 使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称

    注意：
        两个过滤器接口没有实现类，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义
        过滤用的规则
 */

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\bootstrap\\bootstrap-3.3.7-dist");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){


        File[] files = file.listFiles((dir,name)-> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".js"));



        /*//Lambda表达式
        File[] files = file.listFiles((pathname)->{
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".js");
        });*/




        /*File[] files = file.listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File pathname){
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".js");
            }
        });*/


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
