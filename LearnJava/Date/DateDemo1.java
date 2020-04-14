package LearnJava.Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }
    private static void demo1(){
        Date date = new Date();
        System.out.println(date);
    }

    private static void demo2(){
        Date date = new Date(1586162089820L);
        System.out.println(date);
    }

    private static void demo3(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
