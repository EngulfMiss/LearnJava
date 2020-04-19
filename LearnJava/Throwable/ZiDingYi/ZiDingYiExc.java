package LearnJava.Throwable.ZiDingYi;

/*
    自定义异常类:
        格式:
            public class XXXException extends Exception || RuntimeException{
                添加一个空参的构造方法
                添加一个带异常信息的构造方法
            }
        注意：
            1.自定义异常类一般都是以Exception结尾，说明该类是一个异常类
            2.自定义异常类，必须继承Exception或者RuntimeException
                继承RuntimeException  运行期异常  那么自定义异常类是一个运行期异常，可以不处理
                继承Exception  自定义的异常类是一个编译器异常，如果方法内部抛出了编译器
                异常，就必须处理这个异常（throws 或者 tryc...atch）
 */

public class ZiDingYiExc extends Exception{
    //添加一个空参的构造方法
    public ZiDingYiExc(){

    }

    //添加一个异常信息的构造方法
    public ZiDingYiExc(String msg){
        super(msg);
    }
}
