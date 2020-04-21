package LearnJava.IO;

/*
    JDK7的新特性
    在try的后面可以增加一个()，在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动把流对象释放，不用finally了
    格式：
    try(定义流对象;定义流对象...){
        可能出现异常的代码
    }catch(异常类变量 变量名){
        异常处理逻辑
    }
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("D:\\photo\\1.png");
            FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\1.png")){
            int len = 0;
            while((len = fis.read())!=-1){
                fos.write(len);
            }
        }catch(IOException e){
            System.out.println(e);
        }


        //一次读取一个字节，写入一个字节

    }

}



/*    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\photo\\1.png");
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\1.png");
        try(fis;fos){
            int len = 0;
            while((len = fis.read())!=-1){
                fos.write(len);
            }
        }catch(IOException e){
            System.out.println(e);
        }


        //一次读取一个字节，写入一个字节

    }*/





/*
    //变量在定义的时候可以没有值，但是在使用的时候必须有值
    //new FileWriter如果创建失败，fw就没有值，fw.clsoe就会报错
    FileWriter fw = null;
        try{
                fw=new FileWriter("E:\\test\\testdemo\\c.txt",false);
                fw.write("账号Gnardada3"+"\r\n");
                }catch(IOException e){
                System.out.println(e);
                }finally{
                //创建对象失败，fw为null，null是不能调用方法的，会抛出空指针异常
                if(fw!=null){
                try{
                //fw.close();本身也会有异常
                fw.close();
                }catch(IOException e){
                e.printStackTrace();
                }
                }
                }*/
