package LearnJava.Throwable;

/*
java.lang.Throwable :是Java语言中所有错误或异常的超类
    Exception : 编译期异常:进行编译Java程序出现的问题
        RuntimeException: 运行期异常，java程序运行过程中出现的问题

    Error : 错误
        错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续运行
 */

public class ExceptionDemo {
    public static void main(String[] args)  /*throws ParseException */ {

        // Error ：错误
        //int[] arr = new int[1024*1024*1024];







       /*
        // 运行期异常
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("异常后面的代码");
        */






        /*
        //编译异常
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 把字符串格式的日期，解析为Date格式日期
        Date date = null;
        try {
            date = sdf.parse("1999-0909");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("hhhhhh");
        */
    }
}
