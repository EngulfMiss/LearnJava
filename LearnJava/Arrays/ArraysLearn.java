package LearnJava.Arrays;

/*
public static String toString(数组)
将参数数组变成字符串

sort备注：
1.如果是数值，sort默认从小到大升序
2.如果是字符串，sort默认按照字母升序
3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparatar接口支持
 */


import java.util.Arrays;

public class ArraysLearn {
    public static void main(String[] args) {
        int[] nums = {1,2,3,45,6};
        //把数组变成字符串
        String str1 = Arrays.toString(nums);
        System.out.println(str1);
        char[] ch = str1.toCharArray();
        System.out.println(ch[0]);


        int[] array1 = {23,4,32324,35,234,34,43};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] heros = {"Gnar" , "Neeko" , "Zhentian"};
        Arrays.sort(heros);
        System.out.println(Arrays.toString(heros));
    }
}
