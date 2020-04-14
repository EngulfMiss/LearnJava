package LearnJava.Collection;

/*
foreach:底层也是迭代器
Collection<E> extexds Iterable<E> 所有的单列集合都可以使用foreach

格式:
    for(集合/数组的数据类型 变量名:集合名/数组名){
        sout(变量名);
    }
 */

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1(){
        int[] nums = {1,2,3,4,5};
        for(int i:nums){
            System.out.println(i);
        }
    }

    private static void demo2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Gnar");
        list.add("Neeko");
        list.add("Tian");
        for(String str:list){
            System.out.println(str);
        }
    }
}
