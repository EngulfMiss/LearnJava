package LearnJava.FunctionInterface.Consumer;

/*
    将字符串数组中的信息，以姓名：XX，性别：XX 的格式打印出来
 */

import java.util.function.Consumer;

public class Practice {
    public static void main(String[] args) {
        String[] arr = {"Gnar,雄","Neeko,雌","Tian,雌"};
        getInf(arr,(message)->{
            String[] string = message.split(",");
            System.out.print("姓名："+ string[0]);
        },(message)->{
            String[] string = message.split(",");
            System.out.println(",性别：" + string[1]);
        });
    }

    public static void getInf(String[] s, Consumer<String> con1,Consumer<String> con2){
        for(String str : s){
            con1.andThen(con2).accept(str);
        }
    }
}
