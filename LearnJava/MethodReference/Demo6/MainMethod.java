package LearnJava.MethodReference.Demo6;

/*
    类的构造器(构造方法)引用
 */

public class MainMethod {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void printName(String name,PersonBuilder p){
        Person person = p.BuilderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法，方法的参数PersonBuilder接口是一个函数式接口，可以传递Lambda表达式
        printName("Gnar",s->new Person(s));


        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象方法已知
            就可以使用Person引用new创建对象
         */
        printName("Neeko",Person::new);
    }
}
