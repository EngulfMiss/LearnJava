package LearnJava.Collection.Set;

/*
java.util.Set 接口 extends Collection接口
Set接口的特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
java.util.HashSet 集合 implements Set接口
HashSet特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，不能使用for循环遍历
    3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    4.底层是一个哈希表结构(查询速度非常快)


    Set集合不允许重复元素的原理
    存储的元素可以是(String,Integer,...Object) , 但都必须重写hasCode和equal方法

    要求：
        同名和同年龄的人，视为同一个人，只能存储一次
 */

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str1 = new String("Gnar");
        String str2 = new String("Neeko");
        set.add(str1);
        set.add(str2);
        set.add("重地");
        set.add("通话");
        set.add("Gnar");
        System.out.println(set);
    }
}


/*
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(120);
        set.add(140);
        set.add(160);
        set.add(180);
        set.add(120);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("============");
        for(Integer num:set){
            System.out.println(num);
        }
    }*/
