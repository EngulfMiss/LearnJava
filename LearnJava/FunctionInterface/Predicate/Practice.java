package LearnJava.FunctionInterface.Predicate;

/*
    需求：筛选字符串数组中符合条件的字符串存储到ArrayList中
    条件：
        1.必须是雌性的
        2.姓名大于4个字

    分析：
        1.有两个判断条件，需要使用两个Predicate接口对条件进行判断
        2.必须同时满足两个条件，可以使用and连接
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class Practice {
    /*
        定义一个方法，方法的参数传递包含人员信息的数组
        传递两个Predicate接口，用于对数组的信息进行过滤
        把满足条件的信息存放到ArrayList集合中返回
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> p1,Predicate<String> p2){
        ArrayList<String> list = new ArrayList<>();
        for(String s:arr){
            boolean b = p1.and(p2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str2 = "Gnardaad";

        Predicate<String> p1 = new Test();
        boolean bol = p1.test(str2);
        System.out.println(bol);



        

        String[] str = {"Gnar,雄","Neeko,雌","Tian,雌"};
        ArrayList<String> list = filter(str,(s)->{
            return s.split(",")[1].equals("雌");
        },(s)->{
            return s.split(",")[0].length() > 4;
        });
        for(String s : list){
            System.out.println(s);
        }
    }
}
