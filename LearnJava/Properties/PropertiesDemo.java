package LearnJava.Properties;

/*
    java.util.Properties集合 extends Hashtable<K,V> implements Map<K,V>
    Properties 类表示了一个持久的属性集.Properties可保存在流中或从流中加载。属性列表中每个
    键及其对应值都是一个字符串
    Properties 集合是唯一一个和IO流结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，可以把硬盘中保存的文件(键值对)，读取到集合中使用

        写入硬盘：
        void store(OutputStream out,String comments)
        void store(Writer writer,String comments)
        参数：
            OutputStream out : 字节输出流，不能写中文
            Writer writer : 字符输出流，可以写中文
            String comments : 注释，用来解释说明保存的文件是做什么的
                不能使用中文，会产生乱码，默认是Unicode编码
                一般使用空字符串
        使用步骤：
            1.创建Properties集合对象，添加数据
            2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
            4.释放资源



        读取硬盘中文件，读取到集合中使用：
        void load(InputStream inStream)
        void load(Reader reader)
        参数：
            InputStream inStream : 字节输入流，不能读取含有中文的键值对
            Reader reader : 字符输入流，可以读取含有中文的键值对
        使用步骤：
            1.创建Properties集合对象
            2.使用Properties集合对象的load方法读取保存键值对文件
            3.遍历Properties集合

        注意：
            1.存储键值对的文件中，键与值默认的链接符号可以使用=,空格(其他符号)
            2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不再被读取
            3.存储键值对的文件中，键与值默认都是字符串，不再加引号


        属性列表中每个键及其对应值都是一个字符串
        注意：
            Properties集合是一个双列集合，key和value默认都是字符串
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException{
        //show1();
        //show2();
        show3();
    }

    private static void show3() throws IOException {
        Properties prop = new Properties();
        //prop.load(new FileReader("E:\\test\\testdemo\\c.txt"));
        prop.load(new FileInputStream("E:\\test\\testdemo\\c.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println("Key:" + key + ",Value:" + prop.getProperty(key));
        }
    }


    private static void show2() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("Gnar","7");
        prop.setProperty("Neeko","19");
        prop.setProperty("Tian","22");

        /*FileWriter fw = new FileWriter("E:\\test\\testdemo\\c.txt",false);
        prop.store(fw,"save data");
        fw.close();*/

        prop.store(new FileOutputStream("E:\\test\\testdemo\\c.txt"),"save data");
    }

    /**
     * 使用Properties集合存储数据，遍历取出Properties集合中的数据
     * Properties集合中有一些操作字符串的特有方法
     *      Object setProperty(String key,String value) 调用 Hashtable 的方法 put
     *      String getProperty(String key) 用指定的键在此属性列表中搜索属性
     *      Set<String> stringPropertyNames() 返回此属性列表中的键集合，其中该键及其
     *      对应值是字符串
     */
    private static void show1() {
        Properties prop = new Properties();
        prop.setProperty("Gnar","7");
        prop.setProperty("Neeko","19");
        prop.setProperty("Tian","22");

        Set<String> set = prop.stringPropertyNames();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println("Key:" + str + ",Value:" + prop.getProperty(str));
        }
    }
}
