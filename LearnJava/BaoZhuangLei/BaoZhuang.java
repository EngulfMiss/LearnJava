package LearnJava.BaoZhuangLei;

/*
装箱：
    构造方法：
    Integer(int value)
    Integer(String str)
    静态方法:
    static Integer valueOf(int i)
    static Integer valueOf(String str)

拆箱:
    成员方法:
    int intValue()

    基本数据类型与字符串之间的相互转换
    基本类型转字符串方法：
    1.基本数据类型的值加""
    2.包装类的静态方法toString
    static String toString(int value)
    3.String类的静态方法valueOf(参数)

    字符串转基本类型方法:
    1.使用包装类的静态方法parseXXX("数值类型的字符串");
    Integer类 : static int parseInt(String str);
    .....
 */

public class BaoZhuang {
    public static void main(String[] args) {
        int num = 10;
        //基本类型转字符串
        String str = num + "";
        System.out.println(str + 200);

        String str2 = Integer.toString(num);
        System.out.println(str2 + 200);

        String str3 = String.valueOf(num);
        System.out.println(str3 + 200);

        //字符串转基本类型
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}


/*
    public static void main(String[] args) {
        //装箱
        Integer inter = new Integer(100);
        System.out.println(inter);

        Integer inter2 = new Integer("100");
        System.out.println(inter2);

        Integer inter3 = Integer.valueOf(100);
        System.out.println(inter3);

        Integer inter4 = Integer.valueOf("100");
        System.out.println(inter4);

        //拆箱
        int num = inter.intValue();
        System.out.println(num);
    }*/
