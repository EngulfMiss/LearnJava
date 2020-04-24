package LearnJava.FunctionInterface.Predicate;

import java.util.function.Predicate;

public class Test implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.length()>3;
    }
}
