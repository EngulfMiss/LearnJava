package LearnJava.MethodReference.Demo6;

/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名创建Person对象返回
    /*public abstract*/ Person BuilderPerson(String name);
}
