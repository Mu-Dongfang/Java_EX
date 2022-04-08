package com.playerandcoach;

import java.util.Scanner;

/**
 * 测试类
 */

public class test {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        BasketballCoach bc1 = new BasketballCoach();
        System.out.println("请输入姓名:");
        String name1 = sc.nextLine();
        bc1.setName(name1);
        System.out.println("请输入年龄:");
        int age1 = sc.nextInt();
        bc1.setAge(age1);
        bc1.eat();
        bc1.teach();
    }
}