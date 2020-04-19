package LearnJava.Throwable.ZiDingYi;

/*
要求：模拟用户注册操作，如果用户名已存在，则抛出异常并提示：亲，用户名已存在

分析：
    1.使用数组保存已经注册的用户名
    2.使用Scanner获取用户的输入注册的用户名
    3.定义方法对用户输入额用户名进行判断
        遍历用户名数组，获取每个用户名
        使用获取到的用户名和用户注册的用户名比较
        true：
            用户名已经存在 抛出异常
        false：
            继续遍历比较
        如果循环结束还没找到存在的用户名，提示用户注册成功
 */

import java.util.Scanner;

public class ZDYExcPr{
    static String usernames[] = {"Gnar","Neeko","Tian"};

    public static void main(String[] args)/* throws ZiDingYiExc*/{
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您要注册的用户名:");
        String username = input.next();
        cheacName(username);
    }

    public static void cheacName(String name)/* throws ZiDingYiExc*/{
        for(String str : usernames){
            try{
                if(str.equals(name)){
                    throw new ZiDingYiExc("用户已被注册");
                }
            }catch(ZiDingYiExc z){
                z.printStackTrace();
                return; //防止后续执行
            }
        }
        System.out.println("XYZ注册成功!!!!!");
    }
}
