package LearnJava.Collection;

/*
Comparable接口的排序规则：
    自己(this) - 参数:升序
    参数 - 自己(this) :降序
 */

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //重写排序的规则
    @Override
    public int compareTo(Person o) {
        //return 0;
        //自定义比较规则，比较两个人年龄
        return this.getAge() - o.getAge();  //年龄升序排序
    }
}
