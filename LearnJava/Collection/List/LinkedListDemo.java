package LearnJava.Collection.List;

/*
java.util.LinkedList 集合 implement List 接口
LinkedList 集合的特点：
    1.底层是一个链表结构：查询慢，增删快
    2.里边包含了大量操作首尾的方法
    注意：使用LinkedList集合特有的方法，不能使用多态

    - public void addFirst(E e) 将指定元素插入此列表的开头
    - public void addLast(E e) 将指定元素插入此列表的结尾
    - public E getFirst() 返回此列表的第一个元素
    - public E getLast() 返回此列表的最后一个元素
    - public E removeFirst() 移除并返回此列表的第一个元素
    - public E removeLast() 移除并返回此列表的最后一个元素
    - public E pop() 从此列表所表示的堆栈处弹出一个元素    等效于 removeFirst
    - public void push(E e) 将元素推入此列表所表示的堆栈  等效于 addFirst
    - public boolean isEmpty() 列表为空，返回true
 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //show();
        //show2();
        show3();
    }

    private static void show3() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Gnar");
        linked.add("Neeko");
        linked.add("Tian");

        System.out.println(linked.removeFirst());
        System.out.println(linked.removeLast());
        System.out.println(linked);
    }

    private static void show2() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Gnar");
        linked.add("Neeko");
        linked.add("Tian");
        if(!linked.isEmpty()) {
            System.out.println(linked.getFirst());
            System.out.println(linked.getLast());
        }
    }

    private static void show() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Gnar");
        linked.add("Neeko");
        linked.add("Tian");

        //linked.addFirst("QSJ");
        linked.push("QSJ");
        System.out.println(linked);

        linked.addLast("End");
        System.out.println(linked);
    }
}
