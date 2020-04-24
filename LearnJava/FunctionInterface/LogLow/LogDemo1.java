package LearnJava.FunctionInterface.LogLow;

/*
    日志案例

    性能问题：
        无论level是否等于1，我们都把字符串拼接好了
        如果不等于1就会很浪费
 */

public class LogDemo1 {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level,String message){
        //对日志的级别进行判断，如果是1级别，那么输出日志信息
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Gnar";
        String msg2 = "Neeko";
        String msg3 = "Tian";
        showLog(1,msg1+msg2+msg3);
    }
}
