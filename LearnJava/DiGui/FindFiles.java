package LearnJava.DiGui;

/*
    查找目录中，以指定后缀名结尾的文件
 */

import java.io.File;

public class FindFiles {
    public static void main(String[] args) {
        File file = new File("D:\\bootstrap\\bootstrap-3.3.7-dist");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){

        File[] files = file.listFiles();
        for(File f : files){
            //得到File对象，判断是不是文件夹，是就继续查看子文件夹
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
                /*
                    只要.js结尾的文件
                    1.把File对象f，转化为字符串对象
                    getName()
                    getPath()
                    toString()

                    2.调用String类中的方法，endsWith判断字符串是否以.js结尾

                    3.是则输出
                 */
                if(f.getName().toLowerCase().endsWith(".js")){
                    System.out.println(f);
                }
            }
        }
    }
}
