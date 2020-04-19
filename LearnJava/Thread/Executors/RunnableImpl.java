package LearnJava.Thread.Executors;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建新线程");
    }
}
