package LearnJava.ArrayList;

/*
数组长度不可以改变
Arraylist长度可以改变

对应ArrayList来说<>表示泛型
泛型就是集合当中所有元素，全都是统一的什么类型
注意：泛只能是引用类型，不能是基本类型
 */


/*
常用方法
public boolean add(E e); 向集合当中添加元素
public E get(int index); 从集合当中获取元素，参数为编号
public E remove(int index); 从集合当中删除元素
public int size(); 获取集合的长度
 */

//如果想向集合ArrayList中存储基本类型，必须使用基本类型对应的"包装类"
//        byte        Byte
//        short       Short
//        int         Integer
//        long        Long
//        float       Float
//        double      Double
//        char        Character
//        boolean     Boolean

import java.util.ArrayList;
import java.util.Random;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Random rom = new Random();
        for (int i = 0; i < 6; i++) {
            int num = rom.nextInt(33) + 1;
            List.add(num);
        }
        System.out.print(List);
    }
}





    /*public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(120);
        System.out.println(list);

        int num = list.get(0);
        System.out.println("第一个数字是:" + num);
    }*/




    /*  ArrayList<String> list = new ArrayList<>();
        boolean seccess = list.add("纳尔");
        list.add("妮蔻");
                list.add("克烈");
                list.add("真天");
                for (int i = 0; i < list.size(); i++)
        {
        System.out.println(list.get(i));
        }*/




/*      System.out.println(list);
        System.out.println(list.size());
        //System.out.println(list.get(0) + list.get(3));
        String whoRemove = list.remove(3);
        //删除的是谁
        System.out.println(whoRemove);
        System.out.println(list);
        //集合长度
        System.out.println(list.size());
        System.out.println(seccess);*/



/*
    ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
                list.add("纳尔");
                list.add("妮蔻");
                list.add("克烈");
                list.add("真天");
                System.out.println(list);*/
