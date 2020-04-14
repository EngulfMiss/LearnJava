package LearnJava.Equals;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person)obj;
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;
    }

}
