package LearnJava.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Person> list3 = new ArrayList<>();
//        Person p1 = new Person("Gnar",6);
//        Person p2 = new Person("Neeko",16);
//        Person p3 = new Person("Tian",22);
//        Collections.addAll(list3,p1,p2,p3);

        Collections.addAll(list3,new Person("Gnar",6),new Person("Neeko",16),new Person("Tian",22));


        Collections.addAll(list2,5,7,2,3,4,23);
        //添加集合元素
        Collections.addAll(list,"Gnar","Neeko","Tian");
        System.out.println(list);

        //打乱集合元素
        Collections.shuffle(list);
        System.out.println(list);

        //排序,自定义类型
        //被排序的集合里面存储的元素，必须实现Comparable,重写接口中的方法comparaTo定义排序规则
        Collections.sort(list2);
        System.out.println(list2);

        Collections.sort(list3);
        System.out.println(list3);
    }
}
