package LearnJava.Thread.BaoZi;

/*
使用同步技术，保证两个线程只有一个在执行
锁对象必须保证唯一
 */

public class BaoZiPu extends Thread{
    private BaoZI bz;

    public BaoZiPu(BaoZI bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println(bz.pi + bz.xian + "包子做好了");
            }
        }
    }
}
