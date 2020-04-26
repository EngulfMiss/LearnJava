package LearnJava.MethodReference.Demo3;

/*
    通过类名引用静态成员方法
    前提：
        类已经存在，静态成员方法已经存在
        就可以通过类名直接引用静态成员方法
 */

public class MethodRerClass {
    public static int method(int num,Calcable c){
        return c.calcAbs(num);
    }

    public static void main(String[] args) {
        int nums = method(-23,(num)->Math.abs(num));
        System.out.println(nums);

        //使用方法引用优化Lambda
        int sum = method(-12,Math::abs);
        System.out.println(sum);
    }
}
