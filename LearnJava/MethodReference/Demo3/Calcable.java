package LearnJava.MethodReference.Demo3;

@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值运算返回
    int calcAbs(int num);
}
