package LearnJava.LearnString;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char cha = ch[i];
            if('A' <= cha && cha <= 'Z') {
                countUpper++;
            }else if('a' <= cha && cha <= 'z') {
                countLower++;
            }else if('0' <= cha && cha <= '9'){
                countNum++;
            }else{
                countOther++;
            }
        }

        System.out.println("大写字母:" + countUpper + "个");
        System.out.println("小写字母:" + countLower + "个");
        System.out.println("数字:" + countNum + "个");
        System.out.println("其他字符:" + countOther + "个");

    }
}



/*
    public static void main(String[] args) {
        int[] num = {1,2,3};
        String str = ArrayToString(num);
        System.out.println(str);
    }
    public static String ArrayToString(int[] p)
    {
        String str = "[";
        for (int i = 0; i < p.length; i++) {
            if(i == p.length - 1){
                str += "word" + p[i] + "]";
            }else {
                str += "word" + p[i] + "#";
            }
        }
        return str;
    }*/
