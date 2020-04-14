package LearnJava.Generic;

public class GenericTest {
    public static void main(String[] args) {
        //不写泛型默认Object类型
        GenericDemo1 g1 = new GenericDemo1();
        g1.setName("Gnar");
        Object obj1 = g1.getName();
        System.out.println(obj1);

        GenericDemo1<Integer> g2 = new GenericDemo1<>();
        g2.setName(120);
        int num = g2.getName();
        System.out.println(num);

        GenericDemo1<String> g3 = new GenericDemo1<>();
        g3.setName("Gnar");
        String name = g3.getName();
        System.out.println(name);
    }
}
