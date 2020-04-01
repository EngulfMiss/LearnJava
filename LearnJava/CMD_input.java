package LearnJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CMD_input {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1输入字符：");
        String m=sc.next();
        System.out.println("你输入的是"+m);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2输入字符");
        String s=null;
        try {
            s=bf.readLine();
        } catch (IOException e) { e.printStackTrace();}
        System.out.println("你输入的是"+s);
        sc.close();
    }
}
