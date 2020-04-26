package LearnJava.MethodReference.Demo4;

public class Man extends Human{
    @Override
    public void sayHello(){
        System.out.println("Hello,我是Man");
    }

    public void method(Greetable g){
        //定义一个方法，传递Greetable接口
        g.greet();
    }

    public void show(){
        //调用method方法，方法的参数Greetable是一个函数式接口
       /* method(()->{
            //创建父类Human对象
            Human h = new Human();
            //调用父类的sayHello方法
            h.sayHello();
        });*/


        //因为有父类关系，所以可以使用super关键字直接调用父类的成员方法
        this.method(()->{
            super.sayHello();
        });


        //使用super引用类的成员方法
        //super是已经存在的
        //父类的成员方法也是已经存在的
        //所以可以直接使用super引用父类的成员方法
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
