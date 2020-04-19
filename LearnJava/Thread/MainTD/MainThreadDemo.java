package LearnJava.Thread.MainTD;

/*
    主线程：执行(main)方法的线程

    单线程程序：java程序中只有一个线程
    程序从main方法开始，从上到下依次执行
 */

public class MainThreadDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Gnar");
        p1.run();

        Person p2 = new Person("QSJ");
        p2.run();
    }
}
