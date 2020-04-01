package LearnJava.LearnString;

/*
public String substring(int index) 截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin, int end) 截取从begin开始，一直到end结束，中间的字符串
PS：[begin,end) 左闭右开
*/

public class SubString {
    public static void main(String[] args) {
        String str1 = "Gnar~dada~";
        String str2 = str1.substring(0,5);
        System.out.println(str2);
    }
}
