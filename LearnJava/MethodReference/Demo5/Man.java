package LearnJava.MethodReference.Demo5;

/*
    通过this引用本类的成员方法
 */

public class Man {

        public void buyAny(){
            System.out.println("全部买买买");
        }

        public void marry(Richable r){
            r.buy();
        }

        public void happy(){
           /* marry(()->{
                this.buyAny();
            });*/

            /*
            使用方法引用优化Lambda
            this已经存在
            本类中的方法buyAny已经存在
            所以我们可以直接使用this引用本类的buyAny
         */

            marry(this::buyAny);
        }

    public static void main(String[] args) {
        new Man().happy();



    }
}
