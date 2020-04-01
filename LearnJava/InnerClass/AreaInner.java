package LearnJava.InnerClass;

/*
如果一个类是定义在一个方法内部的,那么这个类就是一个局部内部类
"局部",只有当前所属的方法才能使用它，出了这个方法就不能用了

定义格式:
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 局部内部类名称 {

        }
    }
}

public,protected,(default),private
定义一个类时，权限修饰符规则
1.外部类       public / (default)
2.成员内部类     public / protected / (default) / private
3.局部内部类     什么都不能写
 */

public class AreaInner {
    public void Amethod(){

        //局部内部类

        class Inner{
            int num = 10;
            public void InnerMethod(){
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.InnerMethod();
    }
}
