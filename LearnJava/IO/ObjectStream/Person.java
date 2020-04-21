package LearnJava.IO.ObjectStream;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    需要实现java.io.Serializable 接口以启动其序列化功能。未实现此接口的类
    不能使其任何状态序列化或反序列化
    Serializable 接口也叫标记性接口
        要序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
        当我们进行序列化和反序列化的时候就会检测类上是否有这个标记，没有标记就
        会抛出NotSerializableException异常

    手动添加一个序列号，可以使类的修改不发生反序列号匹配时的冲突问题
    方法：
    static final long serialVersionUID = 1214L;
 */

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1214L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
