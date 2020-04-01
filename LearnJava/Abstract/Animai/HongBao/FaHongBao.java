package LearnJava.Abstract.Animai.HongBao;

import java.util.ArrayList;

public class FaHongBao {
    public static void main(String[] args) {
        Manger manger = new Manger("群主大大",100);
        Member member1 = new Member("路人甲" , 20);
        Member member2 = new Member("路人乙",10);
        Member member3 = new Member("路人丙" , 30);

        manger.show();
        member1.show();
        member2.show();
        member3.show();

        ArrayList<Integer> moneyList = manger.send(50,3);
        member1.receive(moneyList);
        member2.receive(moneyList);
        member3.receive(moneyList);
        System.out.println("================");
        manger.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
