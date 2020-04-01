package LearnJava.Math;

public class MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int)Math.ceil(min); i < (int)Math.floor(max); i++) {
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1)
            {
                count++;
            }
        }
        System.out.println("有" + count + "个");
    }
}
