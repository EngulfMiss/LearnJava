package LearnJava.FunctionInterface.LogLow;

/*
    使用Lambda优化日志案例
    Lambda的特点：延迟加载
    Lambda的使用前提，必须存在函数式接口
 */

public class LogDemo1UP {
    //定义一个显示日志的方法，方法的参数传递日志等级和LogMessage接口
    public static void showLog(int level,LogMessage msg){
        //对日志等级进行判断，如果为1级，则调用LogMessage接口中的bulidMsg方法
        if(level == 1){
            System.out.println(msg.bulidMsg());
        }
    }
    public static void main(String[] args) {
        String msg1 = "Gnar";
        String msg2 = "Neeko";
        String msg3 = "Tian";

        //调用showLog方法，参数LogMessage msg是一个函数式接口，可以使用Lambda表达式
        showLog(1,()->msg1+msg2+msg3);
        /*
            使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
            只有满足条件，才会调用接口中的方法

            如果条件不满足，那么接口中的方法不会执行
         */
    }
}
