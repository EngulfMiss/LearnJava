package LearnJava.Extends;

public class NewPhone extends Phone{
    @Override
    public void show(){
        super.show(); //把父类的方法拿过来，子类再加
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
