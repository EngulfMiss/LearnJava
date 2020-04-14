package LearnJava.Collection.List;

/*
java.util.List 接口 extends Collection接口
List接口特点:
    1.有序的集合，存储元素和取出元素的顺序是一致的
    2.有索引，包含了一些带索引的方法
    3.允许存储重复的元素

    List接口中带索引的方法:
    - public void add(int index,E element) 将指定的元素，添加到该集合中的指定位置上
    - public E get(int index) 返回集合中指定位置的元素
    - public E remove(int index) 移除列表中指定位置的元素，返回的是被移除的元素
    - public E set(int index,E element) 用指定的元素替换集合中指定位置的元素，返回值为更新的元素
    注意：
        我们索引的时候要小心越界
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gnar");
        list.add("Neeko");
        list.add("Tian");
        list.add("Gnar");
        System.out.println(list);

        list.add(2,"QSJ");
        System.out.println(list);

        String str = list.remove(4);
        System.out.println(list);
        System.out.println(str);

        String str2 = list.set(2,"qsj");
        System.out.println(list);
        System.out.println(str2);

        for(String s:list){
            System.out.println(s);
        }
        System.out.println("======================");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
