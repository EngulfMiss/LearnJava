package LearnJava.InnerClass;

public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        AreaInner AI = new AreaInner();
        inner.method();
        AI.Amethod();
    }
}
