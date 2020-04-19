package LearnJava.Thread.Lambda;

public class MainMethod {
    public static void main(String[] args) {
        //使用匿名内部类
        invokeCook(new Cook(){

            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //使用Lambda表达式
        invokeCook(()->{
            System.out.println("我吃饭去了");
        });


        //优化省略Lambda
        invokeCook(()->System.out.println("我也吃饭去了"));

    }





    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
