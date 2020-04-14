package LearnJava.Date;

import java.util.Calendar;
import java.util.Date;

/*
java.util.Calendar类:日历类
Calendar类是一个抽象类，里面提供了很多操作日历字段的方法(TEAR,MONTH,DAY_OF_MONTH,HOUR)
Calendar类无法直接创建对象使用，里边有一个静态方法叫getInstance()，该方法返回了Calendar
类的子类对象
static Calendar getInstance()
    使用默认时区和语言环境获得一个日历.


Calendar 的常用成员方法：
    public int get(int field) : 返回给定日历字段的值
    public void set(int field ,int value) : 将给定的日历字段设置为给定的值
    public abstrace void add(int field,int amount) : 根据日历的规则，为给定的日历段添加或
    减去指定的时间量
    public Date getTime() : 返回一个表示此Calendar的时间值的Date对象

    成员方法的参数：
    int field : 日历类的字段，可以使用Calendar类的静态成员变量获取
    public static final int YEAR = 1    年
    public static final int MONTH = 2   月
    public static final int DATE = 3    月中的某一天
    public static final int DAY_OF_MONTH = 4   月中的某一天
    public static final int HOUR = 5   时
    public static final int MINUTE = 6   分
    public static final int SECOND = 7   秒
 */

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        demo4();
        //demo1();
    }

    /**
     *  public int get(int field) 返回日历给定字段的值
     *  参数：传递指定的日历字段(YEAR,MONTH...)
     *  返回值：日历字段代表的值
     */
    private static void demo1(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
    }

    /**
     *  public void set(int field ,int value)  将给定的日历字段设置为给定值
     *  参数：
     *  int field:传递指定的日历字段(YEAR,MINTH...)
     *  int value:给定字段设置的值
     */
    private static void demo2(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2200);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DATE,24);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        //同时设置年月日
        //set(2200,12,24);
    }

    /**
     *  public abstrace void add(int field,int amount):为给定的日历添加或者减去指定的时间量
     *  把指定的字段增加/减少指定的值
     *  参数：
     *  int field: 传递指定的日历字段(YEAR,MONTH...)
     *  int amount:添加/减少指定的时间
     */
    private static void demo3(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,4);
        c.add(Calendar.MONTH,-1);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
    }


    private static void demo4(){
        //日历转化为日期
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
