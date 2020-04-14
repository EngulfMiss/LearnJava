package LearnJava.Collection;

/*
java.util.Collection接口
所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
任意的单列集合都可以使用Collection接口的方法

共性的方法:
    public boolean add(E e)  把给定的对象添加到当前集合中
    public void clear()  清空集合中的所有元素
    public boolean remove(E e)  把给定的对象在当前集合中删除
    public boolean contains(E e)  判断当前集合中是否包含给定的对象
    public boolean isEmpty  判断当前集合是否为空
    public int size()  返回当前集合元素的个数
    public Object[] toArray()  把集合中的元素，存储带数组中
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);

        //add添加
        coll.add("Gnar");
        coll.add("Neeko");
        coll.add("Tian");
        coll.add("QSJ");
        System.out.println(coll);

        //remove删除，有返回true，没有返回false
        coll.remove("QSJ");
        System.out.println(coll);

        //contains判断存在
        boolean b = coll.contains("QSJ");
        boolean b2 = coll.contains("Gnar");
        System.out.println(Boolean.toString(b) + " " + Boolean.toString(b2));

        //size
        System.out.println(coll.size());

        //toArray
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //clear 清空集合，但不清楚元素
        coll.clear();
        System.out.println(coll);

        //isEmpty
        System.out.println(coll.isEmpty());
    }
}
