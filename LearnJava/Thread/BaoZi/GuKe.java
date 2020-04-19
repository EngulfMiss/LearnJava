package LearnJava.Thread.BaoZi;

public class GuKe extends Thread{
    private BaoZI bz;

    public GuKe(BaoZI bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("顾客开始吃包子" + bz.pi + bz.xian + "包子");
                bz.flag = false;
                bz.notify();
                System.out.println("顾客吃完包子");
                System.out.println("======================");
            }
        }
    }
}
