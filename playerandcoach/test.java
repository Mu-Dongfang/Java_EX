package com.playerandcoach;

/**
 * 测试类
 */

public class test {
    public static void main(String[] arg) {
        BasketballCoach bc1 = new BasketballCoach();
        bc1.setName("李翔");
        bc1.setAge(40);
        System.out.println(bc1.getName() + "," + bc1.getAge());
        bc1.eat();
        bc1.teach();
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("JJJ");
        ppp.setAge(20);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.speak();
        ppp.study();
    }
}