package LearnJava.MethodReference.Demo2;

/*
    通过对象名引用成员方法
    使用前提：
        对象名已经存在，成员方法也已经存在
        就可以使用对象名引用成员方法
 */

public class MainMethod {
    //定义一个方法，方法参数传递Printable接口
    public static void PrintString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        /*PrintString(s->{
            MethodRerObj mobj = new MethodRerObj();
            mobj.printUP(s);
        });*/

        /*
            使用方法引用优化Lambda
            对象已经存在，成员方法也已经存在
            所以我们可以使用对象名引用成员方法
         */

        MethodRerObj mobj = new MethodRerObj();
        PrintString(mobj::printUP);
    }
}
