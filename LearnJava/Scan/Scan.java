package LearnJava.Scan;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        //int num = new Scanner(System.in).nextInt();


        //methodParam(new Scanner(System.in));
        Scanner Scan = returnScan();
        int num = Scan.nextInt();
        System.out.println("你的输入是:" + num);
        /*int num = Scan.nextInt();
        int num2 = Scan.nextInt();
        int max = num > num2 ? num : num2;
        int num3 = Scan.nextInt();
        max = max > num3 ? max : num3;
        System.out.println("最大值为:" + max);*/
    }

    public static void methodParam(Scanner Scan)
    {
        int num = Scan.nextInt();
        System.out.println("你输入的是:" + num);
    }

    public static Scanner returnScan()
    {
        return new Scanner(System.in);
    }

}
