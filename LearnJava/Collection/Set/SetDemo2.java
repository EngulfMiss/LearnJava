package LearnJava.Collection.Set;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Gnar",1006);
        Person p2 = new Person("Gnar",1006);
        Person p3 = new Person("Gnar",22);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //不是同一个对象
        System.out.println(p1 == p2);
        //认定是同一个元素
        System.out.println(p1.equals(p2));
    }
}
