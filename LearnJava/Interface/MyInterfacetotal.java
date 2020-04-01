package LearnJava.Interface;

/*
1.多个父接口的抽象方法冲突，没有关系
2.多个父接口的默认方法冲突，那句有关系了如果重复，子接口必须覆盖重写冲突方法
而且要带default关键字
 */

public interface MyInterfacetotal extends MyInterfaceA,MyInterfaceB{
    public abstract void Mymethod();

    @Override
    default void say() {

    }
}
