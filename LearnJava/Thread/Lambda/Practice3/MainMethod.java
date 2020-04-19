package LearnJava.Thread.Lambda.Practice3;

public class MainMethod {
    public static void main(String[] args) {
        incokeCalc(5, 6, new Calulator() {
            @Override
            public int calu(int a, int b) {
                return a+b;
            }
        });


        incokeCalc(5,6,(int a,int b)->{
            return a+b;
        });
    }

    public static void incokeCalc(int a,int b,Calulator c){
        int sum = c.calu(a,b);
        System.out.println(sum);
    }
}
