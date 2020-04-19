package LearnJava.Throwable;

/*
    多个异常使用捕获，怎么处理？
    1.多个异常分别处理
    2.多个异常一次捕获，多次处理
    3.多个异常一次捕获一次处理
 */

import java.util.List;

public class ExceptionS {

    /**
     * 一个try多个catch注意事项：
     *      catch里面定义的异常处理对象，如果有子父类关系，那么子类的异常变量必须写在
     *      上面
     *
     */
    public static void main(String[] args) {
        try{
            //int[] arr = {1,2,3};
            //System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(5));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
}




////多个异常一次捕获，多次处理
//try{
//        int[] arr = {1,2,3};
//        //System.out.println(arr[3]);
//        List<Integer> list = List.of(1,2,3);
//        System.out.println(list.get(4));
//        }catch(ArrayIndexOutOfBoundsException e){
//        System.out.println(e);
//        }catch(IndexOutOfBoundsException e){
//        System.out.println(e);
//        }






///**
// * 多个异常分别处理
// */
//        try{
//                int[] arr = {1,2,3};
//                System.out.println(arr[3]);
//                }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//                }
//
//                try{
//                List<Integer> list = List.of(1,2,3);
//        System.out.println(list.get(3));
//        }catch(IndexOutOfBoundsException e){
//        System.out.println(e);
//        }
//
//        System.out.println("后续代码");