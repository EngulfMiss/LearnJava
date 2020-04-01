package LearnJava.ArrayList.Students;

import java.util.ArrayList;

public class SpiritList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("纳尔");
        list.add("妮蔻");
        list.add("真天");
        print(list);
    }

    public static void print(ArrayList<String> List)
    {
        System.out.print("{");
        for (int i = 0; i < List.size(); i++) {
            if(i == List.size() - 1){
                System.out.print(List.get(i));
            }else {
                System.out.print(List.get(i) + "@");
            }
        }
        System.out.print("}");
    }


    /*public static void main(String[] args) {
        ArrayList<Spirit> List = new ArrayList<>();
        Spirit Sp1 = new Spirit("纳尔",1006);
        Spirit Sp2 = new Spirit("妮蔻",16);
        Spirit Sp3 = new Spirit("真天",20);
        List.add(Sp1);
        List.add(Sp2);
        List.add(Sp3);
        for (int i = 0; i < List.size(); i++) {
            Spirit spirit = List.get(i);
            System.out.println("姓名:" + spirit.getName() + " , 年龄:" + spirit.getAge());
        }
    }*/

}
