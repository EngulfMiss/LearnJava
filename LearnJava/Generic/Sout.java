package LearnJava.Generic;

public class Sout<Tian> implements GenericInterface<Tian>{
    @Override
    public void myInterface(Tian tian) {
        System.out.println(tian);
    }
}
