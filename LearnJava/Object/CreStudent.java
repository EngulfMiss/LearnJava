package LearnJava.Object;

public class CreStudent {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.name = "纳尔";
        stud1.age = 1005;
        System.out.println(stud1.name);
        System.out.println(stud1.age);
        stud1.fight();
    }
}
