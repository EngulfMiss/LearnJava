package LearnJava.Thread.Safe.LockDemo;

/*
    解决线程安全问题的第三种方案：使用Lock锁
    java.util.concurrent.locks.lock接口
    Lock 实现提供了比使用synchronized方法和语句课获得的更广泛的锁定操作
    Lock接口中的方法：
        1.void lock()
            获取锁
        2.void unlock()
            释放锁

    使用步骤:
    java.util.concurrent.locks.ReentrantLock implement Lock  接口

        1.在成员位置创建一个ReentrantLock 对象
        2.在可能会出现线程安全问题的代码前，调用Lock接口中的方法lock获取锁
        3.在可能会出现线程安全问题的代码后，调用Lock接口中的方法unlock释放锁
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableDemo implements Runnable{
    //定义一个多个线程共享的数据
    private int ticket = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {

            while(true) {
                //获取锁
                l.lock();

                try {
                    Thread.sleep(100);
                    if(ticket>0) {
                        System.out.println(Thread.currentThread().getName() + "正在卖->>" + ticket);
                        ticket--;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }
    }
}
