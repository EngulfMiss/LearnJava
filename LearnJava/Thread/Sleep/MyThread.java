package LearnJava.Thread.Sleep;

/*
    public static void sleep(long millis) 使当前正在执行的线程以指定的毫秒数暂停
    毫秒数结束以后，线程继续执行

    Thread.sleep使用是有异常的，要处理
 */

public class MyThread {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i+1);

            //使用Thread的sleep方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
