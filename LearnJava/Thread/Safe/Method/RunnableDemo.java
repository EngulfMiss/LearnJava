package LearnJava.Thread.Safe.Method;

/*
    解决线程安全问题的第二种方法：使用同步方法
    使用步骤：
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加一个修饰符synchronized修饰符

    格式:
        修饰符 synchronized 返回值类型 方法名(参数列表){
            访问共享数据的代码
        }
 */

public class RunnableDemo implements Runnable{
    //定义一个多个线程共享的数据
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            PayTicket2();
            if(ticket==1)
                break;
        }

    }

    //定义一个同步方法

    public synchronized void PayTicket(){
        if(ticket>0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖->>" + ticket);
            ticket--;
        }
    }


    //静态同步方法
    public static synchronized void PayTicket2(){
        if(ticket>0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖->>" + ticket);
            ticket--;
        }
    }
}
