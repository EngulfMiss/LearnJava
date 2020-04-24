package LearnJava.FunctionInterface.Supplier;

/*
    练习：求数组元素的最大值
        使用Supplier<T>接口作为方法的参数，通过Lambda表达式求出int数组中的最大值
 */

import java.util.function.Supplier;

public class Practice {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用integer
    public static int getMAX(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型数组
        int[] arr = {22,19,21,7,-1,120};
        int MAX = getMAX(()->{
           //获取数组最大值
            // 定义一个变量，把数组中的第一个元素给变量，用来记录数组中的最大值
           int max = arr[0];
           for(int num : arr){
               if(num > max){
                   max = num;
               }
           }
           return max;
        });
        System.out.println("最大值为:" + MAX);
    }
}
