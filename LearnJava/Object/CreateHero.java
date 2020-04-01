package LearnJava.Object;

public class CreateHero {
    public static void main(String[] args) {
        Hero[] heros = new Hero[4];
        Hero hero1 = new Hero("纳尔",18);
        Hero hero2 = new Hero("妮蔻",18);
        Hero hero3 = new Hero("克烈",18);
        Hero hero4 = new Hero("真天",18);

        heros[0] = hero1;
        heros[1] = hero2;
        heros[2] = hero3;
        heros[3] = hero4;

        for (int i = 0; i < heros.length; i++) {
            System.out.println(heros[i].getName() + "的等级为:" + heros[i].getLevel());
        }


        /*Hero hero1 = new Hero();
        new Hero().setName("妮蔻");
        new Hero().show();
        hero1.setName("纳尔");
        hero1.setLevel(18);
        hero1.sayHello("主人");*/
    }

}
