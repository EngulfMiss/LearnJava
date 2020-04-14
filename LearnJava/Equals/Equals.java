package LearnJava.Equals;

/*
Object类的equals方法，默认比较的是两个对象的地址值，没有意义
所以我们要重写equals方法，比较两个对象的属性(name,age)
问题:
隐含着一个多态
多态的弊端:无法使用子类特有的内容(属性和方法)
解决:
可以使用向下转型(强转)把obj类型转换为比较的类型
 */

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person("Gnar",1006);
        Person p2 = new Person("Gnar",1006);

        System.out.println("p1的地址:" + p1);
        System.out.println("p2的地址:" + p2);
        //p1 = p2;
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
