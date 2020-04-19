package LearnJava.DiGui;

/*
递归计算1-n的和 sum

递归计算阶乘  value
 */

public class Practice1 {
    public static void main(String[] args) {

        int add = sum(3);
        System.out.println(add);

        int v = value(5);
        System.out.println(v);
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sum(n-1);
        }
    }

    public static int value(int n){
        if(n == 1){
            return 1;
        }else{
            return n * value(n-1);
        }
    }
}
