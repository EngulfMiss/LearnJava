package LearnJava.Thread.Safe.SynchronizedDemo;

/*
    买票案例有线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的一种方案：使用同步代码块
    格式：
        synchronized(锁对象){
            可能会出现线程安全问题的代码(访问了共享数据的代码)
        }

        注意：
            1.同步代码块的锁对象，可以使用任意的对象
            2.必须保证多个线程使用的锁对象是同一个
            3.锁对象作用：
                把同步代码块锁住，只能让一个线程在同步代码块中执行
 */

public class SynchronizedDemo {

}
