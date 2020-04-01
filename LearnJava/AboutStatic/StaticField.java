package LearnJava.AboutStatic;

/*
如果一个成员变量使用static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象
共享同一份数据
 */

public class StaticField {
    public static void main(String[] args) {
        Hero hero1 = new Hero("纳尔",18);
        Hero hero2 = new Hero("真天",18);
        hero1.home = "召唤师峡谷";
        System.out.println("姓名:" + hero1.getName() + " , 等级:" + hero1.getLevel() + " , 家在:" + hero1.home
        + " , ID:" + hero1.getId());
        System.out.println("姓名:" + hero2.getName() + " , 等级:" + hero2.getLevel() + " , 家在:" + hero2.home
        + " , ID:" + hero2.getId());
    }
}
