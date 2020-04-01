package LearnJava.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistReturn {
    //题目要求用一个大集合存放20个随机数字，然后筛选其中的偶数元素
    //放到小集合当中.要求使用自定义方法来实现筛选

    //1.一个存储int的集合
    //2.随机数字
    //3.循环放入大集合
    //4.定义一个方法，进行筛选

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> smallList = new ArrayList<>();
        Random rom = new Random();
        for (int i = 0; i < 20; i++) {
            int num = rom.nextInt(100) + 1;
            List.add(num);
        }
        smallList = getSmallArray(List);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("随机偶数个数为:" + smallList.size());
    }

    public static ArrayList<Integer> getSmallArray(ArrayList<Integer> list) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
            {
                smalllist.add(list.get(i));
            }
        }
        return smalllist;
    }
}
