package com.icey;

import java.util.Scanner;

/**
 * 遍历字符串并输出大写字母,小写字母和数字的数目
 *
 */
public class StringCompare {

    public StringCompare() {
    }

    public void compare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);// String类中的charAt()方法的作用是返回指定索引处的char值
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                System.out.println("你输入的数据有误");
            }
        }
        System.out.println("大写字母:" + bigCount + "个");
        System.out.println("小写字母:" + smallCount + "个");
        System.out.println("数字:" + numberCount + "个");
        sc.close();
    }
}
