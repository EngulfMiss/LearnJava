package LearnJava.Collection.Set;

/*
哈希值：是一个十进制的整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，
是模拟出来的地址，不是数据实际存储的物理地址，在Object类中有一个方法可以获取对象的
哈希值)
 */

public class HashDemo extends Object{
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        /*
        String 类的哈希值
            String类重写Object类的hashCode方法
         */
        String str1 = new String("Gnar");
        String str2 = new String("Gnar");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
