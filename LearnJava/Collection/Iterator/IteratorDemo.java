package LearnJava.Collection.Iterator;

/*
java.util.Iterator接口(对集合进行遍历)
    常用方法：
    boolean hasNext() 如果仍有元素可以迭代，则返回true
    判断集合有没有下一个元素，有true，没有false
    E next() 返回迭代的下一个元素
    取出集合的下一个元素
    Iterator迭代器是一个接口，无法直接使用，需要使用实现类对象
    获取实现类的方式比较特殊.
    Collection接口中有一个方法叫iterator() 方法返回的就是迭代器的实现对象
    Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器

    迭代器的使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现对象，使用Iterator接口接收(多态)
    2.使用Iterator接口的方法hasNext()判断是否还有下一个元素
    3.使用Iterator接口中的方法next取出集合中的下一个元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Gnar");
        coll.add("Neeko");
        coll.add("Tian");

        //1.获取迭代器的实现对象
        // Iterator<E> 接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么类型，迭代器就是
        //什么类型
        //多态   接口               实现类
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            System.out.println(it2.next());
        }
    }
}
