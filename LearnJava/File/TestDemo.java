package LearnJava.File;

import java.io.File;

public class TestDemo {
    public static void main(String[] args) {
        /*
            File类的构造方法
         */
        //show1();
        //show2("c:\\","a.txt");
        show3();
    }

    /*
    File(File parent,String child)  根据parent路径名称字符串和child路径名称字符串
    创建一个File(实例)
    参数：把路径分为两部分
    File parent: 父路径
    String child:子路径

    好处：
        父路径和子路径可以单独书写，使用起来很灵活
        路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
 */
    private static void show3() {
        File parent = new File("C:\\");
        File file = new File(parent,"Heool.java");
        System.out.println(file);
    }








    /*
        File(String parent,String child)  根据parent路径名称字符串和child路径名称字符串
        创建一个File(实例)
        参数：把路径分为两部分
        String parent: 父路径
        String child:子路径

        好处：
            父路径和子路径可以单独书写，使用起来很灵活
     */
    private static void show2(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }


    /*
        File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个File实例
        参数：
            String pathname：路径名称
            路径可以以文件结尾，也可以是以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以是存在，也可以是不存在
            创建File对象，只是把字符串路径封装为File对象，不考虑路径的真实性
     */
    private static void show1() {
        File f1 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava\\a.txt");
        System.out.println(f1);

        File f2 = new File("D:\\IDEA\\LearnJava\\src\\LearnJava");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}
