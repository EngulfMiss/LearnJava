package LearnJava.Generic;

/*
含有泛型的接口，第一种使用方式
定义接口的实现类，实现接口，指定接口的类型
 */

public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void myInterface(String str) {
        System.out.println(str);
    }

}
