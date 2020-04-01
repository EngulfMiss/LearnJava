package LearnJava.LearnString;

import org.w3c.dom.ls.LSOutput;

//常见3+1种方式
//public String()
//public String(char[] array)
//public String(byte[] array)
//直接创建

// == 对于基本数据类型是数值比较
// == 对于引用数据类型是进行地址值的比较

public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] ch = {'a','b','c'};
        String str3 = new String(ch);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }

}


/*
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串是:" + str1);
        char[] ch = {'G','n','a','r'};
        String str2 = new String(ch);
        System.out.println("第二个字符串是:" + str2);
        byte[] bt = {97,98,99};
        String str3 = new String(bt);
        System.out.println("第三个字符串是:" + str3);
        String str4 = "Neeko";
        System.out.println("第四个字符串是:" + str4);
    }*/
