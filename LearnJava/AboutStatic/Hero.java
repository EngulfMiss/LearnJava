package LearnJava.AboutStatic;

public class Hero {
    private String name;
    private int level;
    public static String home;
    private int id;
    private static int Idcounter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hero() {
        this.id = ++Idcounter;
    }

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
        this.id = ++Idcounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
