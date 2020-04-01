package LearnJava.LearnString;

//public boolean equals(Object obj);
//只有参数是一个字符串并且内容相同才会返回true，否则返回false

//public boolean equalsIgnoreCase(String str)
//忽略大小写的字符串比较

//public int length()
//获取字符串当中含有字符的个数，拿到字符串的长度

//public String concat(String str)
//将当前字符串和参数字符串拼接成返回值的字符串

//public char charAt(int index)
//获取指定索引位置的单个字符

//public int indexOf(String str)
//查找参数字符串在文本字符串中首次出现的索引位置，如果没有返回-1

public class StringMethod {
    public static void main(String[] args) {
        int length = "bkfbwEFBKUyebfuyWEUF".length();
        System.out.println(length);
        String str1 = "真天";
        String str2 = ",我想看黄金羽毛";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        char ch = str1.charAt(1);
        System.out.println(ch);
        String origin = "Gnardada";
        int num = origin.indexOf("dad");
        System.out.println(num);
    }
}



/*
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] ch = {'H','e','l','l','o'};
        String str3 = new String(ch);
        String str4 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        System.out.println(str1.equalsIgnoreCase(str4));
    }*/
