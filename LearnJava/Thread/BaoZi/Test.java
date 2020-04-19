package LearnJava.Thread.BaoZi;

public class Test {
    public static void main(String[] args) {
        BaoZI bz = new BaoZI();
        new BaoZiPu(bz).start();
        new GuKe(bz).start();
    }
}
