package LearnJava.Collection.Set;

/*
java.util.LinkedHashSet集合 extends HashSet 集合
LinkedHashSet集合特点:
    底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Gnar");
        set.add("Neeko");
        set.add("Tian");
        set.add("Gnar");
        System.out.println(set);


        //有序的，但还是不允许有重复元素
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Gnar");
        set2.add("Neeko");
        set2.add("Tian");
        set2.add("Gnar");
        System.out.println(set2);
    }
}
