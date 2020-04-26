package LearnJava.MethodReference.Demo7;

/*
    数据的构造器引用
 */

public class MainMethod {
    /*
        定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法builderArray创建数组并返回
     */
    public static int[] createArray(int length,ArrayBuilder a){
        return a.builderArray(length);
    }

    public static void main(String[] args) {
        int[] nums = createArray(5,length->new int[length]);
        System.out.println(nums.length);

        /*
            使用方法引用优化Lambda表达式
            已知创建的就是int[]数组
            数组的长度也是已知的
            我们可以使用方法引用
            int[] 引用new，根据参数传递的长度创建数组
         */
        int[] nums2 = createArray(10,int[]::new);
        System.out.println(nums2.length);
    }
}
