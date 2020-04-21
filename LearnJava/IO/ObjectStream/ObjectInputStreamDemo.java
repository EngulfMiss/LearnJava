package LearnJava.IO.ObjectStream;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream : 对象的反序列化流
    作用：
        把文件中保存的对象，以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream
    参数：
        InputStream in ： 字节输入流
    特有的成员方法：
        Object readObject() 从ObjectInputStream读取对象

    使用步骤：
        1.创建ObjectInputStream对象，构造方法中传递字节输入流
        2.使用ObjectInputStream对象中的方法readObject，读取保存对象的文件
        3.释放资源
        4.使用读取出来的对象

    readObject()方法声明抛出了ClassNotFoundException异常
    当不存在对象的class文件时，抛出此异常

    反序列化的前提：
        1.类必须实现Serializable
        2.必须存在类对应的class文件

    static 关键字：静态关键字
        静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
        被static修饰的成员变量不能被序列化，序列化的都是对象

    transient关键字：瞬态关键字
        被transient修饰的成员变量，不能被序列化
        可以使用这个关键字让某个成员变量不被序列化
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test\\testdemo\\Person.txt"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);

        if(obj instanceof Person){
            Person p = (Person)obj;
            System.out.println(p.getName() + "," + p.getAge());
        }
    }
}
