package LearnJava.Final;

public class HeroDemo {
    public static void main(String[] args) {
        Hero hero1 = new Hero("纳尔");
        System.out.println(hero1.getName());
        System.out.println(hero1);
        hero1 = new Hero("妮蔻");
        System.out.println(hero1.getName());
        System.out.println(hero1);

        //final修饰的引用类型变量，其中的地址不可改变
        final Hero hero2 = new Hero("真天");
        //hero2 = new Hero("克烈");
        hero2.setName("克烈");
        System.out.println(hero2.getName());
    }
}
