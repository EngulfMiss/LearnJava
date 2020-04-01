package LearnJava.Random;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        //[0,10) 的随机数范围
        int num2= r.nextInt(10);
        System.out.println("随机数是:" + num);
        System.out.println("随机数是:" + num2);
    }
}
