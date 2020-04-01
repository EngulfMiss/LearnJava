package LearnJava;

import java.util.Scanner;

public class Pointer {
    public static void main(String[] args) {
        int[] result = calculate(1,2,3);
        System.out.println("总和:" + result[0]);
        System.out.println("乘积:" + result[1]);
    }

    static int[] calculate(int a,int b,int c)
    {
        int sum = a + b + c;
        int mul = a * b * c;
        /*int[] array = new int[2];
        array[0] = sum;
        array[1] = mul;*/
        int[] array = new int[] {sum,mul};
        return array;
    }
}



    //比较数组内元素大小
    /*public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 6, 7};
        printArray(array);
    }

    static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
        }
    }*/





        /*int[] array = new int[]{50, 40, 30, 20, 100, 240, 120};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);*/


//数组的静态初始化
        /*int[] nums = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }*/


//数组的动态初始化
        /*Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = input.nextInt();
        }
        for(int i = 0;i < nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }*/

