package LearnJava.LearnString;

/*
分割字符串的方法：
public String[] split(String regex)
按照参数的规则，将字符串切分为若干部分

注意事项：
split方法的参数其实是一个“正则表达式”，必须写\\.
 */

public class StringSplit {
    public static void main(String[] args) {
        String str1 = "Gnar,Neeko,Tian";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String str2 = "AAA.BBB.CCC";
        String[] array2 = str2.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
