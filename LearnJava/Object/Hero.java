package LearnJava.Object;

public class Hero {
    public static final int NUM30 = 30;
    private String name;
    private int Level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public Hero(String name, int level) {
        this.name = name;
        Level = level;
    }

    public Hero() {

    }

    public void show()
    {
        System.out.println(name + "等级为:" + Level);
    }
    public void sayHello(String name)
    {
        System.out.println(this.name + ", 你好, 我是" + name);
    }
}
