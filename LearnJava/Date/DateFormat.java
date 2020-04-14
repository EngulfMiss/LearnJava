package LearnJava.Date;

import java.text.ParseException;
import java.util.Date;
/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用:
    格式化(日期->文本)，解析(文本->日期)
成员方法：
    String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
    Date parse(String source) 把符合模式的字符串，解析为日期
DateFormat类是一个抽象类，无法直接创建对象，可以使用子类创建对象

    java.text.SimpleDateFormat extends DateFormat

    构造方法：
    SimpleDateFormat(String pattern)
    用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
    参数：
        String pattern : 传递指定的模式
    模式：区分大小写的
                y    年
                M    月
                d    日
                H    时
                m    分
                s    秒
    写对应的模式，会把模式替换为对应的日期和时间
    "yyyy-MM-dd HH:mm:ss"
    注意：
        模式中的字母不可更改，链接模式的符号可以更改
 */

import java.text.SimpleDateFormat;

public class DateFormat {
    public static void main(String[] args) throws ParseException{
        demo1();
        demo2();
    }
    /** 把日期格式化为文本
     * 使用步骤：
     * 1.创建SimpleDateFormat对象，构造方法中传递指定的模式
     * 2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式
     * 把Date日期格式化为符合模式的字符串
     *
     */
    private static void demo1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }

    /**
     *  使用DateFormat类中的方法parse，把文本解析为日期
     *  使用步骤：
     *  1.创建SimpleDateFormat对象，构造方法中传递指定的模式
     *  2.调用SimpleDateFormat对象中的parse，把符合构造方法中模式的字符串，解析为Date日期
     *  注意:
     *  parse方法声明了一个异常ParseException
     *  parse方法声明了一个异常
     *  如果字符串和构造方法的模式不一样，那么程序就会抛出异常
     */
    private static void demo2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-04-06 17:14:16");
        System.out.println(date);
    }
}
