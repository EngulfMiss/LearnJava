package LearnJava.Generic;

/*
    泛型通配符：
        ? :代表任意类型的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Gnar");
        list2.add("Neeko");
        list2.add("Tian");

        printArray(list);
        printArray(list2);
    }

    /**
     * 定义一个方法，能够遍历所有类型的ArrayList集合
     * 这时候我们不知道ArrayList集合使用的什么数据类型，可以使用泛型统配符 ?
     * 注意：
     *  泛型没有继承概念
     */
    public static void printArray(ArrayList<?> list){
        Iterator it = list.iterator();
        for(Object num:list){
            System.out.println(it.next());
        }
    }
}
