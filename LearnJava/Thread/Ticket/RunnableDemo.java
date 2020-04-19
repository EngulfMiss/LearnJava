package LearnJava.Thread.Ticket;

/*
实现卖票
 */

public class RunnableDemo implements Runnable{
    //定义一个多个线程共享的数据
    private int ticket = 100;

    //创建一个锁对象,run方法外面
    Object obj = new Object();



    @Override
    public void run() {

        synchronized (obj){
            while(ticket>0) {
                System.out.println(Thread.currentThread().getName() + "正在卖->>" + ticket);
                ticket--;
            }
        }
    }
}
