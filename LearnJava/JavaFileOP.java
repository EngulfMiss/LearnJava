package LearnJava;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class JavaFileOP {

    public static final int num10 = 10;

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\output.txt");
        File file2 = new File("D:\\input.txt");
        FileInputStream fis = new FileInputStream(file2);
        byte[] bytes = new byte[256];
        int nums[][] = new int[9][9];
        int num = 0;
//        while((num = fis.read(bytes))!=-1){
//            System.out.print(new String(bytes,0,num));
//            if(num % 2 == 0){
//                nums[][];
//            }
//        }
        //System.out.println(new String(bytes));

        fis.close();






        //read()的单字节读取
//        int len = 0;
//        /**
//         * 需要用一个变量来接收，不然循环打印只会出错
//         */
//        while((len = fis.read())!=-1){
//            System.out.println((char)len);
//        }
//        fis.close();






        /*
        写入到文件中去
        FileOutputStream fos = new FileOutputStream(file,true);
        for(int i = 0; i < num10; i++)
        {
            fos.write("纳尔".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

        */


        /*byte[] bytes = "纳尔中午好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();*/
    }
}
