package LearnJava.Thread.Threads;

public class MyThread extends Thread{
    @Override
    public void run(){
        //System.out.println(getName());
        Thread t = Thread.currentThread();
        System.out.println(t);
        /*for (int i = 0; i < 20; i++) {
            System.out.println("run-->" + i);
        }*/
    }
}
