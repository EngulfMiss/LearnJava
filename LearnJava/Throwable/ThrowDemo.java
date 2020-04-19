package LearnJava.Throwable;

/*
    throw关键字:
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");
    注意：
        1.throw关键字必须写在方法的内部
        2.throw关键字后面new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后面创建的是RuntimeEcxeption或者是RuntimeException的子类对象
            我们可以不处理，默认交给JVM处理(打印异常中断程序)
            throw关键字后面创建的是编译异常，我们就必须处理这个异常，throws，或者trycatch

     throws 和 try...catch的不同，throws出现异常抛出后不再执行后续代码

 */

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int num = getElement(arr,3);
    }
    public static int getElement(int[] arr,int index){
        if(arr == null){
            throw new NullPointerException("传递的数组为空");
        }
        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("数组索引有问题");
        }
        int ele = arr[index];
        return ele;
    }
}
