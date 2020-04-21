package LearnJava.IO.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句，默认在控制台输出
    使用System.setOut方法改变输出语句的目的地为参数传递的打印流的目的地
        static void setOut(PrintStream out)
            重新分配"标准"输出流
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class KnowDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");

        PrintStream ps = new PrintStream("E:\\test\\testdemo\\Sout.txt");
        System.setOut(ps);
        System.out.println("我去其他地方输出了");
        ps.close();
    }
}
