package LearnJava.IO.ObjectStream;

/*
    练习：序列化集合
        当我们想在文件中保存多个对象时
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化

    分析：
        1.定义一个存储Person对象的ArrayList集合
        2.向集合中添加Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject对集合进行序列化
        5，创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */

import java.io.*;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Gnar",7));
        list.add(new Person("Neeko",19));
        list.add(new Person("Tian",20));
        list.add(new Person("QSJ",22));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test\\testdemo\\Person.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test\\testdemo\\Person.txt"));
        Object obj = ois.readObject();


            ArrayList<Person> list2 = (ArrayList<Person>)obj;

            for(Person p : list2){
                System.out.println(p);
            }
            oos.close();
            ois.close();
    }
}
