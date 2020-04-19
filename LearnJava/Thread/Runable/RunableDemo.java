package LearnJava.Thread.Runable;

/*
    创建多线程的第二种方式
    实现Runable接口
    java.lang.Runable 接口应该由打算通过某一线程执行其实例的类来实现。
    类必须定义一个名为run的无参方法
    java.lang.Thread类的构造方法
        Thread(Runable target)  分配新的Thread对象
        Thread(Runable target,String name)  分配新的Thread对象

    实现步骤：
        1.创建一个Runable接口的实现类
        2.在实现类中重写Runable接口的run方法，设置线程任务
        3.创建Runable接口的实现类对象
        3.创建Thread类对象，构造方法中传递Runable接口的实现类对象
        5.调用Thread类中的start方法开启新线程执行run方法


    使用Runable的好处：
        1.避免了单继承的局限性
            一个类只能继承一个类，类继承了Thread类就不能继承其他类了
        2.增强了程序的扩展性，降低了程序的耦合度(解耦)
            实现Runable接口的方式，把设置线程任务和开启新线程进行了分离(解耦)
            实现类中，重写了run方法：用来设置线程任务
            创建Thread类对象，调用Thread类对象，调用start方法，用来开启新线程

 */

public class RunableDemo {
    public static void main(String[] args) {

        RunableImpl run = new RunableImpl();

        Thread t = new Thread(run);

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->" + i);
        }
    }
}
