package LearnJava.Throwable;

public class FinaRet {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }
    public static int getA(){
        int a = 10;
        try{
            return 0;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            //一定会执行
            a = 100;
            //尽量不要在finally里面写return语句
            return a;
        }
    }
}
