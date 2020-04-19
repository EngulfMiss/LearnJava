package LearnJava.Thread.WaitNotify;

/*
    等待唤醒案例:线程之间的通信：
        创建一个顾客线程 告诉生产者线程 调用wait方法，放弃CPU的执行 进入到WAITTING状态(无限等待状态)
        创建一个生产者线程 完成任务后，调用notify方法，唤醒消费者线程

    注意：
        生产者线程和消费者线程必须用同步代码块包起来，等待和唤醒只能有一个在执行
        锁对象必须保证唯一的
        只有锁对象才能调用wait和notity方法

    Object类中的方法
    void wait()
        在其他线程调用此对象的notify()方法或notifyAll()方法前，导致当前线程等待
    void notify()
        唤醒在此对象监视器上等待的单个线程
        会继续执行wait方法之后的代码

 */

public class WaitNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("你给我做东西");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //唤醒之后执行的代码
                    System.out.println("wait之后的代码");

                }
            }
        }.start();



        //创建一个消费者线程
        new Thread(){
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    System.out.println("你的东西做好了");
                    obj.notify();
                }
            }
        }.start();
    }
}
