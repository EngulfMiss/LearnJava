package LearnJava.LearnString;

/*
String当中与转换相关的常用方法有：
public char[] toCharArray(): 将当前字符串拆分为字符数组作为返回值
public byte[] getBytes(),获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSeqence newString):
将所有出现的老字符串替换为新的字符串，返回新字符串
 */

public class StringConvert {
    public static void main(String[] args) {
        char[] ch = "Gnar".toCharArray();
        System.out.println(ch[0]);
        System.out.println(ch.length);
        byte[] bytes = "Neeko".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println("================");
        String str1 = "How do you do?";
        String str2 = str1.replace("o","?");
        System.out.println(str2);
        String str3 = "唬嘟哇啦";
        String str4 = str3.replace("唬嘟哇啦","????");
        System.out.println("str4");
    }
}
