package LearnJava.Thread.Lambda.Practice2;

import java.util.Arrays;

public class MainMethod {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("Gnar",7),
                new Person("Neeko",17),
                new Person("Tian",22),
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });



        //使用Lambda表达式简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });


        //优化省略Lambda
        Arrays.sort(arr,(o1, o2)-> o1.getAge()-o2.getAge());


        for(Person p : arr){
            System.out.println(p);
        }
    }
}
